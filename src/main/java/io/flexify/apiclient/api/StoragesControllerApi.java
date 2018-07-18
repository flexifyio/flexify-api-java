package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AccessKeysPair;
import io.flexify.apiclient.model.AddStorageAccountRequest;
import io.flexify.apiclient.model.AddStoragesRequest;
import io.flexify.apiclient.model.AddStoragesResponse;
import io.flexify.apiclient.model.Bucket;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.IdsList;
import io.flexify.apiclient.model.Storage;
import io.flexify.apiclient.model.StorageAccount;
import io.flexify.apiclient.model.StorageProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-18T14:37:49.273+03:00")
public class StoragesControllerApi {
  private ApiClient apiClient;

  public StoragesControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StoragesControllerApi(ApiClient apiClient) {
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
   * Add buckets to the storage account and optionally attach them to endpoint
   * 
   * @param storageAccountId storage-account-id (required)
   * @param request request (required)
   * @return AddStoragesResponse
   * @throws ApiException if fails to make API call
   */
  public AddStoragesResponse addStorages(Long storageAccountId, AddStoragesRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling addStorages");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addStorages");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/storages"
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

    GenericType<AddStoragesResponse> localVarReturnType = new GenericType<AddStoragesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Storage
   * 
   * @param storageAccountId storage-account-id (required)
   * @param storageId storage-id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorage(Long storageAccountId, Long storageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling deleteStorage");
    }
    
    // verify the required parameter 'storageId' is set
    if (storageId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageId' when calling deleteStorage");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/storages/{storage-id}"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()))
      .replaceAll("\\{" + "storage-id" + "\\}", apiClient.escapeString(storageId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes storages
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteStorages(IdsList request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling deleteStorages");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/actions/delete-storages";

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
  /**
   * Generate new access keys pair
   * 
   * @return AccessKeysPair
   * @throws ApiException if fails to make API call
   */
  public AccessKeysPair generateAccessKeys() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/generate-access-keys";

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

    GenericType<AccessKeysPair> localVarReturnType = new GenericType<AccessKeysPair>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all storage providers
   * 
   * @return List&lt;StorageProvider&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StorageProvider> getProviders() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/providers";

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

    GenericType<List<StorageProvider>> localVarReturnType = new GenericType<List<StorageProvider>>() {};
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
   * Get storages of the storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @return List&lt;Storage&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Storage> getStorages(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling getStorages");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/storages"
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

    GenericType<List<Storage>> localVarReturnType = new GenericType<List<Storage>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Refresh storage
   * 
   * @param storageAccountId storage-account-id (required)
   * @param storageId storage-id (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorage(Long storageAccountId, Long storageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling refreshStorage");
    }
    
    // verify the required parameter 'storageId' is set
    if (storageId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageId' when calling refreshStorage");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/storages/{storage-id}/actions/refresh"
      .replaceAll("\\{" + "storage-account-id" + "\\}", apiClient.escapeString(storageAccountId.toString()))
      .replaceAll("\\{" + "storage-id" + "\\}", apiClient.escapeString(storageId.toString()));

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
  /**
   * Refresh storages
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshStorages(IdsList request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling refreshStorages");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/actions/refresh-storages";

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
  /**
   * Lists buckets of the external storage account
   * 
   * @param providerId Provider ID (Amazon S3, Microsoft Azure, etc) (optional)
   * @param identity Account Identity (optional)
   * @param credential Account Credential (optional)
   * @param customUrl Optional endpoint to access the storage (optional)
   * @param useSsl Use SSL to connect to the endpoint (optional, default to true)
   * @return List&lt;Bucket&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Bucket> requestBuckets(Long providerId, String identity, String credential, String customUrl, Boolean useSsl) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/buckets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "providerId", providerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity", identity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "credential", credential));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customUrl", customUrl));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useSsl", useSsl));

    
    
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
   * Retrieve buckets from external cloud storage account
   * 
   * @param storageAccountId storage-account-id (required)
   * @return List&lt;Bucket&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Bucket> requestBucketsForStorageAccount(Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling requestBucketsForStorageAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/storage-accounts/{storage-account-id}/buckets"
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
}
