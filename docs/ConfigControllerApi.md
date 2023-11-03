# ConfigControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig1**](ConfigControllerApi.md#getConfig1) | **GET** /backend/rest/config | Get public Management Server config


<a name="getConfig1"></a>
# **getConfig1**
> PublicManagementServerConfiguration getConfig1()

Get public Management Server config

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ConfigControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ConfigControllerApi apiInstance = new ConfigControllerApi();
try {
    PublicManagementServerConfiguration result = apiInstance.getConfig1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigControllerApi#getConfig1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PublicManagementServerConfiguration**](PublicManagementServerConfiguration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

