/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.16-SNAPSHOT
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
 * SetUserStateRequest
 */

public class SetUserStateRequest {
  /**
   * Gets or Sets newState
   */
  public enum NewStateEnum {
    ACTIVE("ACTIVE"),
    
    DELETED("DELETED"),
    
    DISABLED("DISABLED");

    private String value;

    NewStateEnum(String value) {
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
    public static NewStateEnum fromValue(String value) {
      for (NewStateEnum b : NewStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("newState")
  private NewStateEnum newState = null;

  public SetUserStateRequest newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }

   /**
   * Get newState
   * @return newState
  **/
  @ApiModelProperty(value = "")
  public NewStateEnum getNewState() {
    return newState;
  }

  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetUserStateRequest setUserStateRequest = (SetUserStateRequest) o;
    return Objects.equals(this.newState, setUserStateRequest.newState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetUserStateRequest {\n");
    
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
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

