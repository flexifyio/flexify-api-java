
# BucketStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytes** | **Long** | Bytes in this bucket/container |  [optional]
**lastRefreshed** | [**DateTime**](DateTime.md) | Last success refresh operation complete timestamp |  [optional]
**objects** | **Long** | Objects in this bucket/container |  [optional]
**region** | **String** | Region where this bucket is located |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the bucket/container |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
NONE | &quot;NONE&quot;
OK | &quot;OK&quot;
REFRESHING | &quot;REFRESHING&quot;
WARNING | &quot;WARNING&quot;



