# PaymentsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentOptions**](PaymentsControllerApi.md#getPaymentOptions) | **GET** /rest/pay/paddle/options | getPaymentOptions
[**paymentFulfilled**](PaymentsControllerApi.md#paymentFulfilled) | **GET** /rest/pay/paddle/webhook | paymentFulfilled


<a name="getPaymentOptions"></a>
# **getPaymentOptions**
> PaymentOptions getPaymentOptions(amount, currency)

getPaymentOptions

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.PaymentsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PaymentsControllerApi apiInstance = new PaymentsControllerApi();
Double amount = 3.4D; // Double | amount
String currency = "currency_example"; // String | currency
try {
    PaymentOptions result = apiInstance.getPaymentOptions(amount, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsControllerApi#getPaymentOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amount** | **Double**| amount |
 **currency** | **String**| currency |

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
//import io.flexify.apiclient.api.PaymentsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PaymentsControllerApi apiInstance = new PaymentsControllerApi();
try {
    apiInstance.paymentFulfilled();
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsControllerApi#paymentFulfilled");
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

