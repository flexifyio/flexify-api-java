# ProvidersControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProviders**](ProvidersControllerApi.md#getProviders) | **GET** /backend/rest/providers | Get all storage providers


<a name="getProviders"></a>
# **getProviders**
> List&lt;StorageProvider&gt; getProviders()

Get all storage providers

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ProvidersControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ProvidersControllerApi apiInstance = new ProvidersControllerApi();
try {
    List<StorageProvider> result = apiInstance.getProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvidersControllerApi#getProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StorageProvider&gt;**](StorageProvider.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

