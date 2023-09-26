package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.CreateUserRequest;
import io.flexify.apiclient.model.IdResponse;
import io.flexify.apiclient.model.InformationAboutAuthenticationToken;
import io.flexify.apiclient.model.PageUserStat;
import io.flexify.apiclient.model.PasswordResetToken;
import io.flexify.apiclient.model.SetLimitsRequest;
import io.flexify.apiclient.model.SetRolesRequest;
import io.flexify.apiclient.model.SetUserStateRequest;
import io.flexify.apiclient.model.TokenConfiguration;
import io.flexify.apiclient.model.UpdateUserRequest;
import io.flexify.apiclient.model.User;
import io.flexify.apiclient.model.UserStat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PartnerUsersControllerApi {
  private ApiClient apiClient;

  public PartnerUsersControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PartnerUsersControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Change user state
   * Enables or disables a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserState(SetUserStateRequest request, Long userId) throws ApiException {

    changeUserStateWithHttpInfo(request, userId);
  }

  /**
   * Change user state
   * Enables or disables a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserStateWithHttpInfo(SetUserStateRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserState");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling changeUserState");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/state"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Change user state
   * Enables or disables a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserState1(SetUserStateRequest request, Long userId) throws ApiException {

    changeUserState1WithHttpInfo(request, userId);
  }

  /**
   * Change user state
   * Enables or disables a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserState1WithHttpInfo(SetUserStateRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserState1");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling changeUserState1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/state"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Change user state by external ID
   * Enables or disables a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserStateByExternalId(String externalId, SetUserStateRequest request) throws ApiException {

    changeUserStateByExternalIdWithHttpInfo(externalId, request);
  }

  /**
   * Change user state by external ID
   * Enables or disables a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserStateByExternalIdWithHttpInfo(String externalId, SetUserStateRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling changeUserStateByExternalId");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserStateByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/state"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Change user state by external ID
   * Enables or disables a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserStateByExternalId1(String externalId, SetUserStateRequest request) throws ApiException {

    changeUserStateByExternalId1WithHttpInfo(externalId, request);
  }

  /**
   * Change user state by external ID
   * Enables or disables a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserStateByExternalId1WithHttpInfo(String externalId, SetUserStateRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling changeUserStateByExternalId1");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserStateByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/state"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Change user state by username
   * Enables or disables a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserStateByUsername(SetUserStateRequest request, String username) throws ApiException {

    changeUserStateByUsernameWithHttpInfo(request, username);
  }

  /**
   * Change user state by username
   * Enables or disables a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserStateByUsernameWithHttpInfo(SetUserStateRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserStateByUsername");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling changeUserStateByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/state"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Change user state by username
   * Enables or disables a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void changeUserStateByUsername1(SetUserStateRequest request, String username) throws ApiException {

    changeUserStateByUsername1WithHttpInfo(request, username);
  }

  /**
   * Change user state by username
   * Enables or disables a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> changeUserStateByUsername1WithHttpInfo(SetUserStateRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling changeUserStateByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling changeUserStateByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/state"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Create a user
   * Creates a new user associated with this distributor
   * @param request Profile and optional external ID of a user to be created (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse create(CreateUserRequest request) throws ApiException {
    return createWithHttpInfo(request).getData();
      }

  /**
   * Create a user
   * Creates a new user associated with this distributor
   * @param request Profile and optional external ID of a user to be created (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> createWithHttpInfo(CreateUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling create");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users";

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
   * Create a user
   * Creates a new user associated with this distributor
   * @param request Profile and optional external ID of a user to be created (required)
   * @return IdResponse
   * @throws ApiException if fails to make API call
   */
  public IdResponse create1(CreateUserRequest request) throws ApiException {
    return create1WithHttpInfo(request).getData();
      }

  /**
   * Create a user
   * Creates a new user associated with this distributor
   * @param request Profile and optional external ID of a user to be created (required)
   * @return ApiResponse&lt;IdResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdResponse> create1WithHttpInfo(CreateUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling create1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users";

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
   * Create password reset token
   * 
   * @param userId userId (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetToken(Long userId) throws ApiException {
    return createPasswordResetTokenWithHttpInfo(userId).getData();
      }

  /**
   * Create password reset token
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetTokenWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createPasswordResetToken");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/actions/create-password-reset-token"
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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create password reset token
   * 
   * @param userId userId (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetToken1(Long userId) throws ApiException {
    return createPasswordResetToken1WithHttpInfo(userId).getData();
      }

  /**
   * Create password reset token
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetToken1WithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createPasswordResetToken1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/actions/create-password-reset-token"
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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create password reset token by external ID
   * 
   * @param externalId externalId (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetTokenByExternalId(String externalId) throws ApiException {
    return createPasswordResetTokenByExternalIdWithHttpInfo(externalId).getData();
      }

  /**
   * Create password reset token by external ID
   * 
   * @param externalId externalId (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetTokenByExternalIdWithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling createPasswordResetTokenByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/actions/create-password-reset-token"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create password reset token by external ID
   * 
   * @param externalId externalId (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetTokenByExternalId1(String externalId) throws ApiException {
    return createPasswordResetTokenByExternalId1WithHttpInfo(externalId).getData();
      }

  /**
   * Create password reset token by external ID
   * 
   * @param externalId externalId (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetTokenByExternalId1WithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling createPasswordResetTokenByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/actions/create-password-reset-token"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create password reset token by username
   * 
   * @param username username (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetTokenByUsername(String username) throws ApiException {
    return createPasswordResetTokenByUsernameWithHttpInfo(username).getData();
      }

  /**
   * Create password reset token by username
   * 
   * @param username username (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetTokenByUsernameWithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createPasswordResetTokenByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/actions/create-password-reset-token"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create password reset token by username
   * 
   * @param username username (required)
   * @return PasswordResetToken
   * @throws ApiException if fails to make API call
   */
  public PasswordResetToken createPasswordResetTokenByUsername1(String username) throws ApiException {
    return createPasswordResetTokenByUsername1WithHttpInfo(username).getData();
      }

  /**
   * Create password reset token by username
   * 
   * @param username username (required)
   * @return ApiResponse&lt;PasswordResetToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PasswordResetToken> createPasswordResetTokenByUsername1WithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling createPasswordResetTokenByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/actions/create-password-reset-token"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<PasswordResetToken> localVarReturnType = new GenericType<PasswordResetToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete user
   * Deletes (marks as deleted) a user with given ID
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser(Long userId) throws ApiException {

    deleteUserWithHttpInfo(userId);
  }

  /**
   * Delete user
   * Deletes (marks as deleted) a user with given ID
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete user
   * Deletes (marks as deleted) a user with given ID
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser1(Long userId) throws ApiException {

    deleteUser1WithHttpInfo(userId);
  }

  /**
   * Delete user
   * Deletes (marks as deleted) a user with given ID
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUser1WithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete user by external ID
   * Deletes (marks as deleted) a user with given external ID
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserByExternalId(String externalId) throws ApiException {

    deleteUserByExternalIdWithHttpInfo(externalId);
  }

  /**
   * Delete user by external ID
   * Deletes (marks as deleted) a user with given external ID
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserByExternalIdWithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling deleteUserByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Delete user by external ID
   * Deletes (marks as deleted) a user with given external ID
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserByExternalId1(String externalId) throws ApiException {

    deleteUserByExternalId1WithHttpInfo(externalId);
  }

  /**
   * Delete user by external ID
   * Deletes (marks as deleted) a user with given external ID
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserByExternalId1WithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling deleteUserByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Delete user by username
   * Deletes (marks as deleted) a user with given username
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserByUsername(String username) throws ApiException {

    deleteUserByUsernameWithHttpInfo(username);
  }

  /**
   * Delete user by username
   * Deletes (marks as deleted) a user with given username
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserByUsernameWithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteUserByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Delete user by username
   * Deletes (marks as deleted) a user with given username
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserByUsername1(String username) throws ApiException {

    deleteUserByUsername1WithHttpInfo(username);
  }

  /**
   * Delete user by username
   * Deletes (marks as deleted) a user with given username
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserByUsername1WithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling deleteUserByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Create token
   * Creates new API or integration token for a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateToken(TokenConfiguration request, Long userId) throws ApiException {
    return generateTokenWithHttpInfo(request, userId).getData();
      }

  /**
   * Create token
   * Creates new API or integration token for a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateTokenWithHttpInfo(TokenConfiguration request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling generateToken");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/tokens"
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
   * Create token
   * Creates new API or integration token for a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateToken1(TokenConfiguration request, Long userId) throws ApiException {
    return generateToken1WithHttpInfo(request, userId).getData();
      }

  /**
   * Create token
   * Creates new API or integration token for a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateToken1WithHttpInfo(TokenConfiguration request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateToken1");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling generateToken1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/tokens"
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
   * Create token by external ID
   * Creates new API, impersonation or integration token for a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateTokenByExternalId(String externalId, TokenConfiguration request) throws ApiException {
    return generateTokenByExternalIdWithHttpInfo(externalId, request).getData();
      }

  /**
   * Create token by external ID
   * Creates new API, impersonation or integration token for a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateTokenByExternalIdWithHttpInfo(String externalId, TokenConfiguration request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling generateTokenByExternalId");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateTokenByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/tokens"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Create token by external ID
   * Creates new API, impersonation or integration token for a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateTokenByExternalId1(String externalId, TokenConfiguration request) throws ApiException {
    return generateTokenByExternalId1WithHttpInfo(externalId, request).getData();
      }

  /**
   * Create token by external ID
   * Creates new API, impersonation or integration token for a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateTokenByExternalId1WithHttpInfo(String externalId, TokenConfiguration request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling generateTokenByExternalId1");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateTokenByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/tokens"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Create token by username
   * Creates new API, impersonation or integration token for a user with given username
   * @param request request (required)
   * @param username username (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateTokenByUsername(TokenConfiguration request, String username) throws ApiException {
    return generateTokenByUsernameWithHttpInfo(request, username).getData();
      }

  /**
   * Create token by username
   * Creates new API, impersonation or integration token for a user with given username
   * @param request request (required)
   * @param username username (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateTokenByUsernameWithHttpInfo(TokenConfiguration request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateTokenByUsername");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling generateTokenByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/tokens"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Create token by username
   * Creates new API, impersonation or integration token for a user with given username
   * @param request request (required)
   * @param username username (required)
   * @return InformationAboutAuthenticationToken
   * @throws ApiException if fails to make API call
   */
  public InformationAboutAuthenticationToken generateTokenByUsername1(TokenConfiguration request, String username) throws ApiException {
    return generateTokenByUsername1WithHttpInfo(request, username).getData();
      }

  /**
   * Create token by username
   * Creates new API, impersonation or integration token for a user with given username
   * @param request request (required)
   * @param username username (required)
   * @return ApiResponse&lt;InformationAboutAuthenticationToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InformationAboutAuthenticationToken> generateTokenByUsername1WithHttpInfo(TokenConfiguration request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling generateTokenByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling generateTokenByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/tokens"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Get users with search, sorting and pagination
   * Gets a list of users managed by this distributor
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param searchString Search string (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return PageUserStat
   * @throws ApiException if fails to make API call
   */
  public PageUserStat getAllUsersPageable(Long offset, Integer page, Boolean paged, Integer pageNumber, Integer pageSize, String searchString, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    return getAllUsersPageableWithHttpInfo(offset, page, paged, pageNumber, pageSize, searchString, size, sortSorted, sortUnsorted, sortDirection).getData();
      }

  /**
   * Get users with search, sorting and pagination
   * Gets a list of users managed by this distributor
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param searchString Search string (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return ApiResponse&lt;PageUserStat&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageUserStat> getAllUsersPageableWithHttpInfo(Long offset, Integer page, Boolean paged, Integer pageNumber, Integer pageSize, String searchString, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getAllUsersPageable");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getAllUsersPageable");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paged", paged));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search-string", searchString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.sorted", sortSorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.unsorted", sortUnsorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<PageUserStat> localVarReturnType = new GenericType<PageUserStat>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get users with search, sorting and pagination
   * Gets a list of users managed by this distributor
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param searchString Search string (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return PageUserStat
   * @throws ApiException if fails to make API call
   */
  public PageUserStat getAllUsersPageable1(Long offset, Integer page, Boolean paged, Integer pageNumber, Integer pageSize, String searchString, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    return getAllUsersPageable1WithHttpInfo(offset, page, paged, pageNumber, pageSize, searchString, size, sortSorted, sortUnsorted, sortDirection).getData();
      }

  /**
   * Get users with search, sorting and pagination
   * Gets a list of users managed by this distributor
   * @param offset Position of the first migration in the list (or null to start from the beginning) (required)
   * @param page [Deprecated] Page number (required)
   * @param paged  (optional)
   * @param pageNumber  (optional)
   * @param pageSize  (optional)
   * @param searchString Search string (optional)
   * @param size Max number of entries to return (AKA page size), null means no paging (optional)
   * @param sortSorted  (optional)
   * @param sortUnsorted  (optional)
   * @param sortDirection Sort Direction (optional)
   * @return ApiResponse&lt;PageUserStat&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageUserStat> getAllUsersPageable1WithHttpInfo(Long offset, Integer page, Boolean paged, Integer pageNumber, Integer pageSize, String searchString, Integer size, Boolean sortSorted, Boolean sortUnsorted, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getAllUsersPageable1");
    }
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling getAllUsersPageable1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paged", paged));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search-string", searchString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.sorted", sortSorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort.unsorted", sortUnsorted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<PageUserStat> localVarReturnType = new GenericType<PageUserStat>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details
   * Gets details of a user with given ID
   * @param userId userId (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(Long userId) throws ApiException {
    return getUserWithHttpInfo(userId).getData();
      }

  /**
   * Get user details
   * Gets details of a user with given ID
   * @param userId userId (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details
   * Gets details of a user with given ID
   * @param userId userId (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser1(Long userId) throws ApiException {
    return getUser1WithHttpInfo(userId).getData();
      }

  /**
   * Get user details
   * Gets details of a user with given ID
   * @param userId userId (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUser1WithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details by external ID
   * Gets details of a user with given external ID
   * @param externalId externalId (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByExternalId(String externalId) throws ApiException {
    return getUserByExternalIdWithHttpInfo(externalId).getData();
      }

  /**
   * Get user details by external ID
   * Gets details of a user with given external ID
   * @param externalId externalId (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserByExternalIdWithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling getUserByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details by external ID
   * Gets details of a user with given external ID
   * @param externalId externalId (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByExternalId1(String externalId) throws ApiException {
    return getUserByExternalId1WithHttpInfo(externalId).getData();
      }

  /**
   * Get user details by external ID
   * Gets details of a user with given external ID
   * @param externalId externalId (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserByExternalId1WithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling getUserByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details by username
   * Gets details of a user with given username
   * @param username username (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByUsername(String username) throws ApiException {
    return getUserByUsernameWithHttpInfo(username).getData();
      }

  /**
   * Get user details by username
   * Gets details of a user with given username
   * @param username username (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserByUsernameWithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user details by username
   * Gets details of a user with given username
   * @param username username (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByUsername1(String username) throws ApiException {
    return getUserByUsername1WithHttpInfo(username).getData();
      }

  /**
   * Get user details by username
   * Gets details of a user with given username
   * @param username username (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserByUsername1WithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all users
   * Gets a list of all users managed by this distributor
   * @return List&lt;UserStat&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UserStat> getUsers() throws ApiException {
    return getUsersWithHttpInfo().getData();
      }

  /**
   * Get all users
   * Gets a list of all users managed by this distributor
   * @return ApiResponse&lt;List&lt;UserStat&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UserStat>> getUsersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users";

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

    GenericType<List<UserStat>> localVarReturnType = new GenericType<List<UserStat>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all users
   * Gets a list of all users managed by this distributor
   * @return List&lt;UserStat&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UserStat> getUsers1() throws ApiException {
    return getUsers1WithHttpInfo().getData();
      }

  /**
   * Get all users
   * Gets a list of all users managed by this distributor
   * @return ApiResponse&lt;List&lt;UserStat&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UserStat>> getUsers1WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users";

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

    GenericType<List<UserStat>> localVarReturnType = new GenericType<List<UserStat>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set/reset password
   * Sends a user with given ID password recovery email
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmail(Long userId) throws ApiException {

    sendPasswordResetEmailWithHttpInfo(userId);
  }

  /**
   * Set/reset password
   * Sends a user with given ID password recovery email
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmailWithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling sendPasswordResetEmail");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/actions/send-password-reset-email"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set/reset password
   * Sends a user with given ID password recovery email
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmail1(Long userId) throws ApiException {

    sendPasswordResetEmail1WithHttpInfo(userId);
  }

  /**
   * Set/reset password
   * Sends a user with given ID password recovery email
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmail1WithHttpInfo(Long userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling sendPasswordResetEmail1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/actions/send-password-reset-email"
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


    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set/reset password by external ID
   * Sends a user with given external ID password recovery email
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmailByExternalId(String externalId) throws ApiException {

    sendPasswordResetEmailByExternalIdWithHttpInfo(externalId);
  }

  /**
   * Set/reset password by external ID
   * Sends a user with given external ID password recovery email
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmailByExternalIdWithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling sendPasswordResetEmailByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/actions/send-password-reset-email"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Set/reset password by external ID
   * Sends a user with given external ID password recovery email
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmailByExternalId1(String externalId) throws ApiException {

    sendPasswordResetEmailByExternalId1WithHttpInfo(externalId);
  }

  /**
   * Set/reset password by external ID
   * Sends a user with given external ID password recovery email
   * @param externalId externalId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmailByExternalId1WithHttpInfo(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling sendPasswordResetEmailByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/actions/send-password-reset-email"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Set/reset password by username
   * Sends a user with given username password recovery email
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmailByUsername(String username) throws ApiException {

    sendPasswordResetEmailByUsernameWithHttpInfo(username);
  }

  /**
   * Set/reset password by username
   * Sends a user with given username password recovery email
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmailByUsernameWithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling sendPasswordResetEmailByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/actions/send-password-reset-email"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Set/reset password by username
   * Sends a user with given username password recovery email
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void sendPasswordResetEmailByUsername1(String username) throws ApiException {

    sendPasswordResetEmailByUsername1WithHttpInfo(username);
  }

  /**
   * Set/reset password by username
   * Sends a user with given username password recovery email
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> sendPasswordResetEmailByUsername1WithHttpInfo(String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling sendPasswordResetEmailByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/actions/send-password-reset-email"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Set custom user limits by partner
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimits(SetLimitsRequest request, Long userId) throws ApiException {

    setLimitsWithHttpInfo(request, userId);
  }

  /**
   * Set custom user limits by partner
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimitsWithHttpInfo(SetLimitsRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimits");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setLimits");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/limits"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set custom user limits by partner
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimits1(SetLimitsRequest request, Long userId) throws ApiException {

    setLimits1WithHttpInfo(request, userId);
  }

  /**
   * Set custom user limits by partner
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimits1WithHttpInfo(SetLimitsRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimits1");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setLimits1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/limits"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * setLimitsByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimitsByExternalId(String externalId, SetLimitsRequest request) throws ApiException {

    setLimitsByExternalIdWithHttpInfo(externalId, request);
  }

  /**
   * setLimitsByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimitsByExternalIdWithHttpInfo(String externalId, SetLimitsRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling setLimitsByExternalId");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimitsByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/limits"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * setLimitsByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimitsByExternalId1(String externalId, SetLimitsRequest request) throws ApiException {

    setLimitsByExternalId1WithHttpInfo(externalId, request);
  }

  /**
   * setLimitsByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimitsByExternalId1WithHttpInfo(String externalId, SetLimitsRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling setLimitsByExternalId1");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimitsByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/limits"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * setLimitsByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimitsByUsername(SetLimitsRequest request, String username) throws ApiException {

    setLimitsByUsernameWithHttpInfo(request, username);
  }

  /**
   * setLimitsByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimitsByUsernameWithHttpInfo(SetLimitsRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimitsByUsername");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling setLimitsByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/limits"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * setLimitsByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void setLimitsByUsername1(SetLimitsRequest request, String username) throws ApiException {

    setLimitsByUsername1WithHttpInfo(request, username);
  }

  /**
   * setLimitsByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setLimitsByUsername1WithHttpInfo(SetLimitsRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setLimitsByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling setLimitsByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/limits"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * setRoles
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void setRoles(SetRolesRequest request, Long userId) throws ApiException {

    setRolesWithHttpInfo(request, userId);
  }

  /**
   * setRoles
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRolesWithHttpInfo(SetRolesRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRoles");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setRoles");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}/roles"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * setRoles
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void setRoles1(SetRolesRequest request, Long userId) throws ApiException {

    setRoles1WithHttpInfo(request, userId);
  }

  /**
   * setRoles
   * 
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRoles1WithHttpInfo(SetRolesRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRoles1");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setRoles1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}/roles"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * setRolesByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void setRolesByExternalId(String externalId, SetRolesRequest request) throws ApiException {

    setRolesByExternalIdWithHttpInfo(externalId, request);
  }

  /**
   * setRolesByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRolesByExternalIdWithHttpInfo(String externalId, SetRolesRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling setRolesByExternalId");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRolesByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}/roles"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * setRolesByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void setRolesByExternalId1(String externalId, SetRolesRequest request) throws ApiException {

    setRolesByExternalId1WithHttpInfo(externalId, request);
  }

  /**
   * setRolesByExternalId
   * 
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRolesByExternalId1WithHttpInfo(String externalId, SetRolesRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling setRolesByExternalId1");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRolesByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}/roles"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * setRolesByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void setRolesByUsername(SetRolesRequest request, String username) throws ApiException {

    setRolesByUsernameWithHttpInfo(request, username);
  }

  /**
   * setRolesByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRolesByUsernameWithHttpInfo(SetRolesRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRolesByUsername");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling setRolesByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}/roles"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * setRolesByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void setRolesByUsername1(SetRolesRequest request, String username) throws ApiException {

    setRolesByUsername1WithHttpInfo(request, username);
  }

  /**
   * setRolesByUsername
   * 
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setRolesByUsername1WithHttpInfo(SetRolesRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling setRolesByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling setRolesByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}/roles"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Update profile
   * Updates profile with a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUser(UpdateUserRequest request, Long userId) throws ApiException {

    updateUserWithHttpInfo(request, userId);
  }

  /**
   * Update profile
   * Updates profile with a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUserWithHttpInfo(UpdateUserRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/{userId}"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update profile
   * Updates profile with a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUser1(UpdateUserRequest request, Long userId) throws ApiException {

    updateUser1WithHttpInfo(request, userId);
  }

  /**
   * Update profile
   * Updates profile with a user with given ID
   * @param request request (required)
   * @param userId userId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUser1WithHttpInfo(UpdateUserRequest request, Long userId) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUser1");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/{userId}"
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


    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update profile by external ID
   * Updates profile with a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserByExternalId(String externalId, UpdateUserRequest request) throws ApiException {

    updateUserByExternalIdWithHttpInfo(externalId, request);
  }

  /**
   * Update profile by external ID
   * Updates profile with a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUserByExternalIdWithHttpInfo(String externalId, UpdateUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling updateUserByExternalId");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUserByExternalId");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Update profile by external ID
   * Updates profile with a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserByExternalId1(String externalId, UpdateUserRequest request) throws ApiException {

    updateUserByExternalId1WithHttpInfo(externalId, request);
  }

  /**
   * Update profile by external ID
   * Updates profile with a user with given external ID
   * @param externalId externalId (required)
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUserByExternalId1WithHttpInfo(String externalId, UpdateUserRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling updateUserByExternalId1");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUserByExternalId1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/external/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

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
   * Update profile by username
   * Updates profile with a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserByUsername(UpdateUserRequest request, String username) throws ApiException {

    updateUserByUsernameWithHttpInfo(request, username);
  }

  /**
   * Update profile by username
   * Updates profile with a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUserByUsernameWithHttpInfo(UpdateUserRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUserByUsername");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateUserByUsername");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
   * Update profile by username
   * Updates profile with a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserByUsername1(UpdateUserRequest request, String username) throws ApiException {

    updateUserByUsername1WithHttpInfo(request, username);
  }

  /**
   * Update profile by username
   * Updates profile with a user with given username
   * @param request request (required)
   * @param username username (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateUserByUsername1WithHttpInfo(UpdateUserRequest request, String username) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling updateUserByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling updateUserByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/users/username/{username}"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
