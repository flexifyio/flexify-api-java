package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.BucketsRequest;
import io.flexify.apiclient.model.IdsList;
import io.flexify.apiclient.model.StorageProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
   * Add buckets to the storage account
   * 
   * @param request request (required)
   * @param storageAccountId storage-account-id (required)
   * @return IdsList
   * @throws ApiException if fails to make API call
   */
  public IdsList addBuckets(BucketsRequest request, Long storageAccountId) throws ApiException {
    return addBucketsWithHttpInfo(request, storageAccountId).getData();
      }

  /**
   * Add buckets to the storage account
   * 
   * @param request request (required)
   * @param storageAccountId storage-account-id (required)
   * @return ApiResponse&lt;IdsList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdsList> addBucketsWithHttpInfo(BucketsRequest request, Long storageAccountId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addBuckets");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling addBuckets");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/buckets"
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

    GenericType<IdsList> localVarReturnType = new GenericType<IdsList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes (hides) a bucket/container
   * 
   * @param bucketId bucket-id (required)
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteBucket(Long bucketId, Long storageAccountId, Boolean forceDetach) throws ApiException {

    deleteBucketWithHttpInfo(bucketId, storageAccountId, forceDetach);
  }

  /**
   * Deletes (hides) a bucket/container
   * 
   * @param bucketId bucket-id (required)
   * @param storageAccountId storage-account-id (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteBucketWithHttpInfo(Long bucketId, Long storageAccountId, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketId' is set
    if (bucketId == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketId' when calling deleteBucket");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling deleteBucket");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}"
      .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
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
   * Deletes (hides) multiple buckets/containers
   * 
   * @param request request (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void deleteBuckets(IdsList request, Boolean forceDetach) throws ApiException {

    deleteBucketsWithHttpInfo(request, forceDetach);
  }

  /**
   * Deletes (hides) multiple buckets/containers
   * 
   * @param request request (required)
   * @param forceDetach force-detach (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteBucketsWithHttpInfo(IdsList request, Boolean forceDetach) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling deleteBuckets");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/actions/delete-buckets";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get all storage providers
   * 
   * @return List&lt;StorageProvider&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StorageProvider> getProviders() throws ApiException {
    return getProvidersWithHttpInfo().getData();
      }

  /**
   * Get all storage providers
   * 
   * @return ApiResponse&lt;List&lt;StorageProvider&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<StorageProvider>> getProvidersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/providers";

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
   * Refresh statistics of a single bucket
   * 
   * @param bucketId bucket-id (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshBucket(Long bucketId, Long storageAccountId) throws ApiException {

    refreshBucketWithHttpInfo(bucketId, storageAccountId);
  }

  /**
   * Refresh statistics of a single bucket
   * 
   * @param bucketId bucket-id (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> refreshBucketWithHttpInfo(Long bucketId, Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketId' is set
    if (bucketId == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketId' when calling refreshBucket");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling refreshBucket");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/{storage-account-id}/buckets/{bucket-id}/actions/refresh"
      .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
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
   * Refresh statistics of multiple buckets
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void refreshBuckets(IdsList request) throws ApiException {

    refreshBucketsWithHttpInfo(request);
  }

  /**
   * Refresh statistics of multiple buckets
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> refreshBucketsWithHttpInfo(IdsList request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling refreshBuckets");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/storage-accounts/actions/refresh-buckets";

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
