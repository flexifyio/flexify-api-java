package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.OAuth2DeviceCodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StorageAccountsOAuthControllerApi {
  private ApiClient apiClient;

  public StorageAccountsOAuthControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StorageAccountsOAuthControllerApi(ApiClient apiClient) {
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
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getConfig2(String oauthProviderId) throws ApiException {
    return getConfig2WithHttpInfo(oauthProviderId).getData();
      }

  /**
   * getConfig
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getConfig2WithHttpInfo(String oauthProviderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'oauthProviderId' is set
    if (oauthProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'oauthProviderId' when calling getConfig2");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/oauth/config";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getDeviceCode
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @param storageAccountName storage-account-name (required)
   * @param storageProviderId storage-provider-id (required)
   * @param useSsl use-ssl (required)
   * @param customEndpoint custom-endpoint (optional)
   * @return OAuth2DeviceCodeResponse
   * @throws ApiException if fails to make API call
   */
  public OAuth2DeviceCodeResponse getDeviceCode1(String oauthProviderId, String storageAccountName, Long storageProviderId, Boolean useSsl, String customEndpoint) throws ApiException {
    return getDeviceCode1WithHttpInfo(oauthProviderId, storageAccountName, storageProviderId, useSsl, customEndpoint).getData();
      }

  /**
   * getDeviceCode
   * 
   * @param oauthProviderId oauth-provider-id (required)
   * @param storageAccountName storage-account-name (required)
   * @param storageProviderId storage-provider-id (required)
   * @param useSsl use-ssl (required)
   * @param customEndpoint custom-endpoint (optional)
   * @return ApiResponse&lt;OAuth2DeviceCodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuth2DeviceCodeResponse> getDeviceCode1WithHttpInfo(String oauthProviderId, String storageAccountName, Long storageProviderId, Boolean useSsl, String customEndpoint) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'oauthProviderId' is set
    if (oauthProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'oauthProviderId' when calling getDeviceCode1");
    }
    
    // verify the required parameter 'storageAccountName' is set
    if (storageAccountName == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountName' when calling getDeviceCode1");
    }
    
    // verify the required parameter 'storageProviderId' is set
    if (storageProviderId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageProviderId' when calling getDeviceCode1");
    }
    
    // verify the required parameter 'useSsl' is set
    if (useSsl == null) {
      throw new ApiException(400, "Missing the required parameter 'useSsl' when calling getDeviceCode1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/oauth/device-code";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom-endpoint", customEndpoint));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oauth-provider-id", oauthProviderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-account-name", storageAccountName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "storage-provider-id", storageProviderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use-ssl", useSsl));

    
    
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
}
