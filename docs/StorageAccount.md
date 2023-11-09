
# StorageAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Id of the storage account |  [optional]
**isSas** | **Boolean** | For Azure - if credential is SAS signature (not included if storing in key vault) |  [optional]
**keyVaultSecretId** | **String** | Key Vault secret ID where this credential secret is stored (only for admins) |  [optional]
**oauthProviderId** | [**OauthProviderIdEnum**](#OauthProviderIdEnum) | OAuth provider if the storage account is using OAuth, or null otherwise |  [optional]
**privateUrl** | **String** | URL used by engines to access the cloud |  [optional]
**provider** | [**StorageProvider**](StorageProvider.md) | Link to the storage provider (Amazon, Azure, etc) |  [optional]
**secretInKeyVault** | **Boolean** | If secret credential is stored in Key Vault |  [optional]
**settings** | [**StorageAccountSettingsRes**](StorageAccountSettingsRes.md) | Configuration of this storage account |  [optional]
**stat** | [**StorageAccountStat**](StorageAccountStat.md) | Storage account state and statistics |  [optional]
**url** | **String** | URL to the cloud |  [optional]


<a name="OauthProviderIdEnum"></a>
## Enum: OauthProviderIdEnum
Name | Value
---- | -----
DROPBOX | &quot;DROPBOX&quot;
DROPBOX_TEAM | &quot;DROPBOX_TEAM&quot;
MICROSOFT | &quot;MICROSOFT&quot;



