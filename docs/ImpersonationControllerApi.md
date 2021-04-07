# ImpersonationControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addImpersonateFromUser**](ImpersonationControllerApi.md#addImpersonateFromUser) | **POST** /backend/rest/impersonate/from | addImpersonateFromUser
[**getImpersonateFromList**](ImpersonationControllerApi.md#getImpersonateFromList) | **GET** /backend/rest/impersonate/from | getImpersonateFromList
[**getImpersonateToList**](ImpersonationControllerApi.md#getImpersonateToList) | **GET** /backend/rest/impersonate/to | getImpersonateToList
[**impersonate**](ImpersonationControllerApi.md#impersonate) | **POST** /backend/rest/impersonate/as/{userId} | impersonate
[**removeImpersonateFromUser**](ImpersonationControllerApi.md#removeImpersonateFromUser) | **DELETE** /backend/rest/impersonate/from/{user-id} | removeImpersonateFromUser


<a name="addImpersonateFromUser"></a>
# **addImpersonateFromUser**
> addImpersonateFromUser(request)

addImpersonateFromUser

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ImpersonationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ImpersonationControllerApi apiInstance = new ImpersonationControllerApi();
AddImpersonateFromUserRequest request = new AddImpersonateFromUserRequest(); // AddImpersonateFromUserRequest | request
try {
    apiInstance.addImpersonateFromUser(request);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpersonationControllerApi#addImpersonateFromUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AddImpersonateFromUserRequest**](AddImpersonateFromUserRequest.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getImpersonateFromList"></a>
# **getImpersonateFromList**
> List&lt;ImpersonateUser&gt; getImpersonateFromList()

getImpersonateFromList

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ImpersonationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ImpersonationControllerApi apiInstance = new ImpersonationControllerApi();
try {
    List<ImpersonateUser> result = apiInstance.getImpersonateFromList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpersonationControllerApi#getImpersonateFromList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ImpersonateUser&gt;**](ImpersonateUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getImpersonateToList"></a>
# **getImpersonateToList**
> List&lt;ImpersonateUser&gt; getImpersonateToList()

getImpersonateToList

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ImpersonationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ImpersonationControllerApi apiInstance = new ImpersonationControllerApi();
try {
    List<ImpersonateUser> result = apiInstance.getImpersonateToList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpersonationControllerApi#getImpersonateToList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ImpersonateUser&gt;**](ImpersonateUser.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="impersonate"></a>
# **impersonate**
> InformationAboutAuthenticationToken impersonate(userId)

impersonate

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ImpersonationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ImpersonationControllerApi apiInstance = new ImpersonationControllerApi();
Long userId = 789L; // Long | userId
try {
    InformationAboutAuthenticationToken result = apiInstance.impersonate(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpersonationControllerApi#impersonate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**InformationAboutAuthenticationToken**](InformationAboutAuthenticationToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="removeImpersonateFromUser"></a>
# **removeImpersonateFromUser**
> removeImpersonateFromUser(userId)

removeImpersonateFromUser

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.ImpersonationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ImpersonationControllerApi apiInstance = new ImpersonationControllerApi();
Long userId = 789L; // Long | user-id
try {
    apiInstance.removeImpersonateFromUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ImpersonationControllerApi#removeImpersonateFromUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

