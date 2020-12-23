# UserControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UserControllerApi.md#getCurrentUser) | **GET** /backend/rest/user/current | Get details of user corresponding to provided auth token
[**requestDelete**](UserControllerApi.md#requestDelete) | **POST** /backend/rest/user/request-delete | requestDelete
[**requestResetPassword**](UserControllerApi.md#requestResetPassword) | **POST** /backend/rest/user/request-reset-password | requestResetPassword


<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser(contextPath, localeCountry, localeDisplayCountry, localeDisplayLanguage, localeDisplayName, localeDisplayScript, localeDisplayVariant, localeExtensionKeys, localeISO3Country, localeISO3Language, localeLanguage, localeScript, localeUnicodeLocaleAttributes, localeUnicodeLocaleKeys, localeVariant, remoteUser, secure, userPrincipalName)

Get details of user corresponding to provided auth token

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
String contextPath = "contextPath_example"; // String | 
String localeCountry = "localeCountry_example"; // String | 
String localeDisplayCountry = "localeDisplayCountry_example"; // String | 
String localeDisplayLanguage = "localeDisplayLanguage_example"; // String | 
String localeDisplayName = "localeDisplayName_example"; // String | 
String localeDisplayScript = "localeDisplayScript_example"; // String | 
String localeDisplayVariant = "localeDisplayVariant_example"; // String | 
List<String> localeExtensionKeys = Arrays.asList("localeExtensionKeys_example"); // List<String> | 
String localeISO3Country = "localeISO3Country_example"; // String | 
String localeISO3Language = "localeISO3Language_example"; // String | 
String localeLanguage = "localeLanguage_example"; // String | 
String localeScript = "localeScript_example"; // String | 
List<String> localeUnicodeLocaleAttributes = Arrays.asList("localeUnicodeLocaleAttributes_example"); // List<String> | 
List<String> localeUnicodeLocaleKeys = Arrays.asList("localeUnicodeLocaleKeys_example"); // List<String> | 
String localeVariant = "localeVariant_example"; // String | 
String remoteUser = "remoteUser_example"; // String | 
Boolean secure = true; // Boolean | 
String userPrincipalName = "userPrincipalName_example"; // String | 
try {
    User result = apiInstance.getCurrentUser(contextPath, localeCountry, localeDisplayCountry, localeDisplayLanguage, localeDisplayName, localeDisplayScript, localeDisplayVariant, localeExtensionKeys, localeISO3Country, localeISO3Language, localeLanguage, localeScript, localeUnicodeLocaleAttributes, localeUnicodeLocaleKeys, localeVariant, remoteUser, secure, userPrincipalName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contextPath** | **String**|  | [optional]
 **localeCountry** | **String**|  | [optional]
 **localeDisplayCountry** | **String**|  | [optional]
 **localeDisplayLanguage** | **String**|  | [optional]
 **localeDisplayName** | **String**|  | [optional]
 **localeDisplayScript** | **String**|  | [optional]
 **localeDisplayVariant** | **String**|  | [optional]
 **localeExtensionKeys** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **localeISO3Country** | **String**|  | [optional]
 **localeISO3Language** | **String**|  | [optional]
 **localeLanguage** | **String**|  | [optional]
 **localeScript** | **String**|  | [optional]
 **localeUnicodeLocaleAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **localeUnicodeLocaleKeys** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **localeVariant** | **String**|  | [optional]
 **remoteUser** | **String**|  | [optional]
 **secure** | **Boolean**|  | [optional]
 **userPrincipalName** | **String**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="requestDelete"></a>
# **requestDelete**
> requestDelete()

requestDelete

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
try {
    apiInstance.requestDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#requestDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="requestResetPassword"></a>
# **requestResetPassword**
> requestResetPassword(request)

requestResetPassword

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

UserControllerApi apiInstance = new UserControllerApi();
RequestResetPasswordRequest request = new RequestResetPasswordRequest(); // RequestResetPasswordRequest | request
try {
    apiInstance.requestResetPassword(request);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#requestResetPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RequestResetPasswordRequest**](RequestResetPasswordRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

