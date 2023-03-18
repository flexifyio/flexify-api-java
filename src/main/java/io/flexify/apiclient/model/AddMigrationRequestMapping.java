/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.13-SNAPSHOT
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
 * Mapping between source and destination buckets or containers
 */
@ApiModel(description = "Mapping between source and destination buckets or containers")

public class AddMigrationRequestMapping {
  @JsonProperty("destBucketName")
  private String destBucketName = null;

  @JsonProperty("destBucketNewRegion")
  private String destBucketNewRegion = null;

  @JsonProperty("destStorageAccountId")
  private Long destStorageAccountId = null;

  @JsonProperty("keyAddPrefix")
  private String keyAddPrefix = null;

  @JsonProperty("keyRemovePrefix")
  private String keyRemovePrefix = null;

  @JsonProperty("objectsListUri")
  private String objectsListUri = null;

  @JsonProperty("sourceBucketName")
  private String sourceBucketName = null;

  @JsonProperty("sourceStorageAccountId")
  private Long sourceStorageAccountId = null;

  public AddMigrationRequestMapping destBucketName(String destBucketName) {
    this.destBucketName = destBucketName;
    return this;
  }

   /**
   * Name of source destination or container
   * @return destBucketName
  **/
  @ApiModelProperty(required = true, value = "Name of source destination or container")
  public String getDestBucketName() {
    return destBucketName;
  }

  public void setDestBucketName(String destBucketName) {
    this.destBucketName = destBucketName;
  }

  public AddMigrationRequestMapping destBucketNewRegion(String destBucketNewRegion) {
    this.destBucketNewRegion = destBucketNewRegion;
    return this;
  }

   /**
   * Region where the destination bucket will be created if it does not exist. null to use cloud&#39;s default region
   * @return destBucketNewRegion
  **/
  @ApiModelProperty(value = "Region where the destination bucket will be created if it does not exist. null to use cloud's default region")
  public String getDestBucketNewRegion() {
    return destBucketNewRegion;
  }

  public void setDestBucketNewRegion(String destBucketNewRegion) {
    this.destBucketNewRegion = destBucketNewRegion;
  }

  public AddMigrationRequestMapping destStorageAccountId(Long destStorageAccountId) {
    this.destStorageAccountId = destStorageAccountId;
    return this;
  }

   /**
   * ID of source destination account
   * @return destStorageAccountId
  **/
  @ApiModelProperty(required = true, value = "ID of source destination account")
  public Long getDestStorageAccountId() {
    return destStorageAccountId;
  }

  public void setDestStorageAccountId(Long destStorageAccountId) {
    this.destStorageAccountId = destStorageAccountId;
  }

  public AddMigrationRequestMapping keyAddPrefix(String keyAddPrefix) {
    this.keyAddPrefix = keyAddPrefix;
    return this;
  }

   /**
   * Prefix to to be added to each key when migrating
   * @return keyAddPrefix
  **/
  @ApiModelProperty(value = "Prefix to to be added to each key when migrating")
  public String getKeyAddPrefix() {
    return keyAddPrefix;
  }

  public void setKeyAddPrefix(String keyAddPrefix) {
    this.keyAddPrefix = keyAddPrefix;
  }

  public AddMigrationRequestMapping keyRemovePrefix(String keyRemovePrefix) {
    this.keyRemovePrefix = keyRemovePrefix;
    return this;
  }

   /**
   * Prefix to to be removed from each key when migrating
   * @return keyRemovePrefix
  **/
  @ApiModelProperty(value = "Prefix to to be removed from each key when migrating")
  public String getKeyRemovePrefix() {
    return keyRemovePrefix;
  }

  public void setKeyRemovePrefix(String keyRemovePrefix) {
    this.keyRemovePrefix = keyRemovePrefix;
  }

  public AddMigrationRequestMapping objectsListUri(String objectsListUri) {
    this.objectsListUri = objectsListUri;
    return this;
  }

   /**
   * A URI of a text file to take objects list from
   * @return objectsListUri
  **/
  @ApiModelProperty(value = "A URI of a text file to take objects list from")
  public String getObjectsListUri() {
    return objectsListUri;
  }

  public void setObjectsListUri(String objectsListUri) {
    this.objectsListUri = objectsListUri;
  }

  public AddMigrationRequestMapping sourceBucketName(String sourceBucketName) {
    this.sourceBucketName = sourceBucketName;
    return this;
  }

   /**
   * Name of source bucket or container
   * @return sourceBucketName
  **/
  @ApiModelProperty(required = true, value = "Name of source bucket or container")
  public String getSourceBucketName() {
    return sourceBucketName;
  }

  public void setSourceBucketName(String sourceBucketName) {
    this.sourceBucketName = sourceBucketName;
  }

  public AddMigrationRequestMapping sourceStorageAccountId(Long sourceStorageAccountId) {
    this.sourceStorageAccountId = sourceStorageAccountId;
    return this;
  }

   /**
   * ID of source storage account
   * @return sourceStorageAccountId
  **/
  @ApiModelProperty(required = true, value = "ID of source storage account")
  public Long getSourceStorageAccountId() {
    return sourceStorageAccountId;
  }

  public void setSourceStorageAccountId(Long sourceStorageAccountId) {
    this.sourceStorageAccountId = sourceStorageAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMigrationRequestMapping addMigrationRequestMapping = (AddMigrationRequestMapping) o;
    return Objects.equals(this.destBucketName, addMigrationRequestMapping.destBucketName) &&
        Objects.equals(this.destBucketNewRegion, addMigrationRequestMapping.destBucketNewRegion) &&
        Objects.equals(this.destStorageAccountId, addMigrationRequestMapping.destStorageAccountId) &&
        Objects.equals(this.keyAddPrefix, addMigrationRequestMapping.keyAddPrefix) &&
        Objects.equals(this.keyRemovePrefix, addMigrationRequestMapping.keyRemovePrefix) &&
        Objects.equals(this.objectsListUri, addMigrationRequestMapping.objectsListUri) &&
        Objects.equals(this.sourceBucketName, addMigrationRequestMapping.sourceBucketName) &&
        Objects.equals(this.sourceStorageAccountId, addMigrationRequestMapping.sourceStorageAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destBucketName, destBucketNewRegion, destStorageAccountId, keyAddPrefix, keyRemovePrefix, objectsListUri, sourceBucketName, sourceStorageAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMigrationRequestMapping {\n");
    
    sb.append("    destBucketName: ").append(toIndentedString(destBucketName)).append("\n");
    sb.append("    destBucketNewRegion: ").append(toIndentedString(destBucketNewRegion)).append("\n");
    sb.append("    destStorageAccountId: ").append(toIndentedString(destStorageAccountId)).append("\n");
    sb.append("    keyAddPrefix: ").append(toIndentedString(keyAddPrefix)).append("\n");
    sb.append("    keyRemovePrefix: ").append(toIndentedString(keyRemovePrefix)).append("\n");
    sb.append("    objectsListUri: ").append(toIndentedString(objectsListUri)).append("\n");
    sb.append("    sourceBucketName: ").append(toIndentedString(sourceBucketName)).append("\n");
    sb.append("    sourceStorageAccountId: ").append(toIndentedString(sourceStorageAccountId)).append("\n");
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

