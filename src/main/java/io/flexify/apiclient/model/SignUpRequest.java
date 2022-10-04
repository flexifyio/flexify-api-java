/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.10.hf4
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
import io.flexify.apiclient.model.UserProfile;
import io.flexify.apiclient.model.UserSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignUpRequest
 */




public class SignUpRequest {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("profile")
  private UserProfile profile = null;

  @JsonProperty("settings")
  private UserSettings settings = null;

  @JsonProperty("signupCode")
  private String signupCode = null;

  public SignUpRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public SignUpRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignUpRequest profile(UserProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public UserProfile getProfile() {
    return profile;
  }

  public void setProfile(UserProfile profile) {
    this.profile = profile;
  }

  public SignUpRequest settings(UserSettings settings) {
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

  public SignUpRequest signupCode(String signupCode) {
    this.signupCode = signupCode;
    return this;
  }

   /**
   * Get signupCode
   * @return signupCode
  **/
  @ApiModelProperty(value = "")
  public String getSignupCode() {
    return signupCode;
  }

  public void setSignupCode(String signupCode) {
    this.signupCode = signupCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpRequest signUpRequest = (SignUpRequest) o;
    return Objects.equals(this.externalId, signUpRequest.externalId) &&
        Objects.equals(this.password, signUpRequest.password) &&
        Objects.equals(this.profile, signUpRequest.profile) &&
        Objects.equals(this.settings, signUpRequest.settings) &&
        Objects.equals(this.signupCode, signUpRequest.signupCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, password, profile, settings, signupCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    signupCode: ").append(toIndentedString(signupCode)).append("\n");
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

