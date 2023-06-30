# AuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthControllerApi.md#authenticate) | **POST** /backend/rest/auth | Generate new access token for the user
[**checkTokenAndGetUser**](AuthControllerApi.md#checkTokenAndGetUser) | **GET** /backend/rest/auth/user | Check of given token
[**logout**](AuthControllerApi.md#logout) | **POST** /backend/rest/auth/logout | Logout


<a name="authenticate"></a>
# **authenticate**
> AuthenticationResponse authenticate(authenticationRequest)

Generate new access token for the user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.api.AuthControllerApi;


AuthControllerApi apiInstance = new AuthControllerApi();
AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | authenticationRequest
try {
    AuthenticationResponse result = apiInstance.authenticate(authenticationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#authenticate");
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

<a name="checkTokenAndGetUser"></a>
# **checkTokenAndGetUser**
> AuthCheckTokenAndGetUserResponse checkTokenAndGetUser()

Check of given token

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthControllerApi apiInstance = new AuthControllerApi();
try {
    AuthCheckTokenAndGetUserResponse result = apiInstance.checkTokenAndGetUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#checkTokenAndGetUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthCheckTokenAndGetUserResponse**](AuthCheckTokenAndGetUserResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="logout"></a>
# **logout**
> logout(request)

Logout

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthControllerApi apiInstance = new AuthControllerApi();
LogoutRequest request = new LogoutRequest(); // LogoutRequest | request
try {
    apiInstance.logout(request);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LogoutRequest**](LogoutRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

