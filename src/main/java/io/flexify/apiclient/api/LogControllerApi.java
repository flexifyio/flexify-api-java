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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-19T00:30:02.233+08:00")
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
   * @param page Page number (required)
   * @param size Page size (required)
   * @param endpointId endpoint-id (optional)
   * @param migrationId migration-id (optional)
   * @param sort Attributes to sort (optional)
   * @param sortDirection Sort Direction (optional)
   * @param springPageRequestOffset  (optional)
   * @param springPageRequestPageNumber  (optional)
   * @param springPageRequestPageSize  (optional)
   * @param springPageRequestPaged  (optional)
   * @param springPageRequestSortSorted  (optional)
   * @param springPageRequestSortUnsorted  (optional)
   * @param springPageRequestUnpaged  (optional)
   * @param storageId storage-id (optional)
   * @return PageLogEntry
   * @throws ApiException if fails to make API call
   */
  public PageLogEntry getLogForCurrentUser(Integer page, Integer size, Long endpointId, Long migrationId, List<String> sort, String sortDirection, Long springPageRequestOffset, Integer springPageRequestPageNumber, Integer springPageRequestPageSize, Boolean springPageRequestPaged, Boolean springPageRequestSortSorted, Boolean springPageRequestSortUnsorted, Boolean springPageRequestUnpaged, Long storageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getLogForCurrentUser");
    }
    
    // verify the required parameter 'size' is set
    if (size == null) {
      throw new ApiException(400, "Missing the required parameter 'size' when calling getLogForCurrentUser");
    }
    
    // create path and map variables
    String localVarPath = "/rest/log";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endpoint-id", endpointId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "migration-id", migrationId));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-id", storageId));

    
    
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
