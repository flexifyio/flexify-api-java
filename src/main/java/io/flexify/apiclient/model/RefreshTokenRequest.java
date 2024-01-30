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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RefreshTokenRequest
 */

public class RefreshTokenRequest {
  /**
   * Gets or Sets oauthProviderId
   */
  public enum OauthProviderIdEnum {
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    MICROSOFT("MICROSOFT");

    private String value;

    OauthProviderIdEnum(String value) {
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
    public static OauthProviderIdEnum fromValue(String value) {
      for (OauthProviderIdEnum b : OauthProviderIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("oauthProviderId")
  private OauthProviderIdEnum oauthProviderId = null;

  @JsonProperty("refreshToken")
  private String refreshToken = null;

  public RefreshTokenRequest oauthProviderId(OauthProviderIdEnum oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

   /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @ApiModelProperty(required = true, value = "")
  public OauthProviderIdEnum getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(OauthProviderIdEnum oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public RefreshTokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshTokenRequest refreshTokenRequest = (RefreshTokenRequest) o;
    return Objects.equals(this.oauthProviderId, refreshTokenRequest.oauthProviderId) &&
        Objects.equals(this.refreshToken, refreshTokenRequest.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, refreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshTokenRequest {\n");
    
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

