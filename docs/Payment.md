
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Money**](Money.md) | Payment amount |  [optional]
**comments** | **String** | Payment comments (will be shown to the customer) |  [optional]
**entryMode** | [**EntryModeEnum**](#EntryModeEnum) | Payment entry mode (automatic or manual) |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Payment method |  [optional]
**paymentDate** | [**DateTime**](DateTime.md) | Payment date |  [optional]
**paymentGatewayName** | **String** | Gateway used to make this payment |  [optional]


<a name="EntryModeEnum"></a>
## Enum: EntryModeEnum
Name | Value
---- | -----
AUTOMATIC | &quot;AUTOMATIC&quot;
MANUAL | &quot;MANUAL&quot;


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
ADJUSTMENT | &quot;ADJUSTMENT&quot;
CASH | &quot;CASH&quot;
DISTRIBUTOR | &quot;DISTRIBUTOR&quot;
PAYMENT_GATEWAY | &quot;PAYMENT_GATEWAY&quot;
WIRE_TRANSFER | &quot;WIRE_TRANSFER&quot;



