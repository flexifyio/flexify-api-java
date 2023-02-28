
# MigrationSettingsReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoRestoreIfArchived** | **Boolean** | Automatically restore objects from archival tier |  [optional]
**comparisonMethod** | [**ComparisonMethodEnum**](#ComparisonMethodEnum) | Destination comparison method |  [optional]
**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Conflict resolution |  [optional]
**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | The type of engine deployment |  [optional]
**dryRun** | **Boolean** | Dry run mode |  [optional]
**enginesLocation** | [**CloudLocationReq**](CloudLocationReq.md) | Location of the engines to migrate |  [optional]
**existingDataInDestination** | [**ExistingDataInDestinationEnum**](#ExistingDataInDestinationEnum) | Keep or clean data in destination before migration (identical with source objects keep in any cases) |  [optional]
**lastModifiedFrom** | [**DateTime**](DateTime.md) | Migrate objects modified on or after specified date |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Log level |  [optional]
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
**restoreDays** | **Integer** | Number of days to keep restored objects when automatically restoring objects from archival tier |  [optional]
**restoreMaxSize** | **Long** | Maximum total size of objects to restore when automatically restoring objects from archival tier |  [optional]
**restoreTier** | [**RestoreTierEnum**](#RestoreTierEnum) | Restore tier when automatically restoring objects from archival tier |  [optional]
**retryTimeout** | **Integer** | Initial timeout between retries in seconds |  [optional]
**skipIfHashMatches** | **Boolean** | Skip migration if source and destination object hash match |  [optional]
**slotsPerMapping** | **Integer** | Number of slots of storage mapping (bucket) |  [optional]
**uploadTimestampMode** | [**UploadTimestampModeEnum**](#UploadTimestampModeEnum) | Specify if to copy original or set specified timestamp when migration to B2 |  [optional]
**uploadTimestampValue** | [**DateTime**](DateTime.md) | The B2 timestamp value to set if uploadTimestampMode is CUSTOM |  [optional]


<a name="ComparisonMethodEnum"></a>
## Enum: ComparisonMethodEnum
Name | Value
---- | -----
AUTO | &quot;AUTO&quot;
LIST_ONLY | &quot;LIST_ONLY&quot;
LIST_PROBE | &quot;LIST_PROBE&quot;
PROBE_ONLY | &quot;PROBE_ONLY&quot;


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


<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
DEBUG | &quot;DEBUG&quot;
ERROR | &quot;ERROR&quot;
INFO | &quot;INFO&quot;
TRACE | &quot;TRACE&quot;
WARNING | &quot;WARNING&quot;


<a name="MigrationModeEnum"></a>
## Enum: MigrationModeEnum
Name | Value
---- | -----
COPY | &quot;COPY&quot;
MOVE | &quot;MOVE&quot;


<a name="RestoreTierEnum"></a>
## Enum: RestoreTierEnum
Name | Value
---- | -----
BULK | &quot;BULK&quot;
EXPEDITED | &quot;EXPEDITED&quot;
STANDARD | &quot;STANDARD&quot;


<a name="UploadTimestampModeEnum"></a>
## Enum: UploadTimestampModeEnum
Name | Value
---- | -----
ACTUAL | &quot;ACTUAL&quot;
CUSTOM | &quot;CUSTOM&quot;
ORIGINAL | &quot;ORIGINAL&quot;



