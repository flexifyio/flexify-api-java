# BillingAccountsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostsForCurrentUserBillingAccount**](BillingAccountsControllerApi.md#getCostsForCurrentUserBillingAccount) | **GET** /rest/account/costs | Get costs for current user
[**getCurrentUserBillingAccount**](BillingAccountsControllerApi.md#getCurrentUserBillingAccount) | **GET** /rest/account | Get billing account for current user
[**getPaymentsForCurrentUser**](BillingAccountsControllerApi.md#getPaymentsForCurrentUser) | **GET** /rest/account/payments | Get payments for current user


<a name="getCostsForCurrentUserBillingAccount"></a>
# **getCostsForCurrentUserBillingAccount**
> List&lt;CostDetails&gt; getCostsForCurrentUserBillingAccount()

Get costs for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountsControllerApi apiInstance = new BillingAccountsControllerApi();
try {
    List<CostDetails> result = apiInstance.getCostsForCurrentUserBillingAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountsControllerApi#getCostsForCurrentUserBillingAccount");
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

<a name="getCurrentUserBillingAccount"></a>
# **getCurrentUserBillingAccount**
> BillingAccountWithMoney getCurrentUserBillingAccount()

Get billing account for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountsControllerApi apiInstance = new BillingAccountsControllerApi();
try {
    BillingAccountWithMoney result = apiInstance.getCurrentUserBillingAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountsControllerApi#getCurrentUserBillingAccount");
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

<a name="getPaymentsForCurrentUser"></a>
# **getPaymentsForCurrentUser**
> List&lt;Payment&gt; getPaymentsForCurrentUser()

Get payments for current user

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.BillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

BillingAccountsControllerApi apiInstance = new BillingAccountsControllerApi();
try {
    List<Payment> result = apiInstance.getPaymentsForCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountsControllerApi#getPaymentsForCurrentUser");
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

