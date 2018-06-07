
# DbPriceListEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counter** | [**CounterEnum**](#CounterEnum) |  |  [optional]
**id** | **Long** |  |  [optional]
**price** | [**DbMoney**](DbMoney.md) |  |  [optional]
**service** | [**ServiceEnum**](#ServiceEnum) |  |  [optional]
**unitName** | **String** |  |  [optional]
**unitSize** | **Long** |  |  [optional]


<a name="CounterEnum"></a>
## Enum: CounterEnum
Name | Value
---- | -----
TRAFFIC | &quot;TRAFFIC&quot;
STORAGE_VOLUME | &quot;STORAGE_VOLUME&quot;


<a name="ServiceEnum"></a>
## Enum: ServiceEnum
Name | Value
---- | -----
MIGRATION | &quot;DATA_MIGRATION&quot;
FORWARDING | &quot;DATA_FORWARDING&quot;



