# PartnerSignUpCodesControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCode**](PartnerSignUpCodesControllerApi.md#createCode) | **POST** /backend/rest/distributor/codes | createCode
[**createCode1**](PartnerSignUpCodesControllerApi.md#createCode1) | **POST** /backend/rest/partner/codes | createCode
[**deleteCode**](PartnerSignUpCodesControllerApi.md#deleteCode) | **DELETE** /backend/rest/distributor/codes/{code} | deleteCode
[**deleteCode1**](PartnerSignUpCodesControllerApi.md#deleteCode1) | **DELETE** /backend/rest/partner/codes/{code} | deleteCode
[**getAll**](PartnerSignUpCodesControllerApi.md#getAll) | **GET** /backend/rest/distributor/codes | getAll
[**getAll1**](PartnerSignUpCodesControllerApi.md#getAll1) | **GET** /backend/rest/partner/codes | getAll


<a name="createCode"></a>
# **createCode**
> createCode(request)

createCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
SignupCodeReq request = new SignupCodeReq(); // SignupCodeReq | request
try {
    apiInstance.createCode(request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#createCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SignupCodeReq**](SignupCodeReq.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="createCode1"></a>
# **createCode1**
> createCode1(request)

createCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
SignupCodeReq request = new SignupCodeReq(); // SignupCodeReq | request
try {
    apiInstance.createCode1(request);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#createCode1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SignupCodeReq**](SignupCodeReq.md)| request |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteCode"></a>
# **deleteCode**
> deleteCode(code)

deleteCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
String code = "code_example"; // String | code
try {
    apiInstance.deleteCode(code);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#deleteCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| code |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="deleteCode1"></a>
# **deleteCode1**
> deleteCode1(code)

deleteCode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
String code = "code_example"; // String | code
try {
    apiInstance.deleteCode1(code);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#deleteCode1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| code |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getAll"></a>
# **getAll**
> List&lt;SignupCodeRes&gt; getAll()

getAll

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
try {
    List<SignupCodeRes> result = apiInstance.getAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#getAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SignupCodeRes&gt;**](SignupCodeRes.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getAll1"></a>
# **getAll1**
> List&lt;SignupCodeRes&gt; getAll1()

getAll

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerSignUpCodesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerSignUpCodesControllerApi apiInstance = new PartnerSignUpCodesControllerApi();
try {
    List<SignupCodeRes> result = apiInstance.getAll1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerSignUpCodesControllerApi#getAll1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SignupCodeRes&gt;**](SignupCodeRes.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

