/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.18.hf1
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
import io.flexify.apiclient.model.AddMigrationRequestMapping;
import io.flexify.apiclient.model.MigrationSettingsReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Start new migration request
 */
@ApiModel(description = "Start new migration request")

public class AddMigrationRequest {
  @JsonProperty("mappings")
  private List<AddMigrationRequestMapping> mappings = null;

  @JsonProperty("settings")
  private MigrationSettingsReq settings = null;

  @JsonProperty("verifyBuckets")
  private Boolean verifyBuckets = null;

  public AddMigrationRequest mappings(List<AddMigrationRequestMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public AddMigrationRequest addMappingsItem(AddMigrationRequestMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<AddMigrationRequestMapping>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Source storage to destination account/bucket mapping
   * @return mappings
  **/
  @ApiModelProperty(value = "Source storage to destination account/bucket mapping")
  public List<AddMigrationRequestMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<AddMigrationRequestMapping> mappings) {
    this.mappings = mappings;
  }

  public AddMigrationRequest settings(MigrationSettingsReq settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Migration settings
   * @return settings
  **/
  @ApiModelProperty(value = "Migration settings")
  public MigrationSettingsReq getSettings() {
    return settings;
  }

  public void setSettings(MigrationSettingsReq settings) {
    this.settings = settings;
  }

  public AddMigrationRequest verifyBuckets(Boolean verifyBuckets) {
    this.verifyBuckets = verifyBuckets;
    return this;
  }

   /**
   * If buckets should be verified by HEAD request
   * @return verifyBuckets
  **/
  @ApiModelProperty(value = "If buckets should be verified by HEAD request")
  public Boolean isVerifyBuckets() {
    return verifyBuckets;
  }

  public void setVerifyBuckets(Boolean verifyBuckets) {
    this.verifyBuckets = verifyBuckets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddMigrationRequest addMigrationRequest = (AddMigrationRequest) o;
    return Objects.equals(this.mappings, addMigrationRequest.mappings) &&
        Objects.equals(this.settings, addMigrationRequest.settings) &&
        Objects.equals(this.verifyBuckets, addMigrationRequest.verifyBuckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, settings, verifyBuckets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMigrationRequest {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    verifyBuckets: ").append(toIndentedString(verifyBuckets)).append("\n");
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

