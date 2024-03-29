/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.2
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
import io.flexify.apiclient.model.LogEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * Log entry
 */
@ApiModel(description = "Log entry")

public class LogEntry {
  @JsonProperty("endpointId")
  private Long endpointId = null;

  @JsonProperty("engineUuid")
  private UUID engineUuid = null;

  @JsonProperty("event")
  private LogEvent event = null;

  @JsonProperty("migrationId")
  private Long migrationId = null;

  @JsonProperty("storageAccountId")
  private Long storageAccountId = null;

  @JsonProperty("storageId")
  private Long storageId = null;

  @JsonProperty("taskUuid")
  private UUID taskUuid = null;

  public LogEntry endpointId(Long endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Flexify endpoint related to this event, if any
   * @return endpointId
  **/
  @ApiModelProperty(value = "Flexify endpoint related to this event, if any")
  public Long getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(Long endpointId) {
    this.endpointId = endpointId;
  }

  public LogEntry engineUuid(UUID engineUuid) {
    this.engineUuid = engineUuid;
    return this;
  }

   /**
   * Engine with which this endpoint is associated
   * @return engineUuid
  **/
  @ApiModelProperty(value = "Engine with which this endpoint is associated")
  public UUID getEngineUuid() {
    return engineUuid;
  }

  public void setEngineUuid(UUID engineUuid) {
    this.engineUuid = engineUuid;
  }

  public LogEntry event(LogEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Log event
   * @return event
  **/
  @ApiModelProperty(value = "Log event")
  public LogEvent getEvent() {
    return event;
  }

  public void setEvent(LogEvent event) {
    this.event = event;
  }

  public LogEntry migrationId(Long migrationId) {
    this.migrationId = migrationId;
    return this;
  }

   /**
   * Migration related to this event, if any
   * @return migrationId
  **/
  @ApiModelProperty(value = "Migration related to this event, if any")
  public Long getMigrationId() {
    return migrationId;
  }

  public void setMigrationId(Long migrationId) {
    this.migrationId = migrationId;
  }

  public LogEntry storageAccountId(Long storageAccountId) {
    this.storageAccountId = storageAccountId;
    return this;
  }

   /**
   * Storage account related to this event, if any
   * @return storageAccountId
  **/
  @ApiModelProperty(value = "Storage account related to this event, if any")
  public Long getStorageAccountId() {
    return storageAccountId;
  }

  public void setStorageAccountId(Long storageAccountId) {
    this.storageAccountId = storageAccountId;
  }

  public LogEntry storageId(Long storageId) {
    this.storageId = storageId;
    return this;
  }

   /**
   * Storage related to this event, if any
   * @return storageId
  **/
  @ApiModelProperty(value = "Storage related to this event, if any")
  public Long getStorageId() {
    return storageId;
  }

  public void setStorageId(Long storageId) {
    this.storageId = storageId;
  }

  public LogEntry taskUuid(UUID taskUuid) {
    this.taskUuid = taskUuid;
    return this;
  }

   /**
   * Task UUID related to this event, if any (NOT that the task might be already deleted)
   * @return taskUuid
  **/
  @ApiModelProperty(value = "Task UUID related to this event, if any (NOT that the task might be already deleted)")
  public UUID getTaskUuid() {
    return taskUuid;
  }

  public void setTaskUuid(UUID taskUuid) {
    this.taskUuid = taskUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEntry logEntry = (LogEntry) o;
    return Objects.equals(this.endpointId, logEntry.endpointId) &&
        Objects.equals(this.engineUuid, logEntry.engineUuid) &&
        Objects.equals(this.event, logEntry.event) &&
        Objects.equals(this.migrationId, logEntry.migrationId) &&
        Objects.equals(this.storageAccountId, logEntry.storageAccountId) &&
        Objects.equals(this.storageId, logEntry.storageId) &&
        Objects.equals(this.taskUuid, logEntry.taskUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, engineUuid, event, migrationId, storageAccountId, storageId, taskUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEntry {\n");
    
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    engineUuid: ").append(toIndentedString(engineUuid)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    migrationId: ").append(toIndentedString(migrationId)).append("\n");
    sb.append("    storageAccountId: ").append(toIndentedString(storageAccountId)).append("\n");
    sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
    sb.append("    taskUuid: ").append(toIndentedString(taskUuid)).append("\n");
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

