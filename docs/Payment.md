
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**DbMoney**](DbMoney.md) |  |  [optional]
**comments** | **String** |  |  [optional]
**entryMode** | [**EntryModeEnum**](#EntryModeEnum) |  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  |  [optional]
**paymentDate** | [**DateTime**](DateTime.md) |  |  [optional]


<a name="EntryModeEnum"></a>
## Enum: EntryModeEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
AUTOMATIC | &quot;AUTOMATIC&quot;


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
CASH | &quot;CASH&quot;
WIRE_TRANSFER | &quot;WIRE_TRANSFER&quot;
PAYMENT_GATEWAY | &quot;PAYMENT_GATEWAY&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;



