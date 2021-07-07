
# AddMigrationRequestMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destBucketName** | **String** | Name of source destination or container | 
**destBucketNewRegion** | **String** | Region where the destination bucket will be created if it does not exist. null to use cloud&#39;s default region |  [optional]
**destStorageAccountId** | **Long** | ID of source destination account | 
**keyAddPrefix** | **String** | Prefix to to be added to each key when migrating |  [optional]
**keyRemovePrefix** | **String** | Prefix to to be removed from each key when migrating |  [optional]
**objectsListUri** | **String** | A URI of a text file to take objects list from |  [optional]
**sourceBucketName** | **String** | Name of source bucket or container | 
**sourceStorageAccountId** | **Long** | ID of source storage account | 



