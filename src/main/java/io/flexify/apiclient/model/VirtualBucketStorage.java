/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.14
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

public class VirtualBucketStorage {
  @JsonProperty("bucketId")
  private Long bucketId = null;

  @JsonProperty("settings")
  private VirtualBucketStorageSettings settings = null;

  public VirtualBucketStorage bucketId(Long bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * ID of attached bucket
   * @return bucketId
  **/
  @ApiModelProperty(value = "ID of attached bucket")
  public Long getBucketId() {
    return bucketId;
  }

  public void setBucketId(Long bucketId) {
    this.bucketId = bucketId;
  }

  public VirtualBucketStorage settings(VirtualBucketStorageSettings settings) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketStorage virtualBucketStorage = (VirtualBucketStorage) o;
    return Objects.equals(this.bucketId, virtualBucketStorage.bucketId) &&
        Objects.equals(this.settings, virtualBucketStorage.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketId, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketStorage {\n");
    
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

