
# StorageAccountStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azureEnv** | [**AzureEnvEnum**](#AzureEnvEnum) | Cloud environment (Gov, Germany, etc.) for Azure storage account |  [optional]
**azureRegion** | **String** | Region for Azure storage account |  [optional]
**lastRefreshed** | [**DateTime**](DateTime.md) | When buckets/containers were requested last time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of this storage account |  [optional]


<a name="AzureEnvEnum"></a>
## Enum: AzureEnvEnum
Name | Value
---- | -----
AZURE | &quot;AZURE&quot;
AZURE_CHINA | &quot;AZURE_CHINA&quot;
AZURE_US_GOVERNMENT | &quot;AZURE_US_GOVERNMENT&quot;
AZURE_GERMANY | &quot;AZURE_GERMANY&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
REFRESHING | &quot;REFRESHING&quot;
ERROR | &quot;ERROR&quot;
WARNING | &quot;WARNING&quot;
OK | &quot;OK&quot;



