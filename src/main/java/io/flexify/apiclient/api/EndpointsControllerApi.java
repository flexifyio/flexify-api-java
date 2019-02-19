package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AccessKeysPair;
import io.flexify.apiclient.model.AttachStorageAccountsRequest;
import io.flexify.apiclient.model.AttachVirtualBucketStoragesRequest;
import io.flexify.apiclient.model.CreateVirtualBucketRequest;
import io.flexify.apiclient.model.EndpointDetails;
import io.flexify.apiclient.model.EndpointSettings;
import io.flexify.apiclient.model.EndpointStorageAccountSettings;
import io.flexify.apiclient.model.VirtualBucketSettings;
import io.flexify.apiclient.model.VirtualBucketStorageSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
public class EndpointsControllerApi {
  private ApiClient apiClient;

  public EndpointsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EndpointsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Attach storage accounts to the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void attachAccounts(Long endpointId, AttachStorageAccountsRequest request) throws ApiException {

    attachAccountsWithHttpInfo(endpointId, request);
  }

  /**
   * Attach storage accounts to the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> attachAccountsWithHttpInfo(Long endpointId, AttachStorageAccountsRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling attachAccounts");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling attachAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storage-accounts"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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
   * Attach storages to the virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public void attachBuckets(Long endpointId, AttachVirtualBucketStoragesRequest request, String virtualBucket) throws ApiException {

    attachBucketsWithHttpInfo(endpointId, request, virtualBucket);
  }

  /**
   * Attach storages to the virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> attachBucketsWithHttpInfo(Long endpointId, AttachVirtualBucketStoragesRequest request, String virtualBucket) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling attachBuckets");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling attachBuckets");
    }
    
    // verify the required parameter 'virtualBucket' is set
    if (virtualBucket == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualBucket' when calling attachBuckets");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
      .replaceAll("\\{" + "virtual-bucket" + "\\}", apiClient.escapeString(virtualBucket.toString()));

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
   * Creates new virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void createVirtualBucket(Long endpointId, CreateVirtualBucketRequest request) throws ApiException {

    createVirtualBucketWithHttpInfo(endpointId, request);
  }

  /**
   * Creates new virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createVirtualBucketWithHttpInfo(Long endpointId, CreateVirtualBucketRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling createVirtualBucket");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createVirtualBucket");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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
   * Deletes virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVirtualBucket(Long endpointId, String virtualBucket) throws ApiException {

    deleteVirtualBucketWithHttpInfo(endpointId, virtualBucket);
  }

  /**
   * Deletes virtual bucket
   * 
   * @param endpointId endpoint-id (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteVirtualBucketWithHttpInfo(Long endpointId, String virtualBucket) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling deleteVirtualBucket");
    }
    
    // verify the required parameter 'virtualBucket' is set
    if (virtualBucket == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualBucket' when calling deleteVirtualBucket");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
      .replaceAll("\\{" + "virtual-bucket" + "\\}", apiClient.escapeString(virtualBucket.toString()));

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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Detach storage account from the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void detachAccount(Long endpointId, Long storageAccountId) throws ApiException {

    detachAccountWithHttpInfo(endpointId, storageAccountId);
  }

  /**
   * Detach storage account from the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> detachAccountWithHttpInfo(Long endpointId, Long storageAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling detachAccount");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling detachAccount");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id}"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Detach storage account from the endpoint
   * 
   * @param bucketId bucket-id (required)
   * @param endpointId endpoint-id (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public void detachBucket(Long bucketId, Long endpointId, String virtualBucket) throws ApiException {

    detachBucketWithHttpInfo(bucketId, endpointId, virtualBucket);
  }

  /**
   * Detach storage account from the endpoint
   * 
   * @param bucketId bucket-id (required)
   * @param endpointId endpoint-id (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> detachBucketWithHttpInfo(Long bucketId, Long endpointId, String virtualBucket) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketId' is set
    if (bucketId == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketId' when calling detachBucket");
    }
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling detachBucket");
    }
    
    // verify the required parameter 'virtualBucket' is set
    if (virtualBucket == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualBucket' when calling detachBucket");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id}"
      .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
      .replaceAll("\\{" + "virtual-bucket" + "\\}", apiClient.escapeString(virtualBucket.toString()));

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


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Disable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public void disable(Long endpointId) throws ApiException {

    disableWithHttpInfo(endpointId);
  }

  /**
   * Disable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> disableWithHttpInfo(Long endpointId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling disable");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/actions/disable"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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
  /**
   * Enable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public void enable(Long endpointId) throws ApiException {

    enableWithHttpInfo(endpointId);
  }

  /**
   * Enable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> enableWithHttpInfo(Long endpointId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling enable");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/actions/enable"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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
  /**
   * Generate new access keys pair
   * 
   * @return AccessKeysPair
   * @throws ApiException if fails to make API call
   */
  public AccessKeysPair generateAccessKeys() throws ApiException {
    return generateAccessKeysWithHttpInfo().getData();
      }

  /**
   * Generate new access keys pair
   * 
   * @return ApiResponse&lt;AccessKeysPair&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccessKeysPair> generateAccessKeysWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/generated-access-keys";

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
   * Get endpoint details
   * 
   * @param endpointId endpoint-id (required)
   * @return EndpointDetails
   * @throws ApiException if fails to make API call
   */
  public EndpointDetails getEndpointDetails(Long endpointId) throws ApiException {
    return getEndpointDetailsWithHttpInfo(endpointId).getData();
      }

  /**
   * Get endpoint details
   * 
   * @param endpointId endpoint-id (required)
   * @return ApiResponse&lt;EndpointDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointDetails> getEndpointDetailsWithHttpInfo(Long endpointId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling getEndpointDetails");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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

    GenericType<EndpointDetails> localVarReturnType = new GenericType<EndpointDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
   * 
   * @return List&lt;EndpointDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public List<EndpointDetails> getEndpointsForCurrentUser() throws ApiException {
    return getEndpointsForCurrentUserWithHttpInfo().getData();
      }

  /**
   * Get endpoint for current user. This method will create new endpoint if no endpoints exist for user
   * 
   * @return ApiResponse&lt;List&lt;EndpointDetails&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<EndpointDetails>> getEndpointsForCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/endpoints";

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

    GenericType<List<EndpointDetails>> localVarReturnType = new GenericType<List<EndpointDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Modifies settings of the attached storage account
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public void setAttachedAccountSettings(Long endpointId, EndpointStorageAccountSettings settings, Long storageAccountId) throws ApiException {

    setAttachedAccountSettingsWithHttpInfo(endpointId, settings, storageAccountId);
  }

  /**
   * Modifies settings of the attached storage account
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param storageAccountId storage-account-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setAttachedAccountSettingsWithHttpInfo(Long endpointId, EndpointStorageAccountSettings settings, Long storageAccountId) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling setAttachedAccountSettings");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setAttachedAccountSettings");
    }
    
    // verify the required parameter 'storageAccountId' is set
    if (storageAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageAccountId' when calling setAttachedAccountSettings");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storage-accounts/{storage-account-id}/settings"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
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
  /**
   * Modifies settings of the attached storage
   * 
   * @param bucketId bucket-id (required)
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public void setAttachedBucketSettings(Long bucketId, Long endpointId, VirtualBucketStorageSettings settings, String virtualBucket) throws ApiException {

    setAttachedBucketSettingsWithHttpInfo(bucketId, endpointId, settings, virtualBucket);
  }

  /**
   * Modifies settings of the attached storage
   * 
   * @param bucketId bucket-id (required)
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setAttachedBucketSettingsWithHttpInfo(Long bucketId, Long endpointId, VirtualBucketStorageSettings settings, String virtualBucket) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'bucketId' is set
    if (bucketId == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketId' when calling setAttachedBucketSettings");
    }
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling setAttachedBucketSettings");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setAttachedBucketSettings");
    }
    
    // verify the required parameter 'virtualBucket' is set
    if (virtualBucket == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualBucket' when calling setAttachedBucketSettings");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/buckets/{bucket-id}/settings"
      .replaceAll("\\{" + "bucket-id" + "\\}", apiClient.escapeString(bucketId.toString()))
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
      .replaceAll("\\{" + "virtual-bucket" + "\\}", apiClient.escapeString(virtualBucket.toString()));

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
  /**
   * Modifies virtual bucket configuration
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public void setVirtualBucketSettings(Long endpointId, VirtualBucketSettings settings, String virtualBucket) throws ApiException {

    setVirtualBucketSettingsWithHttpInfo(endpointId, settings, virtualBucket);
  }

  /**
   * Modifies virtual bucket configuration
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @param virtualBucket virtual-bucket (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setVirtualBucketSettingsWithHttpInfo(Long endpointId, VirtualBucketSettings settings, String virtualBucket) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling setVirtualBucketSettings");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setVirtualBucketSettings");
    }
    
    // verify the required parameter 'virtualBucket' is set
    if (virtualBucket == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualBucket' when calling setVirtualBucketSettings");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/virtual-buckets/{virtual-bucket}/settings"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
      .replaceAll("\\{" + "virtual-bucket" + "\\}", apiClient.escapeString(virtualBucket.toString()));

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
  /**
   * Update attributes of the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @throws ApiException if fails to make API call
   */
  public void updateEndpointSettings(Long endpointId, EndpointSettings settings) throws ApiException {

    updateEndpointSettingsWithHttpInfo(endpointId, settings);
  }

  /**
   * Update attributes of the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param settings settings (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateEndpointSettingsWithHttpInfo(Long endpointId, EndpointSettings settings) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling updateEndpointSettings");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling updateEndpointSettings");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/settings"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()));

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
