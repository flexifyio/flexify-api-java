/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.0-SNAPSHOT
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
import io.flexify.apiclient.model.FinishOAuthParams;
import io.flexify.apiclient.model.StorageAccountSettingsReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewStorageAccount
 */

public class NewStorageAccount {
  @JsonProperty("finishOAuthParams")
  private FinishOAuthParams finishOAuthParams = null;

  @JsonProperty("providerId")
  private Long providerId = null;

  @JsonProperty("settings")
  private StorageAccountSettingsReq settings = null;

  public NewStorageAccount finishOAuthParams(FinishOAuthParams finishOAuthParams) {
    this.finishOAuthParams = finishOAuthParams;
    return this;
  }

   /**
   * OAuth parameters used to request credentials if OAuth is used
   * @return finishOAuthParams
  **/
  @ApiModelProperty(value = "OAuth parameters used to request credentials if OAuth is used")
  public FinishOAuthParams getFinishOAuthParams() {
    return finishOAuthParams;
  }

  public void setFinishOAuthParams(FinishOAuthParams finishOAuthParams) {
    this.finishOAuthParams = finishOAuthParams;
  }

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

  public NewStorageAccount settings(StorageAccountSettingsReq settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Configuration of the storage account
   * @return settings
  **/
  @ApiModelProperty(value = "Configuration of the storage account")
  public StorageAccountSettingsReq getSettings() {
    return settings;
  }

  public void setSettings(StorageAccountSettingsReq settings) {
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
    return Objects.equals(this.finishOAuthParams, newStorageAccount.finishOAuthParams) &&
        Objects.equals(this.providerId, newStorageAccount.providerId) &&
        Objects.equals(this.settings, newStorageAccount.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishOAuthParams, providerId, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewStorageAccount {\n");
    
    sb.append("    finishOAuthParams: ").append(toIndentedString(finishOAuthParams)).append("\n");
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

