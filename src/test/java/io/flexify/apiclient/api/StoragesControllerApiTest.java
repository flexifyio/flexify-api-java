/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.7-SNAPSHOT
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.api;

import io.flexify.apiclient.handler.ApiException;
import io.flexify.apiclient.model.BucketsRequest;
import io.flexify.apiclient.model.IdsList;
import io.flexify.apiclient.model.StorageProvider;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoragesControllerApi
 */
@Ignore
public class StoragesControllerApiTest {

    private final StoragesControllerApi api = new StoragesControllerApi();

    
    /**
     * Add buckets to the storage account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBucketsTest() throws ApiException {
        BucketsRequest request = null;
        Long storageAccountId = null;
        IdsList response = api.addBuckets(request, storageAccountId);

        // TODO: test validations
    }
    
    /**
     * Deletes (hides) a bucket/container
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBucketTest() throws ApiException {
        Long bucketId = null;
        Long storageAccountId = null;
        Boolean forceDetach = null;
        api.deleteBucket(bucketId, storageAccountId, forceDetach);

        // TODO: test validations
    }
    
    /**
     * Deletes (hides) multiple buckets/containers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBucketsTest() throws ApiException {
        IdsList request = null;
        Boolean forceDetach = null;
        api.deleteBuckets(request, forceDetach);

        // TODO: test validations
    }
    
    /**
     * Get all storage providers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProvidersTest() throws ApiException {
        List<StorageProvider> response = api.getProviders();

        // TODO: test validations
    }
    
    /**
     * Refresh statistics of a single bucket
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshBucketTest() throws ApiException {
        Long bucketId = null;
        Long storageAccountId = null;
        api.refreshBucket(bucketId, storageAccountId);

        // TODO: test validations
    }
    
    /**
     * Refresh statistics of multiple buckets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshBucketsTest() throws ApiException {
        IdsList request = null;
        api.refreshBuckets(request);

        // TODO: test validations
    }
    
}
