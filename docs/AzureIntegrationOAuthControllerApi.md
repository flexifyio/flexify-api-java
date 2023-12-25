# AzureIntegrationOAuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAzureIntegration**](AzureIntegrationOAuthControllerApi.md#addAzureIntegration) | **POST** /backend/rest/azure-integration | Add new Azure integration
[**deleteAzureIntegration**](AzureIntegrationOAuthControllerApi.md#deleteAzureIntegration) | **DELETE** /backend/rest/azure-integration/{azure-integration-id} | Deletes (hides) Azure integration by Id
[**getAzureIntegrations**](AzureIntegrationOAuthControllerApi.md#getAzureIntegrations) | **GET** /backend/rest/azure-integration | Get Azure integration by id
[**getConfigForStorageList**](AzureIntegrationOAuthControllerApi.md#getConfigForStorageList) | **GET** /backend/rest/azure-integration/oauth/config | Get OAuth configuration to authorize Azure integration
[**getDeviceCodeForStorageList**](AzureIntegrationOAuthControllerApi.md#getDeviceCodeForStorageList) | **GET** /backend/rest/azure-integration/oauth/device-code | Request device code to authorize Azure integration with device code flow
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

<a name="getConfigForStorageList"></a>
# **getConfigForStorageList**
> MicrosoftOAuthConfig getConfigForStorageList()

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
    MicrosoftOAuthConfig result = apiInstance.getConfigForStorageList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getConfigForStorageList");
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

<a name="getDeviceCodeForStorageList"></a>
# **getDeviceCodeForStorageList**
> OAuth2DeviceCodeResponse getDeviceCodeForStorageList()

Request device code to authorize Azure integration with device code flow

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
    OAuth2DeviceCodeResponse result = apiInstance.getDeviceCodeForStorageList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureIntegrationOAuthControllerApi#getDeviceCodeForStorageList");
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

