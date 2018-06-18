package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.PaymentOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-18T17:03:35.898+03:00")
public class PaymentControllerApi {
  private ApiClient apiClient;

  public PaymentControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentControllerApi(ApiClient apiClient) {
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
   * @param currency currency (required)
   * @param amount amount (required)
   * @return PaymentOptions
   * @throws ApiException if fails to make API call
   */
  public PaymentOptions getPaymentOptions(String currency, Double amount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
      throw new ApiException(400, "Missing the required parameter 'currency' when calling getPaymentOptions");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling getPaymentOptions");
    }
    
    // create path and map variables
    String localVarPath = "/rest/pay/paddle/options";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));

    
    
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
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/pay/paddle/webhook";

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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
