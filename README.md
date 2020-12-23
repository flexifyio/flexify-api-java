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
    <version>2.12.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.flexify:management-apiclient:2.12.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/management-apiclient-2.12.1.jar
* target/lib/*.jar

## Getting Started

Please use our [examples](https://github.com/flexifyio/flexify-manage-api-client-sample)

## Documentation for API Endpoints

All URIs are relative to *https://api.flexify.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthControllerApi* | [**authenticate**](docs/AuthControllerApi.md#authenticate) | **POST** /backend/rest/auth | Generate new access token for the user
*AuthControllerApi* | [**authorize**](docs/AuthControllerApi.md#authorize) | **POST** /backend/rest/auth/authorize | Authorization check of given token
*AuthControllerApi* | [**getConfig**](docs/AuthControllerApi.md#getConfig) | **GET** /backend/rest/auth/config | Logout
*AuthControllerApi* | [**logout**](docs/AuthControllerApi.md#logout) | **POST** /backend/rest/auth/logout | Logout
*BillingAccountControllerApi* | [**getCostsForCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCostsForCurrentUserBillingAccount) | **GET** /backend/rest/account/costs | Get costs for current user
*BillingAccountControllerApi* | [**getCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCurrentUserBillingAccount) | **GET** /backend/rest/account | Get billing account for current user
*BillingAccountControllerApi* | [**getPaymentsForCurrentUser**](docs/BillingAccountControllerApi.md#getPaymentsForCurrentUser) | **GET** /backend/rest/account/payments | Get payments for current user
*CloudLocationsControllerApi* | [**getAutoDeployAvailableLocationsForCurrentUser**](docs/CloudLocationsControllerApi.md#getAutoDeployAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations/auto-deploy | getAutoDeployAvailableLocationsForCurrentUser
*CloudLocationsControllerApi* | [**getExistingAvailableLocationsForCurrentUser**](docs/CloudLocationsControllerApi.md#getExistingAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations | getExistingAvailableLocationsForCurrentUser
*CostEstimateControllerApi* | [**estimateMigrationCost**](docs/CostEstimateControllerApi.md#estimateMigrationCost) | **POST** /backend/rest/cost/migration | estimateMigrationCost
*EndpointsControllerApi* | [**attachAccounts**](docs/EndpointsControllerApi.md#attachAccounts) | **POST** /backend/rest/endpoints/{endpoint-id}/storage-accounts | Attach storage accounts to the endpoint
*EndpointsControllerApi* | [**attachBuckets**](docs/EndpointsControllerApi.md#attachBuckets) | **POST** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets | Attach storages to the virtual bucket
*EndpointsControllerApi* | [**createEndpoint**](docs/EndpointsControllerApi.md#createEndpoint) | **POST** /backend/rest/endpoints | Creates new endpoint
*EndpointsControllerApi* | [**createVirtualBucket**](docs/EndpointsControllerApi.md#createVirtualBucket) | **POST** /backend/rest/endpoints/{endpoint-id}/virtual-buckets | Creates new virtual bucket
*EndpointsControllerApi* | [**delete**](docs/EndpointsControllerApi.md#delete) | **DELETE** /backend/rest/endpoints/{endpoint-id} | Delete the endpoint
*EndpointsControllerApi* | [**deleteVirtualBucket**](docs/EndpointsControllerApi.md#deleteVirtualBucket) | **DELETE** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket} | Deletes virtual bucket
*EndpointsControllerApi* | [**detachAccount**](docs/EndpointsControllerApi.md#detachAccount) | **DELETE** /backend/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id} | Detach storage account from the endpoint
*EndpointsControllerApi* | [**detachBucket**](docs/EndpointsControllerApi.md#detachBucket) | **DELETE** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id} | Detach storage account from the endpoint
*EndpointsControllerApi* | [**disable**](docs/EndpointsControllerApi.md#disable) | **PUT** /backend/rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
*EndpointsControllerApi* | [**enable**](docs/EndpointsControllerApi.md#enable) | **PUT** /backend/rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
*EndpointsControllerApi* | [**generateAccessKeys**](docs/EndpointsControllerApi.md#generateAccessKeys) | **GET** /backend/rest/endpoints/generated-access-keys | Generate new access keys pair
*EndpointsControllerApi* | [**getEndpointDetails**](docs/EndpointsControllerApi.md#getEndpointDetails) | **GET** /backend/rest/endpoints/{endpoint-id} | Get endpoint details
*EndpointsControllerApi* | [**getEndpointsForCurrentUser**](docs/EndpointsControllerApi.md#getEndpointsForCurrentUser) | **GET** /backend/rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
*EndpointsControllerApi* | [**setAttachedAccountSettings**](docs/EndpointsControllerApi.md#setAttachedAccountSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id}/settings | Modifies settings of the attached storage account
*EndpointsControllerApi* | [**setAttachedBucketSettings**](docs/EndpointsControllerApi.md#setAttachedBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id}/settings | Modifies settings of the attached storage
*EndpointsControllerApi* | [**setVirtualBucketSettings**](docs/EndpointsControllerApi.md#setVirtualBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/settings | Modifies virtual bucket configuration
*EndpointsControllerApi* | [**updateEndpointSettings**](docs/EndpointsControllerApi.md#updateEndpointSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/settings | Update attributes of the endpoint
*LogControllerApi* | [**getLogForCurrentUser**](docs/LogControllerApi.md#getLogForCurrentUser) | **GET** /backend/rest/log | getLogForCurrentUser
*MigrationsControllerApi* | [**addMigration**](docs/MigrationsControllerApi.md#addMigration) | **POST** /backend/rest/migrations | Add new migration
*MigrationsControllerApi* | [**getMigration**](docs/MigrationsControllerApi.md#getMigration) | **GET** /backend/rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
*MigrationsControllerApi* | [**getMigrations**](docs/MigrationsControllerApi.md#getMigrations) | **GET** /backend/rest/migrations | Get all migrations for logged in user in paged mode
*MigrationsControllerApi* | [**hideAllMigrations**](docs/MigrationsControllerApi.md#hideAllMigrations) | **POST** /backend/rest/migrations/actions/hide-all | Mark all unfinished migrations as hidden UI
*MigrationsControllerApi* | [**hideMigration**](docs/MigrationsControllerApi.md#hideMigration) | **POST** /backend/rest/migrations/{migration-id}/actions/hide | Mark migration as hidden
*MigrationsControllerApi* | [**restartSlot**](docs/MigrationsControllerApi.md#restartSlot) | **POST** /backend/rest/migrations/{migration-id}/mappings/{mapping-id}/slots/{slot}/actions/restart | Mark migration as hidden
*MigrationsControllerApi* | [**stopMigration**](docs/MigrationsControllerApi.md#stopMigration) | **POST** /backend/rest/migrations/{migration-id}/actions/stop | Stop (cancel) the migration
*OAuthControllerApi* | [**getAppInfo**](docs/OAuthControllerApi.md#getAppInfo) | **GET** /backend/rest/oauth/app-info | getAppInfo
*PaymentsControllerApi* | [**getPaymentOptions**](docs/PaymentsControllerApi.md#getPaymentOptions) | **GET** /backend/rest/pay/paddle/options | getPaymentOptions
*PaymentsControllerApi* | [**paymentFulfilled**](docs/PaymentsControllerApi.md#paymentFulfilled) | **GET** /backend/rest/pay/paddle/webhook | paymentFulfilled
*StorageAccountsControllerApi* | [**addStorageAccount**](docs/StorageAccountsControllerApi.md#addStorageAccount) | **POST** /backend/rest/storage-accounts | Add Storage Account with an optional list of buckets
*StorageAccountsControllerApi* | [**deleteStorageAccount**](docs/StorageAccountsControllerApi.md#deleteStorageAccount) | **DELETE** /backend/rest/storage-accounts/{storage-account-id} | Deletes (hides) storage account and all its buckets/containers
*StorageAccountsControllerApi* | [**deleteStorageAccounts**](docs/StorageAccountsControllerApi.md#deleteStorageAccounts) | **POST** /backend/rest/storage-accounts/actions/delete | Deletes (hides) a multiple storage accounts and all their buckets/containers
*StorageAccountsControllerApi* | [**getStorageAccount**](docs/StorageAccountsControllerApi.md#getStorageAccount) | **GET** /backend/rest/storage-accounts/storage-accounts/{storage-account-id} | Get storage account by id
*StorageAccountsControllerApi* | [**getStorageAccounts**](docs/StorageAccountsControllerApi.md#getStorageAccounts) | **GET** /backend/rest/storage-accounts | Get all storage accounts for current user
*StorageAccountsControllerApi* | [**refreshStorageAccount**](docs/StorageAccountsControllerApi.md#refreshStorageAccount) | **POST** /backend/rest/storage-accounts/{storage-account-id}/actions/refresh | Requests and updates list of buckets/containers for the storage account
*StorageAccountsControllerApi* | [**refreshStorageAccounts**](docs/StorageAccountsControllerApi.md#refreshStorageAccounts) | **POST** /backend/rest/storage-accounts/actions/refresh | Requests and updates list of buckets/containers for a list of storage accounts
*StorageAccountsControllerApi* | [**setStorageAccountSettings**](docs/StorageAccountsControllerApi.md#setStorageAccountSettings) | **PUT** /backend/rest/storage-accounts/{storage-account-id}/settings | Updates storage account settings
*StoragesControllerApi* | [**addBuckets**](docs/StoragesControllerApi.md#addBuckets) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets | Add buckets to the storage account
*StoragesControllerApi* | [**deleteBucket**](docs/StoragesControllerApi.md#deleteBucket) | **DELETE** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Deletes (hides) a bucket/container
*StoragesControllerApi* | [**deleteBuckets**](docs/StoragesControllerApi.md#deleteBuckets) | **POST** /backend/rest/storage-accounts/actions/delete-buckets | Deletes (hides) multiple buckets/containers
*StoragesControllerApi* | [**getProviders**](docs/StoragesControllerApi.md#getProviders) | **GET** /backend/rest/providers | Get all storage providers
*StoragesControllerApi* | [**refreshBucket**](docs/StoragesControllerApi.md#refreshBucket) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh | Refresh statistics of a single bucket
*StoragesControllerApi* | [**refreshBuckets**](docs/StoragesControllerApi.md#refreshBuckets) | **POST** /backend/rest/storage-accounts/actions/refresh-buckets | Refresh statistics of multiple buckets
*UserControllerApi* | [**getCurrentUser**](docs/UserControllerApi.md#getCurrentUser) | **GET** /backend/rest/user/current | Get details of user corresponding to provided auth token
*UserControllerApi* | [**requestDelete**](docs/UserControllerApi.md#requestDelete) | **POST** /backend/rest/user/request-delete | requestDelete
*UserControllerApi* | [**requestResetPassword**](docs/UserControllerApi.md#requestResetPassword) | **POST** /backend/rest/user/request-reset-password | requestResetPassword


## Documentation for Models

 - [AccessKeysPair](docs/AccessKeysPair.md)
 - [AddMigrationRequest](docs/AddMigrationRequest.md)
 - [AddMigrationRequestMapping](docs/AddMigrationRequestMapping.md)
 - [AddStorageAccountRequest](docs/AddStorageAccountRequest.md)
 - [AttachStorageAccountsRequest](docs/AttachStorageAccountsRequest.md)
 - [AttachVirtualBucketStoragesRequest](docs/AttachVirtualBucketStoragesRequest.md)
 - [AuthAppInfo](docs/AuthAppInfo.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [AuthorizationResponse](docs/AuthorizationResponse.md)
 - [BillingAccount](docs/BillingAccount.md)
 - [BillingAccountWithMoney](docs/BillingAccountWithMoney.md)
 - [Bucket](docs/Bucket.md)
 - [BucketStat](docs/BucketStat.md)
 - [BucketsRequest](docs/BucketsRequest.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [CleanupStat](docs/CleanupStat.md)
 - [CloudLocation](docs/CloudLocation.md)
 - [CloudLocationReq](docs/CloudLocationReq.md)
 - [CloudLocationRes](docs/CloudLocationRes.md)
 - [CostDetails](docs/CostDetails.md)
 - [CreateVirtualBucketRequest](docs/CreateVirtualBucketRequest.md)
 - [Distributor](docs/Distributor.md)
 - [DtoMappingCostEstimate](docs/DtoMappingCostEstimate.md)
 - [DtoMappingCostEstimateEntry](docs/DtoMappingCostEstimateEntry.md)
 - [DtoMigrationCostEstimate](docs/DtoMigrationCostEstimate.md)
 - [EndpointDetails](docs/EndpointDetails.md)
 - [EndpointSettings](docs/EndpointSettings.md)
 - [EndpointStat](docs/EndpointStat.md)
 - [EndpointStorageAccountReq](docs/EndpointStorageAccountReq.md)
 - [EndpointStorageAccountRes](docs/EndpointStorageAccountRes.md)
 - [EndpointStorageAccountSettings](docs/EndpointStorageAccountSettings.md)
 - [GrantedAuthority](docs/GrantedAuthority.md)
 - [IdResponse](docs/IdResponse.md)
 - [IdsList](docs/IdsList.md)
 - [LogEntry](docs/LogEntry.md)
 - [LogEvent](docs/LogEvent.md)
 - [LogoutRequest](docs/LogoutRequest.md)
 - [Mapping](docs/Mapping.md)
 - [MappingStat](docs/MappingStat.md)
 - [MarkerPageLogEntry](docs/MarkerPageLogEntry.md)
 - [Migration](docs/Migration.md)
 - [MigrationSettings](docs/MigrationSettings.md)
 - [MigrationSettingsReq](docs/MigrationSettingsReq.md)
 - [MigrationSettingsRes](docs/MigrationSettingsRes.md)
 - [MigrationStat](docs/MigrationStat.md)
 - [Money](docs/Money.md)
 - [NewStorageAccount](docs/NewStorageAccount.md)
 - [Organization](docs/Organization.md)
 - [PageMigration](docs/PageMigration.md)
 - [Pageable](docs/Pageable.md)
 - [Payment](docs/Payment.md)
 - [PaymentOptions](docs/PaymentOptions.md)
 - [Price](docs/Price.md)
 - [PriceConstraints](docs/PriceConstraints.md)
 - [PriceList](docs/PriceList.md)
 - [PublicAuthenticationConfiguration](docs/PublicAuthenticationConfiguration.md)
 - [RequestResetPasswordRequest](docs/RequestResetPasswordRequest.md)
 - [ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [SignUpRequest](docs/SignUpRequest.md)
 - [SignupResult](docs/SignupResult.md)
 - [Slot](docs/Slot.md)
 - [SlotStat](docs/SlotStat.md)
 - [Sort](docs/Sort.md)
 - [StorageAccount](docs/StorageAccount.md)
 - [StorageAccountSettings](docs/StorageAccountSettings.md)
 - [StorageAccountSettingsReq](docs/StorageAccountSettingsReq.md)
 - [StorageAccountSettingsRes](docs/StorageAccountSettingsRes.md)
 - [StorageAccountStat](docs/StorageAccountStat.md)
 - [StorageProvider](docs/StorageProvider.md)
 - [User](docs/User.md)
 - [UserConfig](docs/UserConfig.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserSettings](docs/UserSettings.md)
 - [VirtualBucket](docs/VirtualBucket.md)
 - [VirtualBucketSettings](docs/VirtualBucketSettings.md)
 - [VirtualBucketStorageReq](docs/VirtualBucketStorageReq.md)
 - [VirtualBucketStorageRes](docs/VirtualBucketStorageRes.md)
 - [VirtualBucketStorageSettings](docs/VirtualBucketStorageSettings.md)


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
