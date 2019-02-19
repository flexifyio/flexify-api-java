package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AuthenticationRequest;
import io.flexify.apiclient.model.AuthenticationResponse;
import io.flexify.apiclient.model.PublicAuthenticationConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
public class AuthenticationControllerApi {
  private ApiClient apiClient;

  public AuthenticationControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Generate new access token for the user
   * 
   * @param authenticationRequest authenticationRequest (required)
   * @return AuthenticationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) throws ApiException {
    return authenticateWithHttpInfo(authenticationRequest).getData();
      }

  /**
   * Generate new access token for the user
   * 
   * @param authenticationRequest authenticationRequest (required)
   * @return ApiResponse&lt;AuthenticationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuthenticationResponse> authenticateWithHttpInfo(AuthenticationRequest authenticationRequest) throws ApiException {
    Object localVarPostBody = authenticationRequest;
    
    // verify the required parameter 'authenticationRequest' is set
    if (authenticationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'authenticationRequest' when calling authenticate");
    }
    
    // create path and map variables
    String localVarPath = "/rest/auth";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AuthenticationResponse> localVarReturnType = new GenericType<AuthenticationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logout
   * 
   * @return PublicAuthenticationConfiguration
   * @throws ApiException if fails to make API call
   */
  public PublicAuthenticationConfiguration getConfig() throws ApiException {
    return getConfigWithHttpInfo().getData();
      }

  /**
   * Logout
   * 
   * @return ApiResponse&lt;PublicAuthenticationConfiguration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PublicAuthenticationConfiguration> getConfigWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/auth/config";

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

    GenericType<PublicAuthenticationConfiguration> localVarReturnType = new GenericType<PublicAuthenticationConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logout
   * 
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object logout() throws ApiException {
    return logoutWithHttpInfo().getData();
      }

  /**
   * Logout
   * 
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> logoutWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/auth/logout";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
