# LogControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogForCurrentUserUsingGET**](LogControllerApi.md#getLogForCurrentUserUsingGET) | **GET** /rest/log | getLogForCurrentUser


<a name="getLogForCurrentUserUsingGET"></a>
# **getLogForCurrentUserUsingGET**
> List&lt;LogEntry&gt; getLogForCurrentUserUsingGET(storageId, migrationId, endpointId)

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
Long storageId = 789L; // Long | storage-id
Long migrationId = 789L; // Long | migration-id
Long endpointId = 789L; // Long | endpoint-id
try {
    List<LogEntry> result = apiInstance.getLogForCurrentUserUsingGET(storageId, migrationId, endpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogControllerApi#getLogForCurrentUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **Long**| storage-id | [optional]
 **migrationId** | **Long**| migration-id | [optional]
 **endpointId** | **Long**| endpoint-id | [optional]

### Return type

[**List&lt;LogEntry&gt;**](LogEntry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

