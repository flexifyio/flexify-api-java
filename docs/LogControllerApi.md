# LogControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogForCurrentUser**](LogControllerApi.md#getLogForCurrentUser) | **GET** /rest/log | getLogForCurrentUser


<a name="getLogForCurrentUser"></a>
# **getLogForCurrentUser**
> PageLogEntry getLogForCurrentUser(page, size, endpointId, migrationId, sort, sortDirection, springPageRequestOffset, springPageRequestPageNumber, springPageRequestPageSize, springPageRequestPaged, springPageRequestSortSorted, springPageRequestSortUnsorted, springPageRequestUnpaged, storageId)

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
Integer page = 0; // Integer | Page number
Integer size = 100; // Integer | Page size
Long endpointId = 789L; // Long | endpoint-id
Long migrationId = 789L; // Long | migration-id
List<String> sort = Arrays.asList("sort_example"); // List<String> | Attributes to sort
String sortDirection = "\"ASC\""; // String | Sort Direction
Long springPageRequestOffset = 789L; // Long | 
Integer springPageRequestPageNumber = 56; // Integer | 
Integer springPageRequestPageSize = 56; // Integer | 
Boolean springPageRequestPaged = true; // Boolean | 
Boolean springPageRequestSortSorted = true; // Boolean | 
Boolean springPageRequestSortUnsorted = true; // Boolean | 
Boolean springPageRequestUnpaged = true; // Boolean | 
Long storageId = 789L; // Long | storage-id
try {
    PageLogEntry result = apiInstance.getLogForCurrentUser(page, size, endpointId, migrationId, sort, sortDirection, springPageRequestOffset, springPageRequestPageNumber, springPageRequestPageSize, springPageRequestPaged, springPageRequestSortSorted, springPageRequestSortUnsorted, springPageRequestUnpaged, storageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogControllerApi#getLogForCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number |
 **size** | **Integer**| Page size |
 **endpointId** | **Long**| endpoint-id | [optional]
 **migrationId** | **Long**| migration-id | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Attributes to sort | [optional]
 **sortDirection** | **String**| Sort Direction | [optional] [enum: ASC, DESC]
 **springPageRequestOffset** | **Long**|  | [optional]
 **springPageRequestPageNumber** | **Integer**|  | [optional]
 **springPageRequestPageSize** | **Integer**|  | [optional]
 **springPageRequestPaged** | **Boolean**|  | [optional]
 **springPageRequestSortSorted** | **Boolean**|  | [optional]
 **springPageRequestSortUnsorted** | **Boolean**|  | [optional]
 **springPageRequestUnpaged** | **Boolean**|  | [optional]
 **storageId** | **Long**| storage-id | [optional]

### Return type

[**PageLogEntry**](PageLogEntry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

