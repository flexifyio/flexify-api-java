
# UserStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeMigrationsCount** | **Long** |  |  [optional]
**billingAccountAdminState** | [**BillingAccountAdminStateEnum**](#BillingAccountAdminStateEnum) |  |  [optional]
**billingAccountName** | **String** |  |  [optional]
**billingAccountState** | [**BillingAccountStateEnum**](#BillingAccountStateEnum) |  |  [optional]
**company** | **String** |  |  [optional]
**deleteRequested** | [**DateTime**](DateTime.md) |  |  [optional]
**displayName** | **String** |  |  [optional]
**distributorName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**externalId** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**orgName** | **String** |  |  [optional]
**priceListName** | **String** |  |  [optional]
**registered** | [**DateTime**](DateTime.md) |  |  [optional]
**storageAccountsCount** | **Long** |  |  [optional]
**totalMigrationsCount** | **Long** |  |  [optional]
**userState** | [**UserStateEnum**](#UserStateEnum) |  |  [optional]


<a name="BillingAccountAdminStateEnum"></a>
## Enum: BillingAccountAdminStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;


<a name="BillingAccountStateEnum"></a>
## Enum: BillingAccountStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;


<a name="UserStateEnum"></a>
## Enum: UserStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DELETED | &quot;DELETED&quot;
DISABLED | &quot;DISABLED&quot;



