/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.17-SNAPSHOT
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
import io.flexify.apiclient.model.PolicyRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualBucketAccessPolicy
 */

public class VirtualBucketAccessPolicy {
  @JsonProperty("rules")
  private List<PolicyRule> rules = null;

  public VirtualBucketAccessPolicy rules(List<PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  public VirtualBucketAccessPolicy addRulesItem(PolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PolicyRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<PolicyRule> getRules() {
    return rules;
  }

  public void setRules(List<PolicyRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualBucketAccessPolicy virtualBucketAccessPolicy = (VirtualBucketAccessPolicy) o;
    return Objects.equals(this.rules, virtualBucketAccessPolicy.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualBucketAccessPolicy {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

