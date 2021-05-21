package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.Organization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PartnerOrganizationsControllerApi {
  private ApiClient apiClient;

  public PartnerOrganizationsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PartnerOrganizationsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAll
   * 
   * @return List&lt;Organization&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Organization> getAll() throws ApiException {
    return getAllWithHttpInfo().getData();
      }

  /**
   * getAll
   * 
   * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Organization>> getAllWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/partner/organizations";

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

    GenericType<List<Organization>> localVarReturnType = new GenericType<List<Organization>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
