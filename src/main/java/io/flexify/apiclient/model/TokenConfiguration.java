/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.17
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
 * TokenConfiguration
 */

public class TokenConfiguration {
  @JsonProperty("comments")
  private String comments = null;

  /**
   * Type of this token
   */
  public enum TokenTypeEnum {
    API("API"),
    
    IMPERSONATION("IMPERSONATION"),
    
    INTEGRATION("INTEGRATION"),
    
    LOGIN("LOGIN");

    private String value;

    TokenTypeEnum(String value) {
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
    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tokenType")
  private TokenTypeEnum tokenType = null;

  public TokenConfiguration comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * User-defined comments for the token
   * @return comments
  **/
  @ApiModelProperty(value = "User-defined comments for the token")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public TokenConfiguration tokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Type of this token
   * @return tokenType
  **/
  @ApiModelProperty(value = "Type of this token")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }

  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenConfiguration tokenConfiguration = (TokenConfiguration) o;
    return Objects.equals(this.comments, tokenConfiguration.comments) &&
        Objects.equals(this.tokenType, tokenConfiguration.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenConfiguration {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

