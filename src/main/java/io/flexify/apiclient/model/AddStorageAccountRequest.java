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
import io.flexify.apiclient.model.NewStorageAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AddStorageAccountRequest
 */

public class AddStorageAccountRequest {
  @JsonProperty("includeBuckets")
  private List<String> includeBuckets = null;

  @JsonProperty("refreshNow")
  private Boolean refreshNow = null;

  @JsonProperty("storageAccount")
  private NewStorageAccount storageAccount = null;

  @JsonProperty("verify")
  private Boolean verify = null;

  public AddStorageAccountRequest includeBuckets(List<String> includeBuckets) {
    this.includeBuckets = includeBuckets;
    return this;
  }

  public AddStorageAccountRequest addIncludeBucketsItem(String includeBucketsItem) {
    if (this.includeBuckets == null) {
      this.includeBuckets = new ArrayList<String>();
    }
    this.includeBuckets.add(includeBucketsItem);
    return this;
  }

   /**
   * Lists of buckets to start monitoring, or null to request buckets from the cloud
   * @return includeBuckets
  **/
  @ApiModelProperty(value = "Lists of buckets to start monitoring, or null to request buckets from the cloud")
  public List<String> getIncludeBuckets() {
    return includeBuckets;
  }

  public void setIncludeBuckets(List<String> includeBuckets) {
    this.includeBuckets = includeBuckets;
  }

  public AddStorageAccountRequest refreshNow(Boolean refreshNow) {
    this.refreshNow = refreshNow;
    return this;
  }

   /**
   * If set to true, buckets will be refreshed after storage is added
   * @return refreshNow
  **/
  @ApiModelProperty(example = "false", value = "If set to true, buckets will be refreshed after storage is added")
  public Boolean isRefreshNow() {
    return refreshNow;
  }

  public void setRefreshNow(Boolean refreshNow) {
    this.refreshNow = refreshNow;
  }

  public AddStorageAccountRequest storageAccount(NewStorageAccount storageAccount) {
    this.storageAccount = storageAccount;
    return this;
  }

   /**
   * Storage account to create
   * @return storageAccount
  **/
  @ApiModelProperty(value = "Storage account to create")
  public NewStorageAccount getStorageAccount() {
    return storageAccount;
  }

  public void setStorageAccount(NewStorageAccount storageAccount) {
    this.storageAccount = storageAccount;
  }

  public AddStorageAccountRequest verify(Boolean verify) {
    this.verify = verify;
    return this;
  }

   /**
   * Specified if credentials or public access to included buckets should be checked
   * @return verify
  **/
  @ApiModelProperty(example = "true", value = "Specified if credentials or public access to included buckets should be checked")
  public Boolean isVerify() {
    return verify;
  }

  public void setVerify(Boolean verify) {
    this.verify = verify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddStorageAccountRequest addStorageAccountRequest = (AddStorageAccountRequest) o;
    return Objects.equals(this.includeBuckets, addStorageAccountRequest.includeBuckets) &&
        Objects.equals(this.refreshNow, addStorageAccountRequest.refreshNow) &&
        Objects.equals(this.storageAccount, addStorageAccountRequest.storageAccount) &&
        Objects.equals(this.verify, addStorageAccountRequest.verify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBuckets, refreshNow, storageAccount, verify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddStorageAccountRequest {\n");
    
    sb.append("    includeBuckets: ").append(toIndentedString(includeBuckets)).append("\n");
    sb.append("    refreshNow: ").append(toIndentedString(refreshNow)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
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

