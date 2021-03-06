
# StorageProvider

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canCreateBucketsWithUppercase** | **Boolean** | Indicates that this provider allow creating bucket with uppercase in names |  [optional]
**code** | **String** | Code of this cloud provider |  [optional]
**defaultRegion** | **String** | Default region for this provider |  [optional]
**disabledAsDestination** | **Boolean** | Storage is not allowed to be used as a default storage in endpoint or as a migration destination) |  [optional]
**dotEncode** | **String** | Indicates that the provider does not support dots in bucket names and how dots should be encoded |  [optional]
**endpoint** | **String** | Endpoint to access this provider or null for custom providers |  [optional]
**id** | **Long** | Id of the provider in the system |  [optional]
**maxUploadSize** | **Long** | Maximum size of a single upload w/o multipart |  [optional]
**multiRegional** | **Boolean** | This cloud provider supports multiple regions |  [optional]
**name** | **String** | Name of the provider |  [optional]
**portHttp** | **Integer** | Port for HTTP request (null for default 80) |  [optional]
**portHttps** | **Integer** | Port for HTTPS request (null for default 443) |  [optional]
**productName** | **String** | Name of product/region for this provider |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Storage protocol this provider uses |  [optional]
**regions** | **List&lt;String&gt;** | List of regions supported for this provider (or null if regions are not supported |  [optional]
**supportsHttp** | **Boolean** | Indicates that HTTP is supported |  [optional]
**supportsHttps** | **Boolean** | Indicates that HTTPS (SSL) is supported |  [optional]
**supportsMultipartUpload** | **Boolean** | Indicates that the provider supports multipart upload |  [optional]
**supportsOAuth** | **Boolean** | If the provider supports OAuth (instead of storage keys) |  [optional]


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
AZURE | &quot;AZURE&quot;
B2 | &quot;B2&quot;
DROPBOX | &quot;DROPBOX&quot;
DROPBOX_TEAM | &quot;DROPBOX_TEAM&quot;
S3 | &quot;S3&quot;



