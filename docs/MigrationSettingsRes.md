
# MigrationSettingsRes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Conflict resolution |  [optional]
**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | The type of engine deployment |  [optional]
**dryRun** | **Boolean** | Dry run mode |  [optional]
**enginesLocation** | [**CloudLocationRes**](CloudLocationRes.md) | Location of the engines to migrate |  [optional]
**existingDataInDestination** | [**ExistingDataInDestinationEnum**](#ExistingDataInDestinationEnum) | Keep or clean data in destination before migration (identical with source objects keep in any cases) |  [optional]
**lastModifiedFrom** | [**DateTime**](DateTime.md) | Migrate objects modified on or after specified date |  [optional]
**maxEngines** | **Integer** | Maximum number of engines this migration uses (experimental) |  [optional]
**maxRetries** | **Integer** | Maximum number of retries |  [optional]
**maxRetriesForCopy** | **Integer** | Maximum number of retries after copy started |  [optional]
**maxRetryTimeout** | **Integer** | Maximum timeout between retries in seconds |  [optional]
**maxStreams** | **Integer** | Maximum streams that migration will use across all engines |  [optional]
**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) | Migration mode |  [optional]
**multipartConcurrency** | **Integer** | Maximum parts for parallel upload for a single object |  [optional]
**multipartLimit** | **Long** | Minimum size in bytes for multipart upload |  [optional]
**multipartPartSize** | **Long** | Part size for multipart upload |  [optional]
**name** | **String** | Name of the migration |  [optional]
**objectKeyFilter** | **String** | Migrate objects matching pattern |  [optional]
**retryTimeout** | **Integer** | Initial timeout between retries in seconds |  [optional]
**skipIfHashMatches** | **Boolean** | Skip migration if source and destination object hash match |  [optional]
**slotsPerMapping** | **Integer** | Number of slots of storage mapping (bucket) |  [optional]


<a name="ConflictResolutionEnum"></a>
## Enum: ConflictResolutionEnum
Name | Value
---- | -----
BOTH | &quot;BOTH&quot;
DESTINATION | &quot;DESTINATION&quot;
NEWER | &quot;NEWER&quot;
SOURCE | &quot;SOURCE&quot;


<a name="DeploymentTypeEnum"></a>
## Enum: DeploymentTypeEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
DEPLOYMENT | &quot;DEPLOYMENT&quot;
SELECTION | &quot;SELECTION&quot;


<a name="ExistingDataInDestinationEnum"></a>
## Enum: ExistingDataInDestinationEnum
Name | Value
---- | -----
CLEAN | &quot;CLEAN&quot;
KEEP | &quot;KEEP&quot;


<a name="MigrationModeEnum"></a>
## Enum: MigrationModeEnum
Name | Value
---- | -----
COPY | &quot;COPY&quot;
MOVE | &quot;MOVE&quot;



