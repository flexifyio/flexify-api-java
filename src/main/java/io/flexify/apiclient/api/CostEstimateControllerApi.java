package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.ApiResponse;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.AddMigrationRequest;
import io.flexify.apiclient.model.DtoMigrationCostEstimate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CostEstimateControllerApi {
  private ApiClient apiClient;

  public CostEstimateControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CostEstimateControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * estimateMigrationCost
   * 
   * @param migrationRequest migrationRequest (required)
   * @return DtoMigrationCostEstimate
   * @throws ApiException if fails to make API call
   */
  public DtoMigrationCostEstimate estimateMigrationCost(AddMigrationRequest migrationRequest) throws ApiException {
    return estimateMigrationCostWithHttpInfo(migrationRequest).getData();
      }

  /**
   * estimateMigrationCost
   * 
   * @param migrationRequest migrationRequest (required)
   * @return ApiResponse&lt;DtoMigrationCostEstimate&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DtoMigrationCostEstimate> estimateMigrationCostWithHttpInfo(AddMigrationRequest migrationRequest) throws ApiException {
    Object localVarPostBody = migrationRequest;
    
    // verify the required parameter 'migrationRequest' is set
    if (migrationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'migrationRequest' when calling estimateMigrationCost");
    }
    
    // create path and map variables
    String localVarPath = "/backend/rest/cost/migration";

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

    GenericType<DtoMigrationCostEstimate> localVarReturnType = new GenericType<DtoMigrationCostEstimate>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
