# management-apiclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.flexify</groupId>
    <artifactId>management-apiclient</artifactId>
    <version>2.4.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.flexify:management-apiclient:2.4.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/management-apiclient-2.4.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

The complete example of new migration

```java

import io.flexify.apiclient.api.AuthenticationControllerApi;
import io.flexify.apiclient.api.MigrationsControllerApi;
import io.flexify.apiclient.api.StoragesControllerApi;
import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.model.*;

import java.util.ArrayList;
import java.util.List;

public class FlexifyApiTest {

    // Please contact info@flexify.io to get the URL
    private final static String BASE_PATH_URL = "https://ask-flexify-for-your-url";

    // Sign-up first
    // NOTE: Skip authentication if you already have an API key
    private final static String AUTH_USERNAME = "USE_EMAIL_FROM_SIGNUP_FORM";
    private final static String AUTH_PASSWORD = "USE_YOUR_STRONG_PASSWORD";

    // Amazon S3 Source Configuration Example
    public static final String AMAZON_S3_ENDPOINT = "s3.amazonaws.com";
    public static final String S3_IDENTITY = "USE_YOUR_S3_IDENTITY_HERE";
    public static final String S3_CREDENTIAL = "USE_YOUR_S3_IDENTITY_HERE";
    public static final String SOURCE_BUCKET_NAME_IN_AMAZON = "USE_YOUR_SOURCE_BUCKET_NAME";
  
    // Microsoft Azure Destination Configuration Example
    public static final String MICROSOFT_AZURE_ENDPOINT = "{identity}.blob.core.windows.net";
    public static final String AZURE_IDENTITY = "USE_YOUR_AZURE_IDENTITY_HERE";
    public static final String AZURE_CREDENTIAL = "USE_YOUR_AZURE_IDENTITY_HERE+5SIsRO8YJTw==";
    public static final String DESTINATION_BUCKET_NAME_IN_AZURE = "USE_YOUR_DESTINATION_CONTAINER";

    
    public static void main(String[] args) {

        // 1) Setup connection URL
        Configuration.getDefaultApiClient().setBasePath(BASE_PATH_URL);
        try {
            // 2) Login to the Flexify.IO if you don't have an API key
            AuthenticationResponse authResponse = new AuthenticationControllerApi().authenticationRequestUsingPOST(
                    new AuthenticationRequest().username(AUTH_USERNAME).password(AUTH_PASSWORD)
            );
            final String apiKey = authResponse.getToken();

            // 3) Authenticate the client with API key
            ApiKeyAuth bearer = (ApiKeyAuth) Configuration.getDefaultApiClient().getAuthentication("Bearer");
            bearer.setApiKeyPrefix("Bearer");
            bearer.setApiKey(apiKey);
            
            // 4) Use the api
            createNewMigration();

            PageMigration migrations = new MigrationsControllerApi().
                    getForCurrentUserUsingGET(false, false, new ArrayList<String>(), 0, 100, null);
            System.out.println("My migrations: " + migrations);

        } catch (ApiException e) {
            System.err.println("Exception when calling Flexify.IO API: " + e.getCode());
            e.printStackTrace();
        }
    }

    /**
     * Create new migration to copy objects from bucket in Amazon to container in Azure
     *
     * @throws ApiException
     */
    private static void createNewMigration() throws ApiException {

        StoragesControllerApi storagesApi = new StoragesControllerApi();

        // Get all supported cloud storage providers
        List<StorageProvider> allProviders = storagesApi
                .getAllStorageProvidersUsingGET();

        Long amazonS3ProviderId = allProviders.stream()
                .filter(p -> AMAZON_S3_ENDPOINT.equals(p.getEndpoint())).findFirst().orElseThrow(() -> new IllegalArgumentException("Unable to find Amazon S3 Provider")).getId();

        Long azureProviderId = allProviders.stream()
                .filter(p -> MICROSOFT_AZURE_ENDPOINT.equals(p.getEndpoint())).findFirst().orElseThrow(() -> new IllegalArgumentException("Unable to find Windows Azure Provider")).getId();


        // Add Amazon Storage Account with one bucket
        Long amazonAccountId = storagesApi.addStorageAccountWithBucketsUsingPOST(
                new AddStorageAccountWithBucketsRequest().storageAccount(
                        new StorageAccountCreateRequest()
                                .providerId(amazonS3ProviderId)
                                .identity(S3_IDENTITY)
                                .credential(S3_CREDENTIAL)
                                .useSsl(true)
                ).addBucketsItem(new Bucket().name(SOURCE_BUCKET_NAME_IN_AMAZON))
        ).getId();

        // Add Microsoft Account with one container
        Long microsoftAccountId = storagesApi.addStorageAccountWithBucketsUsingPOST(
                new AddStorageAccountWithBucketsRequest().storageAccount(
                        new StorageAccountCreateRequest()
                                .providerId(azureProviderId)
                                .identity(AZURE_IDENTITY)
                                .credential(AZURE_CREDENTIAL)
                                .useSsl(true)
                ).addBucketsItem(new Bucket().name(DESTINATION_BUCKET_NAME_IN_AZURE))
        ).getId();


        // Get created Storage ID for an amazon bucket
        Long amazonBucketStorageId = storagesApi.getStoragesForStorageAccountUsingGET(amazonAccountId)
                .stream().filter(s -> s.getBucket().equals(SOURCE_BUCKET_NAME_IN_AMAZON)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Bucket " + SOURCE_BUCKET_NAME_IN_AMAZON + " cannot be found")).getId();

        // Get created Storage ID for an azure bucket
        Long azureBucketStorageId = storagesApi.getStoragesForStorageAccountUsingGET(microsoftAccountId)
                .stream().filter(s -> s.getBucket().equals("test")).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("DESTINATION_BUCKET_NAME_IN_AZURE " + DESTINATION_BUCKET_NAME_IN_AZURE + " cannot be found")).getId();

        // Start the Migration
        new MigrationsControllerApi().addMigrationUsingPOST(
                new AddMigrationRequest()
                        .migrationMode(AddMigrationRequest.MigrationModeEnum.COPY)
                        .slots(8)
                        .sourceId(amazonBucketStorageId)
                        .destinationId(azureBucketStorageId)
        );
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationControllerApi* | [**authenticationRequestUsingPOST**](docs/AuthenticationControllerApi.md#authenticationRequestUsingPOST) | **POST** /rest/auth | Generate access token for user
*AuthenticationControllerApi* | [**logoutUsingPOST**](docs/AuthenticationControllerApi.md#logoutUsingPOST) | **POST** /rest/auth/logout | Logout
*BillingAccountControllerApi* | [**getCostsForCurrentUserUsingGET**](docs/BillingAccountControllerApi.md#getCostsForCurrentUserUsingGET) | **GET** /rest/account/costs | Get costs for current user
*BillingAccountControllerApi* | [**getCurrentUserBillingAccountUsingGET**](docs/BillingAccountControllerApi.md#getCurrentUserBillingAccountUsingGET) | **GET** /rest/account | Get billing account for current user
*BillingAccountControllerApi* | [**getPaymentsForCurrentUserUsingGET**](docs/BillingAccountControllerApi.md#getPaymentsForCurrentUserUsingGET) | **GET** /rest/account/payments | Get payments for current user
*CloudLocationsControllerApi* | [**getAvailableLocationsForCurrentUserUsingGET**](docs/CloudLocationsControllerApi.md#getAvailableLocationsForCurrentUserUsingGET) | **GET** /rest/cloud-locations | getAvailableLocationsForCurrentUser
*EndpointsControllerApi* | [**attachStorageToEndpointUsingPOST**](docs/EndpointsControllerApi.md#attachStorageToEndpointUsingPOST) | **POST** /rest/endpoints/{endpoint-id}/storages | Attach the storage to the endpoint
*EndpointsControllerApi* | [**detachStorageFromEndpointUsingDELETE**](docs/EndpointsControllerApi.md#detachStorageFromEndpointUsingDELETE) | **DELETE** /rest/endpoints/{endpoint-id}/storages/{storage-id} | Detach the storage from the endpoint
*EndpointsControllerApi* | [**disableUsingPUT**](docs/EndpointsControllerApi.md#disableUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
*EndpointsControllerApi* | [**enableUsingPUT**](docs/EndpointsControllerApi.md#enableUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
*EndpointsControllerApi* | [**getEndpointDetailsUsingGET**](docs/EndpointsControllerApi.md#getEndpointDetailsUsingGET) | **GET** /rest/endpoints/{endpoint-id} | Get endpoint details
*EndpointsControllerApi* | [**getEndpointsForCurrentUserUsingGET**](docs/EndpointsControllerApi.md#getEndpointsForCurrentUserUsingGET) | **GET** /rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
*EndpointsControllerApi* | [**setDefaultStorageUsingPUT**](docs/EndpointsControllerApi.md#setDefaultStorageUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/storages/{storage-id}/actions/set-as-default | Set given storage as default for the endpoint
*EndpointsControllerApi* | [**updateEndpointUsingPUT**](docs/EndpointsControllerApi.md#updateEndpointUsingPUT) | **PUT** /rest/endpoints/{endpoint-id} | Update attributes of the endpoint
*LogControllerApi* | [**getLogForCurrentUserUsingGET**](docs/LogControllerApi.md#getLogForCurrentUserUsingGET) | **GET** /rest/log | getLogForCurrentUser
*MigrationsControllerApi* | [**addMigrationUsingPOST**](docs/MigrationsControllerApi.md#addMigrationUsingPOST) | **POST** /rest/migrations | Add new migration
*MigrationsControllerApi* | [**getForCurrentUserUsingGET**](docs/MigrationsControllerApi.md#getForCurrentUserUsingGET) | **GET** /rest/migrations | Get all migrations for logged in user in pagged mode
*MigrationsControllerApi* | [**getUsingGET**](docs/MigrationsControllerApi.md#getUsingGET) | **GET** /rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
*MigrationsControllerApi* | [**hideMigrationUsingPOST**](docs/MigrationsControllerApi.md#hideMigrationUsingPOST) | **POST** /rest/migrations/{migration-id}/hide | Hide migration from UI
*MigrationsControllerApi* | [**stopMigrationUsingPOST**](docs/MigrationsControllerApi.md#stopMigrationUsingPOST) | **POST** /rest/migrations/{migration-id}/stop | Stop (cancel) the migration
*PaymentControllerApi* | [**getPaymentOptionsUsingGET**](docs/PaymentControllerApi.md#getPaymentOptionsUsingGET) | **GET** /rest/pay/paddle/options | getPaymentOptions
*PaymentControllerApi* | [**paymentFulfilledUsingGET**](docs/PaymentControllerApi.md#paymentFulfilledUsingGET) | **GET** /rest/pay/paddle/webhook | paymentFulfilled
*StoragesControllerApi* | [**addBucketsToStorageAccountUsingPOST**](docs/StoragesControllerApi.md#addBucketsToStorageAccountUsingPOST) | **POST** /rest/storage-accounts/{storage-account-id}/storages | Add buckets to the storage account and optionally attach them to endpoint
*StoragesControllerApi* | [**addStorageAccountWithBucketsUsingPOST**](docs/StoragesControllerApi.md#addStorageAccountWithBucketsUsingPOST) | **POST** /rest/storage-accounts | Add Storage Account with buckets
*StoragesControllerApi* | [**deleteStorageUsingDELETE**](docs/StoragesControllerApi.md#deleteStorageUsingDELETE) | **DELETE** /rest/storage-accounts/{storage-account-id}/storages/{storage-id} | Delete Storage
*StoragesControllerApi* | [**deleteStoragesUsingPOST**](docs/StoragesControllerApi.md#deleteStoragesUsingPOST) | **POST** /rest/storage-accounts/actions/delete-storages | Deletes storages
*StoragesControllerApi* | [**generateAccessKeysUsingGET**](docs/StoragesControllerApi.md#generateAccessKeysUsingGET) | **GET** /rest/generate-access-keys | Generate new access keys pair
*StoragesControllerApi* | [**getAllStorageProvidersUsingGET**](docs/StoragesControllerApi.md#getAllStorageProvidersUsingGET) | **GET** /rest/providers | Get all storage providers
*StoragesControllerApi* | [**getBucketsForStorageAccountUsingGET**](docs/StoragesControllerApi.md#getBucketsForStorageAccountUsingGET) | **GET** /rest/storage-accounts/{storage-account-id}/buckets | Retrieve buckets from external cloud storage account
*StoragesControllerApi* | [**getBucketsUsingGET**](docs/StoragesControllerApi.md#getBucketsUsingGET) | **GET** /rest/buckets | Lists buckets of the external storage account
*StoragesControllerApi* | [**getStorageAccountsForCurrentUserUsingGET**](docs/StoragesControllerApi.md#getStorageAccountsForCurrentUserUsingGET) | **GET** /rest/storage-accounts | Get all storage accounts for current user
*StoragesControllerApi* | [**getStoragesForStorageAccountUsingGET**](docs/StoragesControllerApi.md#getStoragesForStorageAccountUsingGET) | **GET** /rest/storage-accounts/{storage-account-id}/storages | Get storages of the storage account
*StoragesControllerApi* | [**refreshStorageUsingPOST**](docs/StoragesControllerApi.md#refreshStorageUsingPOST) | **POST** /rest/storage-accounts/{storage-account-id}/storages/{storage-id}/actions/refresh | Refresh storage
*StoragesControllerApi* | [**refreshStoragesUsingPOST**](docs/StoragesControllerApi.md#refreshStoragesUsingPOST) | **POST** /rest/storage-accounts/actions/refresh-storages | Refresh storages
*UserControllerApi* | [**getCurrentUserUsingGET**](docs/UserControllerApi.md#getCurrentUserUsingGET) | **GET** /rest/user/current | Get details information for logged in user
*UserControllerApi* | [**requestResetPasswordUsingPOST**](docs/UserControllerApi.md#requestResetPasswordUsingPOST) | **POST** /rest/user/request-reset-password | requestResetPassword


## Documentation for Models

 - [AccessKeysPair](docs/AccessKeysPair.md)
 - [AddBucketsToStorageAccountRequest](docs/AddBucketsToStorageAccountRequest.md)
 - [AddMigrationRequest](docs/AddMigrationRequest.md)
 - [AddStorageAccountWithBucketsRequest](docs/AddStorageAccountWithBucketsRequest.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [BillingAccount](docs/BillingAccount.md)
 - [BillingAccountWithMoney](docs/BillingAccountWithMoney.md)
 - [Bucket](docs/Bucket.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [CloudLocation](docs/CloudLocation.md)
 - [CostDetails](docs/CostDetails.md)
 - [DataStorageStat](docs/DataStorageStat.md)
 - [DescribeOrganization](docs/DescribeOrganization.md)
 - [Endpoint](docs/Endpoint.md)
 - [EndpointDetails](docs/EndpointDetails.md)
 - [EndpointStat](docs/EndpointStat.md)
 - [EndpointStorage](docs/EndpointStorage.md)
 - [IdResponse](docs/IdResponse.md)
 - [IdsList](docs/IdsList.md)
 - [LogEntry](docs/LogEntry.md)
 - [LogEvent](docs/LogEvent.md)
 - [Migration](docs/Migration.md)
 - [MigrationSlotStat](docs/MigrationSlotStat.md)
 - [MigrationStat](docs/MigrationStat.md)
 - [Money](docs/Money.md)
 - [PageMigration](docs/PageMigration.md)
 - [Pageable](docs/Pageable.md)
 - [Payment](docs/Payment.md)
 - [PaymentOptions](docs/PaymentOptions.md)
 - [PriceListEntry](docs/PriceListEntry.md)
 - [RequestResetPasswordReqeust](docs/RequestResetPasswordReqeust.md)
 - [ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [SignUpRequest](docs/SignUpRequest.md)
 - [SignupResult](docs/SignupResult.md)
 - [Sort](docs/Sort.md)
 - [Storage](docs/Storage.md)
 - [StorageAccount](docs/StorageAccount.md)
 - [StorageAccountCreateRequest](docs/StorageAccountCreateRequest.md)
 - [StorageProvider](docs/StorageProvider.md)
 - [User](docs/User.md)
 - [UserProfile](docs/UserProfile.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Alexander Bondin ab@flexify.io

