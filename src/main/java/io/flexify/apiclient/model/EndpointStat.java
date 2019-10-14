/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.8.5
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

/**
 * EndpointStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T13:08:44.282+08:00")
public class EndpointStat {
  @JsonProperty("cloudDownloadBytes")
  private Long cloudDownloadBytes = null;

  @JsonProperty("cloudUploadBytes")
  private Long cloudUploadBytes = null;

  @JsonProperty("errorEngines")
  private Long errorEngines = null;

  /**
   * Gets or Sets health
   */
  public enum HealthEnum {
    HEALTHY("HEALTHY"),
    
    WARNING("WARNING"),
    
    ERROR("ERROR");

    private String value;

    HealthEnum(String value) {
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
    public static HealthEnum fromValue(String text) {
      for (HealthEnum b : HealthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("health")
  private HealthEnum health = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ENABLING("ENABLING"),
    
    ENABLED("ENABLED"),
    
    ERROR("ERROR"),
    
    WARNING("WARNING"),
    
    NOT_ASSIGNED("NOT_ASSIGNED"),
    
    DISABLING("DISABLING"),
    
    DISABLED("DISABLED"),
    
    UPDATING("UPDATING"),
    
    DELETING("DELETING");

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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("totalEngines")
  private Long totalEngines = null;

  @JsonProperty("upToDateEngines")
  private Long upToDateEngines = null;

  @JsonProperty("userDownloadBytes")
  private Long userDownloadBytes = null;

  @JsonProperty("userSpeedDownload")
  private Long userSpeedDownload = null;

  @JsonProperty("userSpeedUpload")
  private Long userSpeedUpload = null;

  @JsonProperty("userUploadBytes")
  private Long userUploadBytes = null;

  @JsonProperty("warningEngines")
  private Long warningEngines = null;

  public EndpointStat cloudDownloadBytes(Long cloudDownloadBytes) {
    this.cloudDownloadBytes = cloudDownloadBytes;
    return this;
  }

   /**
   * Get cloudDownloadBytes
   * @return cloudDownloadBytes
  **/
  @ApiModelProperty(value = "")
  public Long getCloudDownloadBytes() {
    return cloudDownloadBytes;
  }

  public void setCloudDownloadBytes(Long cloudDownloadBytes) {
    this.cloudDownloadBytes = cloudDownloadBytes;
  }

  public EndpointStat cloudUploadBytes(Long cloudUploadBytes) {
    this.cloudUploadBytes = cloudUploadBytes;
    return this;
  }

   /**
   * Get cloudUploadBytes
   * @return cloudUploadBytes
  **/
  @ApiModelProperty(value = "")
  public Long getCloudUploadBytes() {
    return cloudUploadBytes;
  }

  public void setCloudUploadBytes(Long cloudUploadBytes) {
    this.cloudUploadBytes = cloudUploadBytes;
  }

  public EndpointStat errorEngines(Long errorEngines) {
    this.errorEngines = errorEngines;
    return this;
  }

   /**
   * Get errorEngines
   * @return errorEngines
  **/
  @ApiModelProperty(value = "")
  public Long getErrorEngines() {
    return errorEngines;
  }

  public void setErrorEngines(Long errorEngines) {
    this.errorEngines = errorEngines;
  }

  public EndpointStat health(HealthEnum health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @ApiModelProperty(value = "")
  public HealthEnum getHealth() {
    return health;
  }

  public void setHealth(HealthEnum health) {
    this.health = health;
  }

  public EndpointStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public EndpointStat totalEngines(Long totalEngines) {
    this.totalEngines = totalEngines;
    return this;
  }

   /**
   * Get totalEngines
   * @return totalEngines
  **/
  @ApiModelProperty(value = "")
  public Long getTotalEngines() {
    return totalEngines;
  }

  public void setTotalEngines(Long totalEngines) {
    this.totalEngines = totalEngines;
  }

  public EndpointStat upToDateEngines(Long upToDateEngines) {
    this.upToDateEngines = upToDateEngines;
    return this;
  }

   /**
   * Get upToDateEngines
   * @return upToDateEngines
  **/
  @ApiModelProperty(value = "")
  public Long getUpToDateEngines() {
    return upToDateEngines;
  }

  public void setUpToDateEngines(Long upToDateEngines) {
    this.upToDateEngines = upToDateEngines;
  }

  public EndpointStat userDownloadBytes(Long userDownloadBytes) {
    this.userDownloadBytes = userDownloadBytes;
    return this;
  }

   /**
   * Get userDownloadBytes
   * @return userDownloadBytes
  **/
  @ApiModelProperty(value = "")
  public Long getUserDownloadBytes() {
    return userDownloadBytes;
  }

  public void setUserDownloadBytes(Long userDownloadBytes) {
    this.userDownloadBytes = userDownloadBytes;
  }

  public EndpointStat userSpeedDownload(Long userSpeedDownload) {
    this.userSpeedDownload = userSpeedDownload;
    return this;
  }

   /**
   * Get userSpeedDownload
   * @return userSpeedDownload
  **/
  @ApiModelProperty(value = "")
  public Long getUserSpeedDownload() {
    return userSpeedDownload;
  }

  public void setUserSpeedDownload(Long userSpeedDownload) {
    this.userSpeedDownload = userSpeedDownload;
  }

  public EndpointStat userSpeedUpload(Long userSpeedUpload) {
    this.userSpeedUpload = userSpeedUpload;
    return this;
  }

   /**
   * Get userSpeedUpload
   * @return userSpeedUpload
  **/
  @ApiModelProperty(value = "")
  public Long getUserSpeedUpload() {
    return userSpeedUpload;
  }

  public void setUserSpeedUpload(Long userSpeedUpload) {
    this.userSpeedUpload = userSpeedUpload;
  }

  public EndpointStat userUploadBytes(Long userUploadBytes) {
    this.userUploadBytes = userUploadBytes;
    return this;
  }

   /**
   * Get userUploadBytes
   * @return userUploadBytes
  **/
  @ApiModelProperty(value = "")
  public Long getUserUploadBytes() {
    return userUploadBytes;
  }

  public void setUserUploadBytes(Long userUploadBytes) {
    this.userUploadBytes = userUploadBytes;
  }

  public EndpointStat warningEngines(Long warningEngines) {
    this.warningEngines = warningEngines;
    return this;
  }

   /**
   * Get warningEngines
   * @return warningEngines
  **/
  @ApiModelProperty(value = "")
  public Long getWarningEngines() {
    return warningEngines;
  }

  public void setWarningEngines(Long warningEngines) {
    this.warningEngines = warningEngines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointStat endpointStat = (EndpointStat) o;
    return Objects.equals(this.cloudDownloadBytes, endpointStat.cloudDownloadBytes) &&
        Objects.equals(this.cloudUploadBytes, endpointStat.cloudUploadBytes) &&
        Objects.equals(this.errorEngines, endpointStat.errorEngines) &&
        Objects.equals(this.health, endpointStat.health) &&
        Objects.equals(this.state, endpointStat.state) &&
        Objects.equals(this.totalEngines, endpointStat.totalEngines) &&
        Objects.equals(this.upToDateEngines, endpointStat.upToDateEngines) &&
        Objects.equals(this.userDownloadBytes, endpointStat.userDownloadBytes) &&
        Objects.equals(this.userSpeedDownload, endpointStat.userSpeedDownload) &&
        Objects.equals(this.userSpeedUpload, endpointStat.userSpeedUpload) &&
        Objects.equals(this.userUploadBytes, endpointStat.userUploadBytes) &&
        Objects.equals(this.warningEngines, endpointStat.warningEngines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudDownloadBytes, cloudUploadBytes, errorEngines, health, state, totalEngines, upToDateEngines, userDownloadBytes, userSpeedDownload, userSpeedUpload, userUploadBytes, warningEngines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointStat {\n");
    
    sb.append("    cloudDownloadBytes: ").append(toIndentedString(cloudDownloadBytes)).append("\n");
    sb.append("    cloudUploadBytes: ").append(toIndentedString(cloudUploadBytes)).append("\n");
    sb.append("    errorEngines: ").append(toIndentedString(errorEngines)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalEngines: ").append(toIndentedString(totalEngines)).append("\n");
    sb.append("    upToDateEngines: ").append(toIndentedString(upToDateEngines)).append("\n");
    sb.append("    userDownloadBytes: ").append(toIndentedString(userDownloadBytes)).append("\n");
    sb.append("    userSpeedDownload: ").append(toIndentedString(userSpeedDownload)).append("\n");
    sb.append("    userSpeedUpload: ").append(toIndentedString(userSpeedUpload)).append("\n");
    sb.append("    userUploadBytes: ").append(toIndentedString(userUploadBytes)).append("\n");
    sb.append("    warningEngines: ").append(toIndentedString(warningEngines)).append("\n");
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

