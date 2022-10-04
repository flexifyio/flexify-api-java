# AuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthControllerApi.md#authenticate) | **POST** /backend/rest/auth | Generate new access token for the user
[**authorize**](AuthControllerApi.md#authorize) | **POST** /backend/rest/auth/authorize | Authorization check of given token
[**getConfig**](AuthControllerApi.md#getConfig) | **GET** /backend/rest/auth/config | Logout
[**logout**](AuthControllerApi.md#logout) | **POST** /backend/rest/auth/logout | Logout


<a name="authenticate"></a>
# **authenticate**
> Object authenticate(authenticationRequest)

Generate new access token for the user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.api.AuthControllerApi;


AuthControllerApi apiInstance = new AuthControllerApi();
AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | authenticationRequest
try {
    Object result = apiInstance.authenticate(authenticationRequest);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="authorize"></a>
# **authorize**
> Object authorize()

Authorization check of given token

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
    Object result = apiInstance.authorize();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#authorize");
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

<a name="getConfig"></a>
# **getConfig**
> PublicAuthenticationConfiguration getConfig()

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
try {
    PublicAuthenticationConfiguration result = apiInstance.getConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControllerApi#getConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PublicAuthenticationConfiguration**](PublicAuthenticationConfiguration.md)

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

