/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.19
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateUserRequest
 */

public class CreateUserRequest {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("priceListId")
  private Long priceListId = null;

  @JsonProperty("profile")
  private UserProfile profile = null;

  public CreateUserRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * An optional external ID that can be later used to reference this user
   * @return externalId
  **/
  @ApiModelProperty(value = "An optional external ID that can be later used to reference this user")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public CreateUserRequest orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * ID of the organization to assign the user to (or default otherwise)
   * @return orgId
  **/
  @ApiModelProperty(value = "ID of the organization to assign the user to (or default otherwise)")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public CreateUserRequest priceListId(Long priceListId) {
    this.priceListId = priceListId;
    return this;
  }

   /**
   * ID of the price list to assign to this user (or default otherwise)
   * @return priceListId
  **/
  @ApiModelProperty(value = "ID of the price list to assign to this user (or default otherwise)")
  public Long getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(Long priceListId) {
    this.priceListId = priceListId;
  }

  public CreateUserRequest profile(UserProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * New user&#39;s profile containing basic information about the user
   * @return profile
  **/
  @ApiModelProperty(required = true, value = "New user's profile containing basic information about the user")
  public UserProfile getProfile() {
    return profile;
  }

  public void setProfile(UserProfile profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.externalId, createUserRequest.externalId) &&
        Objects.equals(this.orgId, createUserRequest.orgId) &&
        Objects.equals(this.priceListId, createUserRequest.priceListId) &&
        Objects.equals(this.profile, createUserRequest.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, orgId, priceListId, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

