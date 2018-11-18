package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddStorageAccountRequest;
import io.flexify.apiclient.model.Bucket;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.StorageAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-19T00:30:02.233+08:00")
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
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts";

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
   * Deletes (hides) a bucket/container
   * 
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorageAccount(Long storageAccountId, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling deleteStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}"
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get storage account by id
   * 
   * @param storageAccountId storage-account-id (required)
   * @return List&lt;Bucket&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Bucket> getStorageAccount(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling getStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/storage-accounts/{storage-account-id}"
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

    GenericType<List<Bucket>> localVarReturnType = new GenericType<List<Bucket>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all storage accounts for current user
   * 
   * @param includeStorages Include storages of given storage account to the response (optional, default to true)
   * @return List&lt;StorageAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StorageAccount> getStorageAccounts(Boolean includeStorages) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include-storages", includeStorages));

    
    
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
   * Requests and updates list of buckets/containers for the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorageAccount(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling refreshStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/actions/refresh"
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
