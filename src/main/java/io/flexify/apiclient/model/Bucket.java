/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.6
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
public class Bucket {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("stat")
  private BucketStat stat = null;

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
   * Bucket or container name
   * @return name
  **/
  @ApiModelProperty(example = "bucket-1", required = true, value = "Bucket or container name")
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
    return Objects.equals(this.id, bucket.id) &&
        Objects.equals(this.name, bucket.name) &&
        Objects.equals(this.stat, bucket.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bucket {\n");
    
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

