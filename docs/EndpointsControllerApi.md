# EndpointsControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachAccounts**](EndpointsControllerApi.md#attachAccounts) | **POST** /backend/rest/endpoints/{endpoint-id}/storage-accounts | Attach storage accounts to the endpoint
[**attachBuckets**](EndpointsControllerApi.md#attachBuckets) | **POST** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets | Attach storages to the virtual bucket
[**createEndpoint**](EndpointsControllerApi.md#createEndpoint) | **POST** /backend/rest/endpoints | Creates new endpoint
[**createVirtualBucket**](EndpointsControllerApi.md#createVirtualBucket) | **POST** /backend/rest/endpoints/{endpoint-id}/virtual-buckets | Creates new virtual bucket
[**delete**](EndpointsControllerApi.md#delete) | **DELETE** /backend/rest/endpoints/{endpoint-id} | Delete the endpoint
[**deleteVirtualBucket**](EndpointsControllerApi.md#deleteVirtualBucket) | **DELETE** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket} | Deletes virtual bucket
[**detachAccount**](EndpointsControllerApi.md#detachAccount) | **DELETE** /backend/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id} | Detach storage account from the endpoint
[**detachBucket**](EndpointsControllerApi.md#detachBucket) | **DELETE** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id} | Detach storage account from the endpoint
[**disable**](EndpointsControllerApi.md#disable) | **PUT** /backend/rest/endpoints/{endpoint-id}/actions/disable | Disable the endpoint
[**enable**](EndpointsControllerApi.md#enable) | **PUT** /backend/rest/endpoints/{endpoint-id}/actions/enable | Enable the endpoint
[**generateAccessKeys**](EndpointsControllerApi.md#generateAccessKeys) | **GET** /backend/rest/endpoints/generated-access-keys | Generate new access keys pair
[**getEndpointDetails**](EndpointsControllerApi.md#getEndpointDetails) | **GET** /backend/rest/endpoints/{endpoint-id} | Get endpoint details
[**getEndpointsForCurrentUser**](EndpointsControllerApi.md#getEndpointsForCurrentUser) | **GET** /backend/rest/endpoints | Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
[**setAttachedAccountSettings**](EndpointsControllerApi.md#setAttachedAccountSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id}/settings | Modifies settings of the attached storage account
[**setAttachedBucketSettings**](EndpointsControllerApi.md#setAttachedBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id}/settings | Modifies settings of the attached storage
[**setVirtualBucketSettings**](EndpointsControllerApi.md#setVirtualBucketSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/settings | Modifies virtual bucket configuration
[**updateEndpointSettings**](EndpointsControllerApi.md#updateEndpointSettings) | **PUT** /backend/rest/endpoints/{endpoint-id}/settings | Update attributes of the endpoint


<a name="attachAccounts"></a>
# **attachAccounts**
> attachAccounts(endpointId, request)

Attach storage accounts to the endpoint

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
AttachStorageAccountsRequest request = new AttachStorageAccountsRequest(); // AttachStorageAccountsRequest | request
try {
    apiInstance.attachAccounts(endpointId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#attachAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **request** | [**AttachStorageAccountsRequest**](AttachStorageAccountsRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="attachBuckets"></a>
# **attachBuckets**
> attachBuckets(endpointId, request, virtualBucket)

Attach storages to the virtual bucket

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
AttachVirtualBucketStoragesRequest request = new AttachVirtualBucketStoragesRequest(); // AttachVirtualBucketStoragesRequest | request
String virtualBucket = "virtualBucket_example"; // String | virtual-bucket
try {
    apiInstance.attachBuckets(endpointId, request, virtualBucket);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#attachBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **request** | [**AttachVirtualBucketStoragesRequest**](AttachVirtualBucketStoragesRequest.md)| request |
 **virtualBucket** | **String**| virtual-bucket |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createEndpoint"></a>
# **createEndpoint**
> IdResponse createEndpoint()

Creates new endpoint

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
    IdResponse result = apiInstance.createEndpoint();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#createEndpoint");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createVirtualBucket"></a>
# **createVirtualBucket**
> createVirtualBucket(endpointId, request)

Creates new virtual bucket

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
CreateVirtualBucketRequest request = new CreateVirtualBucketRequest(); // CreateVirtualBucketRequest | request
try {
    apiInstance.createVirtualBucket(endpointId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#createVirtualBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **request** | [**CreateVirtualBucketRequest**](CreateVirtualBucketRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="delete"></a>
# **delete**
> delete(endpointId)

Delete the endpoint

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
    apiInstance.delete(endpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#delete");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteVirtualBucket"></a>
# **deleteVirtualBucket**
> deleteVirtualBucket(endpointId, virtualBucket)

Deletes virtual bucket

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
String virtualBucket = "virtualBucket_example"; // String | virtual-bucket
try {
    apiInstance.deleteVirtualBucket(endpointId, virtualBucket);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#deleteVirtualBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **virtualBucket** | **String**| virtual-bucket |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="detachAccount"></a>
# **detachAccount**
> detachAccount(endpointId, storageAccountId)

Detach storage account from the endpoint

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
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.detachAccount(endpointId, storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#detachAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="detachBucket"></a>
# **detachBucket**
> detachBucket(bucketId, endpointId, virtualBucket)

Detach storage account from the endpoint

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
Long bucketId = 789L; // Long | bucket-id
Long endpointId = 789L; // Long | endpoint-id
String virtualBucket = "virtualBucket_example"; // String | virtual-bucket
try {
    apiInstance.detachBucket(bucketId, endpointId, virtualBucket);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#detachBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket-id |
 **endpointId** | **Long**| endpoint-id |
 **virtualBucket** | **String**| virtual-bucket |

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

<a name="generateAccessKeys"></a>
# **generateAccessKeys**
> AccessKeysPair generateAccessKeys()

Generate new access keys pair

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
    AccessKeysPair result = apiInstance.generateAccessKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#generateAccessKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessKeysPair**](AccessKeysPair.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="setAttachedAccountSettings"></a>
# **setAttachedAccountSettings**
> setAttachedAccountSettings(endpointId, settings, storageAccountId)

Modifies settings of the attached storage account

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
EndpointStorageAccountSettings settings = new EndpointStorageAccountSettings(); // EndpointStorageAccountSettings | settings
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.setAttachedAccountSettings(endpointId, settings, storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#setAttachedAccountSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **settings** | [**EndpointStorageAccountSettings**](EndpointStorageAccountSettings.md)| settings |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setAttachedBucketSettings"></a>
# **setAttachedBucketSettings**
> setAttachedBucketSettings(bucketId, endpointId, settings, virtualBucket)

Modifies settings of the attached storage

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
Long bucketId = 789L; // Long | bucket-id
Long endpointId = 789L; // Long | endpoint-id
VirtualBucketStorageSettings settings = new VirtualBucketStorageSettings(); // VirtualBucketStorageSettings | settings
String virtualBucket = "virtualBucket_example"; // String | virtual-bucket
try {
    apiInstance.setAttachedBucketSettings(bucketId, endpointId, settings, virtualBucket);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#setAttachedBucketSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket-id |
 **endpointId** | **Long**| endpoint-id |
 **settings** | [**VirtualBucketStorageSettings**](VirtualBucketStorageSettings.md)| settings |
 **virtualBucket** | **String**| virtual-bucket |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="setVirtualBucketSettings"></a>
# **setVirtualBucketSettings**
> setVirtualBucketSettings(endpointId, settings, virtualBucket)

Modifies virtual bucket configuration

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
VirtualBucketSettings settings = new VirtualBucketSettings(); // VirtualBucketSettings | settings
String virtualBucket = "virtualBucket_example"; // String | virtual-bucket
try {
    apiInstance.setVirtualBucketSettings(endpointId, settings, virtualBucket);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#setVirtualBucketSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **settings** | [**VirtualBucketSettings**](VirtualBucketSettings.md)| settings |
 **virtualBucket** | **String**| virtual-bucket |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="updateEndpointSettings"></a>
# **updateEndpointSettings**
> updateEndpointSettings(endpointId, settings)

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
EndpointSettings settings = new EndpointSettings(); // EndpointSettings | settings
try {
    apiInstance.updateEndpointSettings(endpointId, settings);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsControllerApi#updateEndpointSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **Long**| endpoint-id |
 **settings** | [**EndpointSettings**](EndpointSettings.md)| settings |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

