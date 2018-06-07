
# AddStorageAccountWithBucketsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | Lists of buckets |  [optional]
**endpointId** | **Long** | ID of the user endpoint to add storages to. Do not set the value if you want to attach storages to the endpoint later |  [optional]
**storageAccount** | [**StorageAccount**](StorageAccount.md) | Storage Account. If storage account id is NULL new storage account will be created with given list of buckets |  [optional]



