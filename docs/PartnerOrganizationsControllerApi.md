# PartnerOrganizationsControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAll**](PartnerOrganizationsControllerApi.md#getAll) | **GET** /backend/rest/partner/organizations | getAll
[**getOrgLimits**](PartnerOrganizationsControllerApi.md#getOrgLimits) | **GET** /backend/rest/partner/organizations/{orgId}/limits | getOrgLimits


<a name="getAll"></a>
# **getAll**
> List&lt;Organization&gt; getAll()

getAll

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerOrganizationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerOrganizationsControllerApi apiInstance = new PartnerOrganizationsControllerApi();
try {
    List<Organization> result = apiInstance.getAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerOrganizationsControllerApi#getAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getOrgLimits"></a>
# **getOrgLimits**
> UserConfig getOrgLimits(orgId)

getOrgLimits

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PartnerOrganizationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PartnerOrganizationsControllerApi apiInstance = new PartnerOrganizationsControllerApi();
Long orgId = 789L; // Long | orgId
try {
    UserConfig result = apiInstance.getOrgLimits(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerOrganizationsControllerApi#getOrgLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |

### Return type

[**UserConfig**](UserConfig.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

