
# InformationAboutAuthenticationToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **String** | Comments |  [optional]
**id** | **Long** | Unique token ID |  [optional]
**ip** | **String** | IP address from which token was requested |  [optional]
**issued** | [**DateTime**](DateTime.md) | When the token was issued |  [optional]
**lastUsed** | [**DateTime**](DateTime.md) | When the token was last used |  [optional]
**token** | **String** | Token string used for Bearer auth |  [optional]
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Type of this token |  [optional]


<a name="TokenTypeEnum"></a>
## Enum: TokenTypeEnum
Name | Value
---- | -----
API | &quot;API&quot;
IMPERSONATION | &quot;IMPERSONATION&quot;
INTEGRATION | &quot;INTEGRATION&quot;
LOGIN | &quot;LOGIN&quot;



