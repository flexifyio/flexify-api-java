
# AddStorageAccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageAccount** | [**NewStorageAccount**](NewStorageAccount.md) | Storage account to create |  [optional]
**includeBuckets** | **List&lt;String&gt;** | Lists of buckets to start monitoring |  [optional]
**endpointId** | **Long** | ID of the user endpoint to add storages to. Do not set the value if you want to attach storages to the endpoint later |  [optional]
**putObjects** | **Boolean** | Specifies if new data should be stored to added storages |  [optional]
**verifyKeys** | **Boolean** | If set to true, storage account keys will be verified before adding storage |  [optional]
**refresh** | **Boolean** | If set to true, buckets will be refreshed after storage is added |  [optional]



