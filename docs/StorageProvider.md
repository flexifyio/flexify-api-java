
# StorageProvider

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabledAsDestination** | **Boolean** | Storage is not allowed to be used as a default storage in endpoint or as a migration destination) |  [optional]
**endpoint** | **String** | Endpoint to access this provider or null for custom providers |  [optional]
**id** | **Long** | Id of the provider in the system |  [optional]
**name** | **String** | Name of the provider |  [optional]
**productName** | **String** | Name of product/region for this provider |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Storage protocol this provider uses |  [optional]


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
S3 | &quot;S3&quot;
AZURE | &quot;AZURE&quot;
GOOGLE | &quot;GOOGLE&quot;
OPENSTACK | &quot;OPENSTACK&quot;
RACKSPACE | &quot;RACKSPACE&quot;



