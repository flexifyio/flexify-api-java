package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.SignupCodeReq;
import io.flexify.apiclient.model.SignupCodeRes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PartnerSignUpCodesControllerApi {
  private ApiClient apiClient;

  public PartnerSignUpCodesControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PartnerSignUpCodesControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createCode
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void createCode(SignupCodeReq request) throws ApiException {

    createCodeWithHttpInfo(request);
  }

  /**
   * createCode
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createCodeWithHttpInfo(SignupCodeReq request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createCode");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/codes";

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
   * createCode
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public void createCode1(SignupCodeReq request) throws ApiException {

    createCode1WithHttpInfo(request);
  }

  /**
   * createCode
   * 
   * @param request request (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createCode1WithHttpInfo(SignupCodeReq request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createCode1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/codes";

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
   * deleteCode
   * 
   * @param code code (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCode(String code) throws ApiException {

    deleteCodeWithHttpInfo(code);
  }

  /**
   * deleteCode
   * 
   * @param code code (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCodeWithHttpInfo(String code) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling deleteCode");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/codes/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
   * deleteCode
   * 
   * @param code code (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCode1(String code) throws ApiException {

    deleteCode1WithHttpInfo(code);
  }

  /**
   * deleteCode
   * 
   * @param code code (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteCode1WithHttpInfo(String code) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling deleteCode1");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/codes/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
   * getAll
   * 
   * @return List&lt;SignupCodeRes&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SignupCodeRes> getAll1() throws ApiException {
    return getAll1WithHttpInfo().getData();
      }

  /**
   * getAll
   * 
   * @return ApiResponse&lt;List&lt;SignupCodeRes&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SignupCodeRes>> getAll1WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/distributor/codes";

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

    GenericType<List<SignupCodeRes>> localVarReturnType = new GenericType<List<SignupCodeRes>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAll
   * 
   * @return List&lt;SignupCodeRes&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SignupCodeRes> getAll2() throws ApiException {
    return getAll2WithHttpInfo().getData();
      }

  /**
   * getAll
   * 
   * @return ApiResponse&lt;List&lt;SignupCodeRes&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SignupCodeRes>> getAll2WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/codes";

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

    GenericType<List<SignupCodeRes>> localVarReturnType = new GenericType<List<SignupCodeRes>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
