/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.0
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
 * Flexify IO Virtual Endpoint
 */
@ApiModel(description = "Flexify IO Virtual Endpoint")

public class EndpointSettingsRes {
  @JsonProperty("identity")
  private String identity = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Storage Protocol
   */
  public enum ProtocolEnum {
    AZURE("AZURE"),
    
    B2("B2"),
    
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    S3("S3");

    private String value;

    ProtocolEnum(String value) {
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
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  @JsonProperty("selectionBreakTimeout")
  private Long selectionBreakTimeout = null;

  /**
   * Storage selection policy for GET/HEAD object requests
   */
  public enum SelectionPolicyEnum {
    FASTEST("FASTEST"),
    
    NEWEST("NEWEST"),
    
    PRIORITY("PRIORITY");

    private String value;

    SelectionPolicyEnum(String value) {
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
    public static SelectionPolicyEnum fromValue(String value) {
      for (SelectionPolicyEnum b : SelectionPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("selectionPolicy")
  private SelectionPolicyEnum selectionPolicy = null;

  public EndpointSettingsRes identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Storage Identity (Access Key)
   * @return identity
  **/
  @ApiModelProperty(value = "Storage Identity (Access Key)")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public EndpointSettingsRes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-define name of the endpoint
   * @return name
  **/
  @ApiModelProperty(value = "User-define name of the endpoint")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndpointSettingsRes protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Storage Protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "S3", value = "Storage Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public EndpointSettingsRes selectionBreakTimeout(Long selectionBreakTimeout) {
    this.selectionBreakTimeout = selectionBreakTimeout;
    return this;
  }

   /**
   * Timeout before canceling requests to non-responding clouds in FASTEST selection policy
   * @return selectionBreakTimeout
  **/
  @ApiModelProperty(example = "300", value = "Timeout before canceling requests to non-responding clouds in FASTEST selection policy")
  public Long getSelectionBreakTimeout() {
    return selectionBreakTimeout;
  }

  public void setSelectionBreakTimeout(Long selectionBreakTimeout) {
    this.selectionBreakTimeout = selectionBreakTimeout;
  }

  public EndpointSettingsRes selectionPolicy(SelectionPolicyEnum selectionPolicy) {
    this.selectionPolicy = selectionPolicy;
    return this;
  }

   /**
   * Storage selection policy for GET/HEAD object requests
   * @return selectionPolicy
  **/
  @ApiModelProperty(example = "NEWEST", value = "Storage selection policy for GET/HEAD object requests")
  public SelectionPolicyEnum getSelectionPolicy() {
    return selectionPolicy;
  }

  public void setSelectionPolicy(SelectionPolicyEnum selectionPolicy) {
    this.selectionPolicy = selectionPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSettingsRes endpointSettingsRes = (EndpointSettingsRes) o;
    return Objects.equals(this.identity, endpointSettingsRes.identity) &&
        Objects.equals(this.name, endpointSettingsRes.name) &&
        Objects.equals(this.protocol, endpointSettingsRes.protocol) &&
        Objects.equals(this.selectionBreakTimeout, endpointSettingsRes.selectionBreakTimeout) &&
        Objects.equals(this.selectionPolicy, endpointSettingsRes.selectionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, name, protocol, selectionBreakTimeout, selectionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSettingsRes {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    selectionBreakTimeout: ").append(toIndentedString(selectionBreakTimeout)).append("\n");
    sb.append("    selectionPolicy: ").append(toIndentedString(selectionPolicy)).append("\n");
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

