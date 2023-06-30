package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.ManagementServerDetailedVersionInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AdminSystemInfoControllerApi {
  private ApiClient apiClient;

  public AdminSystemInfoControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminSystemInfoControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Request General System Information
   * 
   * @return ManagementServerDetailedVersionInfo
   * @throws ApiException if fails to make API call
   */
  public ManagementServerDetailedVersionInfo systemInfo() throws ApiException {
    return systemInfoWithHttpInfo().getData();
      }

  /**
   * Request General System Information
   * 
   * @return ApiResponse&lt;ManagementServerDetailedVersionInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ManagementServerDetailedVersionInfo> systemInfoWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/admin/system-info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ManagementServerDetailedVersionInfo> localVarReturnType = new GenericType<ManagementServerDetailedVersionInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
