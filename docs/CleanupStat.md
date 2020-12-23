
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



