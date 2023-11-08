/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.19.hf1
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
import io.flexify.apiclient.model.UserConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SetLimitsRequest
 */

public class SetLimitsRequest {
  @JsonProperty("limits")
  private UserConfig limits = null;

  public SetLimitsRequest limits(UserConfig limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @ApiModelProperty(value = "")
  public UserConfig getLimits() {
    return limits;
  }

  public void setLimits(UserConfig limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetLimitsRequest setLimitsRequest = (SetLimitsRequest) o;
    return Objects.equals(this.limits, setLimitsRequest.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetLimitsRequest {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

