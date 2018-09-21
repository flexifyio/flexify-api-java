
# MappingStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeEngines** | **Long** | Number of engines that are busy with this |  [optional]
**activeSlots** | **Long** | Number fo currently active slots |  [optional]
**activeStreams** | **Long** | Number of currently active streams |  [optional]
**bytesFailed** | **Long** |  |  [optional]
**bytesNotMatchingPattern** | **Long** |  |  [optional]
**bytesProcessed** | **Long** |  |  [optional]
**bytesSkipped** | **Long** |  |  [optional]
**bytesUploaded** | **Long** |  |  [optional]
**cleanup** | [**CleanupStat**](CleanupStat.md) | Cleanup that may be performed before migration |  [optional]
**estimated** | [**DateTime**](DateTime.md) | Estimated finish time |  [optional]
**finished** | [**DateTime**](DateTime.md) | Finished time |  [optional]
**initialBytes** | **Long** | Initial size of all objects in source storage (if known) |  [optional]
**initialObjects** | **Long** | Initial number of objects in source storage (if known) |  [optional]
**objectsFailed** | **Long** |  |  [optional]
**objectsNotMatchingPattern** | **Long** |  |  [optional]
**objectsProcessed** | **Long** |  |  [optional]
**objectsSkipped** | **Long** |  |  [optional]
**objectsUploaded** | **Long** |  |  [optional]
**processingObjectsPerSecond** | **Double** | Objects/second processed |  [optional]
**progress** | **Double** | Progress from 0.0 to 1.0 |  [optional]
**retried** | **Long** | Number of retries |  [optional]
**started** | [**DateTime**](DateTime.md) | Started time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of migration on its part |  [optional]
**step** | [**StepEnum**](#StepEnum) | Step that this mapping is currently doing |  [optional]
**uploadingBytesPerSecond** | **Double** |  |  [optional]
**uploadingObjectsPerSecond** | **Double** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
WAITING | &quot;WAITING&quot;
STARTING | &quot;STARTING&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
STOPPING | &quot;STOPPING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
FAILED | &quot;FAILED&quot;
STOPPED | &quot;STOPPED&quot;
NO_CONNECTION_TO_ENGINE | &quot;NO_CONNECTION_TO_ENGINE&quot;


<a name="StepEnum"></a>
## Enum: StepEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
CLEAN | &quot;CLEAN&quot;
MIGRATE | &quot;MIGRATE&quot;



