# PaymentControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentOptions**](PaymentControllerApi.md#getPaymentOptions) | **GET** /rest/pay/paddle/options | getPaymentOptions
[**paymentFulfilled**](PaymentControllerApi.md#paymentFulfilled) | **GET** /rest/pay/paddle/webhook | paymentFulfilled


<a name="getPaymentOptions"></a>
# **getPaymentOptions**
> PaymentOptions getPaymentOptions(currency, amount)

getPaymentOptions

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PaymentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PaymentControllerApi apiInstance = new PaymentControllerApi();
String currency = "currency_example"; // String | currency
Double amount = 3.4D; // Double | amount
try {
    PaymentOptions result = apiInstance.getPaymentOptions(currency, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentControllerApi#getPaymentOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| currency |
 **amount** | **Double**| amount |

### Return type

[**PaymentOptions**](PaymentOptions.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="paymentFulfilled"></a>
# **paymentFulfilled**
> paymentFulfilled()

paymentFulfilled

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PaymentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PaymentControllerApi apiInstance = new PaymentControllerApi();
try {
    apiInstance.paymentFulfilled();
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentControllerApi#paymentFulfilled");
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

 - **Content-Type**: Not defined
 - **Accept**: */*

