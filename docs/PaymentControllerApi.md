# PaymentControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentOptionsUsingGET**](PaymentControllerApi.md#getPaymentOptionsUsingGET) | **GET** /rest/pay/paddle/options | getPaymentOptions
[**paymentFulfilledUsingGET**](PaymentControllerApi.md#paymentFulfilledUsingGET) | **GET** /rest/pay/paddle/webhook | paymentFulfilled


<a name="getPaymentOptionsUsingGET"></a>
# **getPaymentOptionsUsingGET**
> PaymentOptions getPaymentOptionsUsingGET(currency, amount)

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
    PaymentOptions result = apiInstance.getPaymentOptionsUsingGET(currency, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentControllerApi#getPaymentOptionsUsingGET");
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

<a name="paymentFulfilledUsingGET"></a>
# **paymentFulfilledUsingGET**
> paymentFulfilledUsingGET()

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
    apiInstance.paymentFulfilledUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentControllerApi#paymentFulfilledUsingGET");
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

