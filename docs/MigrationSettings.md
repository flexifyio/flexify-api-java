
# MigrationSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Conflict resolution | 
**enginesLocation** | [**CloudLocation**](CloudLocation.md) | Location of the engines to migrate |  [optional]
**existingDataInDestination** | [**ExistingDataInDestinationEnum**](#ExistingDataInDestinationEnum) | Keep or clean data in destination before migration (identical with source objects keep in any cases) |  [optional]
**maxActiveSlots** | **Integer** | Maximum number of slots that can be migrated simultaneously (experimental) |  [optional]
**maxStreamsPerSlot** | **Integer** | Maximum Connections per engine |  [optional]
**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) | Migration mode | 
**name** | **String** | Name of the migration | 
**objectKeyFilter** | **String** | Migrate objects matching pattern |  [optional]
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



