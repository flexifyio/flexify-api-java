/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.9-SNAPSHOT
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
 * SetRolesRequest
 */




public class SetRolesRequest {
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

  public SetRolesRequest roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public SetRolesRequest addRolesItem(RolesEnum rolesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRolesRequest setRolesRequest = (SetRolesRequest) o;
    return Objects.equals(this.roles, setRolesRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRolesRequest {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

