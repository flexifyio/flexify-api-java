/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.15.0-SNAPSHOT
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
import io.flexify.apiclient.model.PublicAuthenticationConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PublicManagementServerConfiguration
 */

public class PublicManagementServerConfiguration {
  @JsonProperty("anonymousSignupWithMicrosoft")
  private Boolean anonymousSignupWithMicrosoft = null;

  @JsonProperty("anonymousSignupWithPassword")
  private Boolean anonymousSignupWithPassword = null;

  @JsonProperty("billingEnabled")
  private Boolean billingEnabled = null;

  @JsonProperty("haveUsers")
  private Boolean haveUsers = null;

  @JsonProperty("managementServerBuildNumber")
  private String managementServerBuildNumber = null;

  @JsonProperty("singleEngine")
  private Boolean singleEngine = null;

  @JsonProperty("singleUserMode")
  private Boolean singleUserMode = null;

  @JsonProperty("ssoConfig")
  private PublicAuthenticationConfiguration ssoConfig = null;

  public PublicManagementServerConfiguration anonymousSignupWithMicrosoft(Boolean anonymousSignupWithMicrosoft) {
    this.anonymousSignupWithMicrosoft = anonymousSignupWithMicrosoft;
    return this;
  }

   /**
   * Allow anonymous signup with microsoft
   * @return anonymousSignupWithMicrosoft
  **/
  @ApiModelProperty(value = "Allow anonymous signup with microsoft")
  public Boolean isAnonymousSignupWithMicrosoft() {
    return anonymousSignupWithMicrosoft;
  }

  public void setAnonymousSignupWithMicrosoft(Boolean anonymousSignupWithMicrosoft) {
    this.anonymousSignupWithMicrosoft = anonymousSignupWithMicrosoft;
  }

  public PublicManagementServerConfiguration anonymousSignupWithPassword(Boolean anonymousSignupWithPassword) {
    this.anonymousSignupWithPassword = anonymousSignupWithPassword;
    return this;
  }

   /**
   * Allow anonymous signup with password
   * @return anonymousSignupWithPassword
  **/
  @ApiModelProperty(value = "Allow anonymous signup with password")
  public Boolean isAnonymousSignupWithPassword() {
    return anonymousSignupWithPassword;
  }

  public void setAnonymousSignupWithPassword(Boolean anonymousSignupWithPassword) {
    this.anonymousSignupWithPassword = anonymousSignupWithPassword;
  }

  public PublicManagementServerConfiguration billingEnabled(Boolean billingEnabled) {
    this.billingEnabled = billingEnabled;
    return this;
  }

   /**
   * Billing-related content to be shown on web console
   * @return billingEnabled
  **/
  @ApiModelProperty(value = "Billing-related content to be shown on web console")
  public Boolean isBillingEnabled() {
    return billingEnabled;
  }

  public void setBillingEnabled(Boolean billingEnabled) {
    this.billingEnabled = billingEnabled;
  }

  public PublicManagementServerConfiguration haveUsers(Boolean haveUsers) {
    this.haveUsers = haveUsers;
    return this;
  }

   /**
   * Specifies if at least one user is configured
   * @return haveUsers
  **/
  @ApiModelProperty(value = "Specifies if at least one user is configured")
  public Boolean isHaveUsers() {
    return haveUsers;
  }

  public void setHaveUsers(Boolean haveUsers) {
    this.haveUsers = haveUsers;
  }

  public PublicManagementServerConfiguration managementServerBuildNumber(String managementServerBuildNumber) {
    this.managementServerBuildNumber = managementServerBuildNumber;
    return this;
  }

   /**
   * Management Server build number
   * @return managementServerBuildNumber
  **/
  @ApiModelProperty(value = "Management Server build number")
  public String getManagementServerBuildNumber() {
    return managementServerBuildNumber;
  }

  public void setManagementServerBuildNumber(String managementServerBuildNumber) {
    this.managementServerBuildNumber = managementServerBuildNumber;
  }

  public PublicManagementServerConfiguration singleEngine(Boolean singleEngine) {
    this.singleEngine = singleEngine;
    return this;
  }

   /**
   * Only one engine can be created with web console
   * @return singleEngine
  **/
  @ApiModelProperty(value = "Only one engine can be created with web console")
  public Boolean isSingleEngine() {
    return singleEngine;
  }

  public void setSingleEngine(Boolean singleEngine) {
    this.singleEngine = singleEngine;
  }

  public PublicManagementServerConfiguration singleUserMode(Boolean singleUserMode) {
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

  public PublicManagementServerConfiguration ssoConfig(PublicAuthenticationConfiguration ssoConfig) {
    this.ssoConfig = ssoConfig;
    return this;
  }

   /**
   * Configuration for SSO
   * @return ssoConfig
  **/
  @ApiModelProperty(value = "Configuration for SSO")
  public PublicAuthenticationConfiguration getSsoConfig() {
    return ssoConfig;
  }

  public void setSsoConfig(PublicAuthenticationConfiguration ssoConfig) {
    this.ssoConfig = ssoConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicManagementServerConfiguration publicManagementServerConfiguration = (PublicManagementServerConfiguration) o;
    return Objects.equals(this.anonymousSignupWithMicrosoft, publicManagementServerConfiguration.anonymousSignupWithMicrosoft) &&
        Objects.equals(this.anonymousSignupWithPassword, publicManagementServerConfiguration.anonymousSignupWithPassword) &&
        Objects.equals(this.billingEnabled, publicManagementServerConfiguration.billingEnabled) &&
        Objects.equals(this.haveUsers, publicManagementServerConfiguration.haveUsers) &&
        Objects.equals(this.managementServerBuildNumber, publicManagementServerConfiguration.managementServerBuildNumber) &&
        Objects.equals(this.singleEngine, publicManagementServerConfiguration.singleEngine) &&
        Objects.equals(this.singleUserMode, publicManagementServerConfiguration.singleUserMode) &&
        Objects.equals(this.ssoConfig, publicManagementServerConfiguration.ssoConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymousSignupWithMicrosoft, anonymousSignupWithPassword, billingEnabled, haveUsers, managementServerBuildNumber, singleEngine, singleUserMode, ssoConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicManagementServerConfiguration {\n");
    
    sb.append("    anonymousSignupWithMicrosoft: ").append(toIndentedString(anonymousSignupWithMicrosoft)).append("\n");
    sb.append("    anonymousSignupWithPassword: ").append(toIndentedString(anonymousSignupWithPassword)).append("\n");
    sb.append("    billingEnabled: ").append(toIndentedString(billingEnabled)).append("\n");
    sb.append("    haveUsers: ").append(toIndentedString(haveUsers)).append("\n");
    sb.append("    managementServerBuildNumber: ").append(toIndentedString(managementServerBuildNumber)).append("\n");
    sb.append("    singleEngine: ").append(toIndentedString(singleEngine)).append("\n");
    sb.append("    singleUserMode: ").append(toIndentedString(singleUserMode)).append("\n");
    sb.append("    ssoConfig: ").append(toIndentedString(ssoConfig)).append("\n");
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

