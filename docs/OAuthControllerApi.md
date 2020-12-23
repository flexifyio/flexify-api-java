# OAuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppInfo**](OAuthControllerApi.md#getAppInfo) | **GET** /backend/rest/oauth/app-info | getAppInfo


<a name="getAppInfo"></a>
# **getAppInfo**
> AuthAppInfo getAppInfo(providerId)

getAppInfo

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.OAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

OAuthControllerApi apiInstance = new OAuthControllerApi();
Long providerId = 789L; // Long | provider-id
try {
    AuthAppInfo result = apiInstance.getAppInfo(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthControllerApi#getAppInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| provider-id |

### Return type

[**AuthAppInfo**](AuthAppInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

