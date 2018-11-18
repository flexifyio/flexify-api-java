package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-19T00:30:02.233+08:00")
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
   * @param page Page number (required)
   * @param size Page size (required)
   * @param includeHidden Include hidden migrations to response (optional, default to true)
   * @param sort Attributes to sort (optional)
   * @param sortDirection Sort Direction (optional)
   * @param springPageRequestOffset  (optional)
   * @param springPageRequestPageNumber  (optional)
   * @param springPageRequestPageSize  (optional)
   * @param springPageRequestPaged  (optional)
   * @param springPageRequestSortSorted  (optional)
   * @param springPageRequestSortUnsorted  (optional)
   * @param springPageRequestUnpaged  (optional)
   * @return PageMigration
   * @throws ApiException if fails to make API call
   */
  public PageMigration getMigrations(Integer page, Integer size, Boolean includeHidden, List<String> sort, String sortDirection, Long springPageRequestOffset, Integer springPageRequestPageNumber, Integer springPageRequestPageSize, Boolean springPageRequestPaged, Boolean springPageRequestSortSorted, Boolean springPageRequestSortUnsorted, Boolean springPageRequestUnpaged) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getMigrations");
    }
    
    // verify the required parameter 'size' is set
    if (size == null) {
      throw new ApiException(400, "Missing the required parameter 'size' when calling getMigrations");
    }
    
    // create path and map variables
    String localVarPath = "/rest/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-hidden", includeHidden));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.offset", springPageRequestOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.pageNumber", springPageRequestPageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.pageSize", springPageRequestPageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.paged", springPageRequestPaged));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.sort.sorted", springPageRequestSortSorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.sort.unsorted", springPageRequestSortUnsorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "springPageRequest.unpaged", springPageRequestUnpaged));

    
    
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
