# StorageAccountsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStorageAccount**](StorageAccountsControllerApi.md#addStorageAccount) | **POST** /rest/storage-accounts | Add Storage Account with an optional list of buckets
[**deleteStorageAccount**](StorageAccountsControllerApi.md#deleteStorageAccount) | **DELETE** /rest/storage-accounts/{storage-account-id} | Deletes (hides) a bucket/container
[**getStorageAccount**](StorageAccountsControllerApi.md#getStorageAccount) | **GET** /rest/storage-accounts/storage-accounts/{storage-account-id} | Get storage account by id
[**getStorageAccounts**](StorageAccountsControllerApi.md#getStorageAccounts) | **GET** /rest/storage-accounts | Get all storage accounts for current user
[**refreshStorageAccount**](StorageAccountsControllerApi.md#refreshStorageAccount) | **POST** /rest/storage-accounts/{storage-account-id}/actions/refresh | Requests and updates list of buckets/containers for the storage account


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
//import io.flexify.apiclient.api.StorageAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsControllerApi apiInstance = new StorageAccountsControllerApi();
AddStorageAccountRequest request = new AddStorageAccountRequest(); // AddStorageAccountRequest | request
try {
    IdResponse result = apiInstance.addStorageAccount(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#addStorageAccount");
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

<a name="deleteStorageAccount"></a>
# **deleteStorageAccount**
> deleteStorageAccount(storageAccountId, forceDetach)

Deletes (hides) a bucket/container

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StorageAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsControllerApi apiInstance = new StorageAccountsControllerApi();
Long storageAccountId = 789L; // Long | storage-account-id
Boolean forceDetach = false; // Boolean | force-detach
try {
    apiInstance.deleteStorageAccount(storageAccountId, forceDetach);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#deleteStorageAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **forceDetach** | **Boolean**| force-detach | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getStorageAccount"></a>
# **getStorageAccount**
> List&lt;Bucket&gt; getStorageAccount(storageAccountId)

Get storage account by id

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StorageAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsControllerApi apiInstance = new StorageAccountsControllerApi();
Long storageAccountId = 789L; // Long | storage-account-id
try {
    List<Bucket> result = apiInstance.getStorageAccount(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#getStorageAccount");
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
//import io.flexify.apiclient.api.StorageAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsControllerApi apiInstance = new StorageAccountsControllerApi();
Boolean includeStorages = true; // Boolean | Include storages of given storage account to the response
try {
    List<StorageAccount> result = apiInstance.getStorageAccounts(includeStorages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#getStorageAccounts");
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

<a name="refreshStorageAccount"></a>
# **refreshStorageAccount**
> refreshStorageAccount(storageAccountId)

Requests and updates list of buckets/containers for the storage account

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StorageAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsControllerApi apiInstance = new StorageAccountsControllerApi();
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.refreshStorageAccount(storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#refreshStorageAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

