package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.PublicManagementServerConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ConfigControllerApi {
  private ApiClient apiClient;

  public ConfigControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConfigControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get public Management Server config
   * 
   * @return PublicManagementServerConfiguration
   * @throws ApiException if fails to make API call
   */
  public PublicManagementServerConfiguration getConfig() throws ApiException {
    return getConfigWithHttpInfo().getData();
      }

  /**
   * Get public Management Server config
   * 
   * @return ApiResponse&lt;PublicManagementServerConfiguration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicManagementServerConfiguration> getConfigWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/config";

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

    GenericType<PublicManagementServerConfiguration> localVarReturnType = new GenericType<PublicManagementServerConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get public Management Server config
   * 
   * @return PublicManagementServerConfiguration
   * @throws ApiException if fails to make API call
   */
  public PublicManagementServerConfiguration getConfig1() throws ApiException {
    return getConfig1WithHttpInfo().getData();
      }

  /**
   * Get public Management Server config
   * 
   * @return ApiResponse&lt;PublicManagementServerConfiguration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicManagementServerConfiguration> getConfig1WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/config";

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

    GenericType<PublicManagementServerConfiguration> localVarReturnType = new GenericType<PublicManagementServerConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
