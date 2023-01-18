
# PolicyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**keyPattern** | **String** |  |  [optional]
**operations** | [**List&lt;OperationsEnum&gt;**](#List&lt;OperationsEnum&gt;) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
ALLOW | &quot;allow&quot;
ALLOWPUBLIC | &quot;allowPublic&quot;
FORBID | &quot;forbid&quot;


<a name="List<OperationsEnum>"></a>
## Enum: List&lt;OperationsEnum&gt;
Name | Value
---- | -----
DELETEOBJECT | &quot;DeleteObject&quot;
GETOBJECT | &quot;GetObject&quot;
HEADBUCKET | &quot;HeadBucket&quot;
LISTOBJECTS | &quot;ListObjects&quot;
PUTOBJECT | &quot;PutObject&quot;
RESTOREOBJECT | &quot;RestoreObject&quot;



