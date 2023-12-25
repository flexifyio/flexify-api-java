package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddStorageAccountRequest;
import io.flexify.apiclient.model.AddStorageAccountsWithAzureLinkRequest;
import io.flexify.apiclient.model.FinishOAuthParams;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.StorageAccount;
import io.flexify.apiclient.model.StorageAccountSettingsReq;
import io.flexify.apiclient.model.StorageAccountWithBuckets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StorageAccountsControllerApi {
  private ApiClient apiClient;

  public StorageAccountsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StorageAccountsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add Storage Account with an optional list of buckets
   * 
   * @param request request (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse addStorageAccount(AddStorageAccountRequest request) throws ApiException {
    return addStorageAccountWithHttpInfo(request).getData();
      }

  /**
   * Add Storage Account with an optional list of buckets
   * 
   * @param request request (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> addStorageAccountWithHttpInfo(AddStorageAccountRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts";

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

    GenericType<IdResponse> localVarReturnType = new GenericType<IdResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add multiple storage accounts with Azure integration
   * 
   * @param request request (required)
   * @return List&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<IdResponse> addStorageAccountsWithAzureIntegration(AddStorageAccountsWithAzureLinkRequest request) throws ApiException {
    return addStorageAccountsWithAzureIntegrationWithHttpInfo(request).getData();
      }

  /**
   * Add multiple storage accounts with Azure integration
   * 
   * @param request request (required)
   * @return ApiResponse&lt;List&lt;IdResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<IdResponse>> addStorageAccountsWithAzureIntegrationWithHttpInfo(AddStorageAccountsWithAzureLinkRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addStorageAccountsWithAzureIntegration");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/azure-integration";

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

    GenericType<List<IdResponse>> localVarReturnType = new GenericType<List<IdResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes (hides) storage account and all its buckets/containers
   * 
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorageAccount(Long storageAccountId, Boolean forceDetach) throws ApiException {

    deleteStorageAccountWithHttpInfo(storageAccountId, forceDetach);
  }

  /**
   * Deletes (hides) storage account and all its buckets/containers
   * 
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteStorageAccountWithHttpInfo(Long storageAccountId, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling deleteStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force-detach", forceDetach));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get storage account by id
   * 
   * @param storageAccountId storage-account-id (required)
   * @return StorageAccountWithBuckets
   * @throws ApiException if fails to make API call
   */
  public StorageAccountWithBuckets getStorageAccount(Long storageAccountId) throws ApiException {
    return getStorageAccountWithHttpInfo(storageAccountId).getData();
      }

  /**
   * Get storage account by id
   * 
   * @param storageAccountId storage-account-id (required)
   * @return ApiResponse&lt;StorageAccountWithBuckets&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StorageAccountWithBuckets> getStorageAccountWithHttpInfo(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling getStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

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

    GenericType<StorageAccountWithBuckets> localVarReturnType = new GenericType<StorageAccountWithBuckets>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all storage accounts for current user
   * 
   * @param includeBuckets Include storages of given storage account to the response (optional, default to true)
   * @return List&lt;StorageAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StorageAccount> getStorageAccounts(Boolean includeBuckets) throws ApiException {
    return getStorageAccountsWithHttpInfo(includeBuckets).getData();
      }

  /**
   * Get all storage accounts for current user
   * 
   * @param includeBuckets Include storages of given storage account to the response (optional, default to true)
   * @return ApiResponse&lt;List&lt;StorageAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<StorageAccount>> getStorageAccountsWithHttpInfo(Boolean includeBuckets) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-buckets", includeBuckets));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<StorageAccount>> localVarReturnType = new GenericType<List<StorageAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reauthenticate storage account
   * 
   * @param authParams authParams (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void reauthStorageAccount(FinishOAuthParams authParams, Long storageAccountId) throws ApiException {

    reauthStorageAccountWithHttpInfo(authParams, storageAccountId);
  }

  /**
   * Reauthenticate storage account
   * 
   * @param authParams authParams (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> reauthStorageAccountWithHttpInfo(FinishOAuthParams authParams, Long storageAccountId) throws ApiException {
    Object localVarPostBody = authParams;
    
    // verify the required parameter 'authParams' is set
    if (authParams == null) {
      throw new ApiException(400, "Missing the required parameter 'authParams' when calling reauthStorageAccount");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling reauthStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/reauth"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

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
   * Requests and updates list of buckets/containers for the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorageAccount(Long storageAccountId) throws ApiException {

    refreshStorageAccountWithHttpInfo(storageAccountId);
  }

  /**
   * Requests and updates list of buckets/containers for the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> refreshStorageAccountWithHttpInfo(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling refreshStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/actions/refresh"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

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
   * Updates storage account settings
   * 
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void setStorageAccountSettings(StorageAccountSettingsReq settings, Long storageAccountId) throws ApiException {

    setStorageAccountSettingsWithHttpInfo(settings, storageAccountId);
  }

  /**
   * Updates storage account settings
   * 
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setStorageAccountSettingsWithHttpInfo(StorageAccountSettingsReq settings, Long storageAccountId) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setStorageAccountSettings");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling setStorageAccountSettings");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/settings"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()));

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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
