
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**BillingAccount**](BillingAccount.md) | Billing Account associated with this user |  [optional]
**actualLimits** | [**UserConfig**](UserConfig.md) | Actual limits thar are currently in force |  [optional]
**deleteRequested** | [**DateTime**](DateTime.md) | If not null - time when the user requested to delete his or her account |  [optional]
**externalId** | **String** | External ID of the user, if specified |  [optional]
**id** | **Long** | User ID in the system |  [optional]
**org** | [**Organization**](Organization.md) | Organization owning this user |  [optional]
**profile** | [**UserProfile**](UserProfile.md) | User&#39;s profile |  [optional]
**registered** | [**DateTime**](DateTime.md) | Registration time |  [optional]
**requireLicenseTerms** | **Boolean** | Indicates that this user does not have a password and needs to accept EULA |  [optional]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | Roles associated with this user |  [optional]
**settings** | [**UserSettings**](UserSettings.md) | User&#39;s settings |  [optional]
**signUpCode** | **String** | Sign up code that the user used when signing up |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of this user |  [optional]
**userLimits** | [**UserConfig**](UserConfig.md) | Limits defined for this user |  [optional]
**username** | **String** | Username, always the same as user&#39;s email |  [optional]


<a name="List<RolesEnum>"></a>
## Enum: List&lt;RolesEnum&gt;
Name | Value
---- | -----
ACTUATOR | &quot;ROLE_ACTUATOR&quot;
ADMIN | &quot;ROLE_ADMIN&quot;
BILLING | &quot;ROLE_BILLING&quot;
DISTRIBUTOR | &quot;ROLE_DISTRIBUTOR&quot;
USER | &quot;ROLE_USER&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DELETED | &quot;DELETED&quot;
DISABLED | &quot;DISABLED&quot;



