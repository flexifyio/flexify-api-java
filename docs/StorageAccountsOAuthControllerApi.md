# StorageAccountsOAuthControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig2**](StorageAccountsOAuthControllerApi.md#getConfig2) | **GET** /backend/rest/storage-accounts/oauth/config | getConfig
[**getDeviceCode1**](StorageAccountsOAuthControllerApi.md#getDeviceCode1) | **GET** /backend/rest/storage-accounts/oauth/device-code | getDeviceCode


<a name="getConfig2"></a>
# **getConfig2**
> Object getConfig2(oauthProviderId)

getConfig

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StorageAccountsOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsOAuthControllerApi apiInstance = new StorageAccountsOAuthControllerApi();
String oauthProviderId = "oauthProviderId_example"; // String | oauth-provider-id
try {
    Object result = apiInstance.getConfig2(oauthProviderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsOAuthControllerApi#getConfig2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthProviderId** | **String**| oauth-provider-id | [enum: DROPBOX, DROPBOX_TEAM, MICROSOFT]

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDeviceCode1"></a>
# **getDeviceCode1**
> OAuth2DeviceCodeResponse getDeviceCode1(oauthProviderId, storageAccountName, storageProviderId, useSsl, customEndpoint)

getDeviceCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.StorageAccountsOAuthControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StorageAccountsOAuthControllerApi apiInstance = new StorageAccountsOAuthControllerApi();
String oauthProviderId = "oauthProviderId_example"; // String | oauth-provider-id
String storageAccountName = "storageAccountName_example"; // String | storage-account-name
Long storageProviderId = 789L; // Long | storage-provider-id
Boolean useSsl = true; // Boolean | use-ssl
String customEndpoint = "customEndpoint_example"; // String | custom-endpoint
try {
    OAuth2DeviceCodeResponse result = apiInstance.getDeviceCode1(oauthProviderId, storageAccountName, storageProviderId, useSsl, customEndpoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageAccountsOAuthControllerApi#getDeviceCode1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthProviderId** | **String**| oauth-provider-id | [enum: DROPBOX, DROPBOX_TEAM, MICROSOFT]
 **storageAccountName** | **String**| storage-account-name |
 **storageProviderId** | **Long**| storage-provider-id |
 **useSsl** | **Boolean**| use-ssl |
 **customEndpoint** | **String**| custom-endpoint | [optional]

### Return type

[**OAuth2DeviceCodeResponse**](OAuth2DeviceCodeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

