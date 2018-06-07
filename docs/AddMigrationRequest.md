
# AddMigrationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conflictResolution** | [**ConflictResolutionEnum**](#ConflictResolutionEnum) | Conflict resolution | 
**countSourceObjects** | **Boolean** | Count objects in source before migration |  [optional]
**destinationId** | **Long** | Link to destination storage | 
**enginesLocation** | [**CloudLocation**](CloudLocation.md) | Location of the engines to migrate |  [optional]
**existingDataInDestination** | [**ExistingDataInDestinationEnum**](#ExistingDataInDestinationEnum) | Keep or clean data in destination before migration (identical with source objects keep in any cases) |  [optional]
**maxConnectionsPerEngine** | **Integer** | Maximum Connections per engine |  [optional]
**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) | Migration mode | 
**objectKeyFilter** | **String** | Migrate objects matching pattern |  [optional]
**slots** | **Integer** | Number of slots of migration |  [optional]
**sourceId** | **Long** | Link to source storage | 


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



