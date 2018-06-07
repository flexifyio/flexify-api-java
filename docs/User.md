
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**BillingAccount**](BillingAccount.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**org** | [**Org**](Org.md) |  |  [optional]
**profile** | [**DbUserProfile**](DbUserProfile.md) |  |  [optional]
**registered** | [**DateTime**](DateTime.md) |  |  [optional]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**username** | **String** |  |  [optional]


<a name="List<RolesEnum>"></a>
## Enum: List&lt;RolesEnum&gt;
Name | Value
---- | -----
USER | &quot;ROLE_USER&quot;
ADMIN | &quot;ROLE_ADMIN&quot;
ACTUATOR | &quot;ROLE_ACTUATOR&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DISABLED | &quot;DISABLED&quot;



