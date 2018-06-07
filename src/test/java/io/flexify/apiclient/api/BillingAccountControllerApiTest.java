/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.4.0-SNAPSHOT
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.BillingAccountWithMoney;
import io.flexify.apiclient.model.CostData;
import io.flexify.apiclient.model.Payment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingAccountControllerApi
 */
@Ignore
public class BillingAccountControllerApiTest {

    private final BillingAccountControllerApi api = new BillingAccountControllerApi();

    
    /**
     * getCostsForCurrentUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCostsForCurrentUserUsingGETTest() throws ApiException {
        List<CostData> response = api.getCostsForCurrentUserUsingGET();

        // TODO: test validations
    }
    
    /**
     * getCurrentUserBillingAccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserBillingAccountUsingGETTest() throws ApiException {
        BillingAccountWithMoney response = api.getCurrentUserBillingAccountUsingGET();

        // TODO: test validations
    }
    
    /**
     * getPaymentsForCurrentUser
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentsForCurrentUserUsingGETTest() throws ApiException {
        List<Payment> response = api.getPaymentsForCurrentUserUsingGET();

        // TODO: test validations
    }
    
}
