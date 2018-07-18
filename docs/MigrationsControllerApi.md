# MigrationsControllerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMigration**](MigrationsControllerApi.md#addMigration) | **POST** /rest/migrations | Add new migration
[**getMigration**](MigrationsControllerApi.md#getMigration) | **GET** /rest/migrations/{migration-id} | Get migration by id. Only migration owner or administrator have access to the migration
[**getMigrations**](MigrationsControllerApi.md#getMigrations) | **GET** /rest/migrations | Get all migrations for logged in user in pagged mode
[**hideMigration**](MigrationsControllerApi.md#hideMigration) | **POST** /rest/migrations/{migration-id}/hide | Hide migration from UI
[**stopMigration**](MigrationsControllerApi.md#stopMigration) | **POST** /rest/migrations/{migration-id}/stop | Stop (cancel) the migration


<a name="addMigration"></a>
# **addMigration**
> Migration addMigration(migrationRequest)

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
    Migration result = apiInstance.addMigration(migrationRequest);
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

[**Migration**](Migration.md)

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
Long migrationId = 789L; // Long | Migration Id
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
 **migrationId** | **Long**| Migration Id |

### Return type

[**Migration**](Migration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="getMigrations"></a>
# **getMigrations**
> PageMigration getMigrations(includeHidden, attributesToSort, page, size, sortDirection)

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
Boolean includeHidden = true; // Boolean | Include hidden migrations to response
List<String> attributesToSort = Arrays.asList("attributesToSort_example"); // List<String> | Attributes to sort
Integer page = 0; // Integer | Page number
Integer size = 100; // Integer | Page size
String sortDirection = "ASC"; // String | Sort Direction
try {
    PageMigration result = apiInstance.getMigrations(includeHidden, attributesToSort, page, size, sortDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MigrationsControllerApi#getMigrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeHidden** | **Boolean**| Include hidden migrations to response | [optional] [default to true]
 **attributesToSort** | [**List&lt;String&gt;**](String.md)| Attributes to sort | [optional]
 **page** | **Integer**| Page number | [optional] [default to 0]
 **size** | **Integer**| Page size | [optional] [default to 100]
 **sortDirection** | **String**| Sort Direction | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageMigration**](PageMigration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

<a name="hideMigration"></a>
# **hideMigration**
> Migration hideMigration(migrationId)

Hide migration from UI

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
    Migration result = apiInstance.hideMigration(migrationId);
    System.out.println(result);
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

[**Migration**](Migration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="stopMigration"></a>
# **stopMigration**
> Migration stopMigration(migrationId)

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
    Migration result = apiInstance.stopMigration(migrationId);
    System.out.println(result);
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

[**Migration**](Migration.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

