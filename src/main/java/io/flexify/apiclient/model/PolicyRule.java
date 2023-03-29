/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.14-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * PolicyRule
 */

public class PolicyRule {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    ALLOW("allow"),
    
    ALLOWPUBLIC("allowPublic"),
    
    FORBID("forbid");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("action")
  private ActionEnum action = null;

  @JsonProperty("keyPattern")
  private String keyPattern = null;

  /**
   * Gets or Sets operations
   */
  public enum OperationsEnum {
    DELETEOBJECT("DeleteObject"),
    
    GETOBJECT("GetObject"),
    
    HEADBUCKET("HeadBucket"),
    
    LISTOBJECTS("ListObjects"),
    
    PUTOBJECT("PutObject"),
    
    RESTOREOBJECT("RestoreObject");

    private String value;

    OperationsEnum(String value) {
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
    public static OperationsEnum fromValue(String value) {
      for (OperationsEnum b : OperationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operations")
  private List<OperationsEnum> operations = null;

  public PolicyRule action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public PolicyRule keyPattern(String keyPattern) {
    this.keyPattern = keyPattern;
    return this;
  }

   /**
   * Get keyPattern
   * @return keyPattern
  **/
  @ApiModelProperty(value = "")
  public String getKeyPattern() {
    return keyPattern;
  }

  public void setKeyPattern(String keyPattern) {
    this.keyPattern = keyPattern;
  }

  public PolicyRule operations(List<OperationsEnum> operations) {
    this.operations = operations;
    return this;
  }

  public PolicyRule addOperationsItem(OperationsEnum operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<OperationsEnum>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
  public List<OperationsEnum> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationsEnum> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyRule policyRule = (PolicyRule) o;
    return Objects.equals(this.action, policyRule.action) &&
        Objects.equals(this.keyPattern, policyRule.keyPattern) &&
        Objects.equals(this.operations, policyRule.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, keyPattern, operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    keyPattern: ").append(toIndentedString(keyPattern)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

