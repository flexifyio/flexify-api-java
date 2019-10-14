
# MigrationSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Conflict resolution |  [optional]
**enginesLocation** | [**CloudLocation**](CloudLocation.md) | Location of the engines to migrate |  [optional]
**existingDataInDestination** | [**ExistingDataInDestinationEnum**](#ExistingDataInDestinationEnum) | Keep or clean data in destination before migration (identical with source objects keep in any cases) |  [optional]
**maxEngines** | **Integer** | Maximum number of engines this migration uses (experimental) |  [optional]
**maxRetries** | **Integer** | Maximum number of retries |  [optional]
**maxRetriesForCopy** | **Integer** | Maximum number of retries after copy started |  [optional]
**maxRetryTimeout** | **Integer** | Maximum timeout between retries in seconds |  [optional]
**maxStreams** | **Integer** | Maximum streams that migration will use across all aengines |  [optional]
**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) | Migration mode |  [optional]
**name** | **String** | Name of the migration |  [optional]
**objectKeyFilter** | **String** | Migrate objects matching pattern |  [optional]
**retryTimeout** | **Integer** | Initial timeout between retries in seconds |  [optional]
**skipIfHashMatches** | **Boolean** | Skip migration if source and destination object hash match |  [optional]
**slotsPerMapping** | **Integer** | Number of slots of storage mapping (bucket) |  [optional]


<a name="ConflictResolutionEnum"></a>
## Enum: ConflictResolutionEnum
Name | Value
---- | -----
SOURCE | &quot;SOURCE&quot;
DESTINATION | &quot;DESTINATION&quot;
BOTH | &quot;BOTH&quot;
NEWER | &quot;NEWER&quot;


<a name="ExistingDataInDestinationEnum"></a>
## Enum: ExistingDataInDestinationEnum
Name | Value
---- | -----
KEEP | &quot;KEEP&quot;
CLEAN | &quot;CLEAN&quot;


<a name="MigrationModeEnum"></a>
## Enum: MigrationModeEnum
Name | Value
---- | -----
COPY | &quot;COPY&quot;
MOVE | &quot;MOVE&quot;



