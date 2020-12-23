
# AddStorageAccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeBuckets** | **List&lt;String&gt;** | Lists of buckets to start monitoring, or null to request buckets from the cloud |  [optional]
**refreshNow** | **Boolean** | If set to true, buckets will be refreshed after storage is added |  [optional]
**storageAccount** | [**NewStorageAccount**](NewStorageAccount.md) | Storage account to create |  [optional]
**verify** | **Boolean** | Specified if credentials or public access to included buckets should be checked |  [optional]



