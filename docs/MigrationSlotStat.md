
# MigrationSlotStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeStreams** | **Long** |  |  [optional]
**slot** | **Integer** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**step** | [**StepEnum**](#StepEnum) |  |  [optional]


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
CANCELED | &quot;CANCELED&quot;
NO_CONNECTION_TO_ENGINE | &quot;NO_CONNECTION_TO_ENGINE&quot;


<a name="StepEnum"></a>
## Enum: StepEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
COUNT | &quot;COUNT&quot;
CLEAN | &quot;CLEAN&quot;
MIGRATE | &quot;MIGRATE&quot;



