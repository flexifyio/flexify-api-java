/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.10.hf2
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
 * StorageAccountSettingsRes
 */




public class StorageAccountSettingsRes {
  @JsonProperty("anonymous")
  private Boolean anonymous = null;

  @JsonProperty("customEndpoint")
  private String customEndpoint = null;

  @JsonProperty("identity")
  private String identity = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("refreshIntervalSec")
  private Integer refreshIntervalSec = null;

  @JsonProperty("refreshStoragesStat")
  private Boolean refreshStoragesStat = null;

  @JsonProperty("useSsl")
  private Boolean useSsl = null;

  public StorageAccountSettingsRes anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * True for public account
   * @return anonymous
  **/
  @ApiModelProperty(example = "false", value = "True for public account")
  public Boolean isAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public StorageAccountSettingsRes customEndpoint(String customEndpoint) {
    this.customEndpoint = customEndpoint;
    return this;
  }

   /**
   * Custom endpoint to be used for requests
   * @return customEndpoint
  **/
  @ApiModelProperty(value = "Custom endpoint to be used for requests")
  public String getCustomEndpoint() {
    return customEndpoint;
  }

  public void setCustomEndpoint(String customEndpoint) {
    this.customEndpoint = customEndpoint;
  }

  public StorageAccountSettingsRes identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Identity (such as Key ID) of the cloud account
   * @return identity
  **/
  @ApiModelProperty(value = "Identity (such as Key ID) of the cloud account")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public StorageAccountSettingsRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-defined storage account name
   * @return name
  **/
  @ApiModelProperty(value = "User-defined storage account name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageAccountSettingsRes refreshIntervalSec(Integer refreshIntervalSec) {
    this.refreshIntervalSec = refreshIntervalSec;
    return this;
  }

   /**
   * Automatic refresh interval in seconds or null to disable automatic refresh
   * @return refreshIntervalSec
  **/
  @ApiModelProperty(value = "Automatic refresh interval in seconds or null to disable automatic refresh")
  public Integer getRefreshIntervalSec() {
    return refreshIntervalSec;
  }

  public void setRefreshIntervalSec(Integer refreshIntervalSec) {
    this.refreshIntervalSec = refreshIntervalSec;
  }

  public StorageAccountSettingsRes refreshStoragesStat(Boolean refreshStoragesStat) {
    this.refreshStoragesStat = refreshStoragesStat;
    return this;
  }

   /**
   * Indicates if statistics for each bucket/container should be calculated on automatic refresh
   * @return refreshStoragesStat
  **/
  @ApiModelProperty(value = "Indicates if statistics for each bucket/container should be calculated on automatic refresh")
  public Boolean isRefreshStoragesStat() {
    return refreshStoragesStat;
  }

  public void setRefreshStoragesStat(Boolean refreshStoragesStat) {
    this.refreshStoragesStat = refreshStoragesStat;
  }

  public StorageAccountSettingsRes useSsl(Boolean useSsl) {
    this.useSsl = useSsl;
    return this;
  }

   /**
   * Encrypt transfer with SSL
   * @return useSsl
  **/
  @ApiModelProperty(example = "true", value = "Encrypt transfer with SSL")
  public Boolean isUseSsl() {
    return useSsl;
  }

  public void setUseSsl(Boolean useSsl) {
    this.useSsl = useSsl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountSettingsRes storageAccountSettingsRes = (StorageAccountSettingsRes) o;
    return Objects.equals(this.anonymous, storageAccountSettingsRes.anonymous) &&
        Objects.equals(this.customEndpoint, storageAccountSettingsRes.customEndpoint) &&
        Objects.equals(this.identity, storageAccountSettingsRes.identity) &&
        Objects.equals(this.name, storageAccountSettingsRes.name) &&
        Objects.equals(this.refreshIntervalSec, storageAccountSettingsRes.refreshIntervalSec) &&
        Objects.equals(this.refreshStoragesStat, storageAccountSettingsRes.refreshStoragesStat) &&
        Objects.equals(this.useSsl, storageAccountSettingsRes.useSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, customEndpoint, identity, name, refreshIntervalSec, refreshStoragesStat, useSsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountSettingsRes {\n");
    
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    customEndpoint: ").append(toIndentedString(customEndpoint)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    refreshIntervalSec: ").append(toIndentedString(refreshIntervalSec)).append("\n");
    sb.append("    refreshStoragesStat: ").append(toIndentedString(refreshStoragesStat)).append("\n");
    sb.append("    useSsl: ").append(toIndentedString(useSsl)).append("\n");
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

