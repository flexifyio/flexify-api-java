package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.CloudLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CloudLocationsControllerApi {
  private ApiClient apiClient;

  public CloudLocationsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CloudLocationsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAutoDeployAvailableLocationsForCurrentUser
   * 
   * @return List&lt;CloudLocation&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CloudLocation> getAutoDeployAvailableLocationsForCurrentUser() throws ApiException {
    return getAutoDeployAvailableLocationsForCurrentUserWithHttpInfo().getData();
      }

  /**
   * getAutoDeployAvailableLocationsForCurrentUser
   * 
   * @return ApiResponse&lt;List&lt;CloudLocation&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CloudLocation>> getAutoDeployAvailableLocationsForCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/cloud-locations/auto-deploy";

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

    GenericType<List<CloudLocation>> localVarReturnType = new GenericType<List<CloudLocation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getExistingAvailableLocationsForCurrentUser
   * 
   * @return List&lt;CloudLocation&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CloudLocation> getExistingAvailableLocationsForCurrentUser() throws ApiException {
    return getExistingAvailableLocationsForCurrentUserWithHttpInfo().getData();
      }

  /**
   * getExistingAvailableLocationsForCurrentUser
   * 
   * @return ApiResponse&lt;List&lt;CloudLocation&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CloudLocation>> getExistingAvailableLocationsForCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/cloud-locations";

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

    GenericType<List<CloudLocation>> localVarReturnType = new GenericType<List<CloudLocation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
