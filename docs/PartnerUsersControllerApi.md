# PartnerUsersControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserState**](PartnerUsersControllerApi.md#changeUserState) | **PUT** /backend/rest/distributor/users/{userId}/state | Change user state
[**changeUserState1**](PartnerUsersControllerApi.md#changeUserState1) | **PUT** /backend/rest/partner/users/{userId}/state | Change user state
[**changeUserStateByExternalId**](PartnerUsersControllerApi.md#changeUserStateByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId}/state | Change user state by external ID
[**changeUserStateByExternalId1**](PartnerUsersControllerApi.md#changeUserStateByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId}/state | Change user state by external ID
[**changeUserStateByUsername**](PartnerUsersControllerApi.md#changeUserStateByUsername) | **PUT** /backend/rest/distributor/users/username/{username}/state | Change user state by username
[**changeUserStateByUsername1**](PartnerUsersControllerApi.md#changeUserStateByUsername1) | **PUT** /backend/rest/partner/users/username/{username}/state | Change user state by username
[**create**](PartnerUsersControllerApi.md#create) | **POST** /backend/rest/distributor/users | Create a user
[**create1**](PartnerUsersControllerApi.md#create1) | **POST** /backend/rest/partner/users | Create a user
[**createPasswordResetToken**](PartnerUsersControllerApi.md#createPasswordResetToken) | **POST** /backend/rest/distributor/users/{userId}/actions/create-password-reset-token | Create password reset token
[**createPasswordResetToken1**](PartnerUsersControllerApi.md#createPasswordResetToken1) | **POST** /backend/rest/partner/users/{userId}/actions/create-password-reset-token | Create password reset token
[**createPasswordResetTokenByExternalId**](PartnerUsersControllerApi.md#createPasswordResetTokenByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/actions/create-password-reset-token | Create password reset token by external ID
[**createPasswordResetTokenByExternalId1**](PartnerUsersControllerApi.md#createPasswordResetTokenByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/actions/create-password-reset-token | Create password reset token by external ID
[**createPasswordResetTokenByUsername**](PartnerUsersControllerApi.md#createPasswordResetTokenByUsername) | **POST** /backend/rest/distributor/users/username/{username}/actions/create-password-reset-token | Create password reset token by username
[**createPasswordResetTokenByUsername1**](PartnerUsersControllerApi.md#createPasswordResetTokenByUsername1) | **POST** /backend/rest/partner/users/username/{username}/actions/create-password-reset-token | Create password reset token by username
[**deleteUser**](PartnerUsersControllerApi.md#deleteUser) | **DELETE** /backend/rest/distributor/users/{userId} | Delete user
[**deleteUser1**](PartnerUsersControllerApi.md#deleteUser1) | **DELETE** /backend/rest/partner/users/{userId} | Delete user
[**deleteUserByExternalId**](PartnerUsersControllerApi.md#deleteUserByExternalId) | **DELETE** /backend/rest/distributor/users/external/{externalId} | Delete user by external ID
[**deleteUserByExternalId1**](PartnerUsersControllerApi.md#deleteUserByExternalId1) | **DELETE** /backend/rest/partner/users/external/{externalId} | Delete user by external ID
[**deleteUserByUsername**](PartnerUsersControllerApi.md#deleteUserByUsername) | **DELETE** /backend/rest/distributor/users/username/{username} | Delete user by username
[**deleteUserByUsername1**](PartnerUsersControllerApi.md#deleteUserByUsername1) | **DELETE** /backend/rest/partner/users/username/{username} | Delete user by username
[**generateToken**](PartnerUsersControllerApi.md#generateToken) | **POST** /backend/rest/distributor/users/{userId}/tokens | Create token
[**generateToken1**](PartnerUsersControllerApi.md#generateToken1) | **POST** /backend/rest/partner/users/{userId}/tokens | Create token
[**generateTokenByExternalId**](PartnerUsersControllerApi.md#generateTokenByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/tokens | Create token by external ID
[**generateTokenByExternalId1**](PartnerUsersControllerApi.md#generateTokenByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/tokens | Create token by external ID
[**generateTokenByUsername**](PartnerUsersControllerApi.md#generateTokenByUsername) | **POST** /backend/rest/distributor/users/username/{username}/tokens | Create token by username
[**generateTokenByUsername1**](PartnerUsersControllerApi.md#generateTokenByUsername1) | **POST** /backend/rest/partner/users/username/{username}/tokens | Create token by username
[**getUser**](PartnerUsersControllerApi.md#getUser) | **GET** /backend/rest/distributor/users/{userId} | Get user details
[**getUser1**](PartnerUsersControllerApi.md#getUser1) | **GET** /backend/rest/partner/users/{userId} | Get user details
[**getUserByExternalId**](PartnerUsersControllerApi.md#getUserByExternalId) | **GET** /backend/rest/distributor/users/external/{externalId} | Get user details by external ID
[**getUserByExternalId1**](PartnerUsersControllerApi.md#getUserByExternalId1) | **GET** /backend/rest/partner/users/external/{externalId} | Get user details by external ID
[**getUserByUsername**](PartnerUsersControllerApi.md#getUserByUsername) | **GET** /backend/rest/distributor/users/username/{username} | Get user details by username
[**getUserByUsername1**](PartnerUsersControllerApi.md#getUserByUsername1) | **GET** /backend/rest/partner/users/username/{username} | Get user details by username
[**getUsers**](PartnerUsersControllerApi.md#getUsers) | **GET** /backend/rest/distributor/users | Get all users
[**getUsers1**](PartnerUsersControllerApi.md#getUsers1) | **GET** /backend/rest/partner/users | Get all users
[**sendPasswordResetEmail**](PartnerUsersControllerApi.md#sendPasswordResetEmail) | **POST** /backend/rest/distributor/users/{userId}/actions/send-password-reset-email | Set/reset password
[**sendPasswordResetEmail1**](PartnerUsersControllerApi.md#sendPasswordResetEmail1) | **POST** /backend/rest/partner/users/{userId}/actions/send-password-reset-email | Set/reset password
[**sendPasswordResetEmailByExternalId**](PartnerUsersControllerApi.md#sendPasswordResetEmailByExternalId) | **POST** /backend/rest/distributor/users/external/{externalId}/actions/send-password-reset-email | Set/reset password by external ID
[**sendPasswordResetEmailByExternalId1**](PartnerUsersControllerApi.md#sendPasswordResetEmailByExternalId1) | **POST** /backend/rest/partner/users/external/{externalId}/actions/send-password-reset-email | Set/reset password by external ID
[**sendPasswordResetEmailByUsername**](PartnerUsersControllerApi.md#sendPasswordResetEmailByUsername) | **POST** /backend/rest/distributor/users/username/{username}/actions/send-password-reset-email | Set/reset password by username
[**sendPasswordResetEmailByUsername1**](PartnerUsersControllerApi.md#sendPasswordResetEmailByUsername1) | **POST** /backend/rest/partner/users/username/{username}/actions/send-password-reset-email | Set/reset password by username
[**setRoles**](PartnerUsersControllerApi.md#setRoles) | **PUT** /backend/rest/distributor/users/{userId}/roles | setRoles
[**setRoles1**](PartnerUsersControllerApi.md#setRoles1) | **PUT** /backend/rest/partner/users/{userId}/roles | setRoles
[**setRolesByExternalId**](PartnerUsersControllerApi.md#setRolesByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId}/roles | setRolesByExternalId
[**setRolesByExternalId1**](PartnerUsersControllerApi.md#setRolesByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId}/roles | setRolesByExternalId
[**setRolesByUsername**](PartnerUsersControllerApi.md#setRolesByUsername) | **PUT** /backend/rest/distributor/users/username/{username}/roles | setRolesByUsername
[**setRolesByUsername1**](PartnerUsersControllerApi.md#setRolesByUsername1) | **PUT** /backend/rest/partner/users/username/{username}/roles | setRolesByUsername
[**updateUser**](PartnerUsersControllerApi.md#updateUser) | **PUT** /backend/rest/distributor/users/{userId} | Update profile
[**updateUser1**](PartnerUsersControllerApi.md#updateUser1) | **PUT** /backend/rest/partner/users/{userId} | Update profile
[**updateUserByExternalId**](PartnerUsersControllerApi.md#updateUserByExternalId) | **PUT** /backend/rest/distributor/users/external/{externalId} | Update profile by external ID
[**updateUserByExternalId1**](PartnerUsersControllerApi.md#updateUserByExternalId1) | **PUT** /backend/rest/partner/users/external/{externalId} | Update profile by external ID
[**updateUserByUsername**](PartnerUsersControllerApi.md#updateUserByUsername) | **PUT** /backend/rest/distributor/users/username/{username} | Update profile by username
[**updateUserByUsername1**](PartnerUsersControllerApi.md#updateUserByUsername1) | **PUT** /backend/rest/partner/users/username/{username} | Update profile by username


<a name="changeUserState"></a>
# **changeUserState**
> changeUserState(request, userId)

Change user state

Enables or disables a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.changeUserState(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeUserState1"></a>
# **changeUserState1**
> changeUserState1(request, userId)

Change user state

Enables or disables a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.changeUserState1(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserState1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeUserStateByExternalId"></a>
# **changeUserStateByExternalId**
> changeUserStateByExternalId(externalId, request)

Change user state by external ID

Enables or disables a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
try {
    apiInstance.changeUserStateByExternalId(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserStateByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeUserStateByExternalId1"></a>
# **changeUserStateByExternalId1**
> changeUserStateByExternalId1(externalId, request)

Change user state by external ID

Enables or disables a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
try {
    apiInstance.changeUserStateByExternalId1(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserStateByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeUserStateByUsername"></a>
# **changeUserStateByUsername**
> changeUserStateByUsername(request, username)

Change user state by username

Enables or disables a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.changeUserStateByUsername(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserStateByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="changeUserStateByUsername1"></a>
# **changeUserStateByUsername1**
> changeUserStateByUsername1(request, username)

Change user state by username

Enables or disables a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetUserStateRequest request = new SetUserStateRequest(); // SetUserStateRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.changeUserStateByUsername1(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#changeUserStateByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetUserStateRequest**](SetUserStateRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="create"></a>
# **create**
> IdResponse create(request)

Create a user

Creates a new user associated with this distributor

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
CreateUserRequest request = new CreateUserRequest(); // CreateUserRequest | Profile and optional external ID of a user to be created
try {
    IdResponse result = apiInstance.create(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateUserRequest**](CreateUserRequest.md)| Profile and optional external ID of a user to be created |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="create1"></a>
# **create1**
> IdResponse create1(request)

Create a user

Creates a new user associated with this distributor

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
CreateUserRequest request = new CreateUserRequest(); // CreateUserRequest | Profile and optional external ID of a user to be created
try {
    IdResponse result = apiInstance.create1(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateUserRequest**](CreateUserRequest.md)| Profile and optional external ID of a user to be created |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetToken"></a>
# **createPasswordResetToken**
> PasswordResetToken createPasswordResetToken(userId)

Create password reset token

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    PasswordResetToken result = apiInstance.createPasswordResetToken(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetToken1"></a>
# **createPasswordResetToken1**
> PasswordResetToken createPasswordResetToken1(userId)

Create password reset token

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    PasswordResetToken result = apiInstance.createPasswordResetToken1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetTokenByExternalId"></a>
# **createPasswordResetTokenByExternalId**
> PasswordResetToken createPasswordResetTokenByExternalId(externalId)

Create password reset token by external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    PasswordResetToken result = apiInstance.createPasswordResetTokenByExternalId(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetTokenByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetTokenByExternalId1"></a>
# **createPasswordResetTokenByExternalId1**
> PasswordResetToken createPasswordResetTokenByExternalId1(externalId)

Create password reset token by external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    PasswordResetToken result = apiInstance.createPasswordResetTokenByExternalId1(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetTokenByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetTokenByUsername"></a>
# **createPasswordResetTokenByUsername**
> PasswordResetToken createPasswordResetTokenByUsername(username)

Create password reset token by username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    PasswordResetToken result = apiInstance.createPasswordResetTokenByUsername(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetTokenByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createPasswordResetTokenByUsername1"></a>
# **createPasswordResetTokenByUsername1**
> PasswordResetToken createPasswordResetTokenByUsername1(username)

Create password reset token by username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    PasswordResetToken result = apiInstance.createPasswordResetTokenByUsername1(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#createPasswordResetTokenByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**PasswordResetToken**](PasswordResetToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Delete user

Deletes (marks as deleted) a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.deleteUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUser1"></a>
# **deleteUser1**
> deleteUser1(userId)

Delete user

Deletes (marks as deleted) a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.deleteUser1(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUser1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUserByExternalId"></a>
# **deleteUserByExternalId**
> deleteUserByExternalId(externalId)

Delete user by external ID

Deletes (marks as deleted) a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    apiInstance.deleteUserByExternalId(externalId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUserByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUserByExternalId1"></a>
# **deleteUserByExternalId1**
> deleteUserByExternalId1(externalId)

Delete user by external ID

Deletes (marks as deleted) a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    apiInstance.deleteUserByExternalId1(externalId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUserByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUserByUsername"></a>
# **deleteUserByUsername**
> deleteUserByUsername(username)

Delete user by username

Deletes (marks as deleted) a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    apiInstance.deleteUserByUsername(username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUserByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteUserByUsername1"></a>
# **deleteUserByUsername1**
> deleteUserByUsername1(username)

Delete user by username

Deletes (marks as deleted) a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    apiInstance.deleteUserByUsername1(username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#deleteUserByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="generateToken"></a>
# **generateToken**
> InformationAboutAuthenticationToken generateToken(request, userId)

Create token

Creates new API or integration token for a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
Long userId = 789L; // Long | userId
try {
    InformationAboutAuthenticationToken result = apiInstance.generateToken(request, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |
 **userId** | **Long**| userId |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="generateToken1"></a>
# **generateToken1**
> InformationAboutAuthenticationToken generateToken1(request, userId)

Create token

Creates new API or integration token for a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
Long userId = 789L; // Long | userId
try {
    InformationAboutAuthenticationToken result = apiInstance.generateToken1(request, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |
 **userId** | **Long**| userId |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="generateTokenByExternalId"></a>
# **generateTokenByExternalId**
> InformationAboutAuthenticationToken generateTokenByExternalId(externalId, request)

Create token by external ID

Creates new API, impersonation or integration token for a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
try {
    InformationAboutAuthenticationToken result = apiInstance.generateTokenByExternalId(externalId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateTokenByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="generateTokenByExternalId1"></a>
# **generateTokenByExternalId1**
> InformationAboutAuthenticationToken generateTokenByExternalId1(externalId, request)

Create token by external ID

Creates new API, impersonation or integration token for a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
try {
    InformationAboutAuthenticationToken result = apiInstance.generateTokenByExternalId1(externalId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateTokenByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="generateTokenByUsername"></a>
# **generateTokenByUsername**
> InformationAboutAuthenticationToken generateTokenByUsername(request, username)

Create token by username

Creates new API, impersonation or integration token for a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
String username = "username_example"; // String | username
try {
    InformationAboutAuthenticationToken result = apiInstance.generateTokenByUsername(request, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateTokenByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |
 **username** | **String**| username |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="generateTokenByUsername1"></a>
# **generateTokenByUsername1**
> InformationAboutAuthenticationToken generateTokenByUsername1(request, username)

Create token by username

Creates new API, impersonation or integration token for a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
TokenConfiguration request = new TokenConfiguration(); // TokenConfiguration | request
String username = "username_example"; // String | username
try {
    InformationAboutAuthenticationToken result = apiInstance.generateTokenByUsername1(request, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#generateTokenByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TokenConfiguration**](TokenConfiguration.md)| request |
 **username** | **String**| username |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getUser"></a>
# **getUser**
> User getUser(userId)

Get user details

Gets details of a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    User result = apiInstance.getUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUser1"></a>
# **getUser1**
> User getUser1(userId)

Get user details

Gets details of a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    User result = apiInstance.getUser1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUser1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUserByExternalId"></a>
# **getUserByExternalId**
> User getUserByExternalId(externalId)

Get user details by external ID

Gets details of a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    User result = apiInstance.getUserByExternalId(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUserByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUserByExternalId1"></a>
# **getUserByExternalId1**
> User getUserByExternalId1(externalId)

Get user details by external ID

Gets details of a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    User result = apiInstance.getUserByExternalId1(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUserByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUserByUsername"></a>
# **getUserByUsername**
> User getUserByUsername(username)

Get user details by username

Gets details of a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    User result = apiInstance.getUserByUsername(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUserByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUserByUsername1"></a>
# **getUserByUsername1**
> User getUserByUsername1(username)

Get user details by username

Gets details of a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    User result = apiInstance.getUserByUsername1(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUserByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUsers"></a>
# **getUsers**
> List&lt;UserStat&gt; getUsers()

Get all users

Gets a list of all users managed by this distributor

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
try {
    List<UserStat> result = apiInstance.getUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserStat&gt;**](UserStat.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getUsers1"></a>
# **getUsers1**
> List&lt;UserStat&gt; getUsers1()

Get all users

Gets a list of all users managed by this distributor

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
try {
    List<UserStat> result = apiInstance.getUsers1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#getUsers1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserStat&gt;**](UserStat.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmail"></a>
# **sendPasswordResetEmail**
> sendPasswordResetEmail(userId)

Set/reset password

Sends a user with given ID password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.sendPasswordResetEmail(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmail1"></a>
# **sendPasswordResetEmail1**
> sendPasswordResetEmail1(userId)

Set/reset password

Sends a user with given ID password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.sendPasswordResetEmail1(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmail1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmailByExternalId"></a>
# **sendPasswordResetEmailByExternalId**
> sendPasswordResetEmailByExternalId(externalId)

Set/reset password by external ID

Sends a user with given external ID password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    apiInstance.sendPasswordResetEmailByExternalId(externalId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmailByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmailByExternalId1"></a>
# **sendPasswordResetEmailByExternalId1**
> sendPasswordResetEmailByExternalId1(externalId)

Set/reset password by external ID

Sends a user with given external ID password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
try {
    apiInstance.sendPasswordResetEmailByExternalId1(externalId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmailByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmailByUsername"></a>
# **sendPasswordResetEmailByUsername**
> sendPasswordResetEmailByUsername(username)

Set/reset password by username

Sends a user with given username password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    apiInstance.sendPasswordResetEmailByUsername(username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmailByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendPasswordResetEmailByUsername1"></a>
# **sendPasswordResetEmailByUsername1**
> sendPasswordResetEmailByUsername1(username)

Set/reset password by username

Sends a user with given username password recovery email

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String username = "username_example"; // String | username
try {
    apiInstance.sendPasswordResetEmailByUsername1(username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#sendPasswordResetEmailByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRoles"></a>
# **setRoles**
> setRoles(request, userId)

setRoles

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.setRoles(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRoles1"></a>
# **setRoles1**
> setRoles1(request, userId)

setRoles

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.setRoles1(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRoles1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRolesByExternalId"></a>
# **setRolesByExternalId**
> setRolesByExternalId(externalId, request)

setRolesByExternalId

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
try {
    apiInstance.setRolesByExternalId(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRolesByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRolesByExternalId1"></a>
# **setRolesByExternalId1**
> setRolesByExternalId1(externalId, request)

setRolesByExternalId

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
try {
    apiInstance.setRolesByExternalId1(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRolesByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRolesByUsername"></a>
# **setRolesByUsername**
> setRolesByUsername(request, username)

setRolesByUsername

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.setRolesByUsername(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRolesByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setRolesByUsername1"></a>
# **setRolesByUsername1**
> setRolesByUsername1(request, username)

setRolesByUsername

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
SetRolesRequest request = new SetRolesRequest(); // SetRolesRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.setRolesByUsername1(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#setRolesByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetRolesRequest**](SetRolesRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUser"></a>
# **updateUser**
> updateUser(request, userId)

Update profile

Updates profile with a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.updateUser(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUser1"></a>
# **updateUser1**
> updateUser1(request, userId)

Update profile

Updates profile with a user with given ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
Long userId = 789L; // Long | userId
try {
    apiInstance.updateUser1(request, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUser1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUserByExternalId"></a>
# **updateUserByExternalId**
> updateUserByExternalId(externalId, request)

Update profile by external ID

Updates profile with a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
try {
    apiInstance.updateUserByExternalId(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUserByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUserByExternalId1"></a>
# **updateUserByExternalId1**
> updateUserByExternalId1(externalId, request)

Update profile by external ID

Updates profile with a user with given external ID

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
String externalId = "externalId_example"; // String | externalId
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
try {
    apiInstance.updateUserByExternalId1(externalId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUserByExternalId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| externalId |
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUserByUsername"></a>
# **updateUserByUsername**
> updateUserByUsername(request, username)

Update profile by username

Updates profile with a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.updateUserByUsername(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUserByUsername");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateUserByUsername1"></a>
# **updateUserByUsername1**
> updateUserByUsername1(request, username)

Update profile by username

Updates profile with a user with given username

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerUsersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerUsersControllerApi apiInstance = new PartnerUsersControllerApi();
UpdateUserRequest request = new UpdateUserRequest(); // UpdateUserRequest | request
String username = "username_example"; // String | username
try {
    apiInstance.updateUserByUsername1(request, username);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUsersControllerApi#updateUserByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateUserRequest**](UpdateUserRequest.md)| request |
 **username** | **String**| username |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

