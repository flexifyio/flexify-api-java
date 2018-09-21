
# BucketStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytes** | **Long** | Bytes in this bucket/container |  [optional]
**lastRefreshed** | [**DateTime**](DateTime.md) | Last success refresh operation complete timestamp |  [optional]
**objects** | **Long** | Objects in this bucket/container |  [optional]
**statState** | [**StatStateEnum**](#StatStateEnum) | State of the bucket/container |  [optional]


<a name="StatStateEnum"></a>
## Enum: StatStateEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
CALCULATING | &quot;CALCULATING&quot;
REFRESHING | &quot;REFRESHING&quot;
FAILED | &quot;FAILED&quot;
CANCELED | &quot;CANCELED&quot;
UPDATED | &quot;UPDATED&quot;



