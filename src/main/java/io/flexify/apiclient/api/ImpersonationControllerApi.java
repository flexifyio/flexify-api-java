package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddImpersonateFromUserRequest;
import io.flexify.apiclient.model.ImpersonateUser;
import io.flexify.apiclient.model.InformationAboutAuthenticationToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ImpersonationControllerApi {
  private ApiClient apiClient;

  public ImpersonationControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ImpersonationControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * addImpersonateFromUser
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void addImpersonateFromUser(AddImpersonateFromUserRequest request) throws ApiException {

    addImpersonateFromUserWithHttpInfo(request);
  }

  /**
   * addImpersonateFromUser
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> addImpersonateFromUserWithHttpInfo(AddImpersonateFromUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addImpersonateFromUser");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/impersonate/from";

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
   * getImpersonateFromList
   * 
   * @return List&lt;ImpersonateUser&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ImpersonateUser> getImpersonateFromList() throws ApiException {
    return getImpersonateFromListWithHttpInfo().getData();
      }

  /**
   * getImpersonateFromList
   * 
   * @return ApiResponse&lt;List&lt;ImpersonateUser&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ImpersonateUser>> getImpersonateFromListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/impersonate/from";

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

    GenericType<List<ImpersonateUser>> localVarReturnType = new GenericType<List<ImpersonateUser>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getImpersonateToList
   * 
   * @return List&lt;ImpersonateUser&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ImpersonateUser> getImpersonateToList() throws ApiException {
    return getImpersonateToListWithHttpInfo().getData();
      }

  /**
   * getImpersonateToList
   * 
   * @return ApiResponse&lt;List&lt;ImpersonateUser&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ImpersonateUser>> getImpersonateToListWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/impersonate/to";

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

    GenericType<List<ImpersonateUser>> localVarReturnType = new GenericType<List<ImpersonateUser>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * impersonate
   * 
   * @param userId userId (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken impersonate(Long userId) throws ApiException {
    return impersonateWithHttpInfo(userId).getData();
      }

  /**
   * impersonate
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> impersonateWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling impersonate");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/impersonate/as/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<InformationAboutAuthenticationToken> localVarReturnType = new GenericType<InformationAboutAuthenticationToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * removeImpersonateFromUser
   * 
   * @param userId user-id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeImpersonateFromUser(Long userId) throws ApiException {

    removeImpersonateFromUserWithHttpInfo(userId);
  }

  /**
   * removeImpersonateFromUser
   * 
   * @param userId user-id (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> removeImpersonateFromUserWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeImpersonateFromUser");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/impersonate/from/{user-id}"
      .replaceAll("\\{" + "user-id" + "\\}", apiClient.escapeString(userId.toString()));

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
}
