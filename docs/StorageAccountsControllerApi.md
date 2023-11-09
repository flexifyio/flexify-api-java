# StorageAccountsControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStorageAccount**](StorageAccountsControllerApi.md#addStorageAccount) | **POST** /backend/rest/storage-accounts | Add Storage Account with an optional list of buckets
[**deleteStorageAccount**](StorageAccountsControllerApi.md#deleteStorageAccount) | **DELETE** /backend/rest/storage-accounts/{storage-account-id} | Deletes (hides) storage account and all its buckets/containers
[**getStorageAccount**](StorageAccountsControllerApi.md#getStorageAccount) | **GET** /backend/rest/storage-accounts/{storage-account-id} | Get storage account by id
[**getStorageAccounts**](StorageAccountsControllerApi.md#getStorageAccounts) | **GET** /backend/rest/storage-accounts | Get all storage accounts for current user
[**reauthStorageAccount**](StorageAccountsControllerApi.md#reauthStorageAccount) | **POST** /backend/rest/storage-accounts/{storage-account-id}/reauth | Reauthenticate storage account
[**refreshStorageAccount**](StorageAccountsControllerApi.md#refreshStorageAccount) | **POST** /backend/rest/storage-accounts/{storage-account-id}/actions/refresh | Requests and updates list of buckets/containers for the storage account
[**setStorageAccountSettings**](StorageAccountsControllerApi.md#setStorageAccountSettings) | **PUT** /backend/rest/storage-accounts/{storage-account-id}/settings | Updates storage account settings


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

Deletes (hides) storage account and all its buckets/containers

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
> StorageAccountWithBuckets getStorageAccount(storageAccountId)

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
    StorageAccountWithBuckets result = apiInstance.getStorageAccount(storageAccountId);
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

[**StorageAccountWithBuckets**](StorageAccountWithBuckets.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getStorageAccounts"></a>
# **getStorageAccounts**
> List&lt;StorageAccount&gt; getStorageAccounts(includeBuckets)

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
Boolean includeBuckets = true; // Boolean | Include storages of given storage account to the response
try {
    List<StorageAccount> result = apiInstance.getStorageAccounts(includeBuckets);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#getStorageAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeBuckets** | **Boolean**| Include storages of given storage account to the response | [optional] [default to true]

### Return type

[**List&lt;StorageAccount&gt;**](StorageAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="reauthStorageAccount"></a>
# **reauthStorageAccount**
> reauthStorageAccount(authParams, storageAccountId)

Reauthenticate storage account

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
FinishOAuthParams authParams = new FinishOAuthParams(); // FinishOAuthParams | authParams
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.reauthStorageAccount(authParams, storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#reauthStorageAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authParams** | [**FinishOAuthParams**](FinishOAuthParams.md)| authParams |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="setStorageAccountSettings"></a>
# **setStorageAccountSettings**
> setStorageAccountSettings(settings, storageAccountId)

Updates storage account settings

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
StorageAccountSettingsReq settings = new StorageAccountSettingsReq(); // StorageAccountSettingsReq | settings
Long storageAccountId = 789L; // Long | storage-account-id
try {
    apiInstance.setStorageAccountSettings(settings, storageAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsControllerApi#setStorageAccountSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settings** | [**StorageAccountSettingsReq**](StorageAccountSettingsReq.md)| settings |
 **storageAccountId** | **Long**| storage-account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

