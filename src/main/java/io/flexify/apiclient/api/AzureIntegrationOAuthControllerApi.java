package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AzureIntegration;
import io.flexify.apiclient.model.AzureSubscriptionInfoWithStorages;
import io.flexify.apiclient.model.FinishOAuthParams;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.MicrosoftOAuthConfig;
import io.flexify.apiclient.model.OAuth2DeviceCodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AzureIntegrationOAuthControllerApi {
  private ApiClient apiClient;

  public AzureIntegrationOAuthControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AzureIntegrationOAuthControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add new Azure integration
   * 
   * @param request request (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse addAzureIntegration(FinishOAuthParams request) throws ApiException {
    return addAzureIntegrationWithHttpInfo(request).getData();
      }

  /**
   * Add new Azure integration
   * 
   * @param request request (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> addAzureIntegrationWithHttpInfo(FinishOAuthParams request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration";

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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Authenticate Azure integration storage access
   * 
   * @param authParams authParams (required)
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public void authStorage(FinishOAuthParams authParams, Long azureIntegrationId) throws ApiException {

    authStorageWithHttpInfo(authParams, azureIntegrationId);
  }

  /**
   * Authenticate Azure integration storage access
   * 
   * @param authParams authParams (required)
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> authStorageWithHttpInfo(FinishOAuthParams authParams, Long azureIntegrationId) throws ApiException {
    Object localVarPostBody = authParams;
    
    // verify the required parameter 'authParams' is set
    if (authParams == null) {
      throw new ApiException(400, "Missing the required parameter 'authParams' when calling authStorage");
    }
    
    // verify the required parameter 'azureIntegrationId' is set
    if (azureIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'azureIntegrationId' when calling authStorage");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/{azure-integration-id}/actions/auth-storage"
      .replaceAll("\\{" + "azure-integration-id" + "\\}", apiClient.escapeString(azureIntegrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes (hides) Azure integration by Id
   * 
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAzureIntegration(Long azureIntegrationId) throws ApiException {

    deleteAzureIntegrationWithHttpInfo(azureIntegrationId);
  }

  /**
   * Deletes (hides) Azure integration by Id
   * 
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAzureIntegrationWithHttpInfo(Long azureIntegrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'azureIntegrationId' is set
    if (azureIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'azureIntegrationId' when calling deleteAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/{azure-integration-id}"
      .replaceAll("\\{" + "azure-integration-id" + "\\}", apiClient.escapeString(azureIntegrationId.toString()));

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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get Azure integration by id
   * 
   * @return List&lt;AzureIntegration&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AzureIntegration> getAzureIntegrations() throws ApiException {
    return getAzureIntegrationsWithHttpInfo().getData();
      }

  /**
   * Get Azure integration by id
   * 
   * @return ApiResponse&lt;List&lt;AzureIntegration&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AzureIntegration>> getAzureIntegrationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration";

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

    GenericType<List<AzureIntegration>> localVarReturnType = new GenericType<List<AzureIntegration>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get OAuth configuration to authorize Azure integration
   * 
   * @return MicrosoftOAuthConfig
   * @throws ApiException if fails to make API call
   */
  public MicrosoftOAuthConfig getConfigForAzureIntegration() throws ApiException {
    return getConfigForAzureIntegrationWithHttpInfo().getData();
      }

  /**
   * Get OAuth configuration to authorize Azure integration
   * 
   * @return ApiResponse&lt;MicrosoftOAuthConfig&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MicrosoftOAuthConfig> getConfigForAzureIntegrationWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/oauth/config";

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

    GenericType<MicrosoftOAuthConfig> localVarReturnType = new GenericType<MicrosoftOAuthConfig>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request device code to authorize Azure integration with device code flow (management access)
   * 
   * @return OAuth2DeviceCodeResponse
   * @throws ApiException if fails to make API call
   */
  public OAuth2DeviceCodeResponse getDeviceCodeForAzureIntegrationManagement() throws ApiException {
    return getDeviceCodeForAzureIntegrationManagementWithHttpInfo().getData();
      }

  /**
   * Request device code to authorize Azure integration with device code flow (management access)
   * 
   * @return ApiResponse&lt;OAuth2DeviceCodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuth2DeviceCodeResponse> getDeviceCodeForAzureIntegrationManagementWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/oauth/device-code/management";

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

    GenericType<OAuth2DeviceCodeResponse> localVarReturnType = new GenericType<OAuth2DeviceCodeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request device code to authorize Azure integration with device code flow (storage access)
   * 
   * @return OAuth2DeviceCodeResponse
   * @throws ApiException if fails to make API call
   */
  public OAuth2DeviceCodeResponse getDeviceCodeForAzureIntegrationStorage() throws ApiException {
    return getDeviceCodeForAzureIntegrationStorageWithHttpInfo().getData();
      }

  /**
   * Request device code to authorize Azure integration with device code flow (storage access)
   * 
   * @return ApiResponse&lt;OAuth2DeviceCodeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuth2DeviceCodeResponse> getDeviceCodeForAzureIntegrationStorageWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/oauth/device-code/storage";

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

    GenericType<OAuth2DeviceCodeResponse> localVarReturnType = new GenericType<OAuth2DeviceCodeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Use Azure integration to get list of storage accounts from Azure
   * 
   * @param azureIntegrationId azure-integration-id (required)
   * @return List&lt;AzureSubscriptionInfoWithStorages&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AzureSubscriptionInfoWithStorages> getStorageAccountsFromAzure(Long azureIntegrationId) throws ApiException {
    return getStorageAccountsFromAzureWithHttpInfo(azureIntegrationId).getData();
      }

  /**
   * Use Azure integration to get list of storage accounts from Azure
   * 
   * @param azureIntegrationId azure-integration-id (required)
   * @return ApiResponse&lt;List&lt;AzureSubscriptionInfoWithStorages&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<AzureSubscriptionInfoWithStorages>> getStorageAccountsFromAzureWithHttpInfo(Long azureIntegrationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'azureIntegrationId' is set
    if (azureIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'azureIntegrationId' when calling getStorageAccountsFromAzure");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/{azure-integration-id}/storage-accounts-list"
      .replaceAll("\\{" + "azure-integration-id" + "\\}", apiClient.escapeString(azureIntegrationId.toString()));

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

    GenericType<List<AzureSubscriptionInfoWithStorages>> localVarReturnType = new GenericType<List<AzureSubscriptionInfoWithStorages>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reauthenticate Azure integration
   * 
   * @param authParams authParams (required)
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public void reauthAzureIntegration(FinishOAuthParams authParams, Long azureIntegrationId) throws ApiException {

    reauthAzureIntegrationWithHttpInfo(authParams, azureIntegrationId);
  }

  /**
   * Reauthenticate Azure integration
   * 
   * @param authParams authParams (required)
   * @param azureIntegrationId azure-integration-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> reauthAzureIntegrationWithHttpInfo(FinishOAuthParams authParams, Long azureIntegrationId) throws ApiException {
    Object localVarPostBody = authParams;
    
    // verify the required parameter 'authParams' is set
    if (authParams == null) {
      throw new ApiException(400, "Missing the required parameter 'authParams' when calling reauthAzureIntegration");
    }
    
    // verify the required parameter 'azureIntegrationId' is set
    if (azureIntegrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'azureIntegrationId' when calling reauthAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/azure-integration/{azure-integration-id}/actions/reauth"
      .replaceAll("\\{" + "azure-integration-id" + "\\}", apiClient.escapeString(azureIntegrationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
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
