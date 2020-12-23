# CostEstimateControllerApi

All URIs are relative to *https://api.flexify.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**estimateMigrationCost**](CostEstimateControllerApi.md#estimateMigrationCost) | **POST** /backend/rest/cost/migration | estimateMigrationCost


<a name="estimateMigrationCost"></a>
# **estimateMigrationCost**
> DtoMigrationCostEstimate estimateMigrationCost(migrationRequest)

estimateMigrationCost

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.CostEstimateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

CostEstimateControllerApi apiInstance = new CostEstimateControllerApi();
AddMigrationRequest migrationRequest = new AddMigrationRequest(); // AddMigrationRequest | migrationRequest
try {
    DtoMigrationCostEstimate result = apiInstance.estimateMigrationCost(migrationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CostEstimateControllerApi#estimateMigrationCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationRequest** | [**AddMigrationRequest**](AddMigrationRequest.md)| migrationRequest |

### Return type

[**DtoMigrationCostEstimate**](DtoMigrationCostEstimate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

