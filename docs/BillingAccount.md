
# BillingAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminState** | [**AdminStateEnum**](#AdminStateEnum) | System Account state (Updated by Administrator) |  [optional]
**aggregateState** | [**AggregateStateEnum**](#AggregateStateEnum) | Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE) |  [optional]
**billingState** | [**BillingStateEnum**](#BillingStateEnum) | Billing Account state (Depend on balance and max credit) |  [optional]
**createdDate** | [**DateTime**](DateTime.md) | Created Timestamp |  [optional]
**distributor** | [**Distributor**](Distributor.md) | Distributor that manages this account |  [optional]
**id** | **Long** | Account Id |  [optional]
**maxCredit** | [**Money**](Money.md) | Account Maximum Credit |  [optional]
**name** | **String** | Account Name |  [optional]
**priceList** | [**PriceList**](PriceList.md) | Price list (without prices) |  [optional]


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



