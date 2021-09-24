/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.8-SNAPSHOT
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
import io.flexify.apiclient.model.EndpointStorageAccountSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Storage account attached to endpoint
 */
@ApiModel(description = "Storage account attached to endpoint")




public class EndpointStorageAccountRes {
  @JsonProperty("settings")
  private EndpointStorageAccountSettings settings = null;

  @JsonProperty("storageAccountId")
  private Long storageAccountId = null;

  @JsonProperty("transparent")
  private Boolean transparent = null;

  public EndpointStorageAccountRes settings(EndpointStorageAccountSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Attached storage account configuration
   * @return settings
  **/
  @ApiModelProperty(value = "Attached storage account configuration")
  public EndpointStorageAccountSettings getSettings() {
    return settings;
  }

  public void setSettings(EndpointStorageAccountSettings settings) {
    this.settings = settings;
  }

  public EndpointStorageAccountRes storageAccountId(Long storageAccountId) {
    this.storageAccountId = storageAccountId;
    return this;
  }

   /**
   * Id of attached storage account
   * @return storageAccountId
  **/
  @ApiModelProperty(value = "Id of attached storage account")
  public Long getStorageAccountId() {
    return storageAccountId;
  }

  public void setStorageAccountId(Long storageAccountId) {
    this.storageAccountId = storageAccountId;
  }

   /**
   * Transparent proxy is enabled for this storage
   * @return transparent
  **/
  @ApiModelProperty(value = "Transparent proxy is enabled for this storage")
  public Boolean isTransparent() {
    return transparent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointStorageAccountRes endpointStorageAccountRes = (EndpointStorageAccountRes) o;
    return Objects.equals(this.settings, endpointStorageAccountRes.settings) &&
        Objects.equals(this.storageAccountId, endpointStorageAccountRes.storageAccountId) &&
        Objects.equals(this.transparent, endpointStorageAccountRes.transparent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, storageAccountId, transparent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointStorageAccountRes {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    storageAccountId: ").append(toIndentedString(storageAccountId)).append("\n");
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
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

