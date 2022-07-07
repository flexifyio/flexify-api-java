
# StorageAccountStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azureEnv** | [**AzureEnvEnum**](#AzureEnvEnum) | Cloud environment (Gov, Germany, etc.) for Azure storage account |  [optional]
**azureRegion** | **String** | Region for Azure storage account |  [optional]
**lastRefreshed** | [**DateTime**](DateTime.md) | When buckets/containers were requested last time |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of this storage account |  [optional]
**storagesCount** | **Integer** | Number of buckets/containers reported by the storage |  [optional]
**storagesLimitExceeded** | **Boolean** | When the limit of the maximum number of buckets/containers is exceed and not all storages are shown |  [optional]


<a name="AzureEnvEnum"></a>
## Enum: AzureEnvEnum
Name | Value
---- | -----
AZUREGERMANY | &quot;AzureGermany&quot;
AZUREGOVERNMENT | &quot;AzureGovernment&quot;
CHINA | &quot;China&quot;
PRIVATE | &quot;Private&quot;
PUBLIC | &quot;Public&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ERROR | &quot;ERROR&quot;
NONE | &quot;NONE&quot;
OK | &quot;OK&quot;
REFRESHING | &quot;REFRESHING&quot;
WARNING | &quot;WARNING&quot;



