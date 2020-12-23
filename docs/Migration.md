
# Migration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoDeployedEnginesCloudName** | **String** | The name of cloud used to auto deploy engines. All engines are auto deployed to the same cloud. |  [optional]
**autoDeployedEnginesCloudRegion** | **String** | The name of cloud region used to auto deploy engines. All engines are auto deployed to the same cloud region. |  [optional]
**hidden** | **Boolean** | Indicates that his migration should not be show in UI |  [optional]
**id** | **Long** | Unique ID |  [optional]
**mappings** | [**List&lt;Mapping&gt;**](Mapping.md) | Source to destination storages mappings |  [optional]
**settings** | [**MigrationSettingsRes**](MigrationSettingsRes.md) | Migration settings |  [optional]
**stat** | [**MigrationStat**](MigrationStat.md) | Cumulative migration statistics |  [optional]



