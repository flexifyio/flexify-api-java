/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.16-SNAPSHOT
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * CleanupStat
 */

public class CleanupStat {
  @JsonProperty("activeEngines")
  private Long activeEngines = null;

  @JsonProperty("activeStreams")
  private Long activeStreams = null;

  @JsonProperty("bytesFailed")
  private Long bytesFailed = null;

  @JsonProperty("bytesNotMatchingPattern")
  private Long bytesNotMatchingPattern = null;

  @JsonProperty("bytesProcessed")
  private Long bytesProcessed = null;

  @JsonProperty("bytesRemoved")
  private Long bytesRemoved = null;

  @JsonProperty("bytesSkipped")
  private Long bytesSkipped = null;

  @JsonProperty("finished")
  private DateTime finished = null;

  @JsonProperty("objectsFailed")
  private Long objectsFailed = null;

  @JsonProperty("objectsNotMatchingPattern")
  private Long objectsNotMatchingPattern = null;

  @JsonProperty("objectsProcessed")
  private Long objectsProcessed = null;

  @JsonProperty("objectsRemoved")
  private Long objectsRemoved = null;

  @JsonProperty("objectsSkipped")
  private Long objectsSkipped = null;

  @JsonProperty("processingObjectsPerSecond")
  private Double processingObjectsPerSecond = null;

  @JsonProperty("removingObjectsPerSecond")
  private Double removingObjectsPerSecond = null;

  @JsonProperty("retried")
  private Long retried = null;

  @JsonProperty("started")
  private DateTime started = null;

  /**
   * State of migration on its part
   */
  public enum StateEnum {
    DEPLOYING("DEPLOYING"),
    
    FAILED("FAILED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    NO_CONNECTION_TO_ENGINE("NO_CONNECTION_TO_ENGINE"),
    
    RESTARTING("RESTARTING"),
    
    STARTING("STARTING"),
    
    STOPPED("STOPPED"),
    
    STOPPING("STOPPING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    WAITING("WAITING");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  public CleanupStat activeEngines(Long activeEngines) {
    this.activeEngines = activeEngines;
    return this;
  }

   /**
   * Number of engines that are busy with this
   * @return activeEngines
  **/
  @ApiModelProperty(value = "Number of engines that are busy with this")
  public Long getActiveEngines() {
    return activeEngines;
  }

  public void setActiveEngines(Long activeEngines) {
    this.activeEngines = activeEngines;
  }

  public CleanupStat activeStreams(Long activeStreams) {
    this.activeStreams = activeStreams;
    return this;
  }

   /**
   * Number of currently active streams
   * @return activeStreams
  **/
  @ApiModelProperty(value = "Number of currently active streams")
  public Long getActiveStreams() {
    return activeStreams;
  }

  public void setActiveStreams(Long activeStreams) {
    this.activeStreams = activeStreams;
  }

  public CleanupStat bytesFailed(Long bytesFailed) {
    this.bytesFailed = bytesFailed;
    return this;
  }

   /**
   * Get bytesFailed
   * @return bytesFailed
  **/
  @ApiModelProperty(value = "")
  public Long getBytesFailed() {
    return bytesFailed;
  }

  public void setBytesFailed(Long bytesFailed) {
    this.bytesFailed = bytesFailed;
  }

  public CleanupStat bytesNotMatchingPattern(Long bytesNotMatchingPattern) {
    this.bytesNotMatchingPattern = bytesNotMatchingPattern;
    return this;
  }

   /**
   * Get bytesNotMatchingPattern
   * @return bytesNotMatchingPattern
  **/
  @ApiModelProperty(value = "")
  public Long getBytesNotMatchingPattern() {
    return bytesNotMatchingPattern;
  }

  public void setBytesNotMatchingPattern(Long bytesNotMatchingPattern) {
    this.bytesNotMatchingPattern = bytesNotMatchingPattern;
  }

  public CleanupStat bytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
    return this;
  }

   /**
   * Get bytesProcessed
   * @return bytesProcessed
  **/
  @ApiModelProperty(value = "")
  public Long getBytesProcessed() {
    return bytesProcessed;
  }

  public void setBytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
  }

  public CleanupStat bytesRemoved(Long bytesRemoved) {
    this.bytesRemoved = bytesRemoved;
    return this;
  }

   /**
   * Get bytesRemoved
   * @return bytesRemoved
  **/
  @ApiModelProperty(value = "")
  public Long getBytesRemoved() {
    return bytesRemoved;
  }

  public void setBytesRemoved(Long bytesRemoved) {
    this.bytesRemoved = bytesRemoved;
  }

  public CleanupStat bytesSkipped(Long bytesSkipped) {
    this.bytesSkipped = bytesSkipped;
    return this;
  }

   /**
   * Get bytesSkipped
   * @return bytesSkipped
  **/
  @ApiModelProperty(value = "")
  public Long getBytesSkipped() {
    return bytesSkipped;
  }

  public void setBytesSkipped(Long bytesSkipped) {
    this.bytesSkipped = bytesSkipped;
  }

  public CleanupStat finished(DateTime finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Finished time
   * @return finished
  **/
  @ApiModelProperty(value = "Finished time")
  public DateTime getFinished() {
    return finished;
  }

  public void setFinished(DateTime finished) {
    this.finished = finished;
  }

  public CleanupStat objectsFailed(Long objectsFailed) {
    this.objectsFailed = objectsFailed;
    return this;
  }

   /**
   * Get objectsFailed
   * @return objectsFailed
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsFailed() {
    return objectsFailed;
  }

  public void setObjectsFailed(Long objectsFailed) {
    this.objectsFailed = objectsFailed;
  }

  public CleanupStat objectsNotMatchingPattern(Long objectsNotMatchingPattern) {
    this.objectsNotMatchingPattern = objectsNotMatchingPattern;
    return this;
  }

   /**
   * Get objectsNotMatchingPattern
   * @return objectsNotMatchingPattern
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsNotMatchingPattern() {
    return objectsNotMatchingPattern;
  }

  public void setObjectsNotMatchingPattern(Long objectsNotMatchingPattern) {
    this.objectsNotMatchingPattern = objectsNotMatchingPattern;
  }

  public CleanupStat objectsProcessed(Long objectsProcessed) {
    this.objectsProcessed = objectsProcessed;
    return this;
  }

   /**
   * Get objectsProcessed
   * @return objectsProcessed
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsProcessed() {
    return objectsProcessed;
  }

  public void setObjectsProcessed(Long objectsProcessed) {
    this.objectsProcessed = objectsProcessed;
  }

  public CleanupStat objectsRemoved(Long objectsRemoved) {
    this.objectsRemoved = objectsRemoved;
    return this;
  }

   /**
   * Get objectsRemoved
   * @return objectsRemoved
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsRemoved() {
    return objectsRemoved;
  }

  public void setObjectsRemoved(Long objectsRemoved) {
    this.objectsRemoved = objectsRemoved;
  }

  public CleanupStat objectsSkipped(Long objectsSkipped) {
    this.objectsSkipped = objectsSkipped;
    return this;
  }

   /**
   * Get objectsSkipped
   * @return objectsSkipped
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsSkipped() {
    return objectsSkipped;
  }

  public void setObjectsSkipped(Long objectsSkipped) {
    this.objectsSkipped = objectsSkipped;
  }

  public CleanupStat processingObjectsPerSecond(Double processingObjectsPerSecond) {
    this.processingObjectsPerSecond = processingObjectsPerSecond;
    return this;
  }

   /**
   * Objects/second processed
   * @return processingObjectsPerSecond
  **/
  @ApiModelProperty(value = "Objects/second processed")
  public Double getProcessingObjectsPerSecond() {
    return processingObjectsPerSecond;
  }

  public void setProcessingObjectsPerSecond(Double processingObjectsPerSecond) {
    this.processingObjectsPerSecond = processingObjectsPerSecond;
  }

  public CleanupStat removingObjectsPerSecond(Double removingObjectsPerSecond) {
    this.removingObjectsPerSecond = removingObjectsPerSecond;
    return this;
  }

   /**
   * Get removingObjectsPerSecond
   * @return removingObjectsPerSecond
  **/
  @ApiModelProperty(value = "")
  public Double getRemovingObjectsPerSecond() {
    return removingObjectsPerSecond;
  }

  public void setRemovingObjectsPerSecond(Double removingObjectsPerSecond) {
    this.removingObjectsPerSecond = removingObjectsPerSecond;
  }

  public CleanupStat retried(Long retried) {
    this.retried = retried;
    return this;
  }

   /**
   * Number of retries
   * @return retried
  **/
  @ApiModelProperty(value = "Number of retries")
  public Long getRetried() {
    return retried;
  }

  public void setRetried(Long retried) {
    this.retried = retried;
  }

  public CleanupStat started(DateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Started time
   * @return started
  **/
  @ApiModelProperty(value = "Started time")
  public DateTime getStarted() {
    return started;
  }

  public void setStarted(DateTime started) {
    this.started = started;
  }

  public CleanupStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of migration on its part
   * @return state
  **/
  @ApiModelProperty(example = "IN_PROGRESS", value = "State of migration on its part")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanupStat cleanupStat = (CleanupStat) o;
    return Objects.equals(this.activeEngines, cleanupStat.activeEngines) &&
        Objects.equals(this.activeStreams, cleanupStat.activeStreams) &&
        Objects.equals(this.bytesFailed, cleanupStat.bytesFailed) &&
        Objects.equals(this.bytesNotMatchingPattern, cleanupStat.bytesNotMatchingPattern) &&
        Objects.equals(this.bytesProcessed, cleanupStat.bytesProcessed) &&
        Objects.equals(this.bytesRemoved, cleanupStat.bytesRemoved) &&
        Objects.equals(this.bytesSkipped, cleanupStat.bytesSkipped) &&
        Objects.equals(this.finished, cleanupStat.finished) &&
        Objects.equals(this.objectsFailed, cleanupStat.objectsFailed) &&
        Objects.equals(this.objectsNotMatchingPattern, cleanupStat.objectsNotMatchingPattern) &&
        Objects.equals(this.objectsProcessed, cleanupStat.objectsProcessed) &&
        Objects.equals(this.objectsRemoved, cleanupStat.objectsRemoved) &&
        Objects.equals(this.objectsSkipped, cleanupStat.objectsSkipped) &&
        Objects.equals(this.processingObjectsPerSecond, cleanupStat.processingObjectsPerSecond) &&
        Objects.equals(this.removingObjectsPerSecond, cleanupStat.removingObjectsPerSecond) &&
        Objects.equals(this.retried, cleanupStat.retried) &&
        Objects.equals(this.started, cleanupStat.started) &&
        Objects.equals(this.state, cleanupStat.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeEngines, activeStreams, bytesFailed, bytesNotMatchingPattern, bytesProcessed, bytesRemoved, bytesSkipped, finished, objectsFailed, objectsNotMatchingPattern, objectsProcessed, objectsRemoved, objectsSkipped, processingObjectsPerSecond, removingObjectsPerSecond, retried, started, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanupStat {\n");
    
    sb.append("    activeEngines: ").append(toIndentedString(activeEngines)).append("\n");
    sb.append("    activeStreams: ").append(toIndentedString(activeStreams)).append("\n");
    sb.append("    bytesFailed: ").append(toIndentedString(bytesFailed)).append("\n");
    sb.append("    bytesNotMatchingPattern: ").append(toIndentedString(bytesNotMatchingPattern)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesRemoved: ").append(toIndentedString(bytesRemoved)).append("\n");
    sb.append("    bytesSkipped: ").append(toIndentedString(bytesSkipped)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    objectsFailed: ").append(toIndentedString(objectsFailed)).append("\n");
    sb.append("    objectsNotMatchingPattern: ").append(toIndentedString(objectsNotMatchingPattern)).append("\n");
    sb.append("    objectsProcessed: ").append(toIndentedString(objectsProcessed)).append("\n");
    sb.append("    objectsRemoved: ").append(toIndentedString(objectsRemoved)).append("\n");
    sb.append("    objectsSkipped: ").append(toIndentedString(objectsSkipped)).append("\n");
    sb.append("    processingObjectsPerSecond: ").append(toIndentedString(processingObjectsPerSecond)).append("\n");
    sb.append("    removingObjectsPerSecond: ").append(toIndentedString(removingObjectsPerSecond)).append("\n");
    sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

