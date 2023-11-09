/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.20-SNAPSHOT
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
 * ChangeSsoMicrosoftRequest
 */

public class ChangeSsoMicrosoftRequest {
  @JsonProperty("ssoEmail")
  private String ssoEmail = null;

  @JsonProperty("ssoId")
  private String ssoId = null;

  public ChangeSsoMicrosoftRequest ssoEmail(String ssoEmail) {
    this.ssoEmail = ssoEmail;
    return this;
  }

   /**
   * Get ssoEmail
   * @return ssoEmail
  **/
  @ApiModelProperty(value = "")
  public String getSsoEmail() {
    return ssoEmail;
  }

  public void setSsoEmail(String ssoEmail) {
    this.ssoEmail = ssoEmail;
  }

  public ChangeSsoMicrosoftRequest ssoId(String ssoId) {
    this.ssoId = ssoId;
    return this;
  }

   /**
   * Get ssoId
   * @return ssoId
  **/
  @ApiModelProperty(value = "")
  public String getSsoId() {
    return ssoId;
  }

  public void setSsoId(String ssoId) {
    this.ssoId = ssoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeSsoMicrosoftRequest changeSsoMicrosoftRequest = (ChangeSsoMicrosoftRequest) o;
    return Objects.equals(this.ssoEmail, changeSsoMicrosoftRequest.ssoEmail) &&
        Objects.equals(this.ssoId, changeSsoMicrosoftRequest.ssoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoEmail, ssoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSsoMicrosoftRequest {\n");
    
    sb.append("    ssoEmail: ").append(toIndentedString(ssoEmail)).append("\n");
    sb.append("    ssoId: ").append(toIndentedString(ssoId)).append("\n");
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

