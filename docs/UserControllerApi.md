# UserControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeCurrentUserPasswordUsingPOST**](UserControllerApi.md#changeCurrentUserPasswordUsingPOST) | **POST** /rest/user/current/change-password | changeCurrentUserPassword
[**getCurrentUserUsingGET**](UserControllerApi.md#getCurrentUserUsingGET) | **GET** /rest/user/current | getCurrentUser
[**requestResetPasswordUsingPOST**](UserControllerApi.md#requestResetPasswordUsingPOST) | **POST** /rest/user/request-reset-password | requestResetPassword
[**resetPasswordUsingPOST**](UserControllerApi.md#resetPasswordUsingPOST) | **POST** /rest/user/reset-password | resetPassword
[**signupUsingPOST**](UserControllerApi.md#signupUsingPOST) | **POST** /rest/user/signup | signup
[**updateCurrentUserProfileUsingPUT**](UserControllerApi.md#updateCurrentUserProfileUsingPUT) | **PUT** /rest/user/current/profile | updateCurrentUserProfile
[**validateTokenUsingGET**](UserControllerApi.md#validateTokenUsingGET) | **GET** /rest/user/validate-token | validateToken


<a name="changeCurrentUserPasswordUsingPOST"></a>
# **changeCurrentUserPasswordUsingPOST**
> changeCurrentUserPasswordUsingPOST(request)

changeCurrentUserPassword

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
ChangePasswordRequest request = new ChangePasswordRequest(); // ChangePasswordRequest | request
try {
    apiInstance.changeCurrentUserPasswordUsingPOST(request);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#changeCurrentUserPasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getCurrentUserUsingGET"></a>
# **getCurrentUserUsingGET**
> User getCurrentUserUsingGET(silence)

getCurrentUser

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
Boolean silence = false; // Boolean | silence
try {
    User result = apiInstance.getCurrentUserUsingGET(silence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getCurrentUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **silence** | **Boolean**| silence | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="requestResetPasswordUsingPOST"></a>
# **requestResetPasswordUsingPOST**
> requestResetPasswordUsingPOST(reqeust)

requestResetPassword

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
RequestResetPasswordReqeust reqeust = new RequestResetPasswordReqeust(); // RequestResetPasswordReqeust | reqeust
try {
    apiInstance.requestResetPasswordUsingPOST(reqeust);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#requestResetPasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqeust** | [**RequestResetPasswordReqeust**](RequestResetPasswordReqeust.md)| reqeust |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="resetPasswordUsingPOST"></a>
# **resetPasswordUsingPOST**
> User resetPasswordUsingPOST(request)

resetPassword

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
ResetPasswordRequest request = new ResetPasswordRequest(); // ResetPasswordRequest | request
try {
    User result = apiInstance.resetPasswordUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#resetPasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ResetPasswordRequest**](ResetPasswordRequest.md)| request |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="signupUsingPOST"></a>
# **signupUsingPOST**
> SignupResult signupUsingPOST(body)

signup

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
SignUpRequest body = new SignUpRequest(); // SignUpRequest | body
try {
    SignupResult result = apiInstance.signupUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#signupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignUpRequest**](SignUpRequest.md)| body |

### Return type

[**SignupResult**](SignupResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateCurrentUserProfileUsingPUT"></a>
# **updateCurrentUserProfileUsingPUT**
> User updateCurrentUserProfileUsingPUT(newProfile)

updateCurrentUserProfile

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
DbUserProfile newProfile = new DbUserProfile(); // DbUserProfile | newProfile
try {
    User result = apiInstance.updateCurrentUserProfileUsingPUT(newProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#updateCurrentUserProfileUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newProfile** | [**DbUserProfile**](DbUserProfile.md)| newProfile |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="validateTokenUsingGET"></a>
# **validateTokenUsingGET**
> User validateTokenUsingGET(token)

validateToken

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
String token = "token_example"; // String | token
try {
    User result = apiInstance.validateTokenUsingGET(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#validateTokenUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| token |

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

