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
import io.flexify.apiclient.model.Money;
import io.flexify.apiclient.model.PriceConstraints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Price
 */
@ApiModel(description = "Price")

public class Price {
  @JsonProperty("constraints")
  private PriceConstraints constraints = null;

  /**
   * Billable counter (such as traffic or storage volume)
   */
  public enum CounterEnum {
    STORAGE_VOLUME("STORAGE_VOLUME"),
    
    TRAFFIC("TRAFFIC");

    private String value;

    CounterEnum(String value) {
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
    public static CounterEnum fromValue(String value) {
      for (CounterEnum b : CounterEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("counter")
  private CounterEnum counter = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("price")
  private Money price = null;

  /**
   * Service
   */
  public enum ServiceEnum {
    FORWARDING("DATA_FORWARDING"),
    
    MIGRATION("DATA_MIGRATION");

    private String value;

    ServiceEnum(String value) {
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
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("service")
  private ServiceEnum service = null;

  @JsonProperty("unitName")
  private String unitName = null;

  @JsonProperty("unitSize")
  private Long unitSize = null;

  public Price constraints(PriceConstraints constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Constraints that this price works for
   * @return constraints
  **/
  @ApiModelProperty(value = "Constraints that this price works for")
  public PriceConstraints getConstraints() {
    return constraints;
  }

  public void setConstraints(PriceConstraints constraints) {
    this.constraints = constraints;
  }

  public Price counter(CounterEnum counter) {
    this.counter = counter;
    return this;
  }

   /**
   * Billable counter (such as traffic or storage volume)
   * @return counter
  **/
  @ApiModelProperty(example = "TRAFFIC", value = "Billable counter (such as traffic or storage volume)")
  public CounterEnum getCounter() {
    return counter;
  }

  public void setCounter(CounterEnum counter) {
    this.counter = counter;
  }

  public Price id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of this price
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID of this price")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Price price(Money price) {
    this.price = price;
    return this;
  }

   /**
   * Price of one unit
   * @return price
  **/
  @ApiModelProperty(value = "Price of one unit")
  public Money getPrice() {
    return price;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  public Price service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Service
   * @return service
  **/
  @ApiModelProperty(example = "DATA_MIGRATION", value = "Service")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

  public Price unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

   /**
   * Name of billable unit
   * @return unitName
  **/
  @ApiModelProperty(example = "GiB", value = "Name of billable unit")
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public Price unitSize(Long unitSize) {
    this.unitSize = unitSize;
    return this;
  }

   /**
   * Size of billable unit in bytes
   * @return unitSize
  **/
  @ApiModelProperty(example = "1073741824", value = "Size of billable unit in bytes")
  public Long getUnitSize() {
    return unitSize;
  }

  public void setUnitSize(Long unitSize) {
    this.unitSize = unitSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.constraints, price.constraints) &&
        Objects.equals(this.counter, price.counter) &&
        Objects.equals(this.id, price.id) &&
        Objects.equals(this.price, price.price) &&
        Objects.equals(this.service, price.service) &&
        Objects.equals(this.unitName, price.unitName) &&
        Objects.equals(this.unitSize, price.unitSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, counter, id, price, service, unitName, unitSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    unitSize: ").append(toIndentedString(unitSize)).append("\n");
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

