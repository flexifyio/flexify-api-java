# BillingAccountControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostsForCurrentUserUsingGET**](BillingAccountControllerApi.md#getCostsForCurrentUserUsingGET) | **GET** /rest/account/costs | Get costs for current user
[**getCurrentUserBillingAccountUsingGET**](BillingAccountControllerApi.md#getCurrentUserBillingAccountUsingGET) | **GET** /rest/account | Get billing account for current user
[**getPaymentsForCurrentUserUsingGET**](BillingAccountControllerApi.md#getPaymentsForCurrentUserUsingGET) | **GET** /rest/account/payments | Get payments for current user


<a name="getCostsForCurrentUserUsingGET"></a>
# **getCostsForCurrentUserUsingGET**
> List&lt;CostDetails&gt; getCostsForCurrentUserUsingGET()

Get costs for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    List<CostDetails> result = apiInstance.getCostsForCurrentUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getCostsForCurrentUserUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CostDetails&gt;**](CostDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getCurrentUserBillingAccountUsingGET"></a>
# **getCurrentUserBillingAccountUsingGET**
> BillingAccountWithMoney getCurrentUserBillingAccountUsingGET()

Get billing account for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    BillingAccountWithMoney result = apiInstance.getCurrentUserBillingAccountUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getCurrentUserBillingAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingAccountWithMoney**](BillingAccountWithMoney.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getPaymentsForCurrentUserUsingGET"></a>
# **getPaymentsForCurrentUserUsingGET**
> List&lt;Payment&gt; getPaymentsForCurrentUserUsingGET()

Get payments for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountControllerApi apiInstance = new BillingAccountControllerApi();
try {
    List<Payment> result = apiInstance.getPaymentsForCurrentUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountControllerApi#getPaymentsForCurrentUserUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

