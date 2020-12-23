
# Price

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraints** | [**PriceConstraints**](PriceConstraints.md) | Constraints that this price works for |  [optional]
**counter** | [**CounterEnum**](#CounterEnum) | Billable counter (such as traffic or storage volume) |  [optional]
**id** | **Long** | Unique ID of this price |  [optional]
**price** | [**Money**](Money.md) | Price of one unit |  [optional]
**service** | [**ServiceEnum**](#ServiceEnum) | Service |  [optional]
**unitName** | **String** | Name of billable unit |  [optional]
**unitSize** | **Long** | Size of billable unit in bytes |  [optional]


<a name="CounterEnum"></a>
## Enum: CounterEnum
Name | Value
---- | -----
STORAGE_VOLUME | &quot;STORAGE_VOLUME&quot;
TRAFFIC | &quot;TRAFFIC&quot;


<a name="ServiceEnum"></a>
## Enum: ServiceEnum
Name | Value
---- | -----
FORWARDING | &quot;DATA_FORWARDING&quot;
MIGRATION | &quot;DATA_MIGRATION&quot;



