package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.MicrosoftOAuthConfig;
import io.flexify.apiclient.model.OAuth2DeviceCodeResponse;
import io.flexify.apiclient.model.OAuthToken;
import io.flexify.apiclient.model.RefreshTokenRequest;
import io.flexify.apiclient.model.TokenByDeviceCodeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuthSsoControllerApi {
  private ApiClient apiClient;

  public AuthSsoControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthSsoControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getConfig
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @return MicrosoftOAuthConfig
   * @throws ApiException if fails to make API call
   */
  public MicrosoftOAuthConfig getConfig(String oauthProviderId) throws ApiException {
    return getConfigWithHttpInfo(oauthProviderId).getData();
      }

  /**
   * getConfig
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @return ApiResponse&lt;MicrosoftOAuthConfig&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MicrosoftOAuthConfig> getConfigWithHttpInfo(String oauthProviderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'oauthProviderId' is set
    if (oauthProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'oauthProviderId' when calling getConfig");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/sso/config";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oauth-provider-id", oauthProviderId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<MicrosoftOAuthConfig> localVarReturnType = new GenericType<MicrosoftOAuthConfig>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getDeviceCode
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @return OAuth2DeviceCodeResponse
   * @throws ApiException if fails to make API call
   */
  public OAuth2DeviceCodeResponse getDeviceCode(String oauthProviderId) throws ApiException {
    return getDeviceCodeWithHttpInfo(oauthProviderId).getData();
      }

  /**
   * getDeviceCode
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @return ApiResponse&lt;OAuth2DeviceCodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuth2DeviceCodeResponse> getDeviceCodeWithHttpInfo(String oauthProviderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'oauthProviderId' is set
    if (oauthProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'oauthProviderId' when calling getDeviceCode");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/sso/device-code";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oauth-provider-id", oauthProviderId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<OAuth2DeviceCodeResponse> localVarReturnType = new GenericType<OAuth2DeviceCodeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getTokenByDeviceCode
   * 
   * @param request request (required)
   * @return OAuthToken
   * @throws ApiException if fails to make API call
   */
  public OAuthToken getTokenByDeviceCode(TokenByDeviceCodeRequest request) throws ApiException {
    return getTokenByDeviceCodeWithHttpInfo(request).getData();
      }

  /**
   * getTokenByDeviceCode
   * 
   * @param request request (required)
   * @return ApiResponse&lt;OAuthToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthToken> getTokenByDeviceCodeWithHttpInfo(TokenByDeviceCodeRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling getTokenByDeviceCode");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/sso/token-by-device-code";

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

    GenericType<OAuthToken> localVarReturnType = new GenericType<OAuthToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * refreshTokenForDeviceCodeFlow
   * 
   * @param request request (required)
   * @return OAuthToken
   * @throws ApiException if fails to make API call
   */
  public OAuthToken refreshTokenForDeviceCodeFlow(RefreshTokenRequest request) throws ApiException {
    return refreshTokenForDeviceCodeFlowWithHttpInfo(request).getData();
      }

  /**
   * refreshTokenForDeviceCodeFlow
   * 
   * @param request request (required)
   * @return ApiResponse&lt;OAuthToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthToken> refreshTokenForDeviceCodeFlowWithHttpInfo(RefreshTokenRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling refreshTokenForDeviceCodeFlow");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/auth/sso/token-refresh";

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

    GenericType<OAuthToken> localVarReturnType = new GenericType<OAuthToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
