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
 * Access Keys Pair
 */
@ApiModel(description = "Access Keys Pair")

public class AccessKeysPair {
  @JsonProperty("accessKey")
  private String accessKey = null;

  @JsonProperty("secretKey")
  private String secretKey = null;

  public AccessKeysPair accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Access Key
   * @return accessKey
  **/
  @ApiModelProperty(value = "Access Key")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public AccessKeysPair secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Secret Key
   * @return secretKey
  **/
  @ApiModelProperty(value = "Secret Key")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeysPair accessKeysPair = (AccessKeysPair) o;
    return Objects.equals(this.accessKey, accessKeysPair.accessKey) &&
        Objects.equals(this.secretKey, accessKeysPair.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeysPair {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

