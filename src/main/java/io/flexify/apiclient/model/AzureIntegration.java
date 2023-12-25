/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.0-SNAPSHOT
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
 * AzureIntegration
 */

public class AzureIntegration {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * State of the Azure integration
   */
  public enum StateEnum {
    AUTH_ERROR("AUTH_ERROR"),
    
    AUTH_EXPIRED("AUTH_EXPIRED"),
    
    OK("OK");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

   /**
   * Id of the Azure integration
   * @return id
  **/
  @ApiModelProperty(value = "Id of the Azure integration")
  public Long getId() {
    return id;
  }

   /**
   * Name of the Azure integration (email of Entra ID account)
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Azure integration (email of Entra ID account)")
  public String getName() {
    return name;
  }

   /**
   * State of the Azure integration
   * @return state
  **/
  @ApiModelProperty(value = "State of the Azure integration")
  public StateEnum getState() {
    return state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureIntegration azureIntegration = (AzureIntegration) o;
    return Objects.equals(this.id, azureIntegration.id) &&
        Objects.equals(this.name, azureIntegration.name) &&
        Objects.equals(this.state, azureIntegration.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

