
# Mapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destBucket** | [**Bucket**](Bucket.md) | Destination bucket/container | 
**destBucketNewRegion** | **String** | Region where bucket should be created if missing |  [optional]
**destStorageAccount** | [**StorageAccount**](StorageAccount.md) | Destination storage account | 
**id** | **Long** | ID of this mapping | 
**keyAddPrefix** | **String** | Prefix added to each object key |  [optional]
**keyRemovePrefix** | **String** | Prefix removed from each object key |  [optional]
**objectsListUri** | **String** | URI of a text file with a list of objects to migrate |  [optional]
**slots** | [**List&lt;Slot&gt;**](Slot.md) | Slots that this mapping is split into | 
**sourceBucket** | [**Bucket**](Bucket.md) | Source bucket/container | 
**sourceStorageAccount** | [**StorageAccount**](StorageAccount.md) | Source storage account | 
**stat** | [**MappingStat**](MappingStat.md) | Cumulative statistics of this mapping | 



