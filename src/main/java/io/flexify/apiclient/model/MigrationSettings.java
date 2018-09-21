/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.6
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.flexify.apiclient.model.CloudLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Start new migration request
 */
@ApiModel(description = "Start new migration request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
public class MigrationSettings {
  /**
   * Conflict resolution
   */
  public enum ConflictResolutionEnum {
    SOURCE("SOURCE"),
    
    DESTINATION("DESTINATION"),
    
    BOTH("BOTH"),
    
    NEWER("NEWER");

    private String value;

    ConflictResolutionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConflictResolutionEnum fromValue(String text) {
      for (ConflictResolutionEnum b : ConflictResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("conflictResolution")
  private ConflictResolutionEnum conflictResolution = null;

  @JsonProperty("countSourceObjects")
  private Boolean countSourceObjects = null;

  @JsonProperty("enginesLocation")
  private CloudLocation enginesLocation = null;

  /**
   * Keep or clean data in destination before migration (identical with source objects keep in any cases)
   */
  public enum ExistingDataInDestinationEnum {
    KEEP("KEEP"),
    
    CLEAN("CLEAN");

    private String value;

    ExistingDataInDestinationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExistingDataInDestinationEnum fromValue(String text) {
      for (ExistingDataInDestinationEnum b : ExistingDataInDestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("existingDataInDestination")
  private ExistingDataInDestinationEnum existingDataInDestination = null;

  @JsonProperty("maxActiveSlots")
  private Integer maxActiveSlots = null;

  @JsonProperty("maxStreamsPerSlot")
  private Integer maxStreamsPerSlot = null;

  /**
   * Migration mode
   */
  public enum MigrationModeEnum {
    COPY("COPY"),
    
    MOVE("MOVE");

    private String value;

    MigrationModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MigrationModeEnum fromValue(String text) {
      for (MigrationModeEnum b : MigrationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("migrationMode")
  private MigrationModeEnum migrationMode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objectKeyFilter")
  private String objectKeyFilter = null;

  @JsonProperty("slotsPerMapping")
  private Integer slotsPerMapping = null;

  public MigrationSettings conflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
    return this;
  }

   /**
   * Conflict resolution
   * @return conflictResolution
  **/
  @ApiModelProperty(example = "NEWER", required = true, value = "Conflict resolution")
  public ConflictResolutionEnum getConflictResolution() {
    return conflictResolution;
  }

  public void setConflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
  }

  public MigrationSettings countSourceObjects(Boolean countSourceObjects) {
    this.countSourceObjects = countSourceObjects;
    return this;
  }

   /**
   * Count objects in source before migration
   * @return countSourceObjects
  **/
  @ApiModelProperty(example = "true", value = "Count objects in source before migration")
  public Boolean isCountSourceObjects() {
    return countSourceObjects;
  }

  public void setCountSourceObjects(Boolean countSourceObjects) {
    this.countSourceObjects = countSourceObjects;
  }

  public MigrationSettings enginesLocation(CloudLocation enginesLocation) {
    this.enginesLocation = enginesLocation;
    return this;
  }

   /**
   * Location of the engines to migrate
   * @return enginesLocation
  **/
  @ApiModelProperty(value = "Location of the engines to migrate")
  public CloudLocation getEnginesLocation() {
    return enginesLocation;
  }

  public void setEnginesLocation(CloudLocation enginesLocation) {
    this.enginesLocation = enginesLocation;
  }

  public MigrationSettings existingDataInDestination(ExistingDataInDestinationEnum existingDataInDestination) {
    this.existingDataInDestination = existingDataInDestination;
    return this;
  }

   /**
   * Keep or clean data in destination before migration (identical with source objects keep in any cases)
   * @return existingDataInDestination
  **/
  @ApiModelProperty(example = "KEEP", value = "Keep or clean data in destination before migration (identical with source objects keep in any cases)")
  public ExistingDataInDestinationEnum getExistingDataInDestination() {
    return existingDataInDestination;
  }

  public void setExistingDataInDestination(ExistingDataInDestinationEnum existingDataInDestination) {
    this.existingDataInDestination = existingDataInDestination;
  }

  public MigrationSettings maxActiveSlots(Integer maxActiveSlots) {
    this.maxActiveSlots = maxActiveSlots;
    return this;
  }

   /**
   * Maximum number of slots that can be migrated simultaneously
   * @return maxActiveSlots
  **/
  @ApiModelProperty(example = "1", value = "Maximum number of slots that can be migrated simultaneously")
  public Integer getMaxActiveSlots() {
    return maxActiveSlots;
  }

  public void setMaxActiveSlots(Integer maxActiveSlots) {
    this.maxActiveSlots = maxActiveSlots;
  }

  public MigrationSettings maxStreamsPerSlot(Integer maxStreamsPerSlot) {
    this.maxStreamsPerSlot = maxStreamsPerSlot;
    return this;
  }

   /**
   * Maximum Connections per engine
   * @return maxStreamsPerSlot
  **/
  @ApiModelProperty(example = "16", value = "Maximum Connections per engine")
  public Integer getMaxStreamsPerSlot() {
    return maxStreamsPerSlot;
  }

  public void setMaxStreamsPerSlot(Integer maxStreamsPerSlot) {
    this.maxStreamsPerSlot = maxStreamsPerSlot;
  }

  public MigrationSettings migrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
    return this;
  }

   /**
   * Migration mode
   * @return migrationMode
  **/
  @ApiModelProperty(example = "COPY", required = true, value = "Migration mode")
  public MigrationModeEnum getMigrationMode() {
    return migrationMode;
  }

  public void setMigrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
  }

  public MigrationSettings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the migration
   * @return name
  **/
  @ApiModelProperty(example = "Copy from source to destination", required = true, value = "Name of the migration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MigrationSettings objectKeyFilter(String objectKeyFilter) {
    this.objectKeyFilter = objectKeyFilter;
    return this;
  }

   /**
   * Migrate objects matching pattern
   * @return objectKeyFilter
  **/
  @ApiModelProperty(example = "*", value = "Migrate objects matching pattern")
  public String getObjectKeyFilter() {
    return objectKeyFilter;
  }

  public void setObjectKeyFilter(String objectKeyFilter) {
    this.objectKeyFilter = objectKeyFilter;
  }

  public MigrationSettings slotsPerMapping(Integer slotsPerMapping) {
    this.slotsPerMapping = slotsPerMapping;
    return this;
  }

   /**
   * Number of slots of storage mapping (bucket)
   * @return slotsPerMapping
  **/
  @ApiModelProperty(example = "1", value = "Number of slots of storage mapping (bucket)")
  public Integer getSlotsPerMapping() {
    return slotsPerMapping;
  }

  public void setSlotsPerMapping(Integer slotsPerMapping) {
    this.slotsPerMapping = slotsPerMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSettings migrationSettings = (MigrationSettings) o;
    return Objects.equals(this.conflictResolution, migrationSettings.conflictResolution) &&
        Objects.equals(this.countSourceObjects, migrationSettings.countSourceObjects) &&
        Objects.equals(this.enginesLocation, migrationSettings.enginesLocation) &&
        Objects.equals(this.existingDataInDestination, migrationSettings.existingDataInDestination) &&
        Objects.equals(this.maxActiveSlots, migrationSettings.maxActiveSlots) &&
        Objects.equals(this.maxStreamsPerSlot, migrationSettings.maxStreamsPerSlot) &&
        Objects.equals(this.migrationMode, migrationSettings.migrationMode) &&
        Objects.equals(this.name, migrationSettings.name) &&
        Objects.equals(this.objectKeyFilter, migrationSettings.objectKeyFilter) &&
        Objects.equals(this.slotsPerMapping, migrationSettings.slotsPerMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictResolution, countSourceObjects, enginesLocation, existingDataInDestination, maxActiveSlots, maxStreamsPerSlot, migrationMode, name, objectKeyFilter, slotsPerMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSettings {\n");
    
    sb.append("    conflictResolution: ").append(toIndentedString(conflictResolution)).append("\n");
    sb.append("    countSourceObjects: ").append(toIndentedString(countSourceObjects)).append("\n");
    sb.append("    enginesLocation: ").append(toIndentedString(enginesLocation)).append("\n");
    sb.append("    existingDataInDestination: ").append(toIndentedString(existingDataInDestination)).append("\n");
    sb.append("    maxActiveSlots: ").append(toIndentedString(maxActiveSlots)).append("\n");
    sb.append("    maxStreamsPerSlot: ").append(toIndentedString(maxStreamsPerSlot)).append("\n");
    sb.append("    migrationMode: ").append(toIndentedString(migrationMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectKeyFilter: ").append(toIndentedString(objectKeyFilter)).append("\n");
    sb.append("    slotsPerMapping: ").append(toIndentedString(slotsPerMapping)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

