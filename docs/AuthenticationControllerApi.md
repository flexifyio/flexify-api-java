# AuthenticationControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationRequest**](AuthenticationControllerApi.md#authenticationRequest) | **POST** /rest/auth | Generate access token for user
[**logout**](AuthenticationControllerApi.md#logout) | **POST** /rest/auth/logout | Logout


<a name="authenticationRequest"></a>
# **authenticationRequest**
> AuthenticationResponse authenticationRequest(authenticationRequest)

Generate access token for user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.api.AuthenticationControllerApi;


AuthenticationControllerApi apiInstance = new AuthenticationControllerApi();
AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | authenticationRequest
try {
    AuthenticationResponse result = apiInstance.authenticationRequest(authenticationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#authenticationRequest");
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

<a name="logout"></a>
# **logout**
> Object logout()

Logout

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
    Object result = apiInstance.logout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationControllerApi#logout");
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

