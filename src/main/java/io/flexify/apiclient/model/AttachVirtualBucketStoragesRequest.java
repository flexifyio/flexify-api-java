/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.8.5
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
 * Request to attach a number of storages to virtual bucket
 */
@ApiModel(description = "Request to attach a number of storages to virtual bucket")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T13:08:44.282+08:00")
public class AttachVirtualBucketStoragesRequest {
  @JsonProperty("newStorages")
  private List<VirtualBucketStorage> newStorages = null;

  public AttachVirtualBucketStoragesRequest newStorages(List<VirtualBucketStorage> newStorages) {
    this.newStorages = newStorages;
    return this;
  }

  public AttachVirtualBucketStoragesRequest addNewStoragesItem(VirtualBucketStorage newStoragesItem) {
    if (this.newStorages == null) {
      this.newStorages = new ArrayList<VirtualBucketStorage>();
    }
    this.newStorages.add(newStoragesItem);
    return this;
  }

   /**
   * A list of storagea to accounts to virtual bucket
   * @return newStorages
  **/
  @ApiModelProperty(value = "A list of storagea to accounts to virtual bucket")
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
    AttachVirtualBucketStoragesRequest attachVirtualBucketStoragesRequest = (AttachVirtualBucketStoragesRequest) o;
    return Objects.equals(this.newStorages, attachVirtualBucketStoragesRequest.newStorages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newStorages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachVirtualBucketStoragesRequest {\n");
    
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

