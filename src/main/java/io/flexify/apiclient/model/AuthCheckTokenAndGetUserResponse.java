/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.11-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * Check token response
 */
@ApiModel(description = "Check token response")




public class AuthCheckTokenAndGetUserResponse {
  /**
   * Gets or Sets roles
   */
  public enum RolesEnum {
    ACTUATOR("ROLE_ACTUATOR"),
    
    ADMIN("ROLE_ADMIN"),
    
    BILLING("ROLE_BILLING"),
    
    DISTRIBUTOR("ROLE_DISTRIBUTOR"),
    
    IMPERSONATOR("ROLE_IMPERSONATOR"),
    
    PARTNER_ADMIN("ROLE_PARTNER_ADMIN"),
    
    USER("ROLE_USER");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RolesEnum fromValue(String text) {
      for (RolesEnum b : RolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles")
  private List<RolesEnum> roles = null;

  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("username")
  private String username = null;

  public AuthCheckTokenAndGetUserResponse roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public AuthCheckTokenAndGetUserResponse addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public AuthCheckTokenAndGetUserResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AuthCheckTokenAndGetUserResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthCheckTokenAndGetUserResponse authCheckTokenAndGetUserResponse = (AuthCheckTokenAndGetUserResponse) o;
    return Objects.equals(this.roles, authCheckTokenAndGetUserResponse.roles) &&
        Objects.equals(this.userId, authCheckTokenAndGetUserResponse.userId) &&
        Objects.equals(this.username, authCheckTokenAndGetUserResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthCheckTokenAndGetUserResponse {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

