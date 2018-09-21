/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.6
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.BillingAccountWithMoney;
import io.flexify.apiclient.model.CostDetails;
import io.flexify.apiclient.model.Payment;
import io.flexify.apiclient.model.PaymentAddRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistributorBillingAccountsControllerApi
 */
@Ignore
public class DistributorBillingAccountsControllerApiTest {

    private final DistributorBillingAccountsControllerApi api = new DistributorBillingAccountsControllerApi();

    
    /**
     * activateAccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateAccountTest() throws ApiException {
        Long accountId = null;
        api.activateAccount(accountId);

        // TODO: test validations
    }
    
    /**
     * addPayment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPaymentTest() throws ApiException {
        Long accountId = null;
        PaymentAddRequest paymentRequest = null;
        api.addPayment(accountId, paymentRequest);

        // TODO: test validations
    }
    
    /**
     * getCosts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCostsTest() throws ApiException {
        Long accountId = null;
        List<CostDetails> response = api.getCosts(accountId);

        // TODO: test validations
    }
    
    /**
     * getDetails
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        Long accountId = null;
        BillingAccountWithMoney response = api.getDetails(accountId);

        // TODO: test validations
    }
    
    /**
     * getPayments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentsTest() throws ApiException {
        Long accountId = null;
        List<Payment> response = api.getPayments(accountId);

        // TODO: test validations
    }
    
    /**
     * suspendAccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void suspendAccountTest() throws ApiException {
        Long accountId = null;
        api.suspendAccount(accountId);

        // TODO: test validations
    }
    
}
