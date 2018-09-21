# DistributorBillingAccountsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAccount**](DistributorBillingAccountsControllerApi.md#activateAccount) | **PUT** /rest/distributor/accounts/{account-id}/actions/activate | activateAccount
[**addPayment**](DistributorBillingAccountsControllerApi.md#addPayment) | **POST** /rest/distributor/accounts/{account-id}/payments | addPayment
[**getCosts**](DistributorBillingAccountsControllerApi.md#getCosts) | **GET** /rest/distributor/accounts/{account-id}/costs | getCosts
[**getDetails**](DistributorBillingAccountsControllerApi.md#getDetails) | **GET** /rest/distributor/accounts/{account-id} | getDetails
[**getPayments**](DistributorBillingAccountsControllerApi.md#getPayments) | **GET** /rest/distributor/accounts/{account-id}/payments | getPayments
[**suspendAccount**](DistributorBillingAccountsControllerApi.md#suspendAccount) | **PUT** /rest/distributor/accounts/{account-id}/actions/suspend | suspendAccount


<a name="activateAccount"></a>
# **activateAccount**
> activateAccount(accountId)

activateAccount

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
try {
    apiInstance.activateAccount(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#activateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addPayment"></a>
# **addPayment**
> addPayment(accountId, paymentRequest)

addPayment

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
PaymentAddRequest paymentRequest = new PaymentAddRequest(); // PaymentAddRequest | paymentRequest
try {
    apiInstance.addPayment(accountId, paymentRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#addPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |
 **paymentRequest** | [**PaymentAddRequest**](PaymentAddRequest.md)| paymentRequest |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getCosts"></a>
# **getCosts**
> List&lt;CostDetails&gt; getCosts(accountId)

getCosts

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
try {
    List<CostDetails> result = apiInstance.getCosts(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#getCosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |

### Return type

[**List&lt;CostDetails&gt;**](CostDetails.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getDetails"></a>
# **getDetails**
> BillingAccountWithMoney getDetails(accountId)

getDetails

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
try {
    BillingAccountWithMoney result = apiInstance.getDetails(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#getDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |

### Return type

[**BillingAccountWithMoney**](BillingAccountWithMoney.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getPayments"></a>
# **getPayments**
> List&lt;Payment&gt; getPayments(accountId)

getPayments

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
try {
    List<Payment> result = apiInstance.getPayments(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#getPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="suspendAccount"></a>
# **suspendAccount**
> suspendAccount(accountId)

suspendAccount

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.DistributorBillingAccountsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DistributorBillingAccountsControllerApi apiInstance = new DistributorBillingAccountsControllerApi();
Long accountId = 789L; // Long | account-id
try {
    apiInstance.suspendAccount(accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling DistributorBillingAccountsControllerApi#suspendAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| account-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

