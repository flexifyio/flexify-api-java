
# BillingAccountWithMoney

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | System Account state (Updated by Administrator) |  [optional]
**aggregateState** | [**AggregateStateEnum**](#AggregateStateEnum) | Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE) |  [optional]
**balance** | [**Money**](Money.md) | Account Current Balance |  [optional]
**billingState** | [**BillingStateEnum**](#BillingStateEnum) | Billing Account state (Depend on balance and max credit) |  [optional]
**createdDate** | [**DateTime**](DateTime.md) | Created Timestamp |  [optional]
**creditExceeded** | **Boolean** | Is credit exceeded |  [optional]
**distributor** | [**Distributor**](Distributor.md) | Distributor that manages this account |  [optional]
**id** | **Long** | Account Id |  [optional]
**maxCredit** | [**Money**](Money.md) | Account Maximum Credit |  [optional]
**name** | **String** | Account Name |  [optional]
**totalCost** | [**Money**](Money.md) | Account Total Cost |  [optional]
**totalPaid** | [**Money**](Money.md) | Account Total Paid |  [optional]


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



