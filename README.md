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
    <version>2.6</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.flexify:management-apiclient:2.4.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/management-apiclient-2.4.1.jar
* target/lib/*.jar

## Getting Started

Please use our [examples](https://github.com/flexifyio/flexify-manage-api-client-sample)

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationControllerApi* | [**authenticate**](docs/AuthenticationControllerApi.md#authenticate) | **POST** /rest/auth | Generate new access token for the user
*AuthenticationControllerApi* | [**getConfig**](docs/AuthenticationControllerApi.md#getConfig) | **GET** /rest/auth/config | Logout
*AuthenticationControllerApi* | [**logout**](docs/AuthenticationControllerApi.md#logout) | **POST** /rest/auth/logout | Logout
*BillingAccountControllerApi* | [**getCostsForCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCostsForCurrentUserBillingAccount) | **GET** /rest/account/costs | Get costs for current user
*BillingAccountControllerApi* | [**getCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCurrentUserBillingAccount) | **GET** /rest/account | Get billing account for current user
*BillingAccountControllerApi* | [**getPaymentsForCurrentUser**](docs/BillingAccountControllerApi.md#getPaymentsForCurrentUser) | **GET** /rest/account/payments | Get payments for current user
*CloudLocationsControllerApi* | [**getAvailableLocationsForCurrentUser**](docs/CloudLocationsControllerApi.md#getAvailableLocationsForCurrentUser) | **GET** /rest/cloud-locations | getAvailableLocationsForCurrentUser
*DistributorBillingAccountsControllerApi* | [**activateAccount**](docs/DistributorBillingAccountsControllerApi.md#activateAccount) | **PUT** /rest/distributor/accounts/{account-id}/actions/activate | activateAccount
*DistributorBillingAccountsControllerApi* | [**addPayment**](docs/DistributorBillingAccountsControllerApi.md#addPayment) | **POST** /rest/distributor/accounts/{account-id}/payments | addPayment
*DistributorBillingAccountsControllerApi* | [**getCosts**](docs/DistributorBillingAccountsControllerApi.md#getCosts) | **GET** /rest/distributor/accounts/{account-id}/costs | getCosts
*DistributorBillingAccountsControllerApi* | [**getDetails**](docs/DistributorBillingAccountsControllerApi.md#getDetails) | **GET** /rest/distributor/accounts/{account-id} | getDetails
*DistributorBillingAccountsControllerApi* | [**getPayments**](docs/DistributorBillingAccountsControllerApi.md#getPayments) | **GET** /rest/distributor/accounts/{account-id}/payments | getPayments
*DistributorBillingAccountsControllerApi* | [**suspendAccount**](docs/DistributorBillingAccountsControllerApi.md#suspendAccount) | **PUT** /rest/distributor/accounts/{account-id}/actions/suspend | suspendAccount
*EndpointsControllerApi* | [**attachStoragesToEndpoint**](docs/EndpointsControllerApi.md#attachStoragesToEndpoint) | **POST** /rest/endpoints/{endpoint-id}/storages | Attach the storage to the endpoint
*EndpointsControllerApi* | [**detachStorageFromEndpoint**](docs/EndpointsControllerApi.md#detachStorageFromEndpoint) | **DELETE** /rest/endpoints/{endpoint-id}/storages/{storage-id} | Detach the storage from the endpoint
*EndpointsControllerApi* | [**disable**](docs/EndpointsControllerApi.md#disable) | **PUT** /rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
*EndpointsControllerApi* | [**enable**](docs/EndpointsControllerApi.md#enable) | **PUT** /rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
*EndpointsControllerApi* | [**getEndpointDetails**](docs/EndpointsControllerApi.md#getEndpointDetails) | **GET** /rest/endpoints/{endpoint-id} | Get endpoint details
*EndpointsControllerApi* | [**getEndpointsForCurrentUser**](docs/EndpointsControllerApi.md#getEndpointsForCurrentUser) | **GET** /rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
*EndpointsControllerApi* | [**setStoragePutObjects**](docs/EndpointsControllerApi.md#setStoragePutObjects) | **PUT** /rest/endpoints/{endpoint-id}/storages/{storage-id}/put-objects | Set given storage as default for the endpoint
*EndpointsControllerApi* | [**updateEndpoint**](docs/EndpointsControllerApi.md#updateEndpoint) | **PUT** /rest/endpoints/{endpoint-id} | Update attributes of the endpoint
*LogControllerApi* | [**getLogForCurrentUser**](docs/LogControllerApi.md#getLogForCurrentUser) | **GET** /rest/log | getLogForCurrentUser
*MigrationsControllerApi* | [**addMigration**](docs/MigrationsControllerApi.md#addMigration) | **POST** /rest/migrations | Add new migration
*MigrationsControllerApi* | [**getMigration**](docs/MigrationsControllerApi.md#getMigration) | **GET** /rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
*MigrationsControllerApi* | [**getMigrations**](docs/MigrationsControllerApi.md#getMigrations) | **GET** /rest/migrations | Get all migrations for logged in user in pagged mode
*MigrationsControllerApi* | [**hideMigration**](docs/MigrationsControllerApi.md#hideMigration) | **POST** /rest/migrations/{migration-id}/hide | Hide migration from UI
*MigrationsControllerApi* | [**stopMigration**](docs/MigrationsControllerApi.md#stopMigration) | **POST** /rest/migrations/{migration-id}/stop | Stop (cancel) the migration
*PaymentControllerApi* | [**getPaymentOptions**](docs/PaymentControllerApi.md#getPaymentOptions) | **GET** /rest/pay/paddle/options | getPaymentOptions
*PaymentControllerApi* | [**paymentFulfilled**](docs/PaymentControllerApi.md#paymentFulfilled) | **GET** /rest/pay/paddle/webhook | paymentFulfilled
*StoragesControllerApi* | [**addBuckets**](docs/StoragesControllerApi.md#addBuckets) | **POST** /rest/storage-accounts/{storage-account-id}/buckets | Add buckets to the storage account
*StoragesControllerApi* | [**addStorageAccount**](docs/StoragesControllerApi.md#addStorageAccount) | **POST** /rest/storage-accounts | Add Storage Account with an optional list of buckets
*StoragesControllerApi* | [**deleteBucket**](docs/StoragesControllerApi.md#deleteBucket) | **DELETE** /rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Deletes (hides) a bucket/container
*StoragesControllerApi* | [**deleteBuckets**](docs/StoragesControllerApi.md#deleteBuckets) | **POST** /rest/storage-accounts/actions/delete-buckets | Deletes (hides) multiple buckets/containers
*StoragesControllerApi* | [**generateAccessKeys**](docs/StoragesControllerApi.md#generateAccessKeys) | **GET** /rest/generate-access-keys | Generate new access keys pair
*StoragesControllerApi* | [**getBuckets**](docs/StoragesControllerApi.md#getBuckets) | **GET** /rest/storage-accounts/{storage-account-id}/buckets | Get registered non-hidden bukects/containers of the storage account
*StoragesControllerApi* | [**getProviders**](docs/StoragesControllerApi.md#getProviders) | **GET** /rest/providers | Get all storage providers
*StoragesControllerApi* | [**getStorageAccounts**](docs/StoragesControllerApi.md#getStorageAccounts) | **GET** /rest/storage-accounts | Get all storage accounts for current user
*StoragesControllerApi* | [**refreshBucket**](docs/StoragesControllerApi.md#refreshBucket) | **POST** /rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh | Refresh statistics of a single bucket
*StoragesControllerApi* | [**refreshBuckets**](docs/StoragesControllerApi.md#refreshBuckets) | **POST** /rest/storage-accounts/actions/refresh-buckets | Refresh statistics of multiple buckets
*StoragesControllerApi* | [**requestBuckets**](docs/StoragesControllerApi.md#requestBuckets) | **GET** /rest/buckets | Lists buckets of the external storage account
*StoragesControllerApi* | [**requestCloudBuckets**](docs/StoragesControllerApi.md#requestCloudBuckets) | **GET** /rest/storage-accounts/{storage-account-id}/cloud/buckets | Retrieve buckets/containers list from underlying cloud
*StoragesControllerApi* | [**setBuckets**](docs/StoragesControllerApi.md#setBuckets) | **PUT** /rest/storage-accounts/{storage-account-id}/buckets | Sets a list of bucket for a storage account (hides existing buckets not in a list and adds buckets not in a list)
*UserControllerApi* | [**getCurrentUser**](docs/UserControllerApi.md#getCurrentUser) | **GET** /rest/user/current | Get details of user correponsing to provided auth token
*UserControllerApi* | [**requestResetPassword**](docs/UserControllerApi.md#requestResetPassword) | **POST** /rest/user/request-reset-password | requestResetPassword


## Documentation for Models

 - [AccessKeysPair](docs/AccessKeysPair.md)
 - [AddMigrationRequest](docs/AddMigrationRequest.md)
 - [AddMigrationRequestMapping](docs/AddMigrationRequestMapping.md)
 - [AddStorageAccountRequest](docs/AddStorageAccountRequest.md)
 - [AttachStoragesToEndpointRequest](docs/AttachStoragesToEndpointRequest.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [BillingAccount](docs/BillingAccount.md)
 - [BillingAccountWithMoney](docs/BillingAccountWithMoney.md)
 - [Bucket](docs/Bucket.md)
 - [BucketStat](docs/BucketStat.md)
 - [BucketsRequest](docs/BucketsRequest.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [CleanupStat](docs/CleanupStat.md)
 - [CloudLocation](docs/CloudLocation.md)
 - [CostDetails](docs/CostDetails.md)
 - [Distributor](docs/Distributor.md)
 - [Endpoint](docs/Endpoint.md)
 - [EndpointDetails](docs/EndpointDetails.md)
 - [EndpointStat](docs/EndpointStat.md)
 - [EndpointStorage](docs/EndpointStorage.md)
 - [EndpointStorageSettings](docs/EndpointStorageSettings.md)
 - [IdResponse](docs/IdResponse.md)
 - [IdsList](docs/IdsList.md)
 - [LogEntry](docs/LogEntry.md)
 - [LogEvent](docs/LogEvent.md)
 - [Mapping](docs/Mapping.md)
 - [MappingStat](docs/MappingStat.md)
 - [Migration](docs/Migration.md)
 - [MigrationSettings](docs/MigrationSettings.md)
 - [MigrationStat](docs/MigrationStat.md)
 - [Money](docs/Money.md)
 - [NewEndpointStorage](docs/NewEndpointStorage.md)
 - [NewStorageAccount](docs/NewStorageAccount.md)
 - [Organization](docs/Organization.md)
 - [PageLogEntry](docs/PageLogEntry.md)
 - [PageMigration](docs/PageMigration.md)
 - [Pageable](docs/Pageable.md)
 - [Payment](docs/Payment.md)
 - [PaymentAddRequest](docs/PaymentAddRequest.md)
 - [PaymentOptions](docs/PaymentOptions.md)
 - [PriceListEntry](docs/PriceListEntry.md)
 - [PublicAuthenticationConfiguration](docs/PublicAuthenticationConfiguration.md)
 - [RequestResetPasswordReqeust](docs/RequestResetPasswordReqeust.md)
 - [ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [SignUpRequest](docs/SignUpRequest.md)
 - [SignupResult](docs/SignupResult.md)
 - [Slot](docs/Slot.md)
 - [SlotStat](docs/SlotStat.md)
 - [Sort](docs/Sort.md)
 - [StorageAccount](docs/StorageAccount.md)
 - [StorageAccountSettings](docs/StorageAccountSettings.md)
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
