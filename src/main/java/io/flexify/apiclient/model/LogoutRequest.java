/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.6
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
 * LogoutRequest
 */




public class LogoutRequest {
  @JsonProperty("deleteAllImpersonationTokens")
  private Boolean deleteAllImpersonationTokens = null;

  @JsonProperty("deleteAllIntegrationTokens")
  private Boolean deleteAllIntegrationTokens = null;

  @JsonProperty("deleteAllLoginTokens")
  private Boolean deleteAllLoginTokens = null;

  public LogoutRequest deleteAllImpersonationTokens(Boolean deleteAllImpersonationTokens) {
    this.deleteAllImpersonationTokens = deleteAllImpersonationTokens;
    return this;
  }

   /**
   * Specifies if all IMPERSONATION tokens should be deleted
   * @return deleteAllImpersonationTokens
  **/
  @ApiModelProperty(value = "Specifies if all IMPERSONATION tokens should be deleted")
  public Boolean isDeleteAllImpersonationTokens() {
    return deleteAllImpersonationTokens;
  }

  public void setDeleteAllImpersonationTokens(Boolean deleteAllImpersonationTokens) {
    this.deleteAllImpersonationTokens = deleteAllImpersonationTokens;
  }

  public LogoutRequest deleteAllIntegrationTokens(Boolean deleteAllIntegrationTokens) {
    this.deleteAllIntegrationTokens = deleteAllIntegrationTokens;
    return this;
  }

   /**
   * Specifies if all INTEGRATION tokens should be deleted
   * @return deleteAllIntegrationTokens
  **/
  @ApiModelProperty(value = "Specifies if all INTEGRATION tokens should be deleted")
  public Boolean isDeleteAllIntegrationTokens() {
    return deleteAllIntegrationTokens;
  }

  public void setDeleteAllIntegrationTokens(Boolean deleteAllIntegrationTokens) {
    this.deleteAllIntegrationTokens = deleteAllIntegrationTokens;
  }

  public LogoutRequest deleteAllLoginTokens(Boolean deleteAllLoginTokens) {
    this.deleteAllLoginTokens = deleteAllLoginTokens;
    return this;
  }

   /**
   * Specifies if all LOGIN tokens should be deleted
   * @return deleteAllLoginTokens
  **/
  @ApiModelProperty(value = "Specifies if all LOGIN tokens should be deleted")
  public Boolean isDeleteAllLoginTokens() {
    return deleteAllLoginTokens;
  }

  public void setDeleteAllLoginTokens(Boolean deleteAllLoginTokens) {
    this.deleteAllLoginTokens = deleteAllLoginTokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoutRequest logoutRequest = (LogoutRequest) o;
    return Objects.equals(this.deleteAllImpersonationTokens, logoutRequest.deleteAllImpersonationTokens) &&
        Objects.equals(this.deleteAllIntegrationTokens, logoutRequest.deleteAllIntegrationTokens) &&
        Objects.equals(this.deleteAllLoginTokens, logoutRequest.deleteAllLoginTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteAllImpersonationTokens, deleteAllIntegrationTokens, deleteAllLoginTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutRequest {\n");
    
    sb.append("    deleteAllImpersonationTokens: ").append(toIndentedString(deleteAllImpersonationTokens)).append("\n");
    sb.append("    deleteAllIntegrationTokens: ").append(toIndentedString(deleteAllIntegrationTokens)).append("\n");
    sb.append("    deleteAllLoginTokens: ").append(toIndentedString(deleteAllLoginTokens)).append("\n");
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

