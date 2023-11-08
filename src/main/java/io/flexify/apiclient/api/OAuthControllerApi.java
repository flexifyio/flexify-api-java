package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AuthAppInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OAuthControllerApi {
  private ApiClient apiClient;

  public OAuthControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAppInfo
   * 
   * @param providerId provider-id (required)
   * @return AuthAppInfo
   * @throws ApiException if fails to make API call
   */
  public AuthAppInfo getAppInfo(Long providerId) throws ApiException {
    return getAppInfoWithHttpInfo(providerId).getData();
      }

  /**
   * getAppInfo
   * 
   * @param providerId provider-id (required)
   * @return ApiResponse&lt;AuthAppInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuthAppInfo> getAppInfoWithHttpInfo(Long providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling getAppInfo");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/oauth/app-info";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider-id", providerId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<AuthAppInfo> localVarReturnType = new GenericType<AuthAppInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
