/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.19-SNAPSHOT
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
import io.flexify.apiclient.model.VirtualBucketStorage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to set or attach a number of storages to virtual bucket
 */
@ApiModel(description = "Request to set or attach a number of storages to virtual bucket")

public class VirtualBucketStoragesRequest {
  @JsonProperty("newStorages")
  private List<VirtualBucketStorage> newStorages = null;

  public VirtualBucketStoragesRequest newStorages(List<VirtualBucketStorage> newStorages) {
    this.newStorages = newStorages;
    return this;
  }

  public VirtualBucketStoragesRequest addNewStoragesItem(VirtualBucketStorage newStoragesItem) {
    if (this.newStorages == null) {
      this.newStorages = new ArrayList<VirtualBucketStorage>();
    }
    this.newStorages.add(newStoragesItem);
    return this;
  }

   /**
   * A list of storages to set or accounts to virtual bucket
   * @return newStorages
  **/
  @ApiModelProperty(value = "A list of storages to set or accounts to virtual bucket")
  public List<VirtualBucketStorage> getNewStorages() {
    return newStorages;
  }

  public void setNewStorages(List<VirtualBucketStorage> newStorages) {
    this.newStorages = newStorages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketStoragesRequest virtualBucketStoragesRequest = (VirtualBucketStoragesRequest) o;
    return Objects.equals(this.newStorages, virtualBucketStoragesRequest.newStorages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newStorages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketStoragesRequest {\n");
    
    sb.append("    newStorages: ").append(toIndentedString(newStorages)).append("\n");
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

