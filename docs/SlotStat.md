
# SlotStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeEngines** | **Long** | Number of engines that are busy with this |  [optional]
**activeStreams** | **Long** | Number of currently active streams |  [optional]
**bytesFailed** | **Long** |  |  [optional]
**bytesNotMatchingPattern** | **Long** |  |  [optional]
**bytesProcessed** | **Long** |  |  [optional]
**bytesSkipped** | **Long** |  |  [optional]
**bytesSkippedGlacier** | **Long** |  |  [optional]
**bytesUploaded** | **Long** |  |  [optional]
**dstRegion** | **String** |  |  [optional]
**finished** | [**DateTime**](DateTime.md) | Finished time |  [optional]
**objectsFailed** | **Long** |  |  [optional]
**objectsNotMatchingPattern** | **Long** |  |  [optional]
**objectsProcessed** | **Long** |  |  [optional]
**objectsSkipped** | **Long** |  |  [optional]
**objectsSkippedGlacier** | **Long** |  |  [optional]
**objectsUploaded** | **Long** |  |  [optional]
**processingObjectsPerSecond** | **Double** | Objects/second processed |  [optional]
**retried** | **Long** | Number of retries |  [optional]
**srcRegion** | **String** |  |  [optional]
**started** | [**DateTime**](DateTime.md) | Started time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of migration on its part |  [optional]
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



