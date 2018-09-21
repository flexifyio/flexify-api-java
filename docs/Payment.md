
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Money**](Money.md) | Payment amount |  [optional]
**comments** | **String** | Payment comments (will be shown to the customer) |  [optional]
**entryMode** | [**EntryModeEnum**](#EntryModeEnum) | Payment entry mode (automatic or manual) |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Payment method |  [optional]
**paymentDate** | [**DateTime**](DateTime.md) | Payment date |  [optional]


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
DISTRIBUTOR | &quot;DISTRIBUTOR&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;



