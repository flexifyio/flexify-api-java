# MigrationsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMigration**](MigrationsControllerApi.md#addMigration) | **POST** /rest/migrations | Add new migration
[**getMigration**](MigrationsControllerApi.md#getMigration) | **GET** /rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
[**getMigrations**](MigrationsControllerApi.md#getMigrations) | **GET** /rest/migrations | Get all migrations for logged in user in pagged mode
[**hideAllMigrations**](MigrationsControllerApi.md#hideAllMigrations) | **POST** /rest/migrations/actions/hide-all | Mark all unfinished migrations as hidden UI
[**hideMigration**](MigrationsControllerApi.md#hideMigration) | **POST** /rest/migrations/{migration-id}/actions/hide | Mark migration as hidden
[**restartSlot**](MigrationsControllerApi.md#restartSlot) | **POST** /rest/migrations/{migration-id}/mappings/{mapping-id}/slots/{slot}/actions/restart | Mark migration as hidden
[**stopMigration**](MigrationsControllerApi.md#stopMigration) | **POST** /rest/migrations/{migration-id}/actions/stop | Stop (cancel) the migration


<a name="addMigration"></a>
# **addMigration**
> IdResponse addMigration(migrationRequest)

Add new migration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
AddMigrationRequest migrationRequest = new AddMigrationRequest(); // AddMigrationRequest | migrationRequest
try {
    IdResponse result = apiInstance.addMigration(migrationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#addMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationRequest** | [**AddMigrationRequest**](AddMigrationRequest.md)| migrationRequest |

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getMigration"></a>
# **getMigration**
> Migration getMigration(migrationId)

Get migration by id. Only migration owner or administrator have access to the migration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
Long migrationId = 789L; // Long | migration-id
try {
    Migration result = apiInstance.getMigration(migrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#getMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **Long**| migration-id |

### Return type

[**Migration**](Migration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getMigrations"></a>
# **getMigrations**
> PageMigration getMigrations(page, size, includeHidden, sort, sortDirection, springPageRequestOffset, springPageRequestPageNumber, springPageRequestPageSize, springPageRequestPaged, springPageRequestSortSorted, springPageRequestSortUnsorted, springPageRequestUnpaged)

Get all migrations for logged in user in pagged mode

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
Integer page = 0; // Integer | Page number
Integer size = 100; // Integer | Page size
Boolean includeHidden = true; // Boolean | Include hidden migrations to response
List<String> sort = Arrays.asList("sort_example"); // List<String> | Attributes to sort
String sortDirection = "\"ASC\""; // String | Sort Direction
Long springPageRequestOffset = 789L; // Long | 
Integer springPageRequestPageNumber = 56; // Integer | 
Integer springPageRequestPageSize = 56; // Integer | 
Boolean springPageRequestPaged = true; // Boolean | 
Boolean springPageRequestSortSorted = true; // Boolean | 
Boolean springPageRequestSortUnsorted = true; // Boolean | 
Boolean springPageRequestUnpaged = true; // Boolean | 
try {
    PageMigration result = apiInstance.getMigrations(page, size, includeHidden, sort, sortDirection, springPageRequestOffset, springPageRequestPageNumber, springPageRequestPageSize, springPageRequestPaged, springPageRequestSortSorted, springPageRequestSortUnsorted, springPageRequestUnpaged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#getMigrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number |
 **size** | **Integer**| Page size |
 **includeHidden** | **Boolean**| Include hidden migrations to response | [optional] [default to true]
 **sort** | [**List&lt;String&gt;**](String.md)| Attributes to sort | [optional]
 **sortDirection** | **String**| Sort Direction | [optional] [enum: ASC, DESC]
 **springPageRequestOffset** | **Long**|  | [optional]
 **springPageRequestPageNumber** | **Integer**|  | [optional]
 **springPageRequestPageSize** | **Integer**|  | [optional]
 **springPageRequestPaged** | **Boolean**|  | [optional]
 **springPageRequestSortSorted** | **Boolean**|  | [optional]
 **springPageRequestSortUnsorted** | **Boolean**|  | [optional]
 **springPageRequestUnpaged** | **Boolean**|  | [optional]

### Return type

[**PageMigration**](PageMigration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="hideAllMigrations"></a>
# **hideAllMigrations**
> hideAllMigrations()

Mark all unfinished migrations as hidden UI

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
try {
    apiInstance.hideAllMigrations();
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#hideAllMigrations");
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

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="hideMigration"></a>
# **hideMigration**
> hideMigration(migrationId)

Mark migration as hidden

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
Long migrationId = 789L; // Long | migration-id
try {
    apiInstance.hideMigration(migrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#hideMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **Long**| migration-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="restartSlot"></a>
# **restartSlot**
> restartSlot(mappingId, migrationId, slot)

Mark migration as hidden

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
Long mappingId = 789L; // Long | mapping-id
Long migrationId = 789L; // Long | migration-id
Integer slot = 56; // Integer | slot
try {
    apiInstance.restartSlot(mappingId, migrationId, slot);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#restartSlot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mapping-id |
 **migrationId** | **Long**| migration-id |
 **slot** | **Integer**| slot |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="stopMigration"></a>
# **stopMigration**
> stopMigration(migrationId)

Stop (cancel) the migration

### Example
```java
// Import classes:
//import io.flexify.apiclient.handler.ApiClient;
//import io.flexify.apiclient.handler.ApiException;
//import io.flexify.apiclient.handler.Configuration;
//import io.flexify.apiclient.handler.auth.*;
//import io.flexify.apiclient.api.MigrationsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

MigrationsControllerApi apiInstance = new MigrationsControllerApi();
Long migrationId = 789L; // Long | migration-id
try {
    apiInstance.stopMigration(migrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#stopMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **Long**| migration-id |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

