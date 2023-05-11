/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.15
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
 * PublicAuthenticationConfiguration
 */

public class PublicAuthenticationConfiguration {
  @JsonProperty("microsoftClientId")
  private String microsoftClientId = null;

  @JsonProperty("microsoftScope")
  private String microsoftScope = null;

  public PublicAuthenticationConfiguration microsoftClientId(String microsoftClientId) {
    this.microsoftClientId = microsoftClientId;
    return this;
  }

   /**
   * Required client Id in Microsoft access token
   * @return microsoftClientId
  **/
  @ApiModelProperty(value = "Required client Id in Microsoft access token")
  public String getMicrosoftClientId() {
    return microsoftClientId;
  }

  public void setMicrosoftClientId(String microsoftClientId) {
    this.microsoftClientId = microsoftClientId;
  }

  public PublicAuthenticationConfiguration microsoftScope(String microsoftScope) {
    this.microsoftScope = microsoftScope;
    return this;
  }

   /**
   * Required scope in Microsoft access token
   * @return microsoftScope
  **/
  @ApiModelProperty(value = "Required scope in Microsoft access token")
  public String getMicrosoftScope() {
    return microsoftScope;
  }

  public void setMicrosoftScope(String microsoftScope) {
    this.microsoftScope = microsoftScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicAuthenticationConfiguration publicAuthenticationConfiguration = (PublicAuthenticationConfiguration) o;
    return Objects.equals(this.microsoftClientId, publicAuthenticationConfiguration.microsoftClientId) &&
        Objects.equals(this.microsoftScope, publicAuthenticationConfiguration.microsoftScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(microsoftClientId, microsoftScope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicAuthenticationConfiguration {\n");
    
    sb.append("    microsoftClientId: ").append(toIndentedString(microsoftClientId)).append("\n");
    sb.append("    microsoftScope: ").append(toIndentedString(microsoftScope)).append("\n");
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

