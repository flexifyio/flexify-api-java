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
import io.flexify.apiclient.model.UserSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResetSsoRequest
 */

public class ResetSsoRequest {
  @JsonProperty("settings")
  private UserSettings settings = null;

  @JsonProperty("ssoEmail")
  private String ssoEmail = null;

  @JsonProperty("ssoId")
  private String ssoId = null;

  @JsonProperty("ssoType")
  private String ssoType = null;

  @JsonProperty("token")
  private String token = null;

  public ResetSsoRequest settings(UserSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public UserSettings getSettings() {
    return settings;
  }

  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }

  public ResetSsoRequest ssoEmail(String ssoEmail) {
    this.ssoEmail = ssoEmail;
    return this;
  }

   /**
   * Get ssoEmail
   * @return ssoEmail
  **/
  @ApiModelProperty(value = "")
  public String getSsoEmail() {
    return ssoEmail;
  }

  public void setSsoEmail(String ssoEmail) {
    this.ssoEmail = ssoEmail;
  }

  public ResetSsoRequest ssoId(String ssoId) {
    this.ssoId = ssoId;
    return this;
  }

   /**
   * Get ssoId
   * @return ssoId
  **/
  @ApiModelProperty(value = "")
  public String getSsoId() {
    return ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }

  public ResetSsoRequest ssoType(String ssoType) {
    this.ssoType = ssoType;
    return this;
  }

   /**
   * Get ssoType
   * @return ssoType
  **/
  @ApiModelProperty(value = "")
  public String getSsoType() {
    return ssoType;
  }

  public void setSsoType(String ssoType) {
    this.ssoType = ssoType;
  }

  public ResetSsoRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetSsoRequest resetSsoRequest = (ResetSsoRequest) o;
    return Objects.equals(this.settings, resetSsoRequest.settings) &&
        Objects.equals(this.ssoEmail, resetSsoRequest.ssoEmail) &&
        Objects.equals(this.ssoId, resetSsoRequest.ssoId) &&
        Objects.equals(this.ssoType, resetSsoRequest.ssoType) &&
        Objects.equals(this.token, resetSsoRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, ssoEmail, ssoId, ssoType, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetSsoRequest {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    ssoEmail: ").append(toIndentedString(ssoEmail)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
    sb.append("    ssoType: ").append(toIndentedString(ssoType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

