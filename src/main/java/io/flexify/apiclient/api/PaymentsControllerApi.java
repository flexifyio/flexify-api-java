package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.PaymentOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PaymentsControllerApi {
  private ApiClient apiClient;

  public PaymentsControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getPaymentOptions
   * 
   * @param amount amount (required)
   * @param currency currency (required)
   * @return PaymentOptions
   * @throws ApiException if fails to make API call
   */
  public PaymentOptions getPaymentOptions(Double amount, String currency) throws ApiException {
    return getPaymentOptionsWithHttpInfo(amount, currency).getData();
      }

  /**
   * getPaymentOptions
   * 
   * @param amount amount (required)
   * @param currency currency (required)
   * @return ApiResponse&lt;PaymentOptions&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PaymentOptions> getPaymentOptionsWithHttpInfo(Double amount, String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling getPaymentOptions");
    }
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
      throw new ApiException(400, "Missing the required parameter 'currency' when calling getPaymentOptions");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/pay/paddle/options";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<PaymentOptions> localVarReturnType = new GenericType<PaymentOptions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * paymentFulfilled
   * 
   * @throws ApiException if fails to make API call
   */
  public void paymentFulfilled() throws ApiException {

    paymentFulfilledWithHttpInfo();
  }

  /**
   * paymentFulfilled
   * 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> paymentFulfilledWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/backend/rest/pay/paddle/webhook";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
