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
import io.flexify.apiclient.model.VirtualBucketAccessPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Settings of Virtual Bucket
 */
@ApiModel(description = "Settings of Virtual Bucket")

public class VirtualBucketSettings {
  @JsonProperty("accessPolicy")
  private VirtualBucketAccessPolicy accessPolicy = null;

  @JsonProperty("bucketName")
  private String bucketName = null;

  public VirtualBucketSettings accessPolicy(VirtualBucketAccessPolicy accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

   /**
   * Virtual bucket access policy
   * @return accessPolicy
  **/
  @ApiModelProperty(value = "Virtual bucket access policy")
  public VirtualBucketAccessPolicy getAccessPolicy() {
    return accessPolicy;
  }

  public void setAccessPolicy(VirtualBucketAccessPolicy accessPolicy) {
    this.accessPolicy = accessPolicy;
  }

  public VirtualBucketSettings bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Virtual bucket name
   * @return bucketName
  **/
  @ApiModelProperty(example = "fl-demo", required = true, value = "Virtual bucket name")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketSettings virtualBucketSettings = (VirtualBucketSettings) o;
    return Objects.equals(this.accessPolicy, virtualBucketSettings.accessPolicy) &&
        Objects.equals(this.bucketName, virtualBucketSettings.bucketName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicy, bucketName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketSettings {\n");
    
    sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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

