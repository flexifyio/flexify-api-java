/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.6
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
import org.joda.time.DateTime;

/**
 * InformationAboutAuthenticationToken
 */




public class InformationAboutAuthenticationToken {
  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("issued")
  private DateTime issued = null;

  @JsonProperty("lastUsed")
  private DateTime lastUsed = null;

  @JsonProperty("token")
  private String token = null;

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
    public static TokenTypeEnum fromValue(String text) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tokenType")
  private TokenTypeEnum tokenType = null;

  public InformationAboutAuthenticationToken comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @ApiModelProperty(value = "Comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public InformationAboutAuthenticationToken ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP address from which token was requested
   * @return ip
  **/
  @ApiModelProperty(value = "IP address from which token was requested")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public InformationAboutAuthenticationToken issued(DateTime issued) {
    this.issued = issued;
    return this;
  }

   /**
   * When the token was issued
   * @return issued
  **/
  @ApiModelProperty(value = "When the token was issued")
  public DateTime getIssued() {
    return issued;
  }

  public void setIssued(DateTime issued) {
    this.issued = issued;
  }

  public InformationAboutAuthenticationToken lastUsed(DateTime lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * When the token was last used
   * @return lastUsed
  **/
  @ApiModelProperty(value = "When the token was last used")
  public DateTime getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(DateTime lastUsed) {
    this.lastUsed = lastUsed;
  }

  public InformationAboutAuthenticationToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token string used for Bearer auth
   * @return token
  **/
  @ApiModelProperty(value = "Token string used for Bearer auth")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InformationAboutAuthenticationToken tokenType(TokenTypeEnum tokenType) {
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
    InformationAboutAuthenticationToken informationAboutAuthenticationToken = (InformationAboutAuthenticationToken) o;
    return Objects.equals(this.comments, informationAboutAuthenticationToken.comments) &&
        Objects.equals(this.ip, informationAboutAuthenticationToken.ip) &&
        Objects.equals(this.issued, informationAboutAuthenticationToken.issued) &&
        Objects.equals(this.lastUsed, informationAboutAuthenticationToken.lastUsed) &&
        Objects.equals(this.token, informationAboutAuthenticationToken.token) &&
        Objects.equals(this.tokenType, informationAboutAuthenticationToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, ip, issued, lastUsed, token, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformationAboutAuthenticationToken {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

