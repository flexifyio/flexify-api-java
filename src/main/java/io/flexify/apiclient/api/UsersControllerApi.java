package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.handler.ApiClient;
import io.flexify.apiclient.handler.Configuration;
import io.flexify.apiclient.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.flexify.apiclient.model.RequestResetPasswordReqeust;
import io.flexify.apiclient.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-19T00:30:02.233+08:00")
public class UsersControllerApi {
  private ApiClient apiClient;

  public UsersControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get details of user correponsing to provided auth token
   * 
   * @param contextPath  (optional)
   * @param localeISO3Country  (optional)
   * @param localeISO3Language  (optional)
   * @param localeCountry  (optional)
   * @param localeDisplayCountry  (optional)
   * @param localeDisplayLanguage  (optional)
   * @param localeDisplayName  (optional)
   * @param localeDisplayScript  (optional)
   * @param localeDisplayVariant  (optional)
   * @param localeLanguage  (optional)
   * @param localeScript  (optional)
   * @param localeUnicodeLocaleAttributes  (optional)
   * @param localeUnicodeLocaleKeys  (optional)
   * @param localeVariant  (optional)
   * @param remoteUser  (optional)
   * @param secure  (optional)
   * @param userPrincipalName  (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getCurrentUser(String contextPath, String localeISO3Country, String localeISO3Language, String localeCountry, String localeDisplayCountry, String localeDisplayLanguage, String localeDisplayName, String localeDisplayScript, String localeDisplayVariant, String localeLanguage, String localeScript, List<String> localeUnicodeLocaleAttributes, List<String> localeUnicodeLocaleKeys, String localeVariant, String remoteUser, Boolean secure, String userPrincipalName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rest/user/current";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contextPath", contextPath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.ISO3Country", localeISO3Country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.ISO3Language", localeISO3Language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.country", localeCountry));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.displayCountry", localeDisplayCountry));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.displayLanguage", localeDisplayLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.displayName", localeDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.displayScript", localeDisplayScript));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.displayVariant", localeDisplayVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.language", localeLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.script", localeScript));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "locale.unicodeLocaleAttributes", localeUnicodeLocaleAttributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "locale.unicodeLocaleKeys", localeUnicodeLocaleKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale.variant", localeVariant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "remoteUser", remoteUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secure", secure));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userPrincipal.name", userPrincipalName));

    
    
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
   * requestResetPassword
   * 
   * @param reqeust reqeust (required)
   * @throws ApiException if fails to make API call
   */
  public void requestResetPassword(RequestResetPasswordReqeust reqeust) throws ApiException {
    Object localVarPostBody = reqeust;
    
    // verify the required parameter 'reqeust' is set
    if (reqeust == null) {
      throw new ApiException(400, "Missing the required parameter 'reqeust' when calling requestResetPassword");
    }
    
    // create path and map variables
    String localVarPath = "/rest/user/request-reset-password";

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
}
