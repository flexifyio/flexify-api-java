/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.9
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
 * VirtualBucketStorageSettings
 */




public class VirtualBucketStorageSettings {
  @JsonProperty("putObjects")
  private Boolean putObjects = null;

  public VirtualBucketStorageSettings putObjects(Boolean putObjects) {
    this.putObjects = putObjects;
    return this;
  }

   /**
   * Save new data to this storage
   * @return putObjects
  **/
  @ApiModelProperty(value = "Save new data to this storage")
  public Boolean isPutObjects() {
    return putObjects;
  }

  public void setPutObjects(Boolean putObjects) {
    this.putObjects = putObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketStorageSettings virtualBucketStorageSettings = (VirtualBucketStorageSettings) o;
    return Objects.equals(this.putObjects, virtualBucketStorageSettings.putObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(putObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketStorageSettings {\n");
    
    sb.append("    putObjects: ").append(toIndentedString(putObjects)).append("\n");
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

