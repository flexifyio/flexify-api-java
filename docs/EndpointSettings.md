
# EndpointSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credential** | **String** | Storage Credential (Secret Key) |  [optional]
**identity** | **String** | Storage Identity (Access Key) |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Storage Protocol |  [optional]
**publicAccessReadAllBlobs** | **Boolean** | Public read access for all objects in virtual buckets |  [optional]
**selectionBreakTimeout** | **Long** | Timeout before canceling rqeusts to non-responing clouds in FASTEST selection policy |  [optional]
**selectionPolicy** | [**SelectionPolicyEnum**](#SelectionPolicyEnum) | Storage selection policy for GET/HEAD object requests |  [optional]


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
AZURE | &quot;AZURE&quot;
B2 | &quot;B2&quot;
DROPBOX | &quot;DROPBOX&quot;
DROPBOX_TEAM | &quot;DROPBOX_TEAM&quot;
S3 | &quot;S3&quot;


<a name="SelectionPolicyEnum"></a>
## Enum: SelectionPolicyEnum
Name | Value
---- | -----
FASTEST | &quot;FASTEST&quot;
NEWEST | &quot;NEWEST&quot;



