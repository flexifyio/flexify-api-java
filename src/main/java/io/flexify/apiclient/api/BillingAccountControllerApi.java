package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.BillingAccount;
import io.flexify.apiclient.model.CostDetails;
import io.flexify.apiclient.model.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BillingAccountControllerApi {
  private ApiClient apiClient;

  public BillingAccountControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingAccountControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get costs for current user
   * 
   * @return List&lt;CostDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CostDetails> getCostsForCurrentUserBillingAccount() throws ApiException {
    return getCostsForCurrentUserBillingAccountWithHttpInfo().getData();
      }

  /**
   * Get costs for current user
   * 
   * @return ApiResponse&lt;List&lt;CostDetails&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CostDetails>> getCostsForCurrentUserBillingAccountWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/account/costs";

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

    GenericType<List<CostDetails>> localVarReturnType = new GenericType<List<CostDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get billing account for current user
   * 
   * @return BillingAccount
   * @throws ApiException if fails to make API call
   */
  public BillingAccount getCurrentUserBillingAccount() throws ApiException {
    return getCurrentUserBillingAccountWithHttpInfo().getData();
      }

  /**
   * Get billing account for current user
   * 
   * @return ApiResponse&lt;BillingAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BillingAccount> getCurrentUserBillingAccountWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/account";

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

    GenericType<BillingAccount> localVarReturnType = new GenericType<BillingAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get payments for current user
   * 
   * @return List&lt;Payment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Payment> getPaymentsForCurrentUser() throws ApiException {
    return getPaymentsForCurrentUserWithHttpInfo().getData();
      }

  /**
   * Get payments for current user
   * 
   * @return ApiResponse&lt;List&lt;Payment&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Payment>> getPaymentsForCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/account/payments";

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

    GenericType<List<Payment>> localVarReturnType = new GenericType<List<Payment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
