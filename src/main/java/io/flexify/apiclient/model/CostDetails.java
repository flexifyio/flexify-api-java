/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.16-SNAPSHOT
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
import io.flexify.apiclient.model.Money;
import io.flexify.apiclient.model.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Cost Details
 */
@ApiModel(description = "Cost Details")

public class CostDetails {
  @JsonProperty("cost")
  private Money cost = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("usage")
  private Long usage = null;

  @JsonProperty("username")
  private String username = null;

  public CostDetails cost(Money cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Cost
   * @return cost
  **/
  @ApiModelProperty(value = "Cost")
  public Money getCost() {
    return cost;
  }

  public void setCost(Money cost) {
    this.cost = cost;
  }

  public CostDetails price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Price list entry used to calculate this cost
   * @return price
  **/
  @ApiModelProperty(value = "Price list entry used to calculate this cost")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public CostDetails usage(Long usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Usage in bytes
   * @return usage
  **/
  @ApiModelProperty(example = "1073741824", value = "Usage in bytes")
  public Long getUsage() {
    return usage;
  }

  public void setUsage(Long usage) {
    this.usage = usage;
  }

  public CostDetails username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username
   * @return username
  **/
  @ApiModelProperty(example = "scarecrow@wiz.oz", value = "Username")
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
    CostDetails costDetails = (CostDetails) o;
    return Objects.equals(this.cost, costDetails.cost) &&
        Objects.equals(this.price, costDetails.price) &&
        Objects.equals(this.usage, costDetails.usage) &&
        Objects.equals(this.username, costDetails.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, price, usage, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostDetails {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

