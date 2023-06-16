
# EndpointSettingsRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity** | **String** | Storage Identity (Access Key) |  [optional]
**name** | **String** | User-define name of the endpoint |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Storage Protocol |  [optional]
**selectionBreakTimeout** | **Long** | Timeout before canceling requests to non-responding clouds in FASTEST selection policy |  [optional]
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
PRIORITY | &quot;PRIORITY&quot;



