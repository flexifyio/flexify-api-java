/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.8-SNAPSHOT
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
import io.flexify.apiclient.model.VirtualBucketStorageSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Storage attached to virtual bucket
 */
@ApiModel(description = "Storage attached to virtual bucket")




public class VirtualBucketStorageRes {
  @JsonProperty("bucketId")
  private Long bucketId = null;

  @JsonProperty("settings")
  private VirtualBucketStorageSettings settings = null;

  @JsonProperty("transparent")
  private Boolean transparent = null;

  public VirtualBucketStorageRes bucketId(Long bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * Id of atatched bucket
   * @return bucketId
  **/
  @ApiModelProperty(value = "Id of atatched bucket")
  public Long getBucketId() {
    return bucketId;
  }

  public void setBucketId(Long bucketId) {
    this.bucketId = bucketId;
  }

  public VirtualBucketStorageRes settings(VirtualBucketStorageSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Attached storage configuration
   * @return settings
  **/
  @ApiModelProperty(value = "Attached storage configuration")
  public VirtualBucketStorageSettings getSettings() {
    return settings;
  }

  public void setSettings(VirtualBucketStorageSettings settings) {
    this.settings = settings;
  }

   /**
   * Transparent proxy is enabled for this storage
   * @return transparent
  **/
  @ApiModelProperty(value = "Transparent proxy is enabled for this storage")
  public Boolean isTransparent() {
    return transparent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketStorageRes virtualBucketStorageRes = (VirtualBucketStorageRes) o;
    return Objects.equals(this.bucketId, virtualBucketStorageRes.bucketId) &&
        Objects.equals(this.settings, virtualBucketStorageRes.settings) &&
        Objects.equals(this.transparent, virtualBucketStorageRes.transparent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketId, settings, transparent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketStorageRes {\n");
    
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
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

