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
 * PublicAuthenticationConfiguration
 */




public class PublicAuthenticationConfiguration {
  @JsonProperty("configured")
  private Boolean configured = null;

  @JsonProperty("singleUserMode")
  private Boolean singleUserMode = null;

  public PublicAuthenticationConfiguration configured(Boolean configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Specifics if credentials are configured on a single user mode
   * @return configured
  **/
  @ApiModelProperty(value = "Specifics if credentials are configured on a single user mode")
  public Boolean isConfigured() {
    return configured;
  }

  public void setConfigured(Boolean configured) {
    this.configured = configured;
  }

  public PublicAuthenticationConfiguration singleUserMode(Boolean singleUserMode) {
    this.singleUserMode = singleUserMode;
    return this;
  }

   /**
   * In the single user mode only one user account is possible
   * @return singleUserMode
  **/
  @ApiModelProperty(value = "In the single user mode only one user account is possible")
  public Boolean isSingleUserMode() {
    return singleUserMode;
  }

  public void setSingleUserMode(Boolean singleUserMode) {
    this.singleUserMode = singleUserMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicAuthenticationConfiguration publicAuthenticationConfiguration = (PublicAuthenticationConfiguration) o;
    return Objects.equals(this.configured, publicAuthenticationConfiguration.configured) &&
        Objects.equals(this.singleUserMode, publicAuthenticationConfiguration.singleUserMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, singleUserMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAuthenticationConfiguration {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    singleUserMode: ").append(toIndentedString(singleUserMode)).append("\n");
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

