
# CleanupStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeEngines** | **Long** | Number of engines that are busy with this |  [optional]
**activeStreams** | **Long** | Number of currently active streams |  [optional]
**bytesFailed** | **Long** |  |  [optional]
**bytesNotMatchingPattern** | **Long** |  |  [optional]
**bytesProcessed** | **Long** |  |  [optional]
**bytesRemoved** | **Long** |  |  [optional]
**bytesSkipped** | **Long** |  |  [optional]
**finished** | [**DateTime**](DateTime.md) | Finished time |  [optional]
**objectsFailed** | **Long** |  |  [optional]
**objectsNotMatchingPattern** | **Long** |  |  [optional]
**objectsProcessed** | **Long** |  |  [optional]
**objectsRemoved** | **Long** |  |  [optional]
**objectsSkipped** | **Long** |  |  [optional]
**processingObjectsPerSecond** | **Double** | Objects/second processed |  [optional]
**removingObjectsPerSecond** | **Double** |  |  [optional]
**retried** | **Long** | Number of retries |  [optional]
**started** | [**DateTime**](DateTime.md) | Started time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of migration on its part |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
WAITING | &quot;WAITING&quot;
STARTING | &quot;STARTING&quot;
RESTARTING | &quot;RESTARTING&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
STOPPING | &quot;STOPPING&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
FAILED | &quot;FAILED&quot;
STOPPED | &quot;STOPPED&quot;
NO_CONNECTION_TO_ENGINE | &quot;NO_CONNECTION_TO_ENGINE&quot;



