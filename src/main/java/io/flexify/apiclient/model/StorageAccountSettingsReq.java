/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.15.0-SNAPSHOT
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
 * StorageAccountSettingsReq
 */

public class StorageAccountSettingsReq {
  @JsonProperty("azureIntegrationId")
  private Long azureIntegrationId = null;

  @JsonProperty("bucketDotEncodeSequence")
  private String bucketDotEncodeSequence = null;

  @JsonProperty("credential")
  private String credential = null;

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

  public StorageAccountSettingsReq azureIntegrationId(Long azureIntegrationId) {
    this.azureIntegrationId = azureIntegrationId;
    return this;
  }

   /**
   * Id of Azure integration
   * @return azureIntegrationId
  **/
  @ApiModelProperty(value = "Id of Azure integration")
  public Long getAzureIntegrationId() {
    return azureIntegrationId;
  }

  public void setAzureIntegrationId(Long azureIntegrationId) {
    this.azureIntegrationId = azureIntegrationId;
  }

  public StorageAccountSettingsReq bucketDotEncodeSequence(String bucketDotEncodeSequence) {
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

  public StorageAccountSettingsReq credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Credential (such as Secret Key) of the cloud account
   * @return credential
  **/
  @ApiModelProperty(value = "Credential (such as Secret Key) of the cloud account")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public StorageAccountSettingsReq customEndpoint(String customEndpoint) {
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

  public StorageAccountSettingsReq identity(String identity) {
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

  public StorageAccountSettingsReq name(String name) {
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

  public StorageAccountSettingsReq refreshIntervalSec(Integer refreshIntervalSec) {
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

  public StorageAccountSettingsReq refreshStoragesStat(Boolean refreshStoragesStat) {
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

  public StorageAccountSettingsReq useSsl(Boolean useSsl) {
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
    StorageAccountSettingsReq storageAccountSettingsReq = (StorageAccountSettingsReq) o;
    return Objects.equals(this.azureIntegrationId, storageAccountSettingsReq.azureIntegrationId) &&
        Objects.equals(this.bucketDotEncodeSequence, storageAccountSettingsReq.bucketDotEncodeSequence) &&
        Objects.equals(this.credential, storageAccountSettingsReq.credential) &&
        Objects.equals(this.customEndpoint, storageAccountSettingsReq.customEndpoint) &&
        Objects.equals(this.identity, storageAccountSettingsReq.identity) &&
        Objects.equals(this.name, storageAccountSettingsReq.name) &&
        Objects.equals(this.refreshIntervalSec, storageAccountSettingsReq.refreshIntervalSec) &&
        Objects.equals(this.refreshStoragesStat, storageAccountSettingsReq.refreshStoragesStat) &&
        Objects.equals(this.useSsl, storageAccountSettingsReq.useSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureIntegrationId, bucketDotEncodeSequence, credential, customEndpoint, identity, name, refreshIntervalSec, refreshStoragesStat, useSsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountSettingsReq {\n");
    
    sb.append("    azureIntegrationId: ").append(toIndentedString(azureIntegrationId)).append("\n");
    sb.append("    bucketDotEncodeSequence: ").append(toIndentedString(bucketDotEncodeSequence)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

