package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.MarkerPageLogEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
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
   * @param endpointId endpoint-id (optional)
   * @param marker marker (optional)
   * @param migrationId migration-id (optional)
   * @param storageAccountId storage-account-id (optional)
   * @param storageId storage-id (optional)
   * @return MarkerPageLogEntry
   * @throws ApiException if fails to make API call
   */
  public MarkerPageLogEntry getLogForCurrentUser(Long endpointId, Long marker, Long migrationId, Long storageAccountId, Long storageId) throws ApiException {
    return getLogForCurrentUserWithHttpInfo(endpointId, marker, migrationId, storageAccountId, storageId).getData();
      }

  /**
   * getLogForCurrentUser
   * 
   * @param endpointId endpoint-id (optional)
   * @param marker marker (optional)
   * @param migrationId migration-id (optional)
   * @param storageAccountId storage-account-id (optional)
   * @param storageId storage-id (optional)
   * @return ApiResponse&lt;MarkerPageLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MarkerPageLogEntry> getLogForCurrentUserWithHttpInfo(Long endpointId, Long marker, Long migrationId, Long storageAccountId, Long storageId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endpoint-id", endpointId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "marker", marker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "migration-id", migrationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-account-id", storageAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-id", storageId));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<MarkerPageLogEntry> localVarReturnType = new GenericType<MarkerPageLogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
