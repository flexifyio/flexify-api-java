/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.1
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
import io.flexify.apiclient.model.EndpointStorageAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to set or attach a number of storage accounts to endpoint
 */
@ApiModel(description = "Request to set or attach a number of storage accounts to endpoint")

public class StorageAccountsRequest {
  @JsonProperty("newStorageAccounts")
  private List<EndpointStorageAccount> newStorageAccounts = new ArrayList<EndpointStorageAccount>();

  public StorageAccountsRequest newStorageAccounts(List<EndpointStorageAccount> newStorageAccounts) {
    this.newStorageAccounts = newStorageAccounts;
    return this;
  }

  public StorageAccountsRequest addNewStorageAccountsItem(EndpointStorageAccount newStorageAccountsItem) {
    this.newStorageAccounts.add(newStorageAccountsItem);
    return this;
  }

   /**
   * A list of endpoint storage accounts to set or attach
   * @return newStorageAccounts
  **/
  @ApiModelProperty(required = true, value = "A list of endpoint storage accounts to set or attach")
  public List<EndpointStorageAccount> getNewStorageAccounts() {
    return newStorageAccounts;
  }

  public void setNewStorageAccounts(List<EndpointStorageAccount> newStorageAccounts) {
    this.newStorageAccounts = newStorageAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountsRequest storageAccountsRequest = (StorageAccountsRequest) o;
    return Objects.equals(this.newStorageAccounts, storageAccountsRequest.newStorageAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newStorageAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountsRequest {\n");
    
    sb.append("    newStorageAccounts: ").append(toIndentedString(newStorageAccounts)).append("\n");
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

