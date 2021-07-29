# StoragesControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBuckets**](StoragesControllerApi.md#addBuckets) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets | Add buckets to the storage account
[**deleteBucket**](StoragesControllerApi.md#deleteBucket) | **DELETE** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Deletes (hides) a bucket/container
[**deleteBuckets**](StoragesControllerApi.md#deleteBuckets) | **POST** /backend/rest/storage-accounts/actions/delete-buckets | Deletes (hides) multiple buckets/containers
[**getBucket**](StoragesControllerApi.md#getBucket) | **GET** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Get detailed stats for the bucket
[**getProviders**](StoragesControllerApi.md#getProviders) | **GET** /backend/rest/providers | Get all storage providers
[**refreshBucket**](StoragesControllerApi.md#refreshBucket) | **POST** /backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh | Refresh statistics of a single bucket
[**refreshBuckets**](StoragesControllerApi.md#refreshBuckets) | **POST** /backend/rest/storage-accounts/actions/refresh-buckets | Refresh statistics of multiple buckets


<a name="addBuckets"></a>
# **addBuckets**
> IdsList addBuckets(request, storageAccountId)

Add buckets to the storage account

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
BucketsRequest request = new BucketsRequest(); // BucketsRequest | request
Long storageAccountId = 789L; // Long | storage-account-id
try {
    IdsList result = apiInstance.addBuckets(request, storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**BucketsRequest**](BucketsRequest.md)| request |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

[**IdsList**](IdsList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBucket"></a>
# **deleteBucket**
> deleteBucket(bucketId, storageAccountId, forceDetach)

Deletes (hides) a bucket/container

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
Long bucketId = 789L; // Long | bucket-id
Long storageAccountId = 789L; // Long | storage-account-id
Boolean forceDetach = false; // Boolean | force-detach
try {
    apiInstance.deleteBucket(bucketId, storageAccountId, forceDetach);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket-id |
 **storageAccountId** | **Long**| storage-account-id |
 **forceDetach** | **Boolean**| force-detach | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBuckets"></a>
# **deleteBuckets**
> deleteBuckets(request, forceDetach)

Deletes (hides) multiple buckets/containers

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
IdsList request = new IdsList(); // IdsList | request
Boolean forceDetach = false; // Boolean | force-detach
try {
    apiInstance.deleteBuckets(request, forceDetach);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**IdsList**](IdsList.md)| request |
 **forceDetach** | **Boolean**| force-detach | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getBucket"></a>
# **getBucket**
> Bucket getBucket(bucketId, storageAccountId)

Get detailed stats for the bucket

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
Long bucketId = 789L; // Long | bucket-id
Long storageAccountId = 789L; // Long | storage-account-id
try {
    Bucket result = apiInstance.getBucket(bucketId, storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket-id |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

[**Bucket**](Bucket.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getProviders"></a>
# **getProviders**
> List&lt;StorageProvider&gt; getProviders()

Get all storage providers

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
try {
    List<StorageProvider> result = apiInstance.getProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StorageProvider&gt;**](StorageProvider.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="refreshBucket"></a>
# **refreshBucket**
> refreshBucket(bucketId, storageAccountId)

Refresh statistics of a single bucket

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
Long bucketId = 789L; // Long | bucket-id
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.refreshBucket(bucketId, storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket-id |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="refreshBuckets"></a>
# **refreshBuckets**
> refreshBuckets(request)

Refresh statistics of multiple buckets

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
IdsList request = new IdsList(); // IdsList | request
try {
    apiInstance.refreshBuckets(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**IdsList**](IdsList.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

