/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.6
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
 * BucketStat
 */




public class BucketStat {
  @JsonProperty("bytes")
  private Long bytes = null;

  @JsonProperty("lastRefreshed")
  private DateTime lastRefreshed = null;

  @JsonProperty("objects")
  private Long objects = null;

  @JsonProperty("region")
  private String region = null;

  /**
   * State of the bucket/container
   */
  public enum StateEnum {
    ERROR("ERROR"),
    
    NONE("NONE"),
    
    OK("OK"),
    
    REFRESHING("REFRESHING"),
    
    WARNING("WARNING");

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

  public BucketStat bytes(Long bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * Bytes in this bucket/container
   * @return bytes
  **/
  @ApiModelProperty(value = "Bytes in this bucket/container")
  public Long getBytes() {
    return bytes;
  }

  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  public BucketStat lastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

   /**
   * Last success refresh operation complete timestamp
   * @return lastRefreshed
  **/
  @ApiModelProperty(value = "Last success refresh operation complete timestamp")
  public DateTime getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  public BucketStat objects(Long objects) {
    this.objects = objects;
    return this;
  }

   /**
   * Objects in this bucket/container
   * @return objects
  **/
  @ApiModelProperty(value = "Objects in this bucket/container")
  public Long getObjects() {
    return objects;
  }

  public void setObjects(Long objects) {
    this.objects = objects;
  }

  public BucketStat region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region where this bucket is located
   * @return region
  **/
  @ApiModelProperty(value = "Region where this bucket is located")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public BucketStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of the bucket/container
   * @return state
  **/
  @ApiModelProperty(value = "State of the bucket/container")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketStat bucketStat = (BucketStat) o;
    return Objects.equals(this.bytes, bucketStat.bytes) &&
        Objects.equals(this.lastRefreshed, bucketStat.lastRefreshed) &&
        Objects.equals(this.objects, bucketStat.objects) &&
        Objects.equals(this.region, bucketStat.region) &&
        Objects.equals(this.state, bucketStat.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, lastRefreshed, objects, region, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketStat {\n");
    
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

