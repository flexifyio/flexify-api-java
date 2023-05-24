/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.17-SNAPSHOT
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
 * EndpointStorageAccountSettings
 */

public class EndpointStorageAccountSettings {
  @JsonProperty("createNewBucketsIn")
  private String createNewBucketsIn = null;

  @JsonProperty("deleteObjects")
  private Boolean deleteObjects = null;

  @JsonProperty("putObjects")
  private Boolean putObjects = null;

  public EndpointStorageAccountSettings createNewBucketsIn(String createNewBucketsIn) {
    this.createNewBucketsIn = createNewBucketsIn;
    return this;
  }

   /**
   * Region where new buckets will be created if not specified in request. Set to null to create new buckets in a default region.
   * @return createNewBucketsIn
  **/
  @ApiModelProperty(value = "Region where new buckets will be created if not specified in request. Set to null to create new buckets in a default region.")
  public String getCreateNewBucketsIn() {
    return createNewBucketsIn;
  }

  public void setCreateNewBucketsIn(String createNewBucketsIn) {
    this.createNewBucketsIn = createNewBucketsIn;
  }

  public EndpointStorageAccountSettings deleteObjects(Boolean deleteObjects) {
    this.deleteObjects = deleteObjects;
    return this;
  }

   /**
   * Delete data from this storage account
   * @return deleteObjects
  **/
  @ApiModelProperty(value = "Delete data from this storage account")
  public Boolean isDeleteObjects() {
    return deleteObjects;
  }

  public void setDeleteObjects(Boolean deleteObjects) {
    this.deleteObjects = deleteObjects;
  }

  public EndpointStorageAccountSettings putObjects(Boolean putObjects) {
    this.putObjects = putObjects;
    return this;
  }

   /**
   * Save new data to this storage account
   * @return putObjects
  **/
  @ApiModelProperty(value = "Save new data to this storage account")
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
    EndpointStorageAccountSettings endpointStorageAccountSettings = (EndpointStorageAccountSettings) o;
    return Objects.equals(this.createNewBucketsIn, endpointStorageAccountSettings.createNewBucketsIn) &&
        Objects.equals(this.deleteObjects, endpointStorageAccountSettings.deleteObjects) &&
        Objects.equals(this.putObjects, endpointStorageAccountSettings.putObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createNewBucketsIn, deleteObjects, putObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointStorageAccountSettings {\n");
    
    sb.append("    createNewBucketsIn: ").append(toIndentedString(createNewBucketsIn)).append("\n");
    sb.append("    deleteObjects: ").append(toIndentedString(deleteObjects)).append("\n");
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

