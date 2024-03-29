/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.2
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
import org.joda.time.DateTime;

/**
 * UserStat
 */

public class UserStat {
  @JsonProperty("activeMigrationsCount")
  private Long activeMigrationsCount = null;

  /**
   * Gets or Sets billingAccountAdminState
   */
  public enum BillingAccountAdminStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    BillingAccountAdminStateEnum(String value) {
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
    public static BillingAccountAdminStateEnum fromValue(String value) {
      for (BillingAccountAdminStateEnum b : BillingAccountAdminStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("billingAccountAdminState")
  private BillingAccountAdminStateEnum billingAccountAdminState = null;

  @JsonProperty("billingAccountName")
  private String billingAccountName = null;

  /**
   * Gets or Sets billingAccountState
   */
  public enum BillingAccountStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    BillingAccountStateEnum(String value) {
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
    public static BillingAccountStateEnum fromValue(String value) {
      for (BillingAccountStateEnum b : BillingAccountStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("billingAccountState")
  private BillingAccountStateEnum billingAccountState = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("deleteRequested")
  private DateTime deleteRequested = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("distributorName")
  private String distributorName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orgName")
  private String orgName = null;

  @JsonProperty("priceListName")
  private String priceListName = null;

  @JsonProperty("registered")
  private DateTime registered = null;

  @JsonProperty("storageAccountsCount")
  private Long storageAccountsCount = null;

  @JsonProperty("totalMigrationsCount")
  private Long totalMigrationsCount = null;

  /**
   * Gets or Sets userState
   */
  public enum UserStateEnum {
    ACTIVE("ACTIVE"),
    
    DELETED("DELETED"),
    
    DISABLED("DISABLED");

    private String value;

    UserStateEnum(String value) {
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
    public static UserStateEnum fromValue(String value) {
      for (UserStateEnum b : UserStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("userState")
  private UserStateEnum userState = null;

  public UserStat activeMigrationsCount(Long activeMigrationsCount) {
    this.activeMigrationsCount = activeMigrationsCount;
    return this;
  }

   /**
   * Get activeMigrationsCount
   * @return activeMigrationsCount
  **/
  @ApiModelProperty(value = "")
  public Long getActiveMigrationsCount() {
    return activeMigrationsCount;
  }

  public void setActiveMigrationsCount(Long activeMigrationsCount) {
    this.activeMigrationsCount = activeMigrationsCount;
  }

  public UserStat billingAccountAdminState(BillingAccountAdminStateEnum billingAccountAdminState) {
    this.billingAccountAdminState = billingAccountAdminState;
    return this;
  }

   /**
   * Get billingAccountAdminState
   * @return billingAccountAdminState
  **/
  @ApiModelProperty(value = "")
  public BillingAccountAdminStateEnum getBillingAccountAdminState() {
    return billingAccountAdminState;
  }

  public void setBillingAccountAdminState(BillingAccountAdminStateEnum billingAccountAdminState) {
    this.billingAccountAdminState = billingAccountAdminState;
  }

  public UserStat billingAccountName(String billingAccountName) {
    this.billingAccountName = billingAccountName;
    return this;
  }

   /**
   * Get billingAccountName
   * @return billingAccountName
  **/
  @ApiModelProperty(value = "")
  public String getBillingAccountName() {
    return billingAccountName;
  }

  public void setBillingAccountName(String billingAccountName) {
    this.billingAccountName = billingAccountName;
  }

  public UserStat billingAccountState(BillingAccountStateEnum billingAccountState) {
    this.billingAccountState = billingAccountState;
    return this;
  }

   /**
   * Get billingAccountState
   * @return billingAccountState
  **/
  @ApiModelProperty(value = "")
  public BillingAccountStateEnum getBillingAccountState() {
    return billingAccountState;
  }

  public void setBillingAccountState(BillingAccountStateEnum billingAccountState) {
    this.billingAccountState = billingAccountState;
  }

  public UserStat company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserStat deleteRequested(DateTime deleteRequested) {
    this.deleteRequested = deleteRequested;
    return this;
  }

   /**
   * Get deleteRequested
   * @return deleteRequested
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeleteRequested() {
    return deleteRequested;
  }

  public void setDeleteRequested(DateTime deleteRequested) {
    this.deleteRequested = deleteRequested;
  }

  public UserStat displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserStat distributorName(String distributorName) {
    this.distributorName = distributorName;
    return this;
  }

   /**
   * Get distributorName
   * @return distributorName
  **/
  @ApiModelProperty(value = "")
  public String getDistributorName() {
    return distributorName;
  }

  public void setDistributorName(String distributorName) {
    this.distributorName = distributorName;
  }

  public UserStat email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserStat externalId(String externalId) {
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

  public UserStat id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserStat orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @ApiModelProperty(value = "")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UserStat priceListName(String priceListName) {
    this.priceListName = priceListName;
    return this;
  }

   /**
   * Get priceListName
   * @return priceListName
  **/
  @ApiModelProperty(value = "")
  public String getPriceListName() {
    return priceListName;
  }

  public void setPriceListName(String priceListName) {
    this.priceListName = priceListName;
  }

  public UserStat registered(DateTime registered) {
    this.registered = registered;
    return this;
  }

   /**
   * Get registered
   * @return registered
  **/
  @ApiModelProperty(value = "")
  public DateTime getRegistered() {
    return registered;
  }

  public void setRegistered(DateTime registered) {
    this.registered = registered;
  }

  public UserStat storageAccountsCount(Long storageAccountsCount) {
    this.storageAccountsCount = storageAccountsCount;
    return this;
  }

   /**
   * Get storageAccountsCount
   * @return storageAccountsCount
  **/
  @ApiModelProperty(value = "")
  public Long getStorageAccountsCount() {
    return storageAccountsCount;
  }

  public void setStorageAccountsCount(Long storageAccountsCount) {
    this.storageAccountsCount = storageAccountsCount;
  }

  public UserStat totalMigrationsCount(Long totalMigrationsCount) {
    this.totalMigrationsCount = totalMigrationsCount;
    return this;
  }

   /**
   * Get totalMigrationsCount
   * @return totalMigrationsCount
  **/
  @ApiModelProperty(value = "")
  public Long getTotalMigrationsCount() {
    return totalMigrationsCount;
  }

  public void setTotalMigrationsCount(Long totalMigrationsCount) {
    this.totalMigrationsCount = totalMigrationsCount;
  }

  public UserStat userState(UserStateEnum userState) {
    this.userState = userState;
    return this;
  }

   /**
   * Get userState
   * @return userState
  **/
  @ApiModelProperty(value = "")
  public UserStateEnum getUserState() {
    return userState;
  }

  public void setUserState(UserStateEnum userState) {
    this.userState = userState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStat userStat = (UserStat) o;
    return Objects.equals(this.activeMigrationsCount, userStat.activeMigrationsCount) &&
        Objects.equals(this.billingAccountAdminState, userStat.billingAccountAdminState) &&
        Objects.equals(this.billingAccountName, userStat.billingAccountName) &&
        Objects.equals(this.billingAccountState, userStat.billingAccountState) &&
        Objects.equals(this.company, userStat.company) &&
        Objects.equals(this.deleteRequested, userStat.deleteRequested) &&
        Objects.equals(this.displayName, userStat.displayName) &&
        Objects.equals(this.distributorName, userStat.distributorName) &&
        Objects.equals(this.email, userStat.email) &&
        Objects.equals(this.externalId, userStat.externalId) &&
        Objects.equals(this.id, userStat.id) &&
        Objects.equals(this.orgName, userStat.orgName) &&
        Objects.equals(this.priceListName, userStat.priceListName) &&
        Objects.equals(this.registered, userStat.registered) &&
        Objects.equals(this.storageAccountsCount, userStat.storageAccountsCount) &&
        Objects.equals(this.totalMigrationsCount, userStat.totalMigrationsCount) &&
        Objects.equals(this.userState, userStat.userState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMigrationsCount, billingAccountAdminState, billingAccountName, billingAccountState, company, deleteRequested, displayName, distributorName, email, externalId, id, orgName, priceListName, registered, storageAccountsCount, totalMigrationsCount, userState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStat {\n");
    
    sb.append("    activeMigrationsCount: ").append(toIndentedString(activeMigrationsCount)).append("\n");
    sb.append("    billingAccountAdminState: ").append(toIndentedString(billingAccountAdminState)).append("\n");
    sb.append("    billingAccountName: ").append(toIndentedString(billingAccountName)).append("\n");
    sb.append("    billingAccountState: ").append(toIndentedString(billingAccountState)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    deleteRequested: ").append(toIndentedString(deleteRequested)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    distributorName: ").append(toIndentedString(distributorName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    priceListName: ").append(toIndentedString(priceListName)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    storageAccountsCount: ").append(toIndentedString(storageAccountsCount)).append("\n");
    sb.append("    totalMigrationsCount: ").append(toIndentedString(totalMigrationsCount)).append("\n");
    sb.append("    userState: ").append(toIndentedString(userState)).append("\n");
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

