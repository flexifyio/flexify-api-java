# CloudLocationsControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutoDeployAvailableLocationsForCurrentUser**](CloudLocationsControllerApi.md#getAutoDeployAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations/auto-deploy | getAutoDeployAvailableLocationsForCurrentUser
[**getExistingAvailableLocationsForCurrentUser**](CloudLocationsControllerApi.md#getExistingAvailableLocationsForCurrentUser) | **GET** /backend/rest/cloud-locations | getExistingAvailableLocationsForCurrentUser


<a name="getAutoDeployAvailableLocationsForCurrentUser"></a>
# **getAutoDeployAvailableLocationsForCurrentUser**
> List&lt;CloudLocation&gt; getAutoDeployAvailableLocationsForCurrentUser()

getAutoDeployAvailableLocationsForCurrentUser

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
    List<CloudLocation> result = apiInstance.getAutoDeployAvailableLocationsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudLocationsControllerApi#getAutoDeployAvailableLocationsForCurrentUser");
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

<a name="getExistingAvailableLocationsForCurrentUser"></a>
# **getExistingAvailableLocationsForCurrentUser**
> List&lt;CloudLocation&gt; getExistingAvailableLocationsForCurrentUser()

getExistingAvailableLocationsForCurrentUser

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
    List<CloudLocation> result = apiInstance.getExistingAvailableLocationsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudLocationsControllerApi#getExistingAvailableLocationsForCurrentUser");
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

