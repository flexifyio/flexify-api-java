/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.13.1
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
 * StorageAccountSettings
 */

public class StorageAccountSettings {
  @JsonProperty("anonymous")
  private Boolean anonymous = null;

  @JsonProperty("bucketDotEncodeSequence")
  private String bucketDotEncodeSequence = null;

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

  public StorageAccountSettings anonymous(Boolean anonymous) {
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

  public StorageAccountSettings bucketDotEncodeSequence(String bucketDotEncodeSequence) {
    this.bucketDotEncodeSequence = bucketDotEncodeSequence;
    return this;
  }

   /**
   * Dot escape sequence for buckets
   * @return bucketDotEncodeSequence
  **/
  @ApiModelProperty(example = "-dot-", value = "Dot escape sequence for buckets")
  public String getBucketDotEncodeSequence() {
    return bucketDotEncodeSequence;
  }

  public void setBucketDotEncodeSequence(String bucketDotEncodeSequence) {
    this.bucketDotEncodeSequence = bucketDotEncodeSequence;
  }

  public StorageAccountSettings customEndpoint(String customEndpoint) {
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

  public StorageAccountSettings identity(String identity) {
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

  public StorageAccountSettings name(String name) {
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

  public StorageAccountSettings refreshIntervalSec(Integer refreshIntervalSec) {
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

  public StorageAccountSettings refreshStoragesStat(Boolean refreshStoragesStat) {
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

  public StorageAccountSettings useSsl(Boolean useSsl) {
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
    StorageAccountSettings storageAccountSettings = (StorageAccountSettings) o;
    return Objects.equals(this.anonymous, storageAccountSettings.anonymous) &&
        Objects.equals(this.bucketDotEncodeSequence, storageAccountSettings.bucketDotEncodeSequence) &&
        Objects.equals(this.customEndpoint, storageAccountSettings.customEndpoint) &&
        Objects.equals(this.identity, storageAccountSettings.identity) &&
        Objects.equals(this.name, storageAccountSettings.name) &&
        Objects.equals(this.refreshIntervalSec, storageAccountSettings.refreshIntervalSec) &&
        Objects.equals(this.refreshStoragesStat, storageAccountSettings.refreshStoragesStat) &&
        Objects.equals(this.useSsl, storageAccountSettings.useSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, bucketDotEncodeSequence, customEndpoint, identity, name, refreshIntervalSec, refreshStoragesStat, useSsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountSettings {\n");
    
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    bucketDotEncodeSequence: ").append(toIndentedString(bucketDotEncodeSequence)).append("\n");
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

