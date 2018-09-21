
# EndpointStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudDownloadBytes** | **Long** |  |  [optional]
**cloudUploadBytes** | **Long** |  |  [optional]
**errorEngines** | **Long** |  |  [optional]
**health** | [**HealthEnum**](#HealthEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
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
HEALTHY | &quot;HEALTHY&quot;
WARNING | &quot;WARNING&quot;
ERROR | &quot;ERROR&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLING | &quot;ENABLING&quot;
ENABLED | &quot;ENABLED&quot;
ERROR | &quot;ERROR&quot;
WARNING | &quot;WARNING&quot;
NOT_ASSIGNED | &quot;NOT_ASSIGNED&quot;
DISABLING | &quot;DISABLING&quot;
DISABLED | &quot;DISABLED&quot;
UPDATING | &quot;UPDATING&quot;
DELETING | &quot;DELETING&quot;



