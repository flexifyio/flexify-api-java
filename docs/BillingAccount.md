
# BillingAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | System Account state (Updated by Administrator) |  [optional]
**aggregateState** | [**AggregateStateEnum**](#AggregateStateEnum) | Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE) |  [optional]
**billingState** | [**BillingStateEnum**](#BillingStateEnum) | Billing Account state (Depend on balance and max credit) |  [optional]
**createdDate** | [**DateTime**](DateTime.md) | Created Timestamp |  [optional]
**id** | **Long** | Account Id |  [optional]
**maxCredit** | [**DbMoney**](DbMoney.md) | Account Maximum Credit |  [optional]
**name** | **String** | Account Name |  [optional]


<a name="AdminStateEnum"></a>
## Enum: AdminStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;


<a name="AggregateStateEnum"></a>
## Enum: AggregateStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;


<a name="BillingStateEnum"></a>
## Enum: BillingStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;



