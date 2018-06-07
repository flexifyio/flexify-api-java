# EndpointsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachStorageToEndpointUsingPOST**](EndpointsControllerApi.md#attachStorageToEndpointUsingPOST) | **POST** /rest/endpoints/{endpoint-id}/storages | Attach the storage to the endpoint
[**detachStorageFromEndpointUsingDELETE**](EndpointsControllerApi.md#detachStorageFromEndpointUsingDELETE) | **DELETE** /rest/endpoints/{endpoint-id}/storages/{storage-id} | Detach the storage from the endpoint
[**disableUsingPUT**](EndpointsControllerApi.md#disableUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
[**enableUsingPUT**](EndpointsControllerApi.md#enableUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
[**getEndpointDetailsUsingGET**](EndpointsControllerApi.md#getEndpointDetailsUsingGET) | **GET** /rest/endpoints/{endpoint-id} | Get endpoint details
[**getEndpointsForCurrentUserUsingGET**](EndpointsControllerApi.md#getEndpointsForCurrentUserUsingGET) | **GET** /rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
[**setDefaultStorageUsingPUT**](EndpointsControllerApi.md#setDefaultStorageUsingPUT) | **PUT** /rest/endpoints/{endpoint-id}/storages/{storage-id}/actions/set-as-default | Set given storage as default for the endpoint
[**updateEndpointUsingPUT**](EndpointsControllerApi.md#updateEndpointUsingPUT) | **PUT** /rest/endpoints/{endpoint-id} | Update attributes of the endpoint


<a name="attachStorageToEndpointUsingPOST"></a>
# **attachStorageToEndpointUsingPOST**
> attachStorageToEndpointUsingPOST(endpointId, endpointStorage)

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
EndpointStorage endpointStorage = new EndpointStorage(); // EndpointStorage | endpointStorage
try {
    apiInstance.attachStorageToEndpointUsingPOST(endpointId, endpointStorage);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#attachStorageToEndpointUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **endpointStorage** | [**EndpointStorage**](EndpointStorage.md)| endpointStorage |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="detachStorageFromEndpointUsingDELETE"></a>
# **detachStorageFromEndpointUsingDELETE**
> detachStorageFromEndpointUsingDELETE(endpointId, storageId)

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
    apiInstance.detachStorageFromEndpointUsingDELETE(endpointId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#detachStorageFromEndpointUsingDELETE");
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

<a name="disableUsingPUT"></a>
# **disableUsingPUT**
> disableUsingPUT(endpointId)

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
    apiInstance.disableUsingPUT(endpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#disableUsingPUT");
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

<a name="enableUsingPUT"></a>
# **enableUsingPUT**
> enableUsingPUT(endpointId)

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
    apiInstance.enableUsingPUT(endpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#enableUsingPUT");
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

<a name="getEndpointDetailsUsingGET"></a>
# **getEndpointDetailsUsingGET**
> EndpointDetails getEndpointDetailsUsingGET(endpointId)

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
    EndpointDetails result = apiInstance.getEndpointDetailsUsingGET(endpointId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#getEndpointDetailsUsingGET");
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

<a name="getEndpointsForCurrentUserUsingGET"></a>
# **getEndpointsForCurrentUserUsingGET**
> List&lt;EndpointDetails&gt; getEndpointsForCurrentUserUsingGET()

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
    List<EndpointDetails> result = apiInstance.getEndpointsForCurrentUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#getEndpointsForCurrentUserUsingGET");
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

<a name="setDefaultStorageUsingPUT"></a>
# **setDefaultStorageUsingPUT**
> setDefaultStorageUsingPUT(endpointId, storageId)

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
try {
    apiInstance.setDefaultStorageUsingPUT(endpointId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#setDefaultStorageUsingPUT");
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

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateEndpointUsingPUT"></a>
# **updateEndpointUsingPUT**
> updateEndpointUsingPUT(endpointId, endpoint)

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
    apiInstance.updateEndpointUsingPUT(endpointId, endpoint);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#updateEndpointUsingPUT");
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

