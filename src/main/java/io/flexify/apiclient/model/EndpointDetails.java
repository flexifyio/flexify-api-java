/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.16.hf1
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
import io.flexify.apiclient.model.EndpointSettings;
import io.flexify.apiclient.model.EndpointStat;
import io.flexify.apiclient.model.EndpointStorageAccount;
import io.flexify.apiclient.model.VirtualBucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Flexify IO Virtual Endpoint
 */
@ApiModel(description = "Flexify IO Virtual Endpoint")

public class EndpointDetails {
  @JsonProperty("accounts")
  private List<EndpointStorageAccount> accounts = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("settings")
  private EndpointSettings settings = null;

  @JsonProperty("stat")
  private EndpointStat stat = null;

  @JsonProperty("virtualBuckets")
  private List<VirtualBucket> virtualBuckets = null;

  public EndpointDetails accounts(List<EndpointStorageAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  public EndpointDetails addAccountsItem(EndpointStorageAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<EndpointStorageAccount>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public List<EndpointStorageAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<EndpointStorageAccount> accounts) {
    this.accounts = accounts;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Long getId() {
    return id;
  }

  public EndpointDetails settings(EndpointSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings of endpoint
   * @return settings
  **/
  @ApiModelProperty(required = true, value = "Settings of endpoint")
  public EndpointSettings getSettings() {
    return settings;
  }

  public void setSettings(EndpointSettings settings) {
    this.settings = settings;
  }

  public EndpointDetails stat(EndpointStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public EndpointStat getStat() {
    return stat;
  }

  public void setStat(EndpointStat stat) {
    this.stat = stat;
  }

  public EndpointDetails virtualBuckets(List<VirtualBucket> virtualBuckets) {
    this.virtualBuckets = virtualBuckets;
    return this;
  }

  public EndpointDetails addVirtualBucketsItem(VirtualBucket virtualBucketsItem) {
    if (this.virtualBuckets == null) {
      this.virtualBuckets = new ArrayList<VirtualBucket>();
    }
    this.virtualBuckets.add(virtualBucketsItem);
    return this;
  }

   /**
   * Get virtualBuckets
   * @return virtualBuckets
  **/
  @ApiModelProperty(value = "")
  public List<VirtualBucket> getVirtualBuckets() {
    return virtualBuckets;
  }

  public void setVirtualBuckets(List<VirtualBucket> virtualBuckets) {
    this.virtualBuckets = virtualBuckets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointDetails endpointDetails = (EndpointDetails) o;
    return Objects.equals(this.accounts, endpointDetails.accounts) &&
        Objects.equals(this.id, endpointDetails.id) &&
        Objects.equals(this.settings, endpointDetails.settings) &&
        Objects.equals(this.stat, endpointDetails.stat) &&
        Objects.equals(this.virtualBuckets, endpointDetails.virtualBuckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, id, settings, stat, virtualBuckets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointDetails {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    virtualBuckets: ").append(toIndentedString(virtualBuckets)).append("\n");
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

