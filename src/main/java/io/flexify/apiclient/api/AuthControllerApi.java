package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AuthCheckTokenAndGetUserResponse;
import io.flexify.apiclient.model.AuthenticationRequest;
import io.flexify.apiclient.model.AuthenticationResponse;
import io.flexify.apiclient.model.LogoutRequest;
import io.flexify.apiclient.model.PublicAuthenticationConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuthControllerApi {
  private ApiClient apiClient;

  public AuthControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthControllerApi(ApiClient apiClient) {
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
    String localVarPath = "/backend/rest/auth";

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
   * Check of given token
   * 
   * @return AuthCheckTokenAndGetUserResponse
   * @throws ApiException if fails to make API call
   */
  public AuthCheckTokenAndGetUserResponse checkTokenAndGetUser() throws ApiException {
    return checkTokenAndGetUserWithHttpInfo().getData();
      }

  /**
   * Check of given token
   * 
   * @return ApiResponse&lt;AuthCheckTokenAndGetUserResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuthCheckTokenAndGetUserResponse> checkTokenAndGetUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/user";

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

    GenericType<AuthCheckTokenAndGetUserResponse> localVarReturnType = new GenericType<AuthCheckTokenAndGetUserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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

    GenericType<PublicAuthenticationConfiguration> localVarReturnType = new GenericType<PublicAuthenticationConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logout
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void logout(LogoutRequest request) throws ApiException {

    logoutWithHttpInfo(request);
  }

  /**
   * Logout
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> logoutWithHttpInfo(LogoutRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling logout");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/logout";

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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
