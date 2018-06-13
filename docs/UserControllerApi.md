# UserControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUserUsingGET**](UserControllerApi.md#getCurrentUserUsingGET) | **GET** /rest/user/current | Get details information for logged in user
[**requestResetPasswordUsingPOST**](UserControllerApi.md#requestResetPasswordUsingPOST) | **POST** /rest/user/request-reset-password | requestResetPassword


<a name="getCurrentUserUsingGET"></a>
# **getCurrentUserUsingGET**
> User getCurrentUserUsingGET(silence)

Get details information for logged in user

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

