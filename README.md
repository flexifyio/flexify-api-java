# Java API Client for Flexify.IO Management

With [Flexify.IO](https://flexify.io/), storing your data in a cloud does not imply dependency on a single provider anymore!

By unlocking your application from the specific cloud vendor or protocol, you finally gain the freedom to decide when and where to store your data.

And we took care about data migration too!

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
    <version>2.4.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.flexify:management-apiclient:2.4.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/management-apiclient-2.4.0.jar
* target/lib/*.jar

## Getting Started

Please use our [examples]|(https://github.com/flexifyio/flexify-manage-api-client-sample)

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


## Contact us:

+ Information: [info@flexify.io](mailto:info@flexify.io)
+ Sales: [sales@flexify.io](mailto:sales@flexify.io)
+ Support: [support@flexify.io](mailto:support@flexify.io)
