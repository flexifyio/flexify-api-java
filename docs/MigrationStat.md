
# MigrationStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytesFailed** | **Long** |  |  [optional]
**bytesInSource** | **Long** |  |  [optional]
**bytesProcessed** | **Long** |  |  [optional]
**bytesRemovedFromDestination** | **Long** |  |  [optional]
**bytesSkipped** | **Long** |  |  [optional]
**bytesUploaded** | **Long** |  |  [optional]
**created** | [**DateTime**](DateTime.md) | Creation time |  [optional]
**engines** | **Integer** | Number of active engines |  [optional]
**estimated** | [**DateTime**](DateTime.md) | Estimated time |  [optional]
**finished** | [**DateTime**](DateTime.md) | Finished time |  [optional]
**objectsFailed** | **Long** |  |  [optional]
**objectsInSource** | **Long** |  |  [optional]
**objectsProcessed** | **Long** |  |  [optional]
**objectsRemovedFromDestination** | **Long** |  |  [optional]
**objectsSkipped** | **Long** |  |  [optional]
**objectsUploaded** | **Long** |  |  [optional]
**processingObjectsPerSecond** | **Double** |  |  [optional]
**progress** | **Double** | Progress in percents |  [optional]
**retried** | **Long** |  |  [optional]
**slots** | [**List&lt;MigrationSlotStat&gt;**](MigrationSlotStat.md) | Migration&#39;s slots statistics |  [optional]
**state** | [**StateEnum**](#StateEnum) | Migration state |  [optional]
**step** | [**StepEnum**](#StepEnum) | Migration step |  [optional]
**uploadingBytesPerSecond** | **Double** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NOT_ASSIGNED | &quot;NOT_ASSIGNED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
IN_PROGRESS_CANCELING | &quot;IN_PROGRESS_CANCELING&quot;
CANCELED | &quot;CANCELED&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
FAILED | &quot;FAILED&quot;


<a name="StepEnum"></a>
## Enum: StepEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
CLEAN | &quot;CLEAN&quot;
MIGRATE | &quot;MIGRATE&quot;



