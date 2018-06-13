package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.LogEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-13T12:27:12.882+03:00")
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
   * @return List&lt;LogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LogEntry> getLogForCurrentUserUsingGET(Long storageId, Long migrationId, Long endpointId) throws ApiException {
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

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<LogEntry>> localVarReturnType = new GenericType<List<LogEntry>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
