/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.7-SNAPSHOT
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
import io.flexify.apiclient.model.StorageAccountSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewStorageAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-19T00:30:02.233+08:00")
public class NewStorageAccount {
  @JsonProperty("providerId")
  private Long providerId = null;

  @JsonProperty("settings")
  private StorageAccountSettings settings = null;

  public NewStorageAccount providerId(Long providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(value = "")
  public Long getProviderId() {
    return providerId;
  }

  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }

  public NewStorageAccount settings(StorageAccountSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Configuration of the storage account
   * @return settings
  **/
  @ApiModelProperty(value = "Configuration of the storage account")
  public StorageAccountSettings getSettings() {
    return settings;
  }

  public void setSettings(StorageAccountSettings settings) {
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
    NewStorageAccount newStorageAccount = (NewStorageAccount) o;
    return Objects.equals(this.providerId, newStorageAccount.providerId) &&
        Objects.equals(this.settings, newStorageAccount.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewStorageAccount {\n");
    
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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

