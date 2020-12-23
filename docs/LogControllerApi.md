# LogControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogForCurrentUser**](LogControllerApi.md#getLogForCurrentUser) | **GET** /backend/rest/log | getLogForCurrentUser


<a name="getLogForCurrentUser"></a>
# **getLogForCurrentUser**
> MarkerPageLogEntry getLogForCurrentUser(endpointId, marker, migrationId, storageAccountId, storageId)

getLogForCurrentUser

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.LogControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

LogControllerApi apiInstance = new LogControllerApi();
Long endpointId = 789L; // Long | endpoint-id
Long marker = 789L; // Long | marker
Long migrationId = 789L; // Long | migration-id
Long storageAccountId = 789L; // Long | storage-account-id
Long storageId = 789L; // Long | storage-id
try {
    MarkerPageLogEntry result = apiInstance.getLogForCurrentUser(endpointId, marker, migrationId, storageAccountId, storageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogControllerApi#getLogForCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id | [optional]
 **marker** | **Long**| marker | [optional]
 **migrationId** | **Long**| migration-id | [optional]
 **storageAccountId** | **Long**| storage-account-id | [optional]
 **storageId** | **Long**| storage-id | [optional]

### Return type

[**MarkerPageLogEntry**](MarkerPageLogEntry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

