/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.7
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
import java.util.ArrayList;
import java.util.List;

/**
 * BucketsRequest
 */




public class BucketsRequest {
  @JsonProperty("bucketNames")
  private List<String> bucketNames = new ArrayList<String>();

  @JsonProperty("refresh")
  private Boolean refresh = null;

  public BucketsRequest bucketNames(List<String> bucketNames) {
    this.bucketNames = bucketNames;
    return this;
  }

  public BucketsRequest addBucketNamesItem(String bucketNamesItem) {
    this.bucketNames.add(bucketNamesItem);
    return this;
  }

   /**
   * Get bucketNames
   * @return bucketNames
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getBucketNames() {
    return bucketNames;
  }

  public void setBucketNames(List<String> bucketNames) {
    this.bucketNames = bucketNames;
  }

  public BucketsRequest refresh(Boolean refresh) {
    this.refresh = refresh;
    return this;
  }

   /**
   * If set to true, we will start calculating statistics for the buckets
   * @return refresh
  **/
  @ApiModelProperty(value = "If set to true, we will start calculating statistics for the buckets")
  public Boolean isRefresh() {
    return refresh;
  }

  public void setRefresh(Boolean refresh) {
    this.refresh = refresh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketsRequest bucketsRequest = (BucketsRequest) o;
    return Objects.equals(this.bucketNames, bucketsRequest.bucketNames) &&
        Objects.equals(this.refresh, bucketsRequest.refresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketNames, refresh);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketsRequest {\n");
    
    sb.append("    bucketNames: ").append(toIndentedString(bucketNames)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
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

