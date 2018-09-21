/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.6
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.flexify.apiclient.model.Mapping;
import io.flexify.apiclient.model.MigrationSettings;
import io.flexify.apiclient.model.MigrationStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Migration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
public class Migration {
  @JsonProperty("hidden")
  private Boolean hidden = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("mappings")
  private List<Mapping> mappings = null;

  @JsonProperty("settings")
  private MigrationSettings settings = null;

  @JsonProperty("stat")
  private MigrationStat stat = null;

  public Migration hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Indicates that his migration should not be show in UI
   * @return hidden
  **/
  @ApiModelProperty(example = "false", value = "Indicates that his migration should not be show in UI")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

   /**
   * Unique ID
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID")
  public Long getId() {
    return id;
  }

  public Migration mappings(List<Mapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public Migration addMappingsItem(Mapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<Mapping>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Source to destination storages mappings
   * @return mappings
  **/
  @ApiModelProperty(value = "Source to destination storages mappings")
  public List<Mapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<Mapping> mappings) {
    this.mappings = mappings;
  }

  public Migration settings(MigrationSettings settings) {
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

  public Migration stat(MigrationStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Comulative migration statistics
   * @return stat
  **/
  @ApiModelProperty(value = "Comulative migration statistics")
  public MigrationStat getStat() {
    return stat;
  }

  public void setStat(MigrationStat stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Migration migration = (Migration) o;
    return Objects.equals(this.hidden, migration.hidden) &&
        Objects.equals(this.id, migration.id) &&
        Objects.equals(this.mappings, migration.mappings) &&
        Objects.equals(this.settings, migration.settings) &&
        Objects.equals(this.stat, migration.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidden, id, mappings, settings, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Migration {\n");
    
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

