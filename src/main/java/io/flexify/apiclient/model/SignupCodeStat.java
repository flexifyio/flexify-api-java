/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.13.1
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
import io.flexify.apiclient.model.PriceList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * SignupCodeStat
 */

public class SignupCodeStat {
  @JsonProperty("available")
  private Boolean available = null;

  @JsonProperty("billingAccount")
  private BillingAccount billingAccount = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("org")
  private Organization org = null;

  @JsonProperty("priceList")
  private PriceList priceList = null;

  @JsonProperty("usedBy")
  private List<String> usedBy = null;

  public SignupCodeStat available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public SignupCodeStat billingAccount(BillingAccount billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

   /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")
  public BillingAccount getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccount billingAccount) {
    this.billingAccount = billingAccount;
  }

  public SignupCodeStat created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public SignupCodeStat org(Organization org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @ApiModelProperty(value = "")
  public Organization getOrg() {
    return org;
  }

  public void setOrg(Organization org) {
    this.org = org;
  }

  public SignupCodeStat priceList(PriceList priceList) {
    this.priceList = priceList;
    return this;
  }

   /**
   * Get priceList
   * @return priceList
  **/
  @ApiModelProperty(value = "")
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  public SignupCodeStat usedBy(List<String> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  public SignupCodeStat addUsedByItem(String usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<String>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Get usedBy
   * @return usedBy
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupCodeStat signupCodeStat = (SignupCodeStat) o;
    return Objects.equals(this.available, signupCodeStat.available) &&
        Objects.equals(this.billingAccount, signupCodeStat.billingAccount) &&
        Objects.equals(this.created, signupCodeStat.created) &&
        Objects.equals(this.org, signupCodeStat.org) &&
        Objects.equals(this.priceList, signupCodeStat.priceList) &&
        Objects.equals(this.usedBy, signupCodeStat.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, billingAccount, created, org, priceList, usedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupCodeStat {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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

