# LogControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogForCurrentUser**](LogControllerApi.md#getLogForCurrentUser) | **GET** /rest/log | getLogForCurrentUser


<a name="getLogForCurrentUser"></a>
# **getLogForCurrentUser**
> PageLogEntry getLogForCurrentUser(storageId, migrationId, endpointId, sort, page, size, sortDirection)

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
List<String> sort = Arrays.asList("sort_example"); // List<String> | Attributes to sort
Integer page = 0; // Integer | Page number
Integer size = 100; // Integer | Page size
String sortDirection = "ASC"; // String | Sort Direction
try {
    PageLogEntry result = apiInstance.getLogForCurrentUser(storageId, migrationId, endpointId, sort, page, size, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogControllerApi#getLogForCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageId** | **Long**| storage-id | [optional]
 **migrationId** | **Long**| migration-id | [optional]
 **endpointId** | **Long**| endpoint-id | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Attributes to sort | [optional]
 **page** | **Integer**| Page number | [optional] [default to 0]
 **size** | **Integer**| Page size | [optional] [default to 100]
 **sortDirection** | **String**| Sort Direction | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageLogEntry**](PageLogEntry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

