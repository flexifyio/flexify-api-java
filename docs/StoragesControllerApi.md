# StoragesControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStorageAccount**](StoragesControllerApi.md#addStorageAccount) | **POST** /rest/storage-accounts | Add Storage Account with an optional list of buckets
[**addStorages**](StoragesControllerApi.md#addStorages) | **POST** /rest/storage-accounts/{storage-account-id}/storages | Add buckets to the storage account and optionally attach them to endpoint
[**deleteStorage**](StoragesControllerApi.md#deleteStorage) | **DELETE** /rest/storage-accounts/{storage-account-id}/storages/{storage-id} | Delete Storage
[**deleteStorages**](StoragesControllerApi.md#deleteStorages) | **POST** /rest/storage-accounts/actions/delete-storages | Deletes storages
[**generateAccessKeys**](StoragesControllerApi.md#generateAccessKeys) | **GET** /rest/generate-access-keys | Generate new access keys pair
[**getProviders**](StoragesControllerApi.md#getProviders) | **GET** /rest/providers | Get all storage providers
[**getStorageAccounts**](StoragesControllerApi.md#getStorageAccounts) | **GET** /rest/storage-accounts | Get all storage accounts for current user
[**getStorages**](StoragesControllerApi.md#getStorages) | **GET** /rest/storage-accounts/{storage-account-id}/storages | Get storages of the storage account
[**refreshStorage**](StoragesControllerApi.md#refreshStorage) | **POST** /rest/storage-accounts/{storage-account-id}/storages/{storage-id}/actions/refresh | Refresh storage
[**refreshStorages**](StoragesControllerApi.md#refreshStorages) | **POST** /rest/storage-accounts/actions/refresh-storages | Refresh storages
[**requestBuckets**](StoragesControllerApi.md#requestBuckets) | **GET** /rest/buckets | Lists buckets of the external storage account
[**requestBucketsForStorageAccount**](StoragesControllerApi.md#requestBucketsForStorageAccount) | **GET** /rest/storage-accounts/{storage-account-id}/buckets | Retrieve buckets from external cloud storage account


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

<a name="addStorages"></a>
# **addStorages**
> AddStoragesResponse addStorages(storageAccountId, request)

Add buckets to the storage account and optionally attach them to endpoint

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
AddStoragesRequest request = new AddStoragesRequest(); // AddStoragesRequest | request
try {
    AddStoragesResponse result = apiInstance.addStorages(storageAccountId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addStorages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **request** | [**AddStoragesRequest**](AddStoragesRequest.md)| request |

### Return type

[**AddStoragesResponse**](AddStoragesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteStorage"></a>
# **deleteStorage**
> deleteStorage(storageAccountId, storageId)

Delete Storage

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
Long storageId = 789L; // Long | storage-id
try {
    apiInstance.deleteStorage(storageAccountId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **storageId** | **Long**| storage-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteStorages"></a>
# **deleteStorages**
> deleteStorages(request)

Deletes storages

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
    apiInstance.deleteStorages(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteStorages");
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

<a name="getStorages"></a>
# **getStorages**
> List&lt;Storage&gt; getStorages(storageAccountId)

Get storages of the storage account

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
    List<Storage> result = apiInstance.getStorages(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getStorages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |

### Return type

[**List&lt;Storage&gt;**](Storage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="refreshStorage"></a>
# **refreshStorage**
> refreshStorage(storageAccountId, storageId)

Refresh storage

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
Long storageId = 789L; // Long | storage-id
try {
    apiInstance.refreshStorage(storageAccountId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **storageId** | **Long**| storage-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="refreshStorages"></a>
# **refreshStorages**
> refreshStorages(request)

Refresh storages

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
    apiInstance.refreshStorages(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshStorages");
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

<a name="requestBucketsForStorageAccount"></a>
# **requestBucketsForStorageAccount**
> List&lt;Bucket&gt; requestBucketsForStorageAccount(storageAccountId)

Retrieve buckets from external cloud storage account

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
    List<Bucket> result = apiInstance.requestBucketsForStorageAccount(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#requestBucketsForStorageAccount");
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

