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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignupResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
public class SignupResult {
  @JsonProperty("billingAccountId")
  private Long billingAccountId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("username")
  private String username = null;

  public SignupResult billingAccountId(Long billingAccountId) {
    this.billingAccountId = billingAccountId;
    return this;
  }

   /**
   * Get billingAccountId
   * @return billingAccountId
  **/
  @ApiModelProperty(value = "")
  public Long getBillingAccountId() {
    return billingAccountId;
  }

  public void setBillingAccountId(Long billingAccountId) {
    this.billingAccountId = billingAccountId;
  }

  public SignupResult id(Long id) {
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

  public SignupResult username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
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
    SignupResult signupResult = (SignupResult) o;
    return Objects.equals(this.billingAccountId, signupResult.billingAccountId) &&
        Objects.equals(this.id, signupResult.id) &&
        Objects.equals(this.username, signupResult.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAccountId, id, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupResult {\n");
    
    sb.append("    billingAccountId: ").append(toIndentedString(billingAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

