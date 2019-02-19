
# EndpointSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credential** | **String** | Storage Credential (Secret Key) |  [optional]
**identity** | **String** | Storage Identity (Access Key) |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Storage Protocol |  [optional]
**publicAccessReadAllBlobs** | **Boolean** | Public read access for all objects |  [optional]


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
S3 | &quot;S3&quot;
AZURE | &quot;AZURE&quot;
GOOGLE | &quot;GOOGLE&quot;
OPENSTACK | &quot;OPENSTACK&quot;
RACKSPACE | &quot;RACKSPACE&quot;



