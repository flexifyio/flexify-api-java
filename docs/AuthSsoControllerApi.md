# AuthSsoControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig**](AuthSsoControllerApi.md#getConfig) | **GET** /backend/rest/auth/sso/config | getConfig
[**getDeviceCode**](AuthSsoControllerApi.md#getDeviceCode) | **GET** /backend/rest/auth/sso/device-code | getDeviceCode
[**getTokenByDeviceCode**](AuthSsoControllerApi.md#getTokenByDeviceCode) | **POST** /backend/rest/auth/sso/token-by-device-code | getTokenByDeviceCode
[**refreshTokenForDeviceCodeFlow**](AuthSsoControllerApi.md#refreshTokenForDeviceCodeFlow) | **POST** /backend/rest/auth/sso/token-refresh | refreshTokenForDeviceCodeFlow


<a name="getConfig"></a>
# **getConfig**
> MicrosoftOAuthConfig getConfig(oauthProviderId)

getConfig

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthSsoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthSsoControllerApi apiInstance = new AuthSsoControllerApi();
String oauthProviderId = "oauthProviderId_example"; // String | oauth-provider-id
try {
    MicrosoftOAuthConfig result = apiInstance.getConfig(oauthProviderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthSsoControllerApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthProviderId** | **String**| oauth-provider-id | [enum: DROPBOX, DROPBOX_TEAM, MICROSOFT]

### Return type

[**MicrosoftOAuthConfig**](MicrosoftOAuthConfig.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeviceCode"></a>
# **getDeviceCode**
> OAuth2DeviceCodeResponse getDeviceCode(oauthProviderId)

getDeviceCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthSsoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthSsoControllerApi apiInstance = new AuthSsoControllerApi();
String oauthProviderId = "oauthProviderId_example"; // String | oauth-provider-id
try {
    OAuth2DeviceCodeResponse result = apiInstance.getDeviceCode(oauthProviderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthSsoControllerApi#getDeviceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthProviderId** | **String**| oauth-provider-id | [enum: DROPBOX, DROPBOX_TEAM, MICROSOFT]

### Return type

[**OAuth2DeviceCodeResponse**](OAuth2DeviceCodeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTokenByDeviceCode"></a>
# **getTokenByDeviceCode**
> OAuthToken getTokenByDeviceCode(request)

getTokenByDeviceCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthSsoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthSsoControllerApi apiInstance = new AuthSsoControllerApi();
TokenByDeviceCodeRequest request = new TokenByDeviceCodeRequest(); // TokenByDeviceCodeRequest | request
try {
    OAuthToken result = apiInstance.getTokenByDeviceCode(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthSsoControllerApi#getTokenByDeviceCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**TokenByDeviceCodeRequest**](TokenByDeviceCodeRequest.md)| request |

### Return type

[**OAuthToken**](OAuthToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="refreshTokenForDeviceCodeFlow"></a>
# **refreshTokenForDeviceCodeFlow**
> OAuthToken refreshTokenForDeviceCodeFlow(request)

refreshTokenForDeviceCodeFlow

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AuthSsoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthSsoControllerApi apiInstance = new AuthSsoControllerApi();
RefreshTokenRequest request = new RefreshTokenRequest(); // RefreshTokenRequest | request
try {
    OAuthToken result = apiInstance.refreshTokenForDeviceCodeFlow(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthSsoControllerApi#refreshTokenForDeviceCodeFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RefreshTokenRequest**](RefreshTokenRequest.md)| request |

### Return type

[**OAuthToken**](OAuthToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

