# Java API Client for Flexify IO Management

With [Flexify IO](https://flexify.io/), storing your data in a cloud does not imply dependency on a single provider anymore!

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
    <version>2.12.18.hf1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.flexify:management-apiclient:2.12.18.hf1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/management-apiclient-2.12.18.hf1.jar
* target/lib/*.jar

## Getting Started

Please use our [examples](https://github.com/flexifyio/flexify-manage-api-client-sample)

## Documentation for API Endpoints

All URIs are relative to *https://api.flexify.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthControllerApi* | [**authenticate**](docs/AuthControllerApi.md#authenticate) | **POST** /backend/rest/auth | Generate new access token for the user
*AuthControllerApi* | [**checkTokenAndGetUser**](docs/AuthControllerApi.md#checkTokenAndGetUser) | **GET** /backend/rest/auth/user | Check of given token
*AuthControllerApi* | [**logout**](docs/AuthControllerApi.md#logout) | **POST** /backend/rest/auth/logout | Logout
*BillingAccountControllerApi* | [**getCostsForCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCostsForCurrentUserBillingAccount) | **GET** /backend/rest/account/costs | Get costs for current user
*BillingAccountControllerApi* | [**getCurrentUserBillingAccount**](docs/BillingAccountControllerApi.md#getCurrentUserBillingAccount) | **GET** /backend/rest/account | Get billing account for current user
*BillingAccountControllerApi* | [**getPaymentsForCurrentUser**](docs/BillingAccountControllerApi.md#getPaymentsForCurrentUser) | **GET** /backend/rest/account/payments | Get payments for current user
*CloudLocationsControllerApi* | [**getAutoDeployAvailableLocationsForCurrentUser**](docs/CloudLocationsControllerApi.md#getAutoDeployAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations/auto-deploy | getAutoDeployAvailableLocationsForCurrentUser
*CloudLocationsControllerApi* | [**getExistingAvailableLocationsForCurrentUser**](docs/CloudLocationsControllerApi.md#getExistingAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations | getExistingAvailableLocationsForCurrentUser
*ConfigControllerApi* | [**getConfig**](docs/ConfigControllerApi.md#getConfig) | **GET** /backend/rest/auth/config | Get public Management Server config
*ConfigControllerApi* | [**getConfig1**](docs/ConfigControllerApi.md#getConfig1) | **GET** /backend/rest/config | Get public Management Server config
*CostEstimateControllerApi* | [**estimateMigrationCost**](docs/CostEstimateControllerApi.md#estimateMigrationCost) | **POST** /backend/rest/cost/migration | estimateMigrationCost
*EndpointsControllerApi* | [**attachAccounts**](docs/EndpointsControllerApi.md#attachAccounts) | **POST** /backend/rest/endpoints/{endpoint-id}/storage-accounts | Attach storage accounts to the endpoint
*EndpointsControllerApi* | [**attachBuckets**](docs/EndpointsControllerApi.md#attachBuckets) | **POST** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets | Attach storages to the virtual bucket
*EndpointsControllerApi* | [**changeAccounts**](docs/EndpointsControllerApi.md#changeAccounts) | **PUT** /backend/rest/endpoints/{endpoint-id}/storage-accounts | Modified all storage accounts to the endpoint
*EndpointsControllerApi* | [**changeBuckets**](docs/EndpointsControllerApi.md#changeBuckets) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets | Replaces the list of storages attached to the virtual bucket
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
*EndpointsControllerApi* | [**getEndpointSecretKey**](docs/EndpointsControllerApi.md#getEndpointSecretKey) | **GET** /backend/rest/endpoints/{endpoint-id}/settings/secret-key | Get endpoint secret key
*EndpointsControllerApi* | [**getEndpointsForCurrentUser**](docs/EndpointsControllerApi.md#getEndpointsForCurrentUser) | **GET** /backend/rest/endpoints | Get the list of endpoints for current user optionally filtering by name or identity using SQL LIKE syntax
*EndpointsControllerApi* | [**setAttachedAccountSettings**](docs/EndpointsControllerApi.md#setAttachedAccountSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id}/settings | Modifies settings of the attached storage account
*EndpointsControllerApi* | [**setAttachedBucketSettings**](docs/EndpointsControllerApi.md#setAttachedBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id}/settings | Modifies settings of the attached storage
*EndpointsControllerApi* | [**setVirtualBucketSettings**](docs/EndpointsControllerApi.md#setVirtualBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/settings | Modifies virtual bucket configuration
*EndpointsControllerApi* | [**updateEndpointSettings**](docs/EndpointsControllerApi.md#updateEndpointSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/settings | Update attributes of the endpoint
*ImpersonationControllerApi* | [**addImpersonateCode**](docs/ImpersonationControllerApi.md#addImpersonateCode) | **POST** /backend/rest/impersonate/codes | addImpersonateCode
*ImpersonationControllerApi* | [**addImpersonateFromUser**](docs/ImpersonationControllerApi.md#addImpersonateFromUser) | **POST** /backend/rest/impersonate/from | addImpersonateFromUser
*ImpersonationControllerApi* | [**getImpersonateCodesList**](docs/ImpersonationControllerApi.md#getImpersonateCodesList) | **GET** /backend/rest/impersonate/codes | getImpersonateCodesList
*ImpersonationControllerApi* | [**getImpersonateFromList**](docs/ImpersonationControllerApi.md#getImpersonateFromList) | **GET** /backend/rest/impersonate/from | getImpersonateFromList
*ImpersonationControllerApi* | [**getImpersonateToList**](docs/ImpersonationControllerApi.md#getImpersonateToList) | **GET** /backend/rest/impersonate/to | getImpersonateToList
*ImpersonationControllerApi* | [**impersonate**](docs/ImpersonationControllerApi.md#impersonate) | **POST** /backend/rest/impersonate/as/{userId} | impersonate
*ImpersonationControllerApi* | [**removeImpersonateFromUser**](docs/ImpersonationControllerApi.md#removeImpersonateFromUser) | **DELETE** /backend/rest/impersonate/from/{user-id} | removeImpersonateFromUser
*ImpersonationControllerApi* | [**removeImpersonateFromUser1**](docs/ImpersonationControllerApi.md#removeImpersonateFromUser1) | **DELETE** /backend/rest/impersonate/codes/{code} | removeImpersonateFromUser
*LogControllerApi* | [**getLogForCurrentUser**](docs/LogControllerApi.md#getLogForCurrentUser) | **GET** /backend/rest/log | getLogForCurrentUser
*MigrationsControllerApi* | [**addMigration**](docs/MigrationsControllerApi.md#addMigration) | **POST** /backend/rest/migrations | Add new migration
*MigrationsControllerApi* | [**getMigration**](docs/MigrationsControllerApi.md#getMigration) | **GET** /backend/rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
*MigrationsControllerApi* | [**getMigrations**](docs/MigrationsControllerApi.md#getMigrations) | **GET** /backend/rest/migrations | Get all migrations for logged in user in paged mode
*MigrationsControllerApi* | [**hideAllMigrations**](docs/MigrationsControllerApi.md#hideAllMigrations) | **POST** /backend/rest/migrations/actions/hide-all | Mark all unfinished migrations as hidden UI
*MigrationsControllerApi* | [**hideMigration**](docs/MigrationsControllerApi.md#hideMigration) | **POST** /backend/rest/migrations/{migration-id}/actions/hide | Mark migration as hidden
*MigrationsControllerApi* | [**restartSlot**](docs/MigrationsControllerApi.md#restartSlot) | **POST** /backend/rest/migrations/{migration-id}/mappings/{mapping-id}/slots/{slot}/actions/restart | Mark migration as hidden
*MigrationsControllerApi* | [**stopMigration**](docs/MigrationsControllerApi.md#stopMigration) | **POST** /backend/rest/migrations/{migration-id}/actions/stop | Stop (cancel) the migration
*OAuthControllerApi* | [**getAppInfo**](docs/OAuthControllerApi.md#getAppInfo) | **GET** /backend/rest/oauth/app-info | getAppInfo
*PartnerOrganizationsControllerApi* | [**getAll**](docs/PartnerOrganizationsControllerApi.md#getAll) | **GET** /backend/rest/partner/organizations | getAll
*PartnerOrganizationsControllerApi* | [**getOrgLimits**](docs/PartnerOrganizationsControllerApi.md#getOrgLimits) | **GET** /backend/rest/partner/organizations/{orgId}/limits | getOrgLimits
*PartnerSignUpCodesControllerApi* | [**createCode**](docs/PartnerSignUpCodesControllerApi.md#createCode) | **POST** /backend/rest/distributor/codes | createCode
*PartnerSignUpCodesControllerApi* | [**createCode1**](docs/PartnerSignUpCodesControllerApi.md#createCode1) | **POST** /backend/rest/partner/codes | createCode
*PartnerSignUpCodesControllerApi* | [**deleteCode**](docs/PartnerSignUpCodesControllerApi.md#deleteCode) | **DELETE** /backend/rest/distributor/codes/{code} | deleteCode
*PartnerSignUpCodesControllerApi* | [**deleteCode1**](docs/PartnerSignUpCodesControllerApi.md#deleteCode1) | **DELETE** /backend/rest/partner/codes/{code} | deleteCode
*PartnerSignUpCodesControllerApi* | [**getAll1**](docs/PartnerSignUpCodesControllerApi.md#getAll1) | **GET** /backend/rest/distributor/codes | getAll
*PartnerSignUpCodesControllerApi* | [**getAll2**](docs/PartnerSignUpCodesControllerApi.md#getAll2) | **GET** /backend/rest/partner/codes | getAll
*PartnerUsersControllerApi* | [**changeUserState**](docs/PartnerUsersControllerApi.md#changeUserState) | **PUT** /backend/rest/distributor/users/{userId}/state | Change user state
*PartnerUsersControllerApi* | [**changeUserState1**](docs/PartnerUsersControllerApi.md#changeUserState1) | **PUT** /backend/rest/partner/users/{userId}/state | Change user state
*PartnerUsersControllerApi* | [**changeUserStateByExternalId**](docs/PartnerUsersControllerApi.md#changeUserStateByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId}/state | Change user state by external ID
*PartnerUsersControllerApi* | [**changeUserStateByExternalId1**](docs/PartnerUsersControllerApi.md#changeUserStateByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId}/state | Change user state by external ID
*PartnerUsersControllerApi* | [**changeUserStateByUsername**](docs/PartnerUsersControllerApi.md#changeUserStateByUsername) | **PUT** /backend/rest/distributor/users/username/{username}/state | Change user state by username
*PartnerUsersControllerApi* | [**changeUserStateByUsername1**](docs/PartnerUsersControllerApi.md#changeUserStateByUsername1) | **PUT** /backend/rest/partner/users/username/{username}/state | Change user state by username
*PartnerUsersControllerApi* | [**create**](docs/PartnerUsersControllerApi.md#create) | **POST** /backend/rest/distributor/users | Create a user
*PartnerUsersControllerApi* | [**create1**](docs/PartnerUsersControllerApi.md#create1) | **POST** /backend/rest/partner/users | Create a user
*PartnerUsersControllerApi* | [**createPasswordResetToken**](docs/PartnerUsersControllerApi.md#createPasswordResetToken) | **POST** /backend/rest/distributor/users/{userId}/actions/create-password-reset-token | Create password reset token
*PartnerUsersControllerApi* | [**createPasswordResetToken1**](docs/PartnerUsersControllerApi.md#createPasswordResetToken1) | **POST** /backend/rest/partner/users/{userId}/actions/create-password-reset-token | Create password reset token
*PartnerUsersControllerApi* | [**createPasswordResetTokenByExternalId**](docs/PartnerUsersControllerApi.md#createPasswordResetTokenByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/actions/create-password-reset-token | Create password reset token by external ID
*PartnerUsersControllerApi* | [**createPasswordResetTokenByExternalId1**](docs/PartnerUsersControllerApi.md#createPasswordResetTokenByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/actions/create-password-reset-token | Create password reset token by external ID
*PartnerUsersControllerApi* | [**createPasswordResetTokenByUsername**](docs/PartnerUsersControllerApi.md#createPasswordResetTokenByUsername) | **POST** /backend/rest/distributor/users/username/{username}/actions/create-password-reset-token | Create password reset token by username
*PartnerUsersControllerApi* | [**createPasswordResetTokenByUsername1**](docs/PartnerUsersControllerApi.md#createPasswordResetTokenByUsername1) | **POST** /backend/rest/partner/users/username/{username}/actions/create-password-reset-token | Create password reset token by username
*PartnerUsersControllerApi* | [**deleteUser**](docs/PartnerUsersControllerApi.md#deleteUser) | **DELETE** /backend/rest/distributor/users/{userId} | Delete user
*PartnerUsersControllerApi* | [**deleteUser1**](docs/PartnerUsersControllerApi.md#deleteUser1) | **DELETE** /backend/rest/partner/users/{userId} | Delete user
*PartnerUsersControllerApi* | [**deleteUserByExternalId**](docs/PartnerUsersControllerApi.md#deleteUserByExternalId) | **DELETE** /backend/rest/distributor/users/external/{externalId} | Delete user by external ID
*PartnerUsersControllerApi* | [**deleteUserByExternalId1**](docs/PartnerUsersControllerApi.md#deleteUserByExternalId1) | **DELETE** /backend/rest/partner/users/external/{externalId} | Delete user by external ID
*PartnerUsersControllerApi* | [**deleteUserByUsername**](docs/PartnerUsersControllerApi.md#deleteUserByUsername) | **DELETE** /backend/rest/distributor/users/username/{username} | Delete user by username
*PartnerUsersControllerApi* | [**deleteUserByUsername1**](docs/PartnerUsersControllerApi.md#deleteUserByUsername1) | **DELETE** /backend/rest/partner/users/username/{username} | Delete user by username
*PartnerUsersControllerApi* | [**generateToken**](docs/PartnerUsersControllerApi.md#generateToken) | **POST** /backend/rest/distributor/users/{userId}/tokens | Create token
*PartnerUsersControllerApi* | [**generateToken1**](docs/PartnerUsersControllerApi.md#generateToken1) | **POST** /backend/rest/partner/users/{userId}/tokens | Create token
*PartnerUsersControllerApi* | [**generateTokenByExternalId**](docs/PartnerUsersControllerApi.md#generateTokenByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/tokens | Create token by external ID
*PartnerUsersControllerApi* | [**generateTokenByExternalId1**](docs/PartnerUsersControllerApi.md#generateTokenByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/tokens | Create token by external ID
*PartnerUsersControllerApi* | [**generateTokenByUsername**](docs/PartnerUsersControllerApi.md#generateTokenByUsername) | **POST** /backend/rest/distributor/users/username/{username}/tokens | Create token by username
*PartnerUsersControllerApi* | [**generateTokenByUsername1**](docs/PartnerUsersControllerApi.md#generateTokenByUsername1) | **POST** /backend/rest/partner/users/username/{username}/tokens | Create token by username
*PartnerUsersControllerApi* | [**getAllUsersPageable**](docs/PartnerUsersControllerApi.md#getAllUsersPageable) | **GET** /backend/rest/distributor/users/search | Get users with search, sorting and pagination
*PartnerUsersControllerApi* | [**getAllUsersPageable1**](docs/PartnerUsersControllerApi.md#getAllUsersPageable1) | **GET** /backend/rest/partner/users/search | Get users with search, sorting and pagination
*PartnerUsersControllerApi* | [**getUser**](docs/PartnerUsersControllerApi.md#getUser) | **GET** /backend/rest/distributor/users/{userId} | Get user details
*PartnerUsersControllerApi* | [**getUser1**](docs/PartnerUsersControllerApi.md#getUser1) | **GET** /backend/rest/partner/users/{userId} | Get user details
*PartnerUsersControllerApi* | [**getUserByExternalId**](docs/PartnerUsersControllerApi.md#getUserByExternalId) | **GET** /backend/rest/distributor/users/external/{externalId} | Get user details by external ID
*PartnerUsersControllerApi* | [**getUserByExternalId1**](docs/PartnerUsersControllerApi.md#getUserByExternalId1) | **GET** /backend/rest/partner/users/external/{externalId} | Get user details by external ID
*PartnerUsersControllerApi* | [**getUserByUsername**](docs/PartnerUsersControllerApi.md#getUserByUsername) | **GET** /backend/rest/distributor/users/username/{username} | Get user details by username
*PartnerUsersControllerApi* | [**getUserByUsername1**](docs/PartnerUsersControllerApi.md#getUserByUsername1) | **GET** /backend/rest/partner/users/username/{username} | Get user details by username
*PartnerUsersControllerApi* | [**getUsers**](docs/PartnerUsersControllerApi.md#getUsers) | **GET** /backend/rest/distributor/users | Get all users
*PartnerUsersControllerApi* | [**getUsers1**](docs/PartnerUsersControllerApi.md#getUsers1) | **GET** /backend/rest/partner/users | Get all users
*PartnerUsersControllerApi* | [**sendPasswordResetEmail**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmail) | **POST** /backend/rest/distributor/users/{userId}/actions/send-password-reset-email | Set/reset password
*PartnerUsersControllerApi* | [**sendPasswordResetEmail1**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmail1) | **POST** /backend/rest/partner/users/{userId}/actions/send-password-reset-email | Set/reset password
*PartnerUsersControllerApi* | [**sendPasswordResetEmailByExternalId**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmailByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/actions/send-password-reset-email | Set/reset password by external ID
*PartnerUsersControllerApi* | [**sendPasswordResetEmailByExternalId1**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmailByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/actions/send-password-reset-email | Set/reset password by external ID
*PartnerUsersControllerApi* | [**sendPasswordResetEmailByUsername**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmailByUsername) | **POST** /backend/rest/distributor/users/username/{username}/actions/send-password-reset-email | Set/reset password by username
*PartnerUsersControllerApi* | [**sendPasswordResetEmailByUsername1**](docs/PartnerUsersControllerApi.md#sendPasswordResetEmailByUsername1) | **POST** /backend/rest/partner/users/username/{username}/actions/send-password-reset-email | Set/reset password by username
*PartnerUsersControllerApi* | [**setRoles**](docs/PartnerUsersControllerApi.md#setRoles) | **PUT** /backend/rest/distributor/users/{userId}/roles | setRoles
*PartnerUsersControllerApi* | [**setRoles1**](docs/PartnerUsersControllerApi.md#setRoles1) | **PUT** /backend/rest/partner/users/{userId}/roles | setRoles
*PartnerUsersControllerApi* | [**setRolesByExternalId**](docs/PartnerUsersControllerApi.md#setRolesByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId}/roles | setRolesByExternalId
*PartnerUsersControllerApi* | [**setRolesByExternalId1**](docs/PartnerUsersControllerApi.md#setRolesByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId}/roles | setRolesByExternalId
*PartnerUsersControllerApi* | [**setRolesByUsername**](docs/PartnerUsersControllerApi.md#setRolesByUsername) | **PUT** /backend/rest/distributor/users/username/{username}/roles | setRolesByUsername
*PartnerUsersControllerApi* | [**setRolesByUsername1**](docs/PartnerUsersControllerApi.md#setRolesByUsername1) | **PUT** /backend/rest/partner/users/username/{username}/roles | setRolesByUsername
*PartnerUsersControllerApi* | [**updateUser**](docs/PartnerUsersControllerApi.md#updateUser) | **PUT** /backend/rest/distributor/users/{userId} | Update profile
*PartnerUsersControllerApi* | [**updateUser1**](docs/PartnerUsersControllerApi.md#updateUser1) | **PUT** /backend/rest/partner/users/{userId} | Update profile
*PartnerUsersControllerApi* | [**updateUserByExternalId**](docs/PartnerUsersControllerApi.md#updateUserByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId} | Update profile by external ID
*PartnerUsersControllerApi* | [**updateUserByExternalId1**](docs/PartnerUsersControllerApi.md#updateUserByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId} | Update profile by external ID
*PartnerUsersControllerApi* | [**updateUserByUsername**](docs/PartnerUsersControllerApi.md#updateUserByUsername) | **PUT** /backend/rest/distributor/users/username/{username} | Update profile by username
*PartnerUsersControllerApi* | [**updateUserByUsername1**](docs/PartnerUsersControllerApi.md#updateUserByUsername1) | **PUT** /backend/rest/partner/users/username/{username} | Update profile by username
*PaymentsControllerApi* | [**getPaymentOptions**](docs/PaymentsControllerApi.md#getPaymentOptions) | **GET** /backend/rest/pay/paddle/options | getPaymentOptions
*PaymentsControllerApi* | [**paymentFulfilled**](docs/PaymentsControllerApi.md#paymentFulfilled) | **GET** /backend/rest/pay/paddle/webhook | paymentFulfilled
*ProvidersControllerApi* | [**getProviders**](docs/ProvidersControllerApi.md#getProviders) | **GET** /backend/rest/providers | Get all storage providers
*StorageAccountsControllerApi* | [**addStorageAccount**](docs/StorageAccountsControllerApi.md#addStorageAccount) | **POST** /backend/rest/storage-accounts | Add Storage Account with an optional list of buckets
*StorageAccountsControllerApi* | [**deleteStorageAccount**](docs/StorageAccountsControllerApi.md#deleteStorageAccount) | **DELETE** /backend/rest/storage-accounts/{storage-account-id} | Deletes (hides) storage account and all its buckets/containers
*StorageAccountsControllerApi* | [**deleteStorageAccounts**](docs/StorageAccountsControllerApi.md#deleteStorageAccounts) | **POST** /backend/rest/storage-accounts/actions/delete | Deletes (hides) a multiple storage accounts and all their buckets/containers
*StorageAccountsControllerApi* | [**getStorageAccount**](docs/StorageAccountsControllerApi.md#getStorageAccount) | **GET** /backend/rest/storage-accounts/{storage-account-id} | Get storage account by id
*StorageAccountsControllerApi* | [**getStorageAccounts**](docs/StorageAccountsControllerApi.md#getStorageAccounts) | **GET** /backend/rest/storage-accounts | Get all storage accounts for current user
*StorageAccountsControllerApi* | [**refreshStorageAccount**](docs/StorageAccountsControllerApi.md#refreshStorageAccount) | **POST** /backend/rest/storage-accounts/{storage-account-id}/actions/refresh | Requests and updates list of buckets/containers for the storage account
*StorageAccountsControllerApi* | [**refreshStorageAccounts**](docs/StorageAccountsControllerApi.md#refreshStorageAccounts) | **POST** /backend/rest/storage-accounts/actions/refresh | Requests and updates list of buckets/containers for a list of storage accounts
*StorageAccountsControllerApi* | [**setStorageAccountSettings**](docs/StorageAccountsControllerApi.md#setStorageAccountSettings) | **PUT** /backend/rest/storage-accounts/{storage-account-id}/settings | Updates storage account settings
*StoragesControllerApi* | [**addBuckets**](docs/StoragesControllerApi.md#addBuckets) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets | Add buckets to the storage account
*StoragesControllerApi* | [**deleteBucket**](docs/StoragesControllerApi.md#deleteBucket) | **DELETE** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Deletes (hides) a bucket/container
*StoragesControllerApi* | [**getBucket**](docs/StoragesControllerApi.md#getBucket) | **GET** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Get detailed stats for the bucket
*StoragesControllerApi* | [**refreshBucket**](docs/StoragesControllerApi.md#refreshBucket) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh | Refresh statistics of a single bucket
*UserControllerApi* | [**changeMicrosoftSso**](docs/UserControllerApi.md#changeMicrosoftSso) | **POST** /backend/rest/user/current/sso-microsoft | changeMicrosoftSso
*UserControllerApi* | [**getCurrentUser**](docs/UserControllerApi.md#getCurrentUser) | **GET** /backend/rest/user/current | Get details of user corresponding to provided auth token
*UserControllerApi* | [**requestDelete**](docs/UserControllerApi.md#requestDelete) | **POST** /backend/rest/user/request-delete | requestDelete
*UserControllerApi* | [**requestResetPassword**](docs/UserControllerApi.md#requestResetPassword) | **POST** /backend/rest/user/request-reset-password | requestResetPassword


## Documentation for Models

 - [AccessKeysPair](docs/AccessKeysPair.md)
 - [AddImpersonateCodeRequest](docs/AddImpersonateCodeRequest.md)
 - [AddImpersonateFromUserRequest](docs/AddImpersonateFromUserRequest.md)
 - [AddMigrationRequest](docs/AddMigrationRequest.md)
 - [AddMigrationRequestMapping](docs/AddMigrationRequestMapping.md)
 - [AddStorageAccountRequest](docs/AddStorageAccountRequest.md)
 - [AuthAppInfo](docs/AuthAppInfo.md)
 - [AuthCheckTokenAndGetUserResponse](docs/AuthCheckTokenAndGetUserResponse.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [BillingAccount](docs/BillingAccount.md)
 - [Bucket](docs/Bucket.md)
 - [BucketStat](docs/BucketStat.md)
 - [BucketsRequest](docs/BucketsRequest.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [ChangeSsoMicrosoftRequest](docs/ChangeSsoMicrosoftRequest.md)
 - [CleanupStat](docs/CleanupStat.md)
 - [CloudLocation](docs/CloudLocation.md)
 - [CloudLocationReq](docs/CloudLocationReq.md)
 - [CloudLocationRes](docs/CloudLocationRes.md)
 - [CostDetails](docs/CostDetails.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [CreateVirtualBucketRequest](docs/CreateVirtualBucketRequest.md)
 - [Distributor](docs/Distributor.md)
 - [DtoMappingCostEstimate](docs/DtoMappingCostEstimate.md)
 - [DtoMappingCostEstimateEntry](docs/DtoMappingCostEstimateEntry.md)
 - [DtoMigrationCostEstimate](docs/DtoMigrationCostEstimate.md)
 - [EndpointDetails](docs/EndpointDetails.md)
 - [EndpointSecretResponse](docs/EndpointSecretResponse.md)
 - [EndpointSettingsReq](docs/EndpointSettingsReq.md)
 - [EndpointSettingsRes](docs/EndpointSettingsRes.md)
 - [EndpointStat](docs/EndpointStat.md)
 - [EndpointStorageAccount](docs/EndpointStorageAccount.md)
 - [EndpointStorageAccountSettings](docs/EndpointStorageAccountSettings.md)
 - [IdResponse](docs/IdResponse.md)
 - [IdsList](docs/IdsList.md)
 - [ImpersonateUser](docs/ImpersonateUser.md)
 - [InformationAboutAuthenticationToken](docs/InformationAboutAuthenticationToken.md)
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
 - [PageUserStat](docs/PageUserStat.md)
 - [Pageable](docs/Pageable.md)
 - [PasswordResetToken](docs/PasswordResetToken.md)
 - [Payment](docs/Payment.md)
 - [PaymentOptions](docs/PaymentOptions.md)
 - [PolicyRule](docs/PolicyRule.md)
 - [Price](docs/Price.md)
 - [PriceConstraints](docs/PriceConstraints.md)
 - [PriceList](docs/PriceList.md)
 - [PublicAuthenticationConfiguration](docs/PublicAuthenticationConfiguration.md)
 - [PublicManagementServerConfiguration](docs/PublicManagementServerConfiguration.md)
 - [RequestResetPasswordRequest](docs/RequestResetPasswordRequest.md)
 - [ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [ResetSsoRequest](docs/ResetSsoRequest.md)
 - [SetRolesRequest](docs/SetRolesRequest.md)
 - [SetUserStateRequest](docs/SetUserStateRequest.md)
 - [SignUpRequest](docs/SignUpRequest.md)
 - [SignupCodeReq](docs/SignupCodeReq.md)
 - [SignupCodeRes](docs/SignupCodeRes.md)
 - [SignupCodeStat](docs/SignupCodeStat.md)
 - [SignupResult](docs/SignupResult.md)
 - [Slot](docs/Slot.md)
 - [SlotStat](docs/SlotStat.md)
 - [Sort](docs/Sort.md)
 - [StorageAccount](docs/StorageAccount.md)
 - [StorageAccountSettings](docs/StorageAccountSettings.md)
 - [StorageAccountSettingsReq](docs/StorageAccountSettingsReq.md)
 - [StorageAccountSettingsRes](docs/StorageAccountSettingsRes.md)
 - [StorageAccountStat](docs/StorageAccountStat.md)
 - [StorageAccountWithBuckets](docs/StorageAccountWithBuckets.md)
 - [StorageAccountsRequest](docs/StorageAccountsRequest.md)
 - [StorageProvider](docs/StorageProvider.md)
 - [TokenConfiguration](docs/TokenConfiguration.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)
 - [UserConfig](docs/UserConfig.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserSettings](docs/UserSettings.md)
 - [UserStat](docs/UserStat.md)
 - [VirtualBucket](docs/VirtualBucket.md)
 - [VirtualBucketAccessPolicy](docs/VirtualBucketAccessPolicy.md)
 - [VirtualBucketSettings](docs/VirtualBucketSettings.md)
 - [VirtualBucketStorage](docs/VirtualBucketStorage.md)
 - [VirtualBucketStorageSettings](docs/VirtualBucketStorageSettings.md)
 - [VirtualBucketStoragesRequest](docs/VirtualBucketStoragesRequest.md)


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
