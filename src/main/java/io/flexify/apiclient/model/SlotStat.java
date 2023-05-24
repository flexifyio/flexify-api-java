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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * SlotStat
 */

public class SlotStat {
  @JsonProperty("activeEngines")
  private Long activeEngines = null;

  @JsonProperty("activeStreams")
  private Long activeStreams = null;

  @JsonProperty("bytesFailed")
  private Long bytesFailed = null;

  @JsonProperty("bytesGlacierRestoreStarted")
  private Long bytesGlacierRestoreStarted = null;

  @JsonProperty("bytesNotMatchingPattern")
  private Long bytesNotMatchingPattern = null;

  @JsonProperty("bytesProcessed")
  private Long bytesProcessed = null;

  @JsonProperty("bytesSkipped")
  private Long bytesSkipped = null;

  @JsonProperty("bytesSkippedGlacier")
  private Long bytesSkippedGlacier = null;

  @JsonProperty("bytesUploaded")
  private Long bytesUploaded = null;

  @JsonProperty("dstRegion")
  private String dstRegion = null;

  @JsonProperty("finished")
  private DateTime finished = null;

  @JsonProperty("objectsFailed")
  private Long objectsFailed = null;

  @JsonProperty("objectsGlacierRestoreStarted")
  private Long objectsGlacierRestoreStarted = null;

  @JsonProperty("objectsNotMatchingPattern")
  private Long objectsNotMatchingPattern = null;

  @JsonProperty("objectsProcessed")
  private Long objectsProcessed = null;

  @JsonProperty("objectsSkipped")
  private Long objectsSkipped = null;

  @JsonProperty("objectsSkippedGlacier")
  private Long objectsSkippedGlacier = null;

  @JsonProperty("objectsUploaded")
  private Long objectsUploaded = null;

  @JsonProperty("processingObjectsPerSecond")
  private Double processingObjectsPerSecond = null;

  @JsonProperty("retried")
  private Long retried = null;

  @JsonProperty("srcRegion")
  private String srcRegion = null;

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

  @JsonProperty("totalUpload")
  private Long totalUpload = null;

  @JsonProperty("uploadingBytesPerSecond")
  private Double uploadingBytesPerSecond = null;

  @JsonProperty("uploadingObjectsPerSecond")
  private Double uploadingObjectsPerSecond = null;

  public SlotStat activeEngines(Long activeEngines) {
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

  public SlotStat activeStreams(Long activeStreams) {
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

  public SlotStat bytesFailed(Long bytesFailed) {
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

  public SlotStat bytesGlacierRestoreStarted(Long bytesGlacierRestoreStarted) {
    this.bytesGlacierRestoreStarted = bytesGlacierRestoreStarted;
    return this;
  }

   /**
   * Get bytesGlacierRestoreStarted
   * @return bytesGlacierRestoreStarted
  **/
  @ApiModelProperty(value = "")
  public Long getBytesGlacierRestoreStarted() {
    return bytesGlacierRestoreStarted;
  }

  public void setBytesGlacierRestoreStarted(Long bytesGlacierRestoreStarted) {
    this.bytesGlacierRestoreStarted = bytesGlacierRestoreStarted;
  }

  public SlotStat bytesNotMatchingPattern(Long bytesNotMatchingPattern) {
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

  public SlotStat bytesProcessed(Long bytesProcessed) {
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

  public SlotStat bytesSkipped(Long bytesSkipped) {
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

  public SlotStat bytesSkippedGlacier(Long bytesSkippedGlacier) {
    this.bytesSkippedGlacier = bytesSkippedGlacier;
    return this;
  }

   /**
   * Get bytesSkippedGlacier
   * @return bytesSkippedGlacier
  **/
  @ApiModelProperty(value = "")
  public Long getBytesSkippedGlacier() {
    return bytesSkippedGlacier;
  }

  public void setBytesSkippedGlacier(Long bytesSkippedGlacier) {
    this.bytesSkippedGlacier = bytesSkippedGlacier;
  }

  public SlotStat bytesUploaded(Long bytesUploaded) {
    this.bytesUploaded = bytesUploaded;
    return this;
  }

   /**
   * Get bytesUploaded
   * @return bytesUploaded
  **/
  @ApiModelProperty(value = "")
  public Long getBytesUploaded() {
    return bytesUploaded;
  }

  public void setBytesUploaded(Long bytesUploaded) {
    this.bytesUploaded = bytesUploaded;
  }

  public SlotStat dstRegion(String dstRegion) {
    this.dstRegion = dstRegion;
    return this;
  }

   /**
   * Get dstRegion
   * @return dstRegion
  **/
  @ApiModelProperty(value = "")
  public String getDstRegion() {
    return dstRegion;
  }

  public void setDstRegion(String dstRegion) {
    this.dstRegion = dstRegion;
  }

  public SlotStat finished(DateTime finished) {
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

  public SlotStat objectsFailed(Long objectsFailed) {
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

  public SlotStat objectsGlacierRestoreStarted(Long objectsGlacierRestoreStarted) {
    this.objectsGlacierRestoreStarted = objectsGlacierRestoreStarted;
    return this;
  }

   /**
   * Get objectsGlacierRestoreStarted
   * @return objectsGlacierRestoreStarted
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsGlacierRestoreStarted() {
    return objectsGlacierRestoreStarted;
  }

  public void setObjectsGlacierRestoreStarted(Long objectsGlacierRestoreStarted) {
    this.objectsGlacierRestoreStarted = objectsGlacierRestoreStarted;
  }

  public SlotStat objectsNotMatchingPattern(Long objectsNotMatchingPattern) {
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

  public SlotStat objectsProcessed(Long objectsProcessed) {
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

  public SlotStat objectsSkipped(Long objectsSkipped) {
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

  public SlotStat objectsSkippedGlacier(Long objectsSkippedGlacier) {
    this.objectsSkippedGlacier = objectsSkippedGlacier;
    return this;
  }

   /**
   * Get objectsSkippedGlacier
   * @return objectsSkippedGlacier
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsSkippedGlacier() {
    return objectsSkippedGlacier;
  }

  public void setObjectsSkippedGlacier(Long objectsSkippedGlacier) {
    this.objectsSkippedGlacier = objectsSkippedGlacier;
  }

  public SlotStat objectsUploaded(Long objectsUploaded) {
    this.objectsUploaded = objectsUploaded;
    return this;
  }

   /**
   * Get objectsUploaded
   * @return objectsUploaded
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsUploaded() {
    return objectsUploaded;
  }

  public void setObjectsUploaded(Long objectsUploaded) {
    this.objectsUploaded = objectsUploaded;
  }

  public SlotStat processingObjectsPerSecond(Double processingObjectsPerSecond) {
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

  public SlotStat retried(Long retried) {
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

  public SlotStat srcRegion(String srcRegion) {
    this.srcRegion = srcRegion;
    return this;
  }

   /**
   * Get srcRegion
   * @return srcRegion
  **/
  @ApiModelProperty(value = "")
  public String getSrcRegion() {
    return srcRegion;
  }

  public void setSrcRegion(String srcRegion) {
    this.srcRegion = srcRegion;
  }

  public SlotStat started(DateTime started) {
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

  public SlotStat state(StateEnum state) {
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

  public SlotStat totalUpload(Long totalUpload) {
    this.totalUpload = totalUpload;
    return this;
  }

   /**
   * Get totalUpload
   * @return totalUpload
  **/
  @ApiModelProperty(value = "")
  public Long getTotalUpload() {
    return totalUpload;
  }

  public void setTotalUpload(Long totalUpload) {
    this.totalUpload = totalUpload;
  }

  public SlotStat uploadingBytesPerSecond(Double uploadingBytesPerSecond) {
    this.uploadingBytesPerSecond = uploadingBytesPerSecond;
    return this;
  }

   /**
   * Get uploadingBytesPerSecond
   * @return uploadingBytesPerSecond
  **/
  @ApiModelProperty(value = "")
  public Double getUploadingBytesPerSecond() {
    return uploadingBytesPerSecond;
  }

  public void setUploadingBytesPerSecond(Double uploadingBytesPerSecond) {
    this.uploadingBytesPerSecond = uploadingBytesPerSecond;
  }

  public SlotStat uploadingObjectsPerSecond(Double uploadingObjectsPerSecond) {
    this.uploadingObjectsPerSecond = uploadingObjectsPerSecond;
    return this;
  }

   /**
   * Get uploadingObjectsPerSecond
   * @return uploadingObjectsPerSecond
  **/
  @ApiModelProperty(value = "")
  public Double getUploadingObjectsPerSecond() {
    return uploadingObjectsPerSecond;
  }

  public void setUploadingObjectsPerSecond(Double uploadingObjectsPerSecond) {
    this.uploadingObjectsPerSecond = uploadingObjectsPerSecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotStat slotStat = (SlotStat) o;
    return Objects.equals(this.activeEngines, slotStat.activeEngines) &&
        Objects.equals(this.activeStreams, slotStat.activeStreams) &&
        Objects.equals(this.bytesFailed, slotStat.bytesFailed) &&
        Objects.equals(this.bytesGlacierRestoreStarted, slotStat.bytesGlacierRestoreStarted) &&
        Objects.equals(this.bytesNotMatchingPattern, slotStat.bytesNotMatchingPattern) &&
        Objects.equals(this.bytesProcessed, slotStat.bytesProcessed) &&
        Objects.equals(this.bytesSkipped, slotStat.bytesSkipped) &&
        Objects.equals(this.bytesSkippedGlacier, slotStat.bytesSkippedGlacier) &&
        Objects.equals(this.bytesUploaded, slotStat.bytesUploaded) &&
        Objects.equals(this.dstRegion, slotStat.dstRegion) &&
        Objects.equals(this.finished, slotStat.finished) &&
        Objects.equals(this.objectsFailed, slotStat.objectsFailed) &&
        Objects.equals(this.objectsGlacierRestoreStarted, slotStat.objectsGlacierRestoreStarted) &&
        Objects.equals(this.objectsNotMatchingPattern, slotStat.objectsNotMatchingPattern) &&
        Objects.equals(this.objectsProcessed, slotStat.objectsProcessed) &&
        Objects.equals(this.objectsSkipped, slotStat.objectsSkipped) &&
        Objects.equals(this.objectsSkippedGlacier, slotStat.objectsSkippedGlacier) &&
        Objects.equals(this.objectsUploaded, slotStat.objectsUploaded) &&
        Objects.equals(this.processingObjectsPerSecond, slotStat.processingObjectsPerSecond) &&
        Objects.equals(this.retried, slotStat.retried) &&
        Objects.equals(this.srcRegion, slotStat.srcRegion) &&
        Objects.equals(this.started, slotStat.started) &&
        Objects.equals(this.state, slotStat.state) &&
        Objects.equals(this.totalUpload, slotStat.totalUpload) &&
        Objects.equals(this.uploadingBytesPerSecond, slotStat.uploadingBytesPerSecond) &&
        Objects.equals(this.uploadingObjectsPerSecond, slotStat.uploadingObjectsPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeEngines, activeStreams, bytesFailed, bytesGlacierRestoreStarted, bytesNotMatchingPattern, bytesProcessed, bytesSkipped, bytesSkippedGlacier, bytesUploaded, dstRegion, finished, objectsFailed, objectsGlacierRestoreStarted, objectsNotMatchingPattern, objectsProcessed, objectsSkipped, objectsSkippedGlacier, objectsUploaded, processingObjectsPerSecond, retried, srcRegion, started, state, totalUpload, uploadingBytesPerSecond, uploadingObjectsPerSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotStat {\n");
    
    sb.append("    activeEngines: ").append(toIndentedString(activeEngines)).append("\n");
    sb.append("    activeStreams: ").append(toIndentedString(activeStreams)).append("\n");
    sb.append("    bytesFailed: ").append(toIndentedString(bytesFailed)).append("\n");
    sb.append("    bytesGlacierRestoreStarted: ").append(toIndentedString(bytesGlacierRestoreStarted)).append("\n");
    sb.append("    bytesNotMatchingPattern: ").append(toIndentedString(bytesNotMatchingPattern)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesSkipped: ").append(toIndentedString(bytesSkipped)).append("\n");
    sb.append("    bytesSkippedGlacier: ").append(toIndentedString(bytesSkippedGlacier)).append("\n");
    sb.append("    bytesUploaded: ").append(toIndentedString(bytesUploaded)).append("\n");
    sb.append("    dstRegion: ").append(toIndentedString(dstRegion)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    objectsFailed: ").append(toIndentedString(objectsFailed)).append("\n");
    sb.append("    objectsGlacierRestoreStarted: ").append(toIndentedString(objectsGlacierRestoreStarted)).append("\n");
    sb.append("    objectsNotMatchingPattern: ").append(toIndentedString(objectsNotMatchingPattern)).append("\n");
    sb.append("    objectsProcessed: ").append(toIndentedString(objectsProcessed)).append("\n");
    sb.append("    objectsSkipped: ").append(toIndentedString(objectsSkipped)).append("\n");
    sb.append("    objectsSkippedGlacier: ").append(toIndentedString(objectsSkippedGlacier)).append("\n");
    sb.append("    objectsUploaded: ").append(toIndentedString(objectsUploaded)).append("\n");
    sb.append("    processingObjectsPerSecond: ").append(toIndentedString(processingObjectsPerSecond)).append("\n");
    sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
    sb.append("    srcRegion: ").append(toIndentedString(srcRegion)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalUpload: ").append(toIndentedString(totalUpload)).append("\n");
    sb.append("    uploadingBytesPerSecond: ").append(toIndentedString(uploadingBytesPerSecond)).append("\n");
    sb.append("    uploadingObjectsPerSecond: ").append(toIndentedString(uploadingObjectsPerSecond)).append("\n");
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

