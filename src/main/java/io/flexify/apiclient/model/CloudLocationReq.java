/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.15.0-SNAPSHOT
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
 * CloudLocationReq
 */

public class CloudLocationReq {
  @JsonProperty("cloudName")
  private String cloudName = null;

  @JsonProperty("cloudRegion")
  private String cloudRegion = null;

  public CloudLocationReq cloudName(String cloudName) {
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

  public CloudLocationReq cloudRegion(String cloudRegion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudLocationReq cloudLocationReq = (CloudLocationReq) o;
    return Objects.equals(this.cloudName, cloudLocationReq.cloudName) &&
        Objects.equals(this.cloudRegion, cloudLocationReq.cloudRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudName, cloudRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudLocationReq {\n");
    
    sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
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

