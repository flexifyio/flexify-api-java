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
import io.flexify.apiclient.model.BillingAccount;
import io.flexify.apiclient.model.Organization;
import io.flexify.apiclient.model.UserConfig;
import io.flexify.apiclient.model.UserProfile;
import io.flexify.apiclient.model.UserSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Flexify.IO user
 */
@ApiModel(description = "Flexify.IO user")




public class User {
  @JsonProperty("account")
  private BillingAccount account = null;

  @JsonProperty("actualLimits")
  private UserConfig actualLimits = null;

  @JsonProperty("billingServerAccountId")
  private String billingServerAccountId = null;

  @JsonProperty("deleteRequested")
  private DateTime deleteRequested = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("org")
  private Organization org = null;

  @JsonProperty("profile")
  private UserProfile profile = null;

  @JsonProperty("registered")
  private DateTime registered = null;

  @JsonProperty("requireLicenseTerms")
  private Boolean requireLicenseTerms = null;

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

  @JsonProperty("settings")
  private UserSettings settings = null;

  @JsonProperty("signUpCode")
  private String signUpCode = null;

  /**
   * State of this user
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    DELETED("DELETED"),
    
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("userLimits")
  private UserConfig userLimits = null;

  @JsonProperty("username")
  private String username = null;

  public User account(BillingAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Billing Account associated with this user
   * @return account
  **/
  @ApiModelProperty(value = "Billing Account associated with this user")
  public BillingAccount getAccount() {
    return account;
  }

  public void setAccount(BillingAccount account) {
    this.account = account;
  }

  public User actualLimits(UserConfig actualLimits) {
    this.actualLimits = actualLimits;
    return this;
  }

   /**
   * Actual limits thar are currently in force
   * @return actualLimits
  **/
  @ApiModelProperty(value = "Actual limits thar are currently in force")
  public UserConfig getActualLimits() {
    return actualLimits;
  }

  public void setActualLimits(UserConfig actualLimits) {
    this.actualLimits = actualLimits;
  }

  public User billingServerAccountId(String billingServerAccountId) {
    this.billingServerAccountId = billingServerAccountId;
    return this;
  }

   /**
   * ID of this user&#39;s billing account on an external billing server
   * @return billingServerAccountId
  **/
  @ApiModelProperty(value = "ID of this user's billing account on an external billing server")
  public String getBillingServerAccountId() {
    return billingServerAccountId;
  }

  public void setBillingServerAccountId(String billingServerAccountId) {
    this.billingServerAccountId = billingServerAccountId;
  }

  public User deleteRequested(DateTime deleteRequested) {
    this.deleteRequested = deleteRequested;
    return this;
  }

   /**
   * If not null - time when the user requested to delete his or her account
   * @return deleteRequested
  **/
  @ApiModelProperty(value = "If not null - time when the user requested to delete his or her account")
  public DateTime getDeleteRequested() {
    return deleteRequested;
  }

  public void setDeleteRequested(DateTime deleteRequested) {
    this.deleteRequested = deleteRequested;
  }

  public User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External ID of the user, if specified
   * @return externalId
  **/
  @ApiModelProperty(value = "External ID of the user, if specified")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * User ID in the system
   * @return id
  **/
  @ApiModelProperty(value = "User ID in the system")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User org(Organization org) {
    this.org = org;
    return this;
  }

   /**
   * Organization owning this user
   * @return org
  **/
  @ApiModelProperty(value = "Organization owning this user")
  public Organization getOrg() {
    return org;
  }

  public void setOrg(Organization org) {
    this.org = org;
  }

  public User profile(UserProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * User&#39;s profile
   * @return profile
  **/
  @ApiModelProperty(value = "User's profile")
  public UserProfile getProfile() {
    return profile;
  }

  public void setProfile(UserProfile profile) {
    this.profile = profile;
  }

  public User registered(DateTime registered) {
    this.registered = registered;
    return this;
  }

   /**
   * Registration time
   * @return registered
  **/
  @ApiModelProperty(value = "Registration time")
  public DateTime getRegistered() {
    return registered;
  }

  public void setRegistered(DateTime registered) {
    this.registered = registered;
  }

  public User requireLicenseTerms(Boolean requireLicenseTerms) {
    this.requireLicenseTerms = requireLicenseTerms;
    return this;
  }

   /**
   * Indicates that this user does not have a password and needs to accept EULA
   * @return requireLicenseTerms
  **/
  @ApiModelProperty(value = "Indicates that this user does not have a password and needs to accept EULA")
  public Boolean isRequireLicenseTerms() {
    return requireLicenseTerms;
  }

  public void setRequireLicenseTerms(Boolean requireLicenseTerms) {
    this.requireLicenseTerms = requireLicenseTerms;
  }

  public User roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles associated with this user
   * @return roles
  **/
  @ApiModelProperty(value = "Roles associated with this user")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public User settings(UserSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * User&#39;s settings
   * @return settings
  **/
  @ApiModelProperty(value = "User's settings")
  public UserSettings getSettings() {
    return settings;
  }

  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }

  public User signUpCode(String signUpCode) {
    this.signUpCode = signUpCode;
    return this;
  }

   /**
   * Sign up code that the user used when signing up
   * @return signUpCode
  **/
  @ApiModelProperty(value = "Sign up code that the user used when signing up")
  public String getSignUpCode() {
    return signUpCode;
  }

  public void setSignUpCode(String signUpCode) {
    this.signUpCode = signUpCode;
  }

  public User state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of this user
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "State of this user")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public User userLimits(UserConfig userLimits) {
    this.userLimits = userLimits;
    return this;
  }

   /**
   * Limits defined for this user
   * @return userLimits
  **/
  @ApiModelProperty(value = "Limits defined for this user")
  public UserConfig getUserLimits() {
    return userLimits;
  }

  public void setUserLimits(UserConfig userLimits) {
    this.userLimits = userLimits;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username, always the same as user&#39;s email
   * @return username
  **/
  @ApiModelProperty(example = "jsmith@cool.io", value = "Username, always the same as user's email")
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
    User user = (User) o;
    return Objects.equals(this.account, user.account) &&
        Objects.equals(this.actualLimits, user.actualLimits) &&
        Objects.equals(this.billingServerAccountId, user.billingServerAccountId) &&
        Objects.equals(this.deleteRequested, user.deleteRequested) &&
        Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.org, user.org) &&
        Objects.equals(this.profile, user.profile) &&
        Objects.equals(this.registered, user.registered) &&
        Objects.equals(this.requireLicenseTerms, user.requireLicenseTerms) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.settings, user.settings) &&
        Objects.equals(this.signUpCode, user.signUpCode) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.userLimits, user.userLimits) &&
        Objects.equals(this.username, user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, actualLimits, billingServerAccountId, deleteRequested, externalId, id, org, profile, registered, requireLicenseTerms, roles, settings, signUpCode, state, userLimits, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    actualLimits: ").append(toIndentedString(actualLimits)).append("\n");
    sb.append("    billingServerAccountId: ").append(toIndentedString(billingServerAccountId)).append("\n");
    sb.append("    deleteRequested: ").append(toIndentedString(deleteRequested)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    requireLicenseTerms: ").append(toIndentedString(requireLicenseTerms)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    signUpCode: ").append(toIndentedString(signUpCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userLimits: ").append(toIndentedString(userLimits)).append("\n");
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

