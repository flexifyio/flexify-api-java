# UserControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UserControllerApi.md#getCurrentUser) | **GET** /rest/user/current | Get details of user correponsing to provided auth token
[**requestResetPassword**](UserControllerApi.md#requestResetPassword) | **POST** /rest/user/request-reset-password | requestResetPassword


<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()

Get details of user correponsing to provided auth token

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
try {
    User result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="requestResetPassword"></a>
# **requestResetPassword**
> requestResetPassword(reqeust)

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
    apiInstance.requestResetPassword(reqeust);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#requestResetPassword");
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

