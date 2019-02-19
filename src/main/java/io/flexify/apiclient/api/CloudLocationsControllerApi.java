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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
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
   * getAvailableLocationsForCurrentUser
   * 
   * @return List&lt;CloudLocation&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CloudLocation> getAvailableLocationsForCurrentUser() throws ApiException {
    return getAvailableLocationsForCurrentUserWithHttpInfo().getData();
      }

  /**
   * getAvailableLocationsForCurrentUser
   * 
   * @return ApiResponse&lt;List&lt;CloudLocation&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CloudLocation>> getAvailableLocationsForCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/cloud-locations";

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
