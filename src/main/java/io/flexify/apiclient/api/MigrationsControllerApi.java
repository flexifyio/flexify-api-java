package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddMigrationRequest;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.Migration;
import io.flexify.apiclient.model.PageMigration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse addMigration(AddMigrationRequest migrationRequest) throws ApiException {
    return addMigrationWithHttpInfo(migrationRequest).getData();
      }

  /**
   * Add new migration
   * 
   * @param migrationRequest migrationRequest (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> addMigrationWithHttpInfo(AddMigrationRequest migrationRequest) throws ApiException {
    Object localVarPostBody = migrationRequest;
    
    // verify the required parameter 'migrationRequest' is set
    if (migrationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationRequest' when calling addMigration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations";

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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get migration by id. Only migration owner or administrator have access to the migration
   * 
   * @param migrationId migration-id (required)
   * @return Migration
   * @throws ApiException if fails to make API call
   */
  public Migration getMigration(Long migrationId) throws ApiException {
    return getMigrationWithHttpInfo(migrationId).getData();
      }

  /**
   * Get migration by id. Only migration owner or administrator have access to the migration
   * 
   * @param migrationId migration-id (required)
   * @return ApiResponse&lt;Migration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Migration> getMigrationWithHttpInfo(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling getMigration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations/{migration-id}"
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
   * Get all migrations for logged in user in paged mode
   * 
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param includeHidden Include hidden migrations to response (optional, default to true)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return PageMigration
   * @throws ApiException if fails to make API call
   */
  public PageMigration getMigrations(Long offset, Integer page, Boolean includeHidden, Boolean paged, Integer pageNumber, Integer pageSize, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    return getMigrationsWithHttpInfo(offset, page, includeHidden, paged, pageNumber, pageSize, size, sortSorted, sortUnsorted, sortDirection).getData();
      }

  /**
   * Get all migrations for logged in user in paged mode
   * 
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param includeHidden Include hidden migrations to response (optional, default to true)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return ApiResponse&lt;PageMigration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageMigration> getMigrationsWithHttpInfo(Long offset, Integer page, Boolean includeHidden, Boolean paged, Integer pageNumber, Integer pageSize, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getMigrations");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getMigrations");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-hidden", includeHidden));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paged", paged));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.sorted", sortSorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.unsorted", sortUnsorted));
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
   * Mark all unfinished migrations as hidden UI
   * 
   * @throws ApiException if fails to make API call
   */
  public void hideAllMigrations() throws ApiException {

    hideAllMigrationsWithHttpInfo();
  }

  /**
   * Mark all unfinished migrations as hidden UI
   * 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> hideAllMigrationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations/actions/hide-all";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Mark migration as hidden
   * 
   * @param migrationId migration-id (required)
   * @throws ApiException if fails to make API call
   */
  public void hideMigration(Long migrationId) throws ApiException {

    hideMigrationWithHttpInfo(migrationId);
  }

  /**
   * Mark migration as hidden
   * 
   * @param migrationId migration-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> hideMigrationWithHttpInfo(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling hideMigration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations/{migration-id}/actions/hide"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Mark migration as hidden
   * 
   * @param mappingId mapping-id (required)
   * @param migrationId migration-id (required)
   * @param slot slot (required)
   * @throws ApiException if fails to make API call
   */
  public void restartSlot(Long mappingId, Long migrationId, Integer slot) throws ApiException {

    restartSlotWithHttpInfo(mappingId, migrationId, slot);
  }

  /**
   * Mark migration as hidden
   * 
   * @param mappingId mapping-id (required)
   * @param migrationId migration-id (required)
   * @param slot slot (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> restartSlotWithHttpInfo(Long mappingId, Long migrationId, Integer slot) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mappingId' is set
    if (mappingId == null) {
      throw new ApiException(400, "Missing the required parameter 'mappingId' when calling restartSlot");
    }
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling restartSlot");
    }
    
    // verify the required parameter 'slot' is set
    if (slot == null) {
      throw new ApiException(400, "Missing the required parameter 'slot' when calling restartSlot");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations/{migration-id}/mappings/{mapping-id}/slots/{slot}/actions/restart"
      .replaceAll("\\{" + "mapping-id" + "\\}", apiClient.escapeString(mappingId.toString()))
      .replaceAll("\\{" + "migration-id" + "\\}", apiClient.escapeString(migrationId.toString()))
      .replaceAll("\\{" + "slot" + "\\}", apiClient.escapeString(slot.toString()));

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Stop (cancel) the migration
   * 
   * @param migrationId migration-id (required)
   * @throws ApiException if fails to make API call
   */
  public void stopMigration(Long migrationId) throws ApiException {

    stopMigrationWithHttpInfo(migrationId);
  }

  /**
   * Stop (cancel) the migration
   * 
   * @param migrationId migration-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> stopMigrationWithHttpInfo(Long migrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'migrationId' is set
    if (migrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationId' when calling stopMigration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/migrations/{migration-id}/actions/stop"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
