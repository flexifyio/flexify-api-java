/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.7.0
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
import io.flexify.apiclient.model.Distributor;
import io.flexify.apiclient.model.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Billing Account Information
 */
@ApiModel(description = "Billing Account Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
public class BillingAccountWithMoney {
  /**
   * System Account state (Updated by Administrator)
   */
  public enum AdminStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    AdminStateEnum(String value) {
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
    public static AdminStateEnum fromValue(String text) {
      for (AdminStateEnum b : AdminStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("adminState")
  private AdminStateEnum adminState = null;

  /**
   * Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)
   */
  public enum AggregateStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    AggregateStateEnum(String value) {
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
    public static AggregateStateEnum fromValue(String text) {
      for (AggregateStateEnum b : AggregateStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aggregateState")
  private AggregateStateEnum aggregateState = null;

  @JsonProperty("balance")
  private Money balance = null;

  /**
   * Billing Account state (Depend on balance and max credit)
   */
  public enum BillingStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    BillingStateEnum(String value) {
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
    public static BillingStateEnum fromValue(String text) {
      for (BillingStateEnum b : BillingStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("billingState")
  private BillingStateEnum billingState = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("creditExceeded")
  private Boolean creditExceeded = null;

  @JsonProperty("distributor")
  private Distributor distributor = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("maxCredit")
  private Money maxCredit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("totalCost")
  private Money totalCost = null;

  @JsonProperty("totalPaid")
  private Money totalPaid = null;

  public BillingAccountWithMoney adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * System Account state (Updated by Administrator)
   * @return adminState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "System Account state (Updated by Administrator)")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public BillingAccountWithMoney aggregateState(AggregateStateEnum aggregateState) {
    this.aggregateState = aggregateState;
    return this;
  }

   /**
   * Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)
   * @return aggregateState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)")
  public AggregateStateEnum getAggregateState() {
    return aggregateState;
  }

  public void setAggregateState(AggregateStateEnum aggregateState) {
    this.aggregateState = aggregateState;
  }

  public BillingAccountWithMoney balance(Money balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Account Current Balance
   * @return balance
  **/
  @ApiModelProperty(value = "Account Current Balance")
  public Money getBalance() {
    return balance;
  }

  public void setBalance(Money balance) {
    this.balance = balance;
  }

  public BillingAccountWithMoney billingState(BillingStateEnum billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * Billing Account state (Depend on balance and max credit)
   * @return billingState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Billing Account state (Depend on balance and max credit)")
  public BillingStateEnum getBillingState() {
    return billingState;
  }

  public void setBillingState(BillingStateEnum billingState) {
    this.billingState = billingState;
  }

  public BillingAccountWithMoney createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Created Timestamp
   * @return createdDate
  **/
  @ApiModelProperty(value = "Created Timestamp")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

   /**
   * Is credit exceeded
   * @return creditExceeded
  **/
  @ApiModelProperty(value = "Is credit exceeded")
  public Boolean isCreditExceeded() {
    return creditExceeded;
  }

  public BillingAccountWithMoney distributor(Distributor distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * Distributor that manages this account
   * @return distributor
  **/
  @ApiModelProperty(value = "Distributor that manages this account")
  public Distributor getDistributor() {
    return distributor;
  }

  public void setDistributor(Distributor distributor) {
    this.distributor = distributor;
  }

  public BillingAccountWithMoney id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Account Id
   * @return id
  **/
  @ApiModelProperty(value = "Account Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BillingAccountWithMoney maxCredit(Money maxCredit) {
    this.maxCredit = maxCredit;
    return this;
  }

   /**
   * Account Maximum Credit
   * @return maxCredit
  **/
  @ApiModelProperty(value = "Account Maximum Credit")
  public Money getMaxCredit() {
    return maxCredit;
  }

  public void setMaxCredit(Money maxCredit) {
    this.maxCredit = maxCredit;
  }

  public BillingAccountWithMoney name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account Name
   * @return name
  **/
  @ApiModelProperty(example = "Personal Account", value = "Account Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingAccountWithMoney totalCost(Money totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Account Total Cost
   * @return totalCost
  **/
  @ApiModelProperty(value = "Account Total Cost")
  public Money getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Money totalCost) {
    this.totalCost = totalCost;
  }

  public BillingAccountWithMoney totalPaid(Money totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

   /**
   * Account Total Paid
   * @return totalPaid
  **/
  @ApiModelProperty(value = "Account Total Paid")
  public Money getTotalPaid() {
    return totalPaid;
  }

  public void setTotalPaid(Money totalPaid) {
    this.totalPaid = totalPaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAccountWithMoney billingAccountWithMoney = (BillingAccountWithMoney) o;
    return Objects.equals(this.adminState, billingAccountWithMoney.adminState) &&
        Objects.equals(this.aggregateState, billingAccountWithMoney.aggregateState) &&
        Objects.equals(this.balance, billingAccountWithMoney.balance) &&
        Objects.equals(this.billingState, billingAccountWithMoney.billingState) &&
        Objects.equals(this.createdDate, billingAccountWithMoney.createdDate) &&
        Objects.equals(this.creditExceeded, billingAccountWithMoney.creditExceeded) &&
        Objects.equals(this.distributor, billingAccountWithMoney.distributor) &&
        Objects.equals(this.id, billingAccountWithMoney.id) &&
        Objects.equals(this.maxCredit, billingAccountWithMoney.maxCredit) &&
        Objects.equals(this.name, billingAccountWithMoney.name) &&
        Objects.equals(this.totalCost, billingAccountWithMoney.totalCost) &&
        Objects.equals(this.totalPaid, billingAccountWithMoney.totalPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminState, aggregateState, balance, billingState, createdDate, creditExceeded, distributor, id, maxCredit, name, totalCost, totalPaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccountWithMoney {\n");
    
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    aggregateState: ").append(toIndentedString(aggregateState)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    creditExceeded: ").append(toIndentedString(creditExceeded)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxCredit: ").append(toIndentedString(maxCredit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
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

