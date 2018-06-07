# AuthenticationControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationRequestUsingPOST**](AuthenticationControllerApi.md#authenticationRequestUsingPOST) | **POST** /rest/auth | Generate access token for user
[**logoutUsingPOST**](AuthenticationControllerApi.md#logoutUsingPOST) | **POST** /rest/auth/logout | logout


<a name="authenticationRequestUsingPOST"></a>
# **authenticationRequestUsingPOST**
> AuthenticationResponse authenticationRequestUsingPOST(authenticationRequest)

Generate access token for user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | authenticationRequest
try {
    AuthenticationResponse result = apiInstance.authenticationRequestUsingPOST(authenticationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#authenticationRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md)| authenticationRequest |

### Return type

[**AuthenticationResponse**](AuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="logoutUsingPOST"></a>
# **logoutUsingPOST**
> Object logoutUsingPOST()

logout

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthenticationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
try {
    Object result = apiInstance.logoutUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#logoutUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

