
# MappingStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeEngines** | **Long** | Number of engines that are busy with this |  [optional]
**activeSlots** | **Long** | Number fo currently active slots |  [optional]
**activeStreams** | **Long** | Number of currently active streams |  [optional]
**bytesFailed** | **Long** |  |  [optional]
**bytesGlacierRestoreStarted** | **Long** |  |  [optional]
**bytesNotMatchingPattern** | **Long** |  |  [optional]
**bytesProcessed** | **Long** |  |  [optional]
**bytesSkipped** | **Long** |  |  [optional]
**bytesSkippedGlacier** | **Long** |  |  [optional]
**bytesUploaded** | **Long** |  |  [optional]
**cleanup** | [**CleanupStat**](CleanupStat.md) | Cleanup that may be performed before migration |  [optional]
**dstRegion** | **String** |  |  [optional]
**estimated** | [**DateTime**](DateTime.md) | Estimated finish time |  [optional]
**finished** | [**DateTime**](DateTime.md) | Finished time |  [optional]
**initialBytes** | **Long** | Initial size of all objects in source storage (if known) |  [optional]
**initialObjects** | **Long** | Initial number of objects in source storage (if known) |  [optional]
**objectsFailed** | **Long** |  |  [optional]
**objectsGlacierRestoreStarted** | **Long** |  |  [optional]
**objectsNotMatchingPattern** | **Long** |  |  [optional]
**objectsProcessed** | **Long** |  |  [optional]
**objectsSkipped** | **Long** |  |  [optional]
**objectsSkippedGlacier** | **Long** |  |  [optional]
**objectsUploaded** | **Long** |  |  [optional]
**processingObjectsPerSecond** | **Double** | Objects/second processed |  [optional]
**progress** | **Double** | Progress from 0.0 to 1.0 |  [optional]
**retried** | **Long** | Number of retries |  [optional]
**srcRegion** | **String** |  |  [optional]
**started** | [**DateTime**](DateTime.md) | Started time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of migration on its part |  [optional]
**step** | [**StepEnum**](#StepEnum) | Step that this mapping is currently doing |  [optional]
**totalUpload** | **Long** |  |  [optional]
**uploadingBytesPerSecond** | **Double** |  |  [optional]
**uploadingObjectsPerSecond** | **Double** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
DEPLOYING | &quot;DEPLOYING&quot;
FAILED | &quot;FAILED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
NO_CONNECTION_TO_ENGINE | &quot;NO_CONNECTION_TO_ENGINE&quot;
RESTARTING | &quot;RESTARTING&quot;
STARTING | &quot;STARTING&quot;
STOPPED | &quot;STOPPED&quot;
STOPPING | &quot;STOPPING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
WAITING | &quot;WAITING&quot;


<a name="StepEnum"></a>
## Enum: StepEnum
Name | Value
---- | -----
CLEAN | &quot;CLEAN&quot;
COUNT | &quot;COUNT&quot;
MIGRATE | &quot;MIGRATE&quot;



