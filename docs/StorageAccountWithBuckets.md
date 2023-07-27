
# StorageAccountWithBuckets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | Buckets that we have cached for this storage account |  [optional]
**id** | **Long** | Id of the storage account |  [optional]
**isSas** | **Boolean** | For Azure - if credential is SAS signature (not included if storing in key vault) |  [optional]
**keyVaultSecretId** | **String** | Key Vault secret ID where this credential secret is stored (only for admins) |  [optional]
**privateUrl** | **String** | URL used by engines to access the cloud |  [optional]
**provider** | [**StorageProvider**](StorageProvider.md) | Link to the storage provider (Amazon, Azure, etc) |  [optional]
**secretInKeyVault** | **Boolean** | If secret credential is stored in Key Vault |  [optional]
**settings** | [**StorageAccountSettingsRes**](StorageAccountSettingsRes.md) | Configuration of this storage account |  [optional]
**stat** | [**StorageAccountStat**](StorageAccountStat.md) | Storage account state and statistics |  [optional]
**url** | **String** | URL to the cloud |  [optional]



