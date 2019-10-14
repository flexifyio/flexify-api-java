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
import io.flexify.apiclient.model.AddMigrationRequestMapping;
import io.flexify.apiclient.model.MigrationSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Start new migration request
 */
@ApiModel(description = "Start new migration request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-14T13:08:44.282+08:00")
public class AddMigrationRequest {
  @JsonProperty("mappings")
  private List<AddMigrationRequestMapping> mappings = null;

  @JsonProperty("settings")
  private MigrationSettings settings = null;

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

  public AddMigrationRequest settings(MigrationSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Migration settings
   * @return settings
  **/
  @ApiModelProperty(value = "Migration settings")
  public MigrationSettings getSettings() {
    return settings;
  }

  public void setSettings(MigrationSettings settings) {
    this.settings = settings;
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
        Objects.equals(this.settings, addMigrationRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddMigrationRequest {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

