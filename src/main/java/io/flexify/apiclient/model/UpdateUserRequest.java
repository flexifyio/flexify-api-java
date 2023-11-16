/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.13.0
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
 * UpdateUserRequest
 */

public class UpdateUserRequest {
  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("profile")
  private UserProfile profile = null;

  public UpdateUserRequest orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * ID os user&#39;s organization
   * @return orgId
  **/
  @ApiModelProperty(value = "ID os user's organization")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public UpdateUserRequest profile(UserProfile profile) {
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
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.orgId, updateUserRequest.orgId) &&
        Objects.equals(this.profile, updateUserRequest.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

