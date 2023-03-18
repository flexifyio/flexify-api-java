/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.12
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
 * CloudLocationRes
 */

public class CloudLocationRes {
  @JsonProperty("cloudName")
  private String cloudName = null;

  @JsonProperty("cloudRegion")
  private String cloudRegion = null;

  @JsonProperty("engines")
  private Long engines = null;

  public CloudLocationRes cloudName(String cloudName) {
    this.cloudName = cloudName;
    return this;
  }

   /**
   * Cloud name
   * @return cloudName
  **/
  @ApiModelProperty(example = "Azure", value = "Cloud name")
  public String getCloudName() {
    return cloudName;
  }

  public void setCloudName(String cloudName) {
    this.cloudName = cloudName;
  }

  public CloudLocationRes cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

   /**
   * Cloud Region
   * @return cloudRegion
  **/
  @ApiModelProperty(example = "East US", value = "Cloud Region")
  public String getCloudRegion() {
    return cloudRegion;
  }

  public void setCloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
  }

  public CloudLocationRes engines(Long engines) {
    this.engines = engines;
    return this;
  }

   /**
   * Number of Available Engines in the location
   * @return engines
  **/
  @ApiModelProperty(value = "Number of Available Engines in the location")
  public Long getEngines() {
    return engines;
  }

  public void setEngines(Long engines) {
    this.engines = engines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudLocationRes cloudLocationRes = (CloudLocationRes) o;
    return Objects.equals(this.cloudName, cloudLocationRes.cloudName) &&
        Objects.equals(this.cloudRegion, cloudLocationRes.cloudRegion) &&
        Objects.equals(this.engines, cloudLocationRes.engines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudName, cloudRegion, engines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudLocationRes {\n");
    
    sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
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

