/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.12
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
 * SignupCodeReq
 */

public class SignupCodeReq {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("priceListId")
  private Long priceListId = null;

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
    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles")
  private List<RolesEnum> roles = null;

  @JsonProperty("singleUse")
  private Boolean singleUse = null;

  @JsonProperty("useMyBillingAccount")
  private Boolean useMyBillingAccount = null;

  public SignupCodeReq code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SignupCodeReq orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public SignupCodeReq priceListId(Long priceListId) {
    this.priceListId = priceListId;
    return this;
  }

   /**
   * Get priceListId
   * @return priceListId
  **/
  @ApiModelProperty(value = "")
  public Long getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(Long priceListId) {
    this.priceListId = priceListId;
  }

  public SignupCodeReq roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public SignupCodeReq addRolesItem(RolesEnum rolesItem) {
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

  public SignupCodeReq singleUse(Boolean singleUse) {
    this.singleUse = singleUse;
    return this;
  }

   /**
   * Get singleUse
   * @return singleUse
  **/
  @ApiModelProperty(value = "")
  public Boolean isSingleUse() {
    return singleUse;
  }

  public void setSingleUse(Boolean singleUse) {
    this.singleUse = singleUse;
  }

  public SignupCodeReq useMyBillingAccount(Boolean useMyBillingAccount) {
    this.useMyBillingAccount = useMyBillingAccount;
    return this;
  }

   /**
   * Get useMyBillingAccount
   * @return useMyBillingAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseMyBillingAccount() {
    return useMyBillingAccount;
  }

  public void setUseMyBillingAccount(Boolean useMyBillingAccount) {
    this.useMyBillingAccount = useMyBillingAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupCodeReq signupCodeReq = (SignupCodeReq) o;
    return Objects.equals(this.code, signupCodeReq.code) &&
        Objects.equals(this.orgId, signupCodeReq.orgId) &&
        Objects.equals(this.priceListId, signupCodeReq.priceListId) &&
        Objects.equals(this.roles, signupCodeReq.roles) &&
        Objects.equals(this.singleUse, signupCodeReq.singleUse) &&
        Objects.equals(this.useMyBillingAccount, signupCodeReq.useMyBillingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, orgId, priceListId, roles, singleUse, useMyBillingAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupCodeReq {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    priceListId: ").append(toIndentedString(priceListId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    singleUse: ").append(toIndentedString(singleUse)).append("\n");
    sb.append("    useMyBillingAccount: ").append(toIndentedString(useMyBillingAccount)).append("\n");
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

