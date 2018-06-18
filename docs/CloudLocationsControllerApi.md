# CloudLocationsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableLocationsForCurrentUser**](CloudLocationsControllerApi.md#getAvailableLocationsForCurrentUser) | **GET** /rest/cloud-locations | getAvailableLocationsForCurrentUser


<a name="getAvailableLocationsForCurrentUser"></a>
# **getAvailableLocationsForCurrentUser**
> List&lt;CloudLocation&gt; getAvailableLocationsForCurrentUser()

getAvailableLocationsForCurrentUser

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.CloudLocationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

CloudLocationsControllerApi apiInstance = new CloudLocationsControllerApi();
try {
    List<CloudLocation> result = apiInstance.getAvailableLocationsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudLocationsControllerApi#getAvailableLocationsForCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CloudLocation&gt;**](CloudLocation.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

