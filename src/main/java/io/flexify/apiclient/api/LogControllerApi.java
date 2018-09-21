package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.PageLogEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
public class LogControllerApi {
  private ApiClient apiClient;

  public LogControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getLogForCurrentUser
   * 
   * @param storageId storage-id (optional)
   * @param migrationId migration-id (optional)
   * @param endpointId endpoint-id (optional)
   * @param sort Attributes to sort (optional)
   * @param page Page number (optional, default to 0)
   * @param size Page size (optional, default to 100)
   * @param sortDirection Sort Direction (optional, default to ASC)
   * @return PageLogEntry
   * @throws ApiException if fails to make API call
   */
  public PageLogEntry getLogForCurrentUser(Long storageId, Long migrationId, Long endpointId, List<String> sort, Integer page, Integer size, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-id", storageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "migration-id", migrationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endpoint-id", endpointId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
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

    GenericType<PageLogEntry> localVarReturnType = new GenericType<PageLogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
