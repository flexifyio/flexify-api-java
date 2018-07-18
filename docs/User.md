
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**BillingAccount**](BillingAccount.md) | Billing Account |  [optional]
**id** | **Long** | User ID in the system |  [optional]
**org** | [**Organization**](Organization.md) | Owning Organization |  [optional]
**profile** | [**UserProfile**](UserProfile.md) | User Profile |  [optional]
**registered** | [**DateTime**](DateTime.md) | Registration time |  [optional]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | User Roles |  [optional]
**state** | [**StateEnum**](#StateEnum) | User State |  [optional]
**username** | **String** | Username |  [optional]


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



