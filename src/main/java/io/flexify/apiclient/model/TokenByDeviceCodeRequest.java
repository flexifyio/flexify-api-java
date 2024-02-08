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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TokenByDeviceCodeRequest
 */

public class TokenByDeviceCodeRequest {
  @JsonProperty("deviceCode")
  private String deviceCode = null;

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

  public TokenByDeviceCodeRequest deviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
    return this;
  }

   /**
   * Get deviceCode
   * @return deviceCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceCode() {
    return deviceCode;
  }

  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  public TokenByDeviceCodeRequest oauthProviderId(OauthProviderIdEnum oauthProviderId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenByDeviceCodeRequest tokenByDeviceCodeRequest = (TokenByDeviceCodeRequest) o;
    return Objects.equals(this.deviceCode, tokenByDeviceCodeRequest.deviceCode) &&
        Objects.equals(this.oauthProviderId, tokenByDeviceCodeRequest.oauthProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceCode, oauthProviderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenByDeviceCodeRequest {\n");
    
    sb.append("    deviceCode: ").append(toIndentedString(deviceCode)).append("\n");
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
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

