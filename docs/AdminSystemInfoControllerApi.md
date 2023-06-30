# AdminSystemInfoControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemInfo**](AdminSystemInfoControllerApi.md#systemInfo) | **GET** /backend/rest/admin/system-info | Request General System Information


<a name="systemInfo"></a>
# **systemInfo**
> ManagementServerDetailedVersionInfo systemInfo()

Request General System Information

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AdminSystemInfoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AdminSystemInfoControllerApi apiInstance = new AdminSystemInfoControllerApi();
try {
    ManagementServerDetailedVersionInfo result = apiInstance.systemInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminSystemInfoControllerApi#systemInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementServerDetailedVersionInfo**](ManagementServerDetailedVersionInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

