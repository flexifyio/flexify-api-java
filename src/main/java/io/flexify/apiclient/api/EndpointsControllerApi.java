package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AttachStoragesToEndpointRequest;
import io.flexify.apiclient.model.Endpoint;
import io.flexify.apiclient.model.EndpointDetails;
import io.flexify.apiclient.model.EndpointStorageSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
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
   * Attach the storage to the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void attachStoragesToEndpoint(Long endpointId, AttachStoragesToEndpointRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling attachStoragesToEndpoint");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling attachStoragesToEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storages"
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Detach the storage from the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param storageId storage-id (required)
   * @throws ApiException if fails to make API call
   */
  public void detachStorageFromEndpoint(Long endpointId, Long storageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling detachStorageFromEndpoint");
    }
    
    // verify the required parameter 'storageId' is set
    if (storageId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageId' when calling detachStorageFromEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storages/{storage-id}"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
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
   * Disable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public void disable(Long endpointId) throws ApiException {
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Enable the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @throws ApiException if fails to make API call
   */
  public void enable(Long endpointId) throws ApiException {
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get endpoint details
   * 
   * @param endpointId endpoint-id (required)
   * @return EndpointDetails
   * @throws ApiException if fails to make API call
   */
  public EndpointDetails getEndpointDetails(Long endpointId) throws ApiException {
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
   * Set given storage as default for the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param storageId storage-id (required)
   * @param settings settings (required)
   * @throws ApiException if fails to make API call
   */
  public void setStoragePutObjects(Long endpointId, Long storageId, EndpointStorageSettings settings) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling setStoragePutObjects");
    }
    
    // verify the required parameter 'storageId' is set
    if (storageId == null) {
      throw new ApiException(400, "Missing the required parameter 'storageId' when calling setStoragePutObjects");
    }
    
    // verify the required parameter 'settings' is set
    if (settings == null) {
      throw new ApiException(400, "Missing the required parameter 'settings' when calling setStoragePutObjects");
    }
    
    // create path and map variables
    String localVarPath = "/rest/endpoints/{endpoint-id}/storages/{storage-id}/put-objects"
      .replaceAll("\\{" + "endpoint-id" + "\\}", apiClient.escapeString(endpointId.toString()))
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update attributes of the endpoint
   * 
   * @param endpointId endpoint-id (required)
   * @param endpoint endpoint (required)
   * @throws ApiException if fails to make API call
   */
  public void updateEndpoint(Long endpointId, Endpoint endpoint) throws ApiException {
    Object localVarPostBody = endpoint;
    
    // verify the required parameter 'endpointId' is set
    if (endpointId == null) {
      throw new ApiException(400, "Missing the required parameter 'endpointId' when calling updateEndpoint");
    }
    
    // verify the required parameter 'endpoint' is set
    if (endpoint == null) {
      throw new ApiException(400, "Missing the required parameter 'endpoint' when calling updateEndpoint");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
