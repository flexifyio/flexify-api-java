# StoragesControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBucketsToStorageAccountUsingPOST**](StoragesControllerApi.md#addBucketsToStorageAccountUsingPOST) | **POST** /rest/storage-accounts/{storage-account-id}/storages | Add buckets to the storage account and optionally attach them to endpoint
[**addStorageAccountWithBucketsUsingPOST**](StoragesControllerApi.md#addStorageAccountWithBucketsUsingPOST) | **POST** /rest/storage-accounts | Add Storage Account with buckets
[**deleteStorageUsingDELETE**](StoragesControllerApi.md#deleteStorageUsingDELETE) | **DELETE** /rest/storage-accounts/{storage-account-id}/storages/{storage-id} | Delete Storage
[**deleteStoragesUsingPOST**](StoragesControllerApi.md#deleteStoragesUsingPOST) | **POST** /rest/storage-accounts/actions/delete-storages | Deletes storages
[**generateAccessKeysUsingGET**](StoragesControllerApi.md#generateAccessKeysUsingGET) | **GET** /rest/generate-access-keys | Generate new access keys pair
[**getAllStorageProvidersUsingGET**](StoragesControllerApi.md#getAllStorageProvidersUsingGET) | **GET** /rest/providers | Get all storage providers
[**getBucketsForStorageAccountUsingGET**](StoragesControllerApi.md#getBucketsForStorageAccountUsingGET) | **GET** /rest/storage-accounts/{storage-account-id}/buckets | Retrieve buckets from external cloud storage account
[**getBucketsUsingGET**](StoragesControllerApi.md#getBucketsUsingGET) | **GET** /rest/buckets | Lists buckets of the external storage account
[**getStorageAccountsForCurrentUserUsingGET**](StoragesControllerApi.md#getStorageAccountsForCurrentUserUsingGET) | **GET** /rest/storage-accounts | Get all storage accounts for current user
[**getStoragesForStorageAccountUsingGET**](StoragesControllerApi.md#getStoragesForStorageAccountUsingGET) | **GET** /rest/storage-accounts/{storage-account-id}/storages | Get storages of the storage account
[**refreshStorageUsingPOST**](StoragesControllerApi.md#refreshStorageUsingPOST) | **POST** /rest/storage-accounts/{storage-account-id}/storages/{storage-id}/actions/refresh | Refresh storage
[**refreshStoragesUsingPOST**](StoragesControllerApi.md#refreshStoragesUsingPOST) | **POST** /rest/storage-accounts/actions/refresh-storages | Refresh storages


<a name="addBucketsToStorageAccountUsingPOST"></a>
# **addBucketsToStorageAccountUsingPOST**
> addBucketsToStorageAccountUsingPOST(storageAccountId, request)

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
AddBucketsToStorageAccountRequest request = new AddBucketsToStorageAccountRequest(); // AddBucketsToStorageAccountRequest | request
try {
    apiInstance.addBucketsToStorageAccountUsingPOST(storageAccountId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addBucketsToStorageAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageAccountId** | **Long**| storage-account-id |
 **request** | [**AddBucketsToStorageAccountRequest**](AddBucketsToStorageAccountRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="addStorageAccountWithBucketsUsingPOST"></a>
# **addStorageAccountWithBucketsUsingPOST**
> IdResponse addStorageAccountWithBucketsUsingPOST(request)

Add Storage Account with buckets

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
AddStorageAccountWithBucketsRequest request = new AddStorageAccountWithBucketsRequest(); // AddStorageAccountWithBucketsRequest | request
try {
    IdResponse result = apiInstance.addStorageAccountWithBucketsUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#addStorageAccountWithBucketsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddStorageAccountWithBucketsRequest**](AddStorageAccountWithBucketsRequest.md)| request |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteStorageUsingDELETE"></a>
# **deleteStorageUsingDELETE**
> deleteStorageUsingDELETE(storageAccountId, storageId)

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
    apiInstance.deleteStorageUsingDELETE(storageAccountId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteStorageUsingDELETE");
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

<a name="deleteStoragesUsingPOST"></a>
# **deleteStoragesUsingPOST**
> deleteStoragesUsingPOST(request)

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
    apiInstance.deleteStoragesUsingPOST(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#deleteStoragesUsingPOST");
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

<a name="generateAccessKeysUsingGET"></a>
# **generateAccessKeysUsingGET**
> AccessKeysPair generateAccessKeysUsingGET()

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
    AccessKeysPair result = apiInstance.generateAccessKeysUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#generateAccessKeysUsingGET");
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

<a name="getAllStorageProvidersUsingGET"></a>
# **getAllStorageProvidersUsingGET**
> List&lt;StorageProvider&gt; getAllStorageProvidersUsingGET()

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
    List<StorageProvider> result = apiInstance.getAllStorageProvidersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getAllStorageProvidersUsingGET");
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

<a name="getBucketsForStorageAccountUsingGET"></a>
# **getBucketsForStorageAccountUsingGET**
> List&lt;Bucket&gt; getBucketsForStorageAccountUsingGET(storageAccountId)

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
    List<Bucket> result = apiInstance.getBucketsForStorageAccountUsingGET(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getBucketsForStorageAccountUsingGET");
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

<a name="getBucketsUsingGET"></a>
# **getBucketsUsingGET**
> List&lt;Bucket&gt; getBucketsUsingGET(providerId, identity, credential, customUrl, useSsl)

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
    List<Bucket> result = apiInstance.getBucketsUsingGET(providerId, identity, credential, customUrl, useSsl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getBucketsUsingGET");
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

<a name="getStorageAccountsForCurrentUserUsingGET"></a>
# **getStorageAccountsForCurrentUserUsingGET**
> List&lt;StorageAccount&gt; getStorageAccountsForCurrentUserUsingGET(includeStorages)

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
    List<StorageAccount> result = apiInstance.getStorageAccountsForCurrentUserUsingGET(includeStorages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getStorageAccountsForCurrentUserUsingGET");
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

<a name="getStoragesForStorageAccountUsingGET"></a>
# **getStoragesForStorageAccountUsingGET**
> List&lt;Storage&gt; getStoragesForStorageAccountUsingGET(storageAccountId)

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
    List<Storage> result = apiInstance.getStoragesForStorageAccountUsingGET(storageAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#getStoragesForStorageAccountUsingGET");
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

<a name="refreshStorageUsingPOST"></a>
# **refreshStorageUsingPOST**
> refreshStorageUsingPOST(storageAccountId, storageId)

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
    apiInstance.refreshStorageUsingPOST(storageAccountId, storageId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshStorageUsingPOST");
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

<a name="refreshStoragesUsingPOST"></a>
# **refreshStoragesUsingPOST**
> refreshStoragesUsingPOST(request)

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
    apiInstance.refreshStoragesUsingPOST(request);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragesControllerApi#refreshStoragesUsingPOST");
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

