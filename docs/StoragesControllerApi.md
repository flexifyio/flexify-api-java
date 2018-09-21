# StoragesControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBuckets**](StoragesControllerApi.md#addBuckets) | **POST** /rest/storage-accounts/{storage-account-id}/buckets | Add buckets to the storage account
[**addStorageAccount**](StoragesControllerApi.md#addStorageAccount) | **POST** /rest/storage-accounts | Add Storage Account with an optional list of buckets
[**deleteBucket**](StoragesControllerApi.md#deleteBucket) | **DELETE** /rest/storage-accounts/{storage-account-id}/buckets/{bucket-id} | Deletes (hides) a bucket/container
[**deleteBuckets**](StoragesControllerApi.md#deleteBuckets) | **POST** /rest/storage-accounts/actions/delete-buckets | Deletes (hides) multiple buckets/containers
[**generateAccessKeys**](StoragesControllerApi.md#generateAccessKeys) | **GET** /rest/generate-access-keys | Generate new access keys pair
[**getBuckets**](StoragesControllerApi.md#getBuckets) | **GET** /rest/storage-accounts/{storage-account-id}/buckets | Get registered non-hidden bukects/containers of the storage account
[**getProviders**](StoragesControllerApi.md#getProviders) | **GET** /rest/providers | Get all storage providers
[**getStorageAccounts**](StoragesControllerApi.md#getStorageAccounts) | **GET** /rest/storage-accounts | Get all storage accounts for current user
[**refreshBucket**](StoragesControllerApi.md#refreshBucket) | **POST** /rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh | Refresh statistics of a single bucket
[**refreshBuckets**](StoragesControllerApi.md#refreshBuckets) | **POST** /rest/storage-accounts/actions/refresh-buckets | Refresh statistics of multiple buckets
[**requestBuckets**](StoragesControllerApi.md#requestBuckets) | **GET** /rest/buckets | Lists buckets of the external storage account
[**requestCloudBuckets**](StoragesControllerApi.md#requestCloudBuckets) | **GET** /rest/storage-accounts/{storage-account-id}/cloud/buckets | Retrieve buckets/containers list from underlying cloud
[**setBuckets**](StoragesControllerApi.md#setBuckets) | **PUT** /rest/storage-accounts/{storage-account-id}/buckets | Sets a list of bucket for a storage account (hides existing buckets not in a list and adds buckets not in a list)


<a name="addBuckets"></a>
# **addBuckets**
> IdsList addBuckets(storageAccountId, request)

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
Long storageAccountId = 789L; // Long | storage-account-id
BucketsRequest request = new BucketsRequest(); // BucketsRequest | request
try {
    IdsList result = apiInstance.addBuckets(storageAccountId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **request** | [**BucketsRequest**](BucketsRequest.md)| request |

### Return type

[**IdsList**](IdsList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addStorageAccount"></a>
# **addStorageAccount**
> IdResponse addStorageAccount(request)

Add Storage Account with an optional list of buckets

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
AddStorageAccountRequest request = new AddStorageAccountRequest(); // AddStorageAccountRequest | request
try {
    IdResponse result = apiInstance.addStorageAccount(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addStorageAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddStorageAccountRequest**](AddStorageAccountRequest.md)| request |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBucket"></a>
# **deleteBucket**
> deleteBucket(storageAccountId, bucketId)

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
Long storageAccountId = 789L; // Long | storage-account-id
Long bucketId = 789L; // Long | bucket-id
try {
    apiInstance.deleteBucket(storageAccountId, bucketId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **bucketId** | **Long**| bucket-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteBuckets"></a>
# **deleteBuckets**
> deleteBuckets(request)

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
try {
    apiInstance.deleteBuckets(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteBuckets");
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
//import io.flexify.apiclient.api.StoragesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StoragesControllerApi apiInstance = new StoragesControllerApi();
try {
    AccessKeysPair result = apiInstance.generateAccessKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#generateAccessKeys");
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

<a name="getBuckets"></a>
# **getBuckets**
> List&lt;Bucket&gt; getBuckets(storageAccountId)

Get registered non-hidden bukects/containers of the storage account

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
Long storageAccountId = 789L; // Long | storage-account-id
try {
    List<Bucket> result = apiInstance.getBuckets(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |

### Return type

[**List&lt;Bucket&gt;**](Bucket.md)

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

<a name="getStorageAccounts"></a>
# **getStorageAccounts**
> List&lt;StorageAccount&gt; getStorageAccounts(includeStorages)

Get all storage accounts for current user

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
Boolean includeStorages = true; // Boolean | Include storages of given storage account to the response
try {
    List<StorageAccount> result = apiInstance.getStorageAccounts(includeStorages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getStorageAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeStorages** | **Boolean**| Include storages of given storage account to the response | [optional] [default to true]

### Return type

[**List&lt;StorageAccount&gt;**](StorageAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="refreshBucket"></a>
# **refreshBucket**
> refreshBucket(storageAccountId, bucketId)

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
Long storageAccountId = 789L; // Long | storage-account-id
Long bucketId = 789L; // Long | bucket-id
try {
    apiInstance.refreshBucket(storageAccountId, bucketId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **bucketId** | **Long**| bucket-id |

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

<a name="requestBuckets"></a>
# **requestBuckets**
> List&lt;Bucket&gt; requestBuckets(providerId, identity, credential, customUrl, useSsl)

Lists buckets of the external storage account

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
Long providerId = 789L; // Long | Provider ID (Amazon S3, Microsoft Azure, etc)
String identity = "identity_example"; // String | Account Identity
String credential = "credential_example"; // String | Account Credential
String customUrl = "customUrl_example"; // String | Optional endpoint to access the storage
Boolean useSsl = true; // Boolean | Use SSL to connect to the endpoint
try {
    List<Bucket> result = apiInstance.requestBuckets(providerId, identity, credential, customUrl, useSsl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#requestBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **Long**| Provider ID (Amazon S3, Microsoft Azure, etc) | [optional]
 **identity** | **String**| Account Identity | [optional]
 **credential** | **String**| Account Credential | [optional]
 **customUrl** | **String**| Optional endpoint to access the storage | [optional]
 **useSsl** | **Boolean**| Use SSL to connect to the endpoint | [optional] [default to true]

### Return type

[**List&lt;Bucket&gt;**](Bucket.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="requestCloudBuckets"></a>
# **requestCloudBuckets**
> List&lt;Bucket&gt; requestCloudBuckets(storageAccountId)

Retrieve buckets/containers list from underlying cloud

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
Long storageAccountId = 789L; // Long | storage-account-id
try {
    List<Bucket> result = apiInstance.requestCloudBuckets(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#requestCloudBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |

### Return type

[**List&lt;Bucket&gt;**](Bucket.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="setBuckets"></a>
# **setBuckets**
> IdsList setBuckets(storageAccountId, request)

Sets a list of bucket for a storage account (hides existing buckets not in a list and adds buckets not in a list)

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
Long storageAccountId = 789L; // Long | storage-account-id
BucketsRequest request = new BucketsRequest(); // BucketsRequest | request
try {
    IdsList result = apiInstance.setBuckets(storageAccountId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#setBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **request** | [**BucketsRequest**](BucketsRequest.md)| request |

### Return type

[**IdsList**](IdsList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

