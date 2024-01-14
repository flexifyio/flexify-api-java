# AzureIntegrationOAuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAzureIntegration**](AzureIntegrationOAuthControllerApi.md#addAzureIntegration) | **POST** /backend/rest/azure-integration | Add new Azure integration
[**authStorage**](AzureIntegrationOAuthControllerApi.md#authStorage) | **POST** /backend/rest/azure-integration/{azure-integration-id}/actions/auth-storage | Authenticate Azure integration storage access
[**deleteAzureIntegration**](AzureIntegrationOAuthControllerApi.md#deleteAzureIntegration) | **DELETE** /backend/rest/azure-integration/{azure-integration-id} | Deletes (hides) Azure integration by Id
[**getAzureIntegrations**](AzureIntegrationOAuthControllerApi.md#getAzureIntegrations) | **GET** /backend/rest/azure-integration | Get Azure integration by id
[**getConfigForAzureIntegration**](AzureIntegrationOAuthControllerApi.md#getConfigForAzureIntegration) | **GET** /backend/rest/azure-integration/oauth/config | Get OAuth configuration to authorize Azure integration
[**getDeviceCodeForAzureIntegrationManagement**](AzureIntegrationOAuthControllerApi.md#getDeviceCodeForAzureIntegrationManagement) | **GET** /backend/rest/azure-integration/oauth/device-code/management | Request device code to authorize Azure integration with device code flow (management access)
[**getDeviceCodeForAzureIntegrationStorage**](AzureIntegrationOAuthControllerApi.md#getDeviceCodeForAzureIntegrationStorage) | **GET** /backend/rest/azure-integration/oauth/device-code/storage | Request device code to authorize Azure integration with device code flow (storage access)
[**getStorageAccountsFromAzure**](AzureIntegrationOAuthControllerApi.md#getStorageAccountsFromAzure) | **GET** /backend/rest/azure-integration/{azure-integration-id}/storage-accounts-list | Use Azure integration to get list of storage accounts from Azure
[**reauthAzureIntegration**](AzureIntegrationOAuthControllerApi.md#reauthAzureIntegration) | **POST** /backend/rest/azure-integration/{azure-integration-id}/actions/reauth | Reauthenticate Azure integration


<a name="addAzureIntegration"></a>
# **addAzureIntegration**
> IdResponse addAzureIntegration(request)

Add new Azure integration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
FinishOAuthParams request = new FinishOAuthParams(); // FinishOAuthParams | request
try {
    IdResponse result = apiInstance.addAzureIntegration(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#addAzureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**FinishOAuthParams**](FinishOAuthParams.md)| request |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="authStorage"></a>
# **authStorage**
> authStorage(authParams, azureIntegrationId)

Authenticate Azure integration storage access

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
FinishOAuthParams authParams = new FinishOAuthParams(); // FinishOAuthParams | authParams
Long azureIntegrationId = 789L; // Long | azure-integration-id
try {
    apiInstance.authStorage(authParams, azureIntegrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#authStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authParams** | [**FinishOAuthParams**](FinishOAuthParams.md)| authParams |
 **azureIntegrationId** | **Long**| azure-integration-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteAzureIntegration"></a>
# **deleteAzureIntegration**
> deleteAzureIntegration(azureIntegrationId)

Deletes (hides) Azure integration by Id

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
Long azureIntegrationId = 789L; // Long | azure-integration-id
try {
    apiInstance.deleteAzureIntegration(azureIntegrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#deleteAzureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **azureIntegrationId** | **Long**| azure-integration-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAzureIntegrations"></a>
# **getAzureIntegrations**
> List&lt;AzureIntegration&gt; getAzureIntegrations()

Get Azure integration by id

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
try {
    List<AzureIntegration> result = apiInstance.getAzureIntegrations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getAzureIntegrations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AzureIntegration&gt;**](AzureIntegration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getConfigForAzureIntegration"></a>
# **getConfigForAzureIntegration**
> MicrosoftOAuthConfig getConfigForAzureIntegration()

Get OAuth configuration to authorize Azure integration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
try {
    MicrosoftOAuthConfig result = apiInstance.getConfigForAzureIntegration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getConfigForAzureIntegration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MicrosoftOAuthConfig**](MicrosoftOAuthConfig.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeviceCodeForAzureIntegrationManagement"></a>
# **getDeviceCodeForAzureIntegrationManagement**
> OAuth2DeviceCodeResponse getDeviceCodeForAzureIntegrationManagement()

Request device code to authorize Azure integration with device code flow (management access)

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
try {
    OAuth2DeviceCodeResponse result = apiInstance.getDeviceCodeForAzureIntegrationManagement();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getDeviceCodeForAzureIntegrationManagement");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuth2DeviceCodeResponse**](OAuth2DeviceCodeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeviceCodeForAzureIntegrationStorage"></a>
# **getDeviceCodeForAzureIntegrationStorage**
> OAuth2DeviceCodeResponse getDeviceCodeForAzureIntegrationStorage()

Request device code to authorize Azure integration with device code flow (storage access)

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
try {
    OAuth2DeviceCodeResponse result = apiInstance.getDeviceCodeForAzureIntegrationStorage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getDeviceCodeForAzureIntegrationStorage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuth2DeviceCodeResponse**](OAuth2DeviceCodeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStorageAccountsFromAzure"></a>
# **getStorageAccountsFromAzure**
> List&lt;AzureSubscriptionInfoWithStorages&gt; getStorageAccountsFromAzure(azureIntegrationId)

Use Azure integration to get list of storage accounts from Azure

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
Long azureIntegrationId = 789L; // Long | azure-integration-id
try {
    List<AzureSubscriptionInfoWithStorages> result = apiInstance.getStorageAccountsFromAzure(azureIntegrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getStorageAccountsFromAzure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **azureIntegrationId** | **Long**| azure-integration-id |

### Return type

[**List&lt;AzureSubscriptionInfoWithStorages&gt;**](AzureSubscriptionInfoWithStorages.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="reauthAzureIntegration"></a>
# **reauthAzureIntegration**
> reauthAzureIntegration(authParams, azureIntegrationId)

Reauthenticate Azure integration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.AzureIntegrationOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AzureIntegrationOAuthControllerApi apiInstance = new AzureIntegrationOAuthControllerApi();
FinishOAuthParams authParams = new FinishOAuthParams(); // FinishOAuthParams | authParams
Long azureIntegrationId = 789L; // Long | azure-integration-id
try {
    apiInstance.reauthAzureIntegration(authParams, azureIntegrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#reauthAzureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authParams** | [**FinishOAuthParams**](FinishOAuthParams.md)| authParams |
 **azureIntegrationId** | **Long**| azure-integration-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

