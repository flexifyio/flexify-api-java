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
 * UserConfig
 */

public class UserConfig {
  @JsonProperty("maxActiveMigrations")
  private Integer maxActiveMigrations = null;

  @JsonProperty("maxAutoDeployEnginesCount")
  private Integer maxAutoDeployEnginesCount = null;

  @JsonProperty("maxEndpoints")
  private Integer maxEndpoints = null;

  @JsonProperty("maxMigrationCopyRetries")
  private Integer maxMigrationCopyRetries = null;

  @JsonProperty("maxMigrationEngines")
  private Integer maxMigrationEngines = null;

  @JsonProperty("maxMigrationMappings")
  private Integer maxMigrationMappings = null;

  @JsonProperty("maxMigrationRamMb")
  private Integer maxMigrationRamMb = null;

  @JsonProperty("maxMigrationRetries")
  private Integer maxMigrationRetries = null;

  @JsonProperty("maxMigrationSlots")
  private Integer maxMigrationSlots = null;

  @JsonProperty("maxMigrationStreamRamKb")
  private Integer maxMigrationStreamRamKb = null;

  @JsonProperty("maxMigrationStreams")
  private Integer maxMigrationStreams = null;

  @JsonProperty("maxMigrationsInQueue")
  private Integer maxMigrationsInQueue = null;

  @JsonProperty("maxPolicyRulesPerVirtualBucket")
  private Integer maxPolicyRulesPerVirtualBucket = null;

  @JsonProperty("maxStorageAccountsPerEndpoint")
  private Integer maxStorageAccountsPerEndpoint = null;

  @JsonProperty("maxStorages")
  private Integer maxStorages = null;

  @JsonProperty("maxStoragesPerVirtualBucket")
  private Integer maxStoragesPerVirtualBucket = null;

  @JsonProperty("maxVirtualBucketsPerEndpoint")
  private Integer maxVirtualBucketsPerEndpoint = null;

  @JsonProperty("skipAutoUndeploy")
  private Integer skipAutoUndeploy = null;

  public UserConfig maxActiveMigrations(Integer maxActiveMigrations) {
    this.maxActiveMigrations = maxActiveMigrations;
    return this;
  }

   /**
   * Get maxActiveMigrations
   * @return maxActiveMigrations
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxActiveMigrations() {
    return maxActiveMigrations;
  }

  public void setMaxActiveMigrations(Integer maxActiveMigrations) {
    this.maxActiveMigrations = maxActiveMigrations;
  }

  public UserConfig maxAutoDeployEnginesCount(Integer maxAutoDeployEnginesCount) {
    this.maxAutoDeployEnginesCount = maxAutoDeployEnginesCount;
    return this;
  }

   /**
   * Get maxAutoDeployEnginesCount
   * @return maxAutoDeployEnginesCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxAutoDeployEnginesCount() {
    return maxAutoDeployEnginesCount;
  }

  public void setMaxAutoDeployEnginesCount(Integer maxAutoDeployEnginesCount) {
    this.maxAutoDeployEnginesCount = maxAutoDeployEnginesCount;
  }

  public UserConfig maxEndpoints(Integer maxEndpoints) {
    this.maxEndpoints = maxEndpoints;
    return this;
  }

   /**
   * Get maxEndpoints
   * @return maxEndpoints
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxEndpoints() {
    return maxEndpoints;
  }

  public void setMaxEndpoints(Integer maxEndpoints) {
    this.maxEndpoints = maxEndpoints;
  }

  public UserConfig maxMigrationCopyRetries(Integer maxMigrationCopyRetries) {
    this.maxMigrationCopyRetries = maxMigrationCopyRetries;
    return this;
  }

   /**
   * Get maxMigrationCopyRetries
   * @return maxMigrationCopyRetries
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationCopyRetries() {
    return maxMigrationCopyRetries;
  }

  public void setMaxMigrationCopyRetries(Integer maxMigrationCopyRetries) {
    this.maxMigrationCopyRetries = maxMigrationCopyRetries;
  }

  public UserConfig maxMigrationEngines(Integer maxMigrationEngines) {
    this.maxMigrationEngines = maxMigrationEngines;
    return this;
  }

   /**
   * Get maxMigrationEngines
   * @return maxMigrationEngines
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationEngines() {
    return maxMigrationEngines;
  }

  public void setMaxMigrationEngines(Integer maxMigrationEngines) {
    this.maxMigrationEngines = maxMigrationEngines;
  }

  public UserConfig maxMigrationMappings(Integer maxMigrationMappings) {
    this.maxMigrationMappings = maxMigrationMappings;
    return this;
  }

   /**
   * Get maxMigrationMappings
   * @return maxMigrationMappings
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationMappings() {
    return maxMigrationMappings;
  }

  public void setMaxMigrationMappings(Integer maxMigrationMappings) {
    this.maxMigrationMappings = maxMigrationMappings;
  }

  public UserConfig maxMigrationRamMb(Integer maxMigrationRamMb) {
    this.maxMigrationRamMb = maxMigrationRamMb;
    return this;
  }

   /**
   * Get maxMigrationRamMb
   * @return maxMigrationRamMb
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationRamMb() {
    return maxMigrationRamMb;
  }

  public void setMaxMigrationRamMb(Integer maxMigrationRamMb) {
    this.maxMigrationRamMb = maxMigrationRamMb;
  }

  public UserConfig maxMigrationRetries(Integer maxMigrationRetries) {
    this.maxMigrationRetries = maxMigrationRetries;
    return this;
  }

   /**
   * Get maxMigrationRetries
   * @return maxMigrationRetries
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationRetries() {
    return maxMigrationRetries;
  }

  public void setMaxMigrationRetries(Integer maxMigrationRetries) {
    this.maxMigrationRetries = maxMigrationRetries;
  }

  public UserConfig maxMigrationSlots(Integer maxMigrationSlots) {
    this.maxMigrationSlots = maxMigrationSlots;
    return this;
  }

   /**
   * Get maxMigrationSlots
   * @return maxMigrationSlots
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationSlots() {
    return maxMigrationSlots;
  }

  public void setMaxMigrationSlots(Integer maxMigrationSlots) {
    this.maxMigrationSlots = maxMigrationSlots;
  }

  public UserConfig maxMigrationStreamRamKb(Integer maxMigrationStreamRamKb) {
    this.maxMigrationStreamRamKb = maxMigrationStreamRamKb;
    return this;
  }

   /**
   * Get maxMigrationStreamRamKb
   * @return maxMigrationStreamRamKb
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationStreamRamKb() {
    return maxMigrationStreamRamKb;
  }

  public void setMaxMigrationStreamRamKb(Integer maxMigrationStreamRamKb) {
    this.maxMigrationStreamRamKb = maxMigrationStreamRamKb;
  }

  public UserConfig maxMigrationStreams(Integer maxMigrationStreams) {
    this.maxMigrationStreams = maxMigrationStreams;
    return this;
  }

   /**
   * Get maxMigrationStreams
   * @return maxMigrationStreams
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationStreams() {
    return maxMigrationStreams;
  }

  public void setMaxMigrationStreams(Integer maxMigrationStreams) {
    this.maxMigrationStreams = maxMigrationStreams;
  }

  public UserConfig maxMigrationsInQueue(Integer maxMigrationsInQueue) {
    this.maxMigrationsInQueue = maxMigrationsInQueue;
    return this;
  }

   /**
   * Get maxMigrationsInQueue
   * @return maxMigrationsInQueue
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxMigrationsInQueue() {
    return maxMigrationsInQueue;
  }

  public void setMaxMigrationsInQueue(Integer maxMigrationsInQueue) {
    this.maxMigrationsInQueue = maxMigrationsInQueue;
  }

  public UserConfig maxPolicyRulesPerVirtualBucket(Integer maxPolicyRulesPerVirtualBucket) {
    this.maxPolicyRulesPerVirtualBucket = maxPolicyRulesPerVirtualBucket;
    return this;
  }

   /**
   * Get maxPolicyRulesPerVirtualBucket
   * @return maxPolicyRulesPerVirtualBucket
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxPolicyRulesPerVirtualBucket() {
    return maxPolicyRulesPerVirtualBucket;
  }

  public void setMaxPolicyRulesPerVirtualBucket(Integer maxPolicyRulesPerVirtualBucket) {
    this.maxPolicyRulesPerVirtualBucket = maxPolicyRulesPerVirtualBucket;
  }

  public UserConfig maxStorageAccountsPerEndpoint(Integer maxStorageAccountsPerEndpoint) {
    this.maxStorageAccountsPerEndpoint = maxStorageAccountsPerEndpoint;
    return this;
  }

   /**
   * Get maxStorageAccountsPerEndpoint
   * @return maxStorageAccountsPerEndpoint
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxStorageAccountsPerEndpoint() {
    return maxStorageAccountsPerEndpoint;
  }

  public void setMaxStorageAccountsPerEndpoint(Integer maxStorageAccountsPerEndpoint) {
    this.maxStorageAccountsPerEndpoint = maxStorageAccountsPerEndpoint;
  }

  public UserConfig maxStorages(Integer maxStorages) {
    this.maxStorages = maxStorages;
    return this;
  }

   /**
   * Get maxStorages
   * @return maxStorages
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxStorages() {
    return maxStorages;
  }

  public void setMaxStorages(Integer maxStorages) {
    this.maxStorages = maxStorages;
  }

  public UserConfig maxStoragesPerVirtualBucket(Integer maxStoragesPerVirtualBucket) {
    this.maxStoragesPerVirtualBucket = maxStoragesPerVirtualBucket;
    return this;
  }

   /**
   * Get maxStoragesPerVirtualBucket
   * @return maxStoragesPerVirtualBucket
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxStoragesPerVirtualBucket() {
    return maxStoragesPerVirtualBucket;
  }

  public void setMaxStoragesPerVirtualBucket(Integer maxStoragesPerVirtualBucket) {
    this.maxStoragesPerVirtualBucket = maxStoragesPerVirtualBucket;
  }

  public UserConfig maxVirtualBucketsPerEndpoint(Integer maxVirtualBucketsPerEndpoint) {
    this.maxVirtualBucketsPerEndpoint = maxVirtualBucketsPerEndpoint;
    return this;
  }

   /**
   * Get maxVirtualBucketsPerEndpoint
   * @return maxVirtualBucketsPerEndpoint
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxVirtualBucketsPerEndpoint() {
    return maxVirtualBucketsPerEndpoint;
  }

  public void setMaxVirtualBucketsPerEndpoint(Integer maxVirtualBucketsPerEndpoint) {
    this.maxVirtualBucketsPerEndpoint = maxVirtualBucketsPerEndpoint;
  }

  public UserConfig skipAutoUndeploy(Integer skipAutoUndeploy) {
    this.skipAutoUndeploy = skipAutoUndeploy;
    return this;
  }

   /**
   * Get skipAutoUndeploy
   * @return skipAutoUndeploy
  **/
  @ApiModelProperty(value = "")
  public Integer getSkipAutoUndeploy() {
    return skipAutoUndeploy;
  }

  public void setSkipAutoUndeploy(Integer skipAutoUndeploy) {
    this.skipAutoUndeploy = skipAutoUndeploy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConfig userConfig = (UserConfig) o;
    return Objects.equals(this.maxActiveMigrations, userConfig.maxActiveMigrations) &&
        Objects.equals(this.maxAutoDeployEnginesCount, userConfig.maxAutoDeployEnginesCount) &&
        Objects.equals(this.maxEndpoints, userConfig.maxEndpoints) &&
        Objects.equals(this.maxMigrationCopyRetries, userConfig.maxMigrationCopyRetries) &&
        Objects.equals(this.maxMigrationEngines, userConfig.maxMigrationEngines) &&
        Objects.equals(this.maxMigrationMappings, userConfig.maxMigrationMappings) &&
        Objects.equals(this.maxMigrationRamMb, userConfig.maxMigrationRamMb) &&
        Objects.equals(this.maxMigrationRetries, userConfig.maxMigrationRetries) &&
        Objects.equals(this.maxMigrationSlots, userConfig.maxMigrationSlots) &&
        Objects.equals(this.maxMigrationStreamRamKb, userConfig.maxMigrationStreamRamKb) &&
        Objects.equals(this.maxMigrationStreams, userConfig.maxMigrationStreams) &&
        Objects.equals(this.maxMigrationsInQueue, userConfig.maxMigrationsInQueue) &&
        Objects.equals(this.maxPolicyRulesPerVirtualBucket, userConfig.maxPolicyRulesPerVirtualBucket) &&
        Objects.equals(this.maxStorageAccountsPerEndpoint, userConfig.maxStorageAccountsPerEndpoint) &&
        Objects.equals(this.maxStorages, userConfig.maxStorages) &&
        Objects.equals(this.maxStoragesPerVirtualBucket, userConfig.maxStoragesPerVirtualBucket) &&
        Objects.equals(this.maxVirtualBucketsPerEndpoint, userConfig.maxVirtualBucketsPerEndpoint) &&
        Objects.equals(this.skipAutoUndeploy, userConfig.skipAutoUndeploy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxActiveMigrations, maxAutoDeployEnginesCount, maxEndpoints, maxMigrationCopyRetries, maxMigrationEngines, maxMigrationMappings, maxMigrationRamMb, maxMigrationRetries, maxMigrationSlots, maxMigrationStreamRamKb, maxMigrationStreams, maxMigrationsInQueue, maxPolicyRulesPerVirtualBucket, maxStorageAccountsPerEndpoint, maxStorages, maxStoragesPerVirtualBucket, maxVirtualBucketsPerEndpoint, skipAutoUndeploy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConfig {\n");
    
    sb.append("    maxActiveMigrations: ").append(toIndentedString(maxActiveMigrations)).append("\n");
    sb.append("    maxAutoDeployEnginesCount: ").append(toIndentedString(maxAutoDeployEnginesCount)).append("\n");
    sb.append("    maxEndpoints: ").append(toIndentedString(maxEndpoints)).append("\n");
    sb.append("    maxMigrationCopyRetries: ").append(toIndentedString(maxMigrationCopyRetries)).append("\n");
    sb.append("    maxMigrationEngines: ").append(toIndentedString(maxMigrationEngines)).append("\n");
    sb.append("    maxMigrationMappings: ").append(toIndentedString(maxMigrationMappings)).append("\n");
    sb.append("    maxMigrationRamMb: ").append(toIndentedString(maxMigrationRamMb)).append("\n");
    sb.append("    maxMigrationRetries: ").append(toIndentedString(maxMigrationRetries)).append("\n");
    sb.append("    maxMigrationSlots: ").append(toIndentedString(maxMigrationSlots)).append("\n");
    sb.append("    maxMigrationStreamRamKb: ").append(toIndentedString(maxMigrationStreamRamKb)).append("\n");
    sb.append("    maxMigrationStreams: ").append(toIndentedString(maxMigrationStreams)).append("\n");
    sb.append("    maxMigrationsInQueue: ").append(toIndentedString(maxMigrationsInQueue)).append("\n");
    sb.append("    maxPolicyRulesPerVirtualBucket: ").append(toIndentedString(maxPolicyRulesPerVirtualBucket)).append("\n");
    sb.append("    maxStorageAccountsPerEndpoint: ").append(toIndentedString(maxStorageAccountsPerEndpoint)).append("\n");
    sb.append("    maxStorages: ").append(toIndentedString(maxStorages)).append("\n");
    sb.append("    maxStoragesPerVirtualBucket: ").append(toIndentedString(maxStoragesPerVirtualBucket)).append("\n");
    sb.append("    maxVirtualBucketsPerEndpoint: ").append(toIndentedString(maxVirtualBucketsPerEndpoint)).append("\n");
    sb.append("    skipAutoUndeploy: ").append(toIndentedString(skipAutoUndeploy)).append("\n");
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

