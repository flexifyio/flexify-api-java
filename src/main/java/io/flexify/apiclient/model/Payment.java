/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.10
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Payment information
 */
@ApiModel(description = "Payment information")




public class Payment {
  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("comments")
  private String comments = null;

  /**
   * Payment entry mode (automatic or manual)
   */
  public enum EntryModeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    EntryModeEnum(String value) {
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
    public static EntryModeEnum fromValue(String text) {
      for (EntryModeEnum b : EntryModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("entryMode")
  private EntryModeEnum entryMode = null;

  /**
   * Payment method
   */
  public enum MethodEnum {
    ADJUSTMENT("ADJUSTMENT"),
    
    CASH("CASH"),
    
    DISTRIBUTOR("DISTRIBUTOR"),
    
    PAYMENT_GATEWAY("PAYMENT_GATEWAY"),
    
    WIRE_TRANSFER("WIRE_TRANSFER");

    private String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("method")
  private MethodEnum method = null;

  @JsonProperty("paymentDate")
  private DateTime paymentDate = null;

  @JsonProperty("paymentGatewayName")
  private String paymentGatewayName = null;

  public Payment amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Payment amount
   * @return amount
  **/
  @ApiModelProperty(value = "Payment amount")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public Payment comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Payment comments (will be shown to the customer)
   * @return comments
  **/
  @ApiModelProperty(value = "Payment comments (will be shown to the customer)")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Payment entryMode(EntryModeEnum entryMode) {
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Payment entry mode (automatic or manual)
   * @return entryMode
  **/
  @ApiModelProperty(value = "Payment entry mode (automatic or manual)")
  public EntryModeEnum getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(EntryModeEnum entryMode) {
    this.entryMode = entryMode;
  }

  public Payment method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Payment method
   * @return method
  **/
  @ApiModelProperty(value = "Payment method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public Payment paymentDate(DateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Payment date
   * @return paymentDate
  **/
  @ApiModelProperty(value = "Payment date")
  public DateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(DateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Payment paymentGatewayName(String paymentGatewayName) {
    this.paymentGatewayName = paymentGatewayName;
    return this;
  }

   /**
   * Gateway used to make this payment
   * @return paymentGatewayName
  **/
  @ApiModelProperty(value = "Gateway used to make this payment")
  public String getPaymentGatewayName() {
    return paymentGatewayName;
  }

  public void setPaymentGatewayName(String paymentGatewayName) {
    this.paymentGatewayName = paymentGatewayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.comments, payment.comments) &&
        Objects.equals(this.entryMode, payment.entryMode) &&
        Objects.equals(this.method, payment.method) &&
        Objects.equals(this.paymentDate, payment.paymentDate) &&
        Objects.equals(this.paymentGatewayName, payment.paymentGatewayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, comments, entryMode, method, paymentDate, paymentGatewayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentGatewayName: ").append(toIndentedString(paymentGatewayName)).append("\n");
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

