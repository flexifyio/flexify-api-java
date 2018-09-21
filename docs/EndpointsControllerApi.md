# EndpointsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachStoragesToEndpoint**](EndpointsControllerApi.md#attachStoragesToEndpoint) | **POST** /rest/endpoints/{endpoint-id}/storages | Attach the storage to the endpoint
[**detachStorageFromEndpoint**](EndpointsControllerApi.md#detachStorageFromEndpoint) | **DELETE** /rest/endpoints/{endpoint-id}/storages/{storage-id} | Detach the storage from the endpoint
[**disable**](EndpointsControllerApi.md#disable) | **PUT** /rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
[**enable**](EndpointsControllerApi.md#enable) | **PUT** /rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
[**getEndpointDetails**](EndpointsControllerApi.md#getEndpointDetails) | **GET** /rest/endpoints/{endpoint-id} | Get endpoint details
[**getEndpointsForCurrentUser**](EndpointsControllerApi.md#getEndpointsForCurrentUser) | **GET** /rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
[**setStoragePutObjects**](EndpointsControllerApi.md#setStoragePutObjects) | **PUT** /rest/endpoints/{endpoint-id}/storages/{storage-id}/put-objects | Set given storage as default for the endpoint
[**updateEndpoint**](EndpointsControllerApi.md#updateEndpoint) | **PUT** /rest/endpoints/{endpoint-id} | Update attributes of the endpoint


<a name="attachStoragesToEndpoint"></a>
# **attachStoragesToEndpoint**
> attachStoragesToEndpoint(endpointId, request)

Attach the storage to the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
AttachStoragesToEndpointRequest request = new AttachStoragesToEndpointRequest(); // AttachStoragesToEndpointRequest | request
try {
    apiInstance.attachStoragesToEndpoint(endpointId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#attachStoragesToEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **request** | [**AttachStoragesToEndpointRequest**](AttachStoragesToEndpointRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="detachStorageFromEndpoint"></a>
# **detachStorageFromEndpoint**
> detachStorageFromEndpoint(endpointId, storageId)

Detach the storage from the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
Long storageId = 789L; // Long | storage-id
try {
    apiInstance.detachStorageFromEndpoint(endpointId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#detachStorageFromEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **storageId** | **Long**| storage-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="disable"></a>
# **disable**
> disable(endpointId)

Disable the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
try {
    apiInstance.disable(endpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#disable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="enable"></a>
# **enable**
> enable(endpointId)

Enable the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
try {
    apiInstance.enable(endpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#enable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getEndpointDetails"></a>
# **getEndpointDetails**
> EndpointDetails getEndpointDetails(endpointId)

Get endpoint details

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
try {
    EndpointDetails result = apiInstance.getEndpointDetails(endpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#getEndpointDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |

### Return type

[**EndpointDetails**](EndpointDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getEndpointsForCurrentUser"></a>
# **getEndpointsForCurrentUser**
> List&lt;EndpointDetails&gt; getEndpointsForCurrentUser()

Get endpoint for current user. This method will create new endpoint if no endpoints exist for user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
try {
    List<EndpointDetails> result = apiInstance.getEndpointsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#getEndpointsForCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EndpointDetails&gt;**](EndpointDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="setStoragePutObjects"></a>
# **setStoragePutObjects**
> setStoragePutObjects(endpointId, storageId, settings)

Set given storage as default for the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
Long storageId = 789L; // Long | storage-id
EndpointStorageSettings settings = new EndpointStorageSettings(); // EndpointStorageSettings | settings
try {
    apiInstance.setStoragePutObjects(endpointId, storageId, settings);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#setStoragePutObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **storageId** | **Long**| storage-id |
 **settings** | [**EndpointStorageSettings**](EndpointStorageSettings.md)| settings |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateEndpoint"></a>
# **updateEndpoint**
> updateEndpoint(endpointId, endpoint)

Update attributes of the endpoint

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.EndpointsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EndpointsControllerApi apiInstance = new EndpointsControllerApi();
Long endpointId = 789L; // Long | endpoint-id
Endpoint endpoint = new Endpoint(); // Endpoint | endpoint
try {
    apiInstance.updateEndpoint(endpointId, endpoint);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#updateEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **endpoint** | [**Endpoint**](Endpoint.md)| endpoint |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

