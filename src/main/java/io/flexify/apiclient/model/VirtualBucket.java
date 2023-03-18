/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.12
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
import io.flexify.apiclient.model.VirtualBucketSettings;
import io.flexify.apiclient.model.VirtualBucketStorage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Flexify IO Virtual Bucket
 */
@ApiModel(description = "Flexify IO Virtual Bucket")

public class VirtualBucket {
  @JsonProperty("settings")
  private VirtualBucketSettings settings = null;

  @JsonProperty("storages")
  private List<VirtualBucketStorage> storages = new ArrayList<VirtualBucketStorage>();

  public VirtualBucket settings(VirtualBucketSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings of the virtual bucket (name, etc.)
   * @return settings
  **/
  @ApiModelProperty(value = "Settings of the virtual bucket (name, etc.)")
  public VirtualBucketSettings getSettings() {
    return settings;
  }

  public void setSettings(VirtualBucketSettings settings) {
    this.settings = settings;
  }

  public VirtualBucket storages(List<VirtualBucketStorage> storages) {
    this.storages = storages;
    return this;
  }

  public VirtualBucket addStoragesItem(VirtualBucketStorage storagesItem) {
    this.storages.add(storagesItem);
    return this;
  }

   /**
   * List of storages mapped to this virtual bucket
   * @return storages
  **/
  @ApiModelProperty(required = true, value = "List of storages mapped to this virtual bucket")
  public List<VirtualBucketStorage> getStorages() {
    return storages;
  }

  public void setStorages(List<VirtualBucketStorage> storages) {
    this.storages = storages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucket virtualBucket = (VirtualBucket) o;
    return Objects.equals(this.settings, virtualBucket.settings) &&
        Objects.equals(this.storages, virtualBucket.storages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, storages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucket {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
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

