/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.10.hf4
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
import io.flexify.apiclient.model.BucketStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Storage bucket or container
 */
@ApiModel(description = "Storage bucket or container")




public class Bucket {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("stat")
  private BucketStat stat = null;

  public Bucket displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name to show in the UI when name is not heman-readable
   * @return displayName
  **/
  @ApiModelProperty(example = "USER: John Smith", value = "Name to show in the UI when name is not heman-readable")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

   /**
   * Unique identifier if managed
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier if managed")
  public Long getId() {
    return id;
  }

  public Bucket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Bucket, container or namespace name or another id
   * @return name
  **/
  @ApiModelProperty(example = "bucket-1", required = true, value = "Bucket, container or namespace name or another id")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bucket stat(BucketStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Storage statistics
   * @return stat
  **/
  @ApiModelProperty(value = "Storage statistics")
  public BucketStat getStat() {
    return stat;
  }

  public void setStat(BucketStat stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bucket bucket = (Bucket) o;
    return Objects.equals(this.displayName, bucket.displayName) &&
        Objects.equals(this.id, bucket.id) &&
        Objects.equals(this.name, bucket.name) &&
        Objects.equals(this.stat, bucket.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, name, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bucket {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

