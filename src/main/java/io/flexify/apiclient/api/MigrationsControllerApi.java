package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddMigrationRequest;
import io.flexify.apiclient.model.Migration;
import io.flexify.apiclient.model.PageMigration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-18T14:37:49.273+03:00")
public class MigrationsControllerApi {
  private ApiClient apiClient;

  public MigrationsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MigrationsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add new migration
   * 
   * @param migrationRequest migrationRequest (required)
   * @return Migration
   * @throws ApiException if fails to make API call
   */
  public Migration addMigration(AddMigrationRequest migrationRequest) throws ApiException {
    Object localVarPostBody = migrationRequest;
    
    // verify the required parameter 'migrationRequest' is set
    if (migrationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationRequest' when calling addMigration");
    }
    
    // create path and map variables
    String localVarPath = "/rest/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Migration> localVarReturnType = new GenericType<Migration>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get migration by id. Only migration owner or administrator have access to the migration
   * 
   * @param migrationId Migration Id (required)
   * @return Migration
   * @throws ApiException if fails to make API call
   */
  public Migration getMigration(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling getMigration");
    }
    
    // create path and map variables
    String localVarPath = "/rest/migrations/{migration-id}"
      .replaceAll("\\{" + "migration-id" + "\\}", apiClient.escapeString(migrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Migration> localVarReturnType = new GenericType<Migration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all migrations for logged in user in pagged mode
   * 
   * @param includeHidden Include hidden migrations to response (optional, default to true)
   * @param attributesToSort Attributes to sort (optional)
   * @param page Page number (optional, default to 0)
   * @param size Page size (optional, default to 100)
   * @param sortDirection Sort Direction (optional, default to ASC)
   * @return PageMigration
   * @throws ApiException if fails to make API call
   */
  public PageMigration getMigrations(Boolean includeHidden, List<String> attributesToSort, Integer page, Integer size, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-hidden", includeHidden));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributesToSort", attributesToSort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<PageMigration> localVarReturnType = new GenericType<PageMigration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Hide migration from UI
   * 
   * @param migrationId migration-id (required)
   * @return Migration
   * @throws ApiException if fails to make API call
   */
  public Migration hideMigration(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling hideMigration");
    }
    
    // create path and map variables
    String localVarPath = "/rest/migrations/{migration-id}/hide"
      .replaceAll("\\{" + "migration-id" + "\\}", apiClient.escapeString(migrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Migration> localVarReturnType = new GenericType<Migration>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Stop (cancel) the migration
   * 
   * @param migrationId migration-id (required)
   * @return Migration
   * @throws ApiException if fails to make API call
   */
  public Migration stopMigration(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling stopMigration");
    }
    
    // create path and map variables
    String localVarPath = "/rest/migrations/{migration-id}/stop"
      .replaceAll("\\{" + "migration-id" + "\\}", apiClient.escapeString(migrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Migration> localVarReturnType = new GenericType<Migration>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
