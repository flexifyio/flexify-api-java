
# EndpointStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudDownloadBytes** | **Long** |  |  [optional]
**cloudUploadBytes** | **Long** |  |  [optional]
**errorEngines** | **Long** |  |  [optional]
**health** | [**HealthEnum**](#HealthEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**stateUpdateRequested** | **Boolean** |  |  [optional]
**totalEngines** | **Long** |  |  [optional]
**upToDateEngines** | **Long** |  |  [optional]
**userDownloadBytes** | **Long** |  |  [optional]
**userSpeedDownload** | **Long** |  |  [optional]
**userSpeedUpload** | **Long** |  |  [optional]
**userUploadBytes** | **Long** |  |  [optional]
**warningEngines** | **Long** |  |  [optional]


<a name="HealthEnum"></a>
## Enum: HealthEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
HEALTHY | &quot;HEALTHY&quot;
WARNING | &quot;WARNING&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
DELETING | &quot;DELETING&quot;
DISABLED | &quot;DISABLED&quot;
DISABLING | &quot;DISABLING&quot;
ENABLED | &quot;ENABLED&quot;
ENABLING | &quot;ENABLING&quot;
ERROR | &quot;ERROR&quot;
NOT_ASSIGNED | &quot;NOT_ASSIGNED&quot;
UPDATING | &quot;UPDATING&quot;
WARNING | &quot;WARNING&quot;



