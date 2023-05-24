/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.17-SNAPSHOT
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.flexify.apiclient.model.CloudLocationReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Start new migration request
 */
@ApiModel(description = "Start new migration request")

public class MigrationSettingsReq {
  @JsonProperty("autoRestoreIfArchived")
  private Boolean autoRestoreIfArchived = null;

  /**
   * Destination comparison method
   */
  public enum ComparisonMethodEnum {
    AUTO("AUTO"),
    
    LIST_ONLY("LIST_ONLY"),
    
    LIST_PROBE("LIST_PROBE"),
    
    PROBE_ONLY("PROBE_ONLY");

    private String value;

    ComparisonMethodEnum(String value) {
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
    public static ComparisonMethodEnum fromValue(String value) {
      for (ComparisonMethodEnum b : ComparisonMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("comparisonMethod")
  private ComparisonMethodEnum comparisonMethod = null;

  /**
   * Conflict resolution
   */
  public enum ConflictResolutionEnum {
    BOTH("BOTH"),
    
    DESTINATION("DESTINATION"),
    
    NEWER("NEWER"),
    
    SOURCE("SOURCE");

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
    public static ConflictResolutionEnum fromValue(String value) {
      for (ConflictResolutionEnum b : ConflictResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("conflictResolution")
  private ConflictResolutionEnum conflictResolution = null;

  /**
   * The type of engine deployment
   */
  public enum DeploymentTypeEnum {
    AUTO("AUTO"),
    
    DEPLOYMENT("DEPLOYMENT"),
    
    SELECTION("SELECTION");

    private String value;

    DeploymentTypeEnum(String value) {
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
    public static DeploymentTypeEnum fromValue(String value) {
      for (DeploymentTypeEnum b : DeploymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deploymentType")
  private DeploymentTypeEnum deploymentType = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  @JsonProperty("enginesLocation")
  private CloudLocationReq enginesLocation = null;

  /**
   * Keep or clean data in destination before migration (identical with source objects keep in any cases)
   */
  public enum ExistingDataInDestinationEnum {
    CLEAN("CLEAN"),
    
    KEEP("KEEP");

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
    public static ExistingDataInDestinationEnum fromValue(String value) {
      for (ExistingDataInDestinationEnum b : ExistingDataInDestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("existingDataInDestination")
  private ExistingDataInDestinationEnum existingDataInDestination = null;

  @JsonProperty("lastModifiedFrom")
  private DateTime lastModifiedFrom = null;

  /**
   * Log level
   */
  public enum LogLevelEnum {
    DEBUG("DEBUG"),
    
    ERROR("ERROR"),
    
    INFO("INFO"),
    
    TRACE("TRACE"),
    
    WARNING("WARNING");

    private String value;

    LogLevelEnum(String value) {
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
    public static LogLevelEnum fromValue(String value) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("logLevel")
  private LogLevelEnum logLevel = null;

  @JsonProperty("maxEngines")
  private Integer maxEngines = null;

  @JsonProperty("maxRetries")
  private Integer maxRetries = null;

  @JsonProperty("maxRetriesForCopy")
  private Integer maxRetriesForCopy = null;

  @JsonProperty("maxRetryTimeout")
  private Integer maxRetryTimeout = null;

  @JsonProperty("maxStreams")
  private Integer maxStreams = null;

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
    public static MigrationModeEnum fromValue(String value) {
      for (MigrationModeEnum b : MigrationModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("migrationMode")
  private MigrationModeEnum migrationMode = null;

  @JsonProperty("multipartConcurrency")
  private Integer multipartConcurrency = null;

  @JsonProperty("multipartLimit")
  private Long multipartLimit = null;

  @JsonProperty("multipartPartSize")
  private Long multipartPartSize = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objectKeyFilter")
  private String objectKeyFilter = null;

  @JsonProperty("restoreDays")
  private Integer restoreDays = null;

  @JsonProperty("restoreMaxSize")
  private Long restoreMaxSize = null;

  /**
   * Restore tier when automatically restoring objects from archival tier
   */
  public enum RestoreTierEnum {
    BULK("BULK"),
    
    EXPEDITED("EXPEDITED"),
    
    STANDARD("STANDARD");

    private String value;

    RestoreTierEnum(String value) {
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
    public static RestoreTierEnum fromValue(String value) {
      for (RestoreTierEnum b : RestoreTierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("restoreTier")
  private RestoreTierEnum restoreTier = null;

  @JsonProperty("retryTimeout")
  private Integer retryTimeout = null;

  @JsonProperty("skipIfHashMatches")
  private Boolean skipIfHashMatches = null;

  @JsonProperty("slotsPerMapping")
  private Integer slotsPerMapping = null;

  /**
   * Specify if to copy original or set specified timestamp when migration to B2
   */
  public enum UploadTimestampModeEnum {
    ACTUAL("ACTUAL"),
    
    CUSTOM("CUSTOM"),
    
    ORIGINAL("ORIGINAL");

    private String value;

    UploadTimestampModeEnum(String value) {
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
    public static UploadTimestampModeEnum fromValue(String value) {
      for (UploadTimestampModeEnum b : UploadTimestampModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("uploadTimestampMode")
  private UploadTimestampModeEnum uploadTimestampMode = null;

  @JsonProperty("uploadTimestampValue")
  private DateTime uploadTimestampValue = null;

  public MigrationSettingsReq autoRestoreIfArchived(Boolean autoRestoreIfArchived) {
    this.autoRestoreIfArchived = autoRestoreIfArchived;
    return this;
  }

   /**
   * Automatically restore objects from archival tier
   * @return autoRestoreIfArchived
  **/
  @ApiModelProperty(example = "true", value = "Automatically restore objects from archival tier")
  public Boolean isAutoRestoreIfArchived() {
    return autoRestoreIfArchived;
  }

  public void setAutoRestoreIfArchived(Boolean autoRestoreIfArchived) {
    this.autoRestoreIfArchived = autoRestoreIfArchived;
  }

  public MigrationSettingsReq comparisonMethod(ComparisonMethodEnum comparisonMethod) {
    this.comparisonMethod = comparisonMethod;
    return this;
  }

   /**
   * Destination comparison method
   * @return comparisonMethod
  **/
  @ApiModelProperty(example = "LIST_PROBE", value = "Destination comparison method")
  public ComparisonMethodEnum getComparisonMethod() {
    return comparisonMethod;
  }

  public void setComparisonMethod(ComparisonMethodEnum comparisonMethod) {
    this.comparisonMethod = comparisonMethod;
  }

  public MigrationSettingsReq conflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
    return this;
  }

   /**
   * Conflict resolution
   * @return conflictResolution
  **/
  @ApiModelProperty(example = "NEWER", value = "Conflict resolution")
  public ConflictResolutionEnum getConflictResolution() {
    return conflictResolution;
  }

  public void setConflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
  }

  public MigrationSettingsReq deploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * The type of engine deployment
   * @return deploymentType
  **/
  @ApiModelProperty(value = "The type of engine deployment")
  public DeploymentTypeEnum getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
  }

  public MigrationSettingsReq dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Dry run mode
   * @return dryRun
  **/
  @ApiModelProperty(value = "Dry run mode")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public MigrationSettingsReq enginesLocation(CloudLocationReq enginesLocation) {
    this.enginesLocation = enginesLocation;
    return this;
  }

   /**
   * Location of the engines to migrate
   * @return enginesLocation
  **/
  @ApiModelProperty(value = "Location of the engines to migrate")
  public CloudLocationReq getEnginesLocation() {
    return enginesLocation;
  }

  public void setEnginesLocation(CloudLocationReq enginesLocation) {
    this.enginesLocation = enginesLocation;
  }

  public MigrationSettingsReq existingDataInDestination(ExistingDataInDestinationEnum existingDataInDestination) {
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

  public MigrationSettingsReq lastModifiedFrom(DateTime lastModifiedFrom) {
    this.lastModifiedFrom = lastModifiedFrom;
    return this;
  }

   /**
   * Migrate objects modified on or after specified date
   * @return lastModifiedFrom
  **/
  @ApiModelProperty(example = "1593080831081", value = "Migrate objects modified on or after specified date")
  public DateTime getLastModifiedFrom() {
    return lastModifiedFrom;
  }

  public void setLastModifiedFrom(DateTime lastModifiedFrom) {
    this.lastModifiedFrom = lastModifiedFrom;
  }

  public MigrationSettingsReq logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Log level
   * @return logLevel
  **/
  @ApiModelProperty(value = "Log level")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public MigrationSettingsReq maxEngines(Integer maxEngines) {
    this.maxEngines = maxEngines;
    return this;
  }

   /**
   * Maximum number of engines this migration uses (experimental)
   * @return maxEngines
  **/
  @ApiModelProperty(example = "1", value = "Maximum number of engines this migration uses (experimental)")
  public Integer getMaxEngines() {
    return maxEngines;
  }

  public void setMaxEngines(Integer maxEngines) {
    this.maxEngines = maxEngines;
  }

  public MigrationSettingsReq maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Maximum number of retries
   * @return maxRetries
  **/
  @ApiModelProperty(example = "100", value = "Maximum number of retries")
  public Integer getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
  }

  public MigrationSettingsReq maxRetriesForCopy(Integer maxRetriesForCopy) {
    this.maxRetriesForCopy = maxRetriesForCopy;
    return this;
  }

   /**
   * Maximum number of retries after copy started
   * @return maxRetriesForCopy
  **/
  @ApiModelProperty(example = "10", value = "Maximum number of retries after copy started")
  public Integer getMaxRetriesForCopy() {
    return maxRetriesForCopy;
  }

  public void setMaxRetriesForCopy(Integer maxRetriesForCopy) {
    this.maxRetriesForCopy = maxRetriesForCopy;
  }

  public MigrationSettingsReq maxRetryTimeout(Integer maxRetryTimeout) {
    this.maxRetryTimeout = maxRetryTimeout;
    return this;
  }

   /**
   * Maximum timeout between retries in seconds
   * @return maxRetryTimeout
  **/
  @ApiModelProperty(example = "5", value = "Maximum timeout between retries in seconds")
  public Integer getMaxRetryTimeout() {
    return maxRetryTimeout;
  }

  public void setMaxRetryTimeout(Integer maxRetryTimeout) {
    this.maxRetryTimeout = maxRetryTimeout;
  }

  public MigrationSettingsReq maxStreams(Integer maxStreams) {
    this.maxStreams = maxStreams;
    return this;
  }

   /**
   * Maximum streams that migration will use across all engines
   * @return maxStreams
  **/
  @ApiModelProperty(example = "16", value = "Maximum streams that migration will use across all engines")
  public Integer getMaxStreams() {
    return maxStreams;
  }

  public void setMaxStreams(Integer maxStreams) {
    this.maxStreams = maxStreams;
  }

  public MigrationSettingsReq migrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
    return this;
  }

   /**
   * Migration mode
   * @return migrationMode
  **/
  @ApiModelProperty(example = "COPY", value = "Migration mode")
  public MigrationModeEnum getMigrationMode() {
    return migrationMode;
  }

  public void setMigrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
  }

  public MigrationSettingsReq multipartConcurrency(Integer multipartConcurrency) {
    this.multipartConcurrency = multipartConcurrency;
    return this;
  }

   /**
   * Maximum parts for parallel upload for a single object
   * @return multipartConcurrency
  **/
  @ApiModelProperty(example = "16", value = "Maximum parts for parallel upload for a single object")
  public Integer getMultipartConcurrency() {
    return multipartConcurrency;
  }

  public void setMultipartConcurrency(Integer multipartConcurrency) {
    this.multipartConcurrency = multipartConcurrency;
  }

  public MigrationSettingsReq multipartLimit(Long multipartLimit) {
    this.multipartLimit = multipartLimit;
    return this;
  }

   /**
   * Minimum size in bytes for multipart upload
   * @return multipartLimit
  **/
  @ApiModelProperty(example = "524288000", value = "Minimum size in bytes for multipart upload")
  public Long getMultipartLimit() {
    return multipartLimit;
  }

  public void setMultipartLimit(Long multipartLimit) {
    this.multipartLimit = multipartLimit;
  }

  public MigrationSettingsReq multipartPartSize(Long multipartPartSize) {
    this.multipartPartSize = multipartPartSize;
    return this;
  }

   /**
   * Part size for multipart upload
   * @return multipartPartSize
  **/
  @ApiModelProperty(example = "104857600", value = "Part size for multipart upload")
  public Long getMultipartPartSize() {
    return multipartPartSize;
  }

  public void setMultipartPartSize(Long multipartPartSize) {
    this.multipartPartSize = multipartPartSize;
  }

  public MigrationSettingsReq name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the migration
   * @return name
  **/
  @ApiModelProperty(example = "Copy from source to destination", value = "Name of the migration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MigrationSettingsReq objectKeyFilter(String objectKeyFilter) {
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

  public MigrationSettingsReq restoreDays(Integer restoreDays) {
    this.restoreDays = restoreDays;
    return this;
  }

   /**
   * Number of days to keep restored objects when automatically restoring objects from archival tier
   * @return restoreDays
  **/
  @ApiModelProperty(example = "7", value = "Number of days to keep restored objects when automatically restoring objects from archival tier")
  public Integer getRestoreDays() {
    return restoreDays;
  }

  public void setRestoreDays(Integer restoreDays) {
    this.restoreDays = restoreDays;
  }

  public MigrationSettingsReq restoreMaxSize(Long restoreMaxSize) {
    this.restoreMaxSize = restoreMaxSize;
    return this;
  }

   /**
   * Maximum total size of objects to restore when automatically restoring objects from archival tier
   * @return restoreMaxSize
  **/
  @ApiModelProperty(example = "1000000000", value = "Maximum total size of objects to restore when automatically restoring objects from archival tier")
  public Long getRestoreMaxSize() {
    return restoreMaxSize;
  }

  public void setRestoreMaxSize(Long restoreMaxSize) {
    this.restoreMaxSize = restoreMaxSize;
  }

  public MigrationSettingsReq restoreTier(RestoreTierEnum restoreTier) {
    this.restoreTier = restoreTier;
    return this;
  }

   /**
   * Restore tier when automatically restoring objects from archival tier
   * @return restoreTier
  **/
  @ApiModelProperty(example = "BULK", value = "Restore tier when automatically restoring objects from archival tier")
  public RestoreTierEnum getRestoreTier() {
    return restoreTier;
  }

  public void setRestoreTier(RestoreTierEnum restoreTier) {
    this.restoreTier = restoreTier;
  }

  public MigrationSettingsReq retryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
    return this;
  }

   /**
   * Initial timeout between retries in seconds
   * @return retryTimeout
  **/
  @ApiModelProperty(example = "5", value = "Initial timeout between retries in seconds")
  public Integer getRetryTimeout() {
    return retryTimeout;
  }

  public void setRetryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
  }

  public MigrationSettingsReq skipIfHashMatches(Boolean skipIfHashMatches) {
    this.skipIfHashMatches = skipIfHashMatches;
    return this;
  }

   /**
   * Skip migration if source and destination object hash match
   * @return skipIfHashMatches
  **/
  @ApiModelProperty(value = "Skip migration if source and destination object hash match")
  public Boolean isSkipIfHashMatches() {
    return skipIfHashMatches;
  }

  public void setSkipIfHashMatches(Boolean skipIfHashMatches) {
    this.skipIfHashMatches = skipIfHashMatches;
  }

  public MigrationSettingsReq slotsPerMapping(Integer slotsPerMapping) {
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

  public MigrationSettingsReq uploadTimestampMode(UploadTimestampModeEnum uploadTimestampMode) {
    this.uploadTimestampMode = uploadTimestampMode;
    return this;
  }

   /**
   * Specify if to copy original or set specified timestamp when migration to B2
   * @return uploadTimestampMode
  **/
  @ApiModelProperty(value = "Specify if to copy original or set specified timestamp when migration to B2")
  public UploadTimestampModeEnum getUploadTimestampMode() {
    return uploadTimestampMode;
  }

  public void setUploadTimestampMode(UploadTimestampModeEnum uploadTimestampMode) {
    this.uploadTimestampMode = uploadTimestampMode;
  }

  public MigrationSettingsReq uploadTimestampValue(DateTime uploadTimestampValue) {
    this.uploadTimestampValue = uploadTimestampValue;
    return this;
  }

   /**
   * The B2 timestamp value to set if uploadTimestampMode is CUSTOM
   * @return uploadTimestampValue
  **/
  @ApiModelProperty(value = "The B2 timestamp value to set if uploadTimestampMode is CUSTOM")
  public DateTime getUploadTimestampValue() {
    return uploadTimestampValue;
  }

  public void setUploadTimestampValue(DateTime uploadTimestampValue) {
    this.uploadTimestampValue = uploadTimestampValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSettingsReq migrationSettingsReq = (MigrationSettingsReq) o;
    return Objects.equals(this.autoRestoreIfArchived, migrationSettingsReq.autoRestoreIfArchived) &&
        Objects.equals(this.comparisonMethod, migrationSettingsReq.comparisonMethod) &&
        Objects.equals(this.conflictResolution, migrationSettingsReq.conflictResolution) &&
        Objects.equals(this.deploymentType, migrationSettingsReq.deploymentType) &&
        Objects.equals(this.dryRun, migrationSettingsReq.dryRun) &&
        Objects.equals(this.enginesLocation, migrationSettingsReq.enginesLocation) &&
        Objects.equals(this.existingDataInDestination, migrationSettingsReq.existingDataInDestination) &&
        Objects.equals(this.lastModifiedFrom, migrationSettingsReq.lastModifiedFrom) &&
        Objects.equals(this.logLevel, migrationSettingsReq.logLevel) &&
        Objects.equals(this.maxEngines, migrationSettingsReq.maxEngines) &&
        Objects.equals(this.maxRetries, migrationSettingsReq.maxRetries) &&
        Objects.equals(this.maxRetriesForCopy, migrationSettingsReq.maxRetriesForCopy) &&
        Objects.equals(this.maxRetryTimeout, migrationSettingsReq.maxRetryTimeout) &&
        Objects.equals(this.maxStreams, migrationSettingsReq.maxStreams) &&
        Objects.equals(this.migrationMode, migrationSettingsReq.migrationMode) &&
        Objects.equals(this.multipartConcurrency, migrationSettingsReq.multipartConcurrency) &&
        Objects.equals(this.multipartLimit, migrationSettingsReq.multipartLimit) &&
        Objects.equals(this.multipartPartSize, migrationSettingsReq.multipartPartSize) &&
        Objects.equals(this.name, migrationSettingsReq.name) &&
        Objects.equals(this.objectKeyFilter, migrationSettingsReq.objectKeyFilter) &&
        Objects.equals(this.restoreDays, migrationSettingsReq.restoreDays) &&
        Objects.equals(this.restoreMaxSize, migrationSettingsReq.restoreMaxSize) &&
        Objects.equals(this.restoreTier, migrationSettingsReq.restoreTier) &&
        Objects.equals(this.retryTimeout, migrationSettingsReq.retryTimeout) &&
        Objects.equals(this.skipIfHashMatches, migrationSettingsReq.skipIfHashMatches) &&
        Objects.equals(this.slotsPerMapping, migrationSettingsReq.slotsPerMapping) &&
        Objects.equals(this.uploadTimestampMode, migrationSettingsReq.uploadTimestampMode) &&
        Objects.equals(this.uploadTimestampValue, migrationSettingsReq.uploadTimestampValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRestoreIfArchived, comparisonMethod, conflictResolution, deploymentType, dryRun, enginesLocation, existingDataInDestination, lastModifiedFrom, logLevel, maxEngines, maxRetries, maxRetriesForCopy, maxRetryTimeout, maxStreams, migrationMode, multipartConcurrency, multipartLimit, multipartPartSize, name, objectKeyFilter, restoreDays, restoreMaxSize, restoreTier, retryTimeout, skipIfHashMatches, slotsPerMapping, uploadTimestampMode, uploadTimestampValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSettingsReq {\n");
    
    sb.append("    autoRestoreIfArchived: ").append(toIndentedString(autoRestoreIfArchived)).append("\n");
    sb.append("    comparisonMethod: ").append(toIndentedString(comparisonMethod)).append("\n");
    sb.append("    conflictResolution: ").append(toIndentedString(conflictResolution)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    enginesLocation: ").append(toIndentedString(enginesLocation)).append("\n");
    sb.append("    existingDataInDestination: ").append(toIndentedString(existingDataInDestination)).append("\n");
    sb.append("    lastModifiedFrom: ").append(toIndentedString(lastModifiedFrom)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    maxEngines: ").append(toIndentedString(maxEngines)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxRetriesForCopy: ").append(toIndentedString(maxRetriesForCopy)).append("\n");
    sb.append("    maxRetryTimeout: ").append(toIndentedString(maxRetryTimeout)).append("\n");
    sb.append("    maxStreams: ").append(toIndentedString(maxStreams)).append("\n");
    sb.append("    migrationMode: ").append(toIndentedString(migrationMode)).append("\n");
    sb.append("    multipartConcurrency: ").append(toIndentedString(multipartConcurrency)).append("\n");
    sb.append("    multipartLimit: ").append(toIndentedString(multipartLimit)).append("\n");
    sb.append("    multipartPartSize: ").append(toIndentedString(multipartPartSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectKeyFilter: ").append(toIndentedString(objectKeyFilter)).append("\n");
    sb.append("    restoreDays: ").append(toIndentedString(restoreDays)).append("\n");
    sb.append("    restoreMaxSize: ").append(toIndentedString(restoreMaxSize)).append("\n");
    sb.append("    restoreTier: ").append(toIndentedString(restoreTier)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
    sb.append("    skipIfHashMatches: ").append(toIndentedString(skipIfHashMatches)).append("\n");
    sb.append("    slotsPerMapping: ").append(toIndentedString(slotsPerMapping)).append("\n");
    sb.append("    uploadTimestampMode: ").append(toIndentedString(uploadTimestampMode)).append("\n");
    sb.append("    uploadTimestampValue: ").append(toIndentedString(uploadTimestampValue)).append("\n");
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

