/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.4.0-SNAPSHOT
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StorageAccountCreateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-13T12:27:12.882+03:00")
public class StorageAccountCreateRequest {
  @JsonProperty("anonymous")
  private Boolean anonymous = null;

  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("identity")
  private String identity = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("providerId")
  private Long providerId = null;

  @JsonProperty("useSsl")
  private Boolean useSsl = null;

  public StorageAccountCreateRequest anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Is public bucket
   * @return anonymous
  **/
  @ApiModelProperty(example = "false", value = "Is public bucket")
  public Boolean isAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public StorageAccountCreateRequest credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Credential of the cloud account
   * @return credential
  **/
  @ApiModelProperty(value = "Credential of the cloud account")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public StorageAccountCreateRequest identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Identity of the cloud account
   * @return identity
  **/
  @ApiModelProperty(value = "Identity of the cloud account")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public StorageAccountCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Storage account name
   * @return name
  **/
  @ApiModelProperty(value = "Storage account name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageAccountCreateRequest providerId(Long providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(value = "")
  public Long getProviderId() {
    return providerId;
  }

  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }

  public StorageAccountCreateRequest useSsl(Boolean useSsl) {
    this.useSsl = useSsl;
    return this;
  }

   /**
   * Encrypt transfer with SSL
   * @return useSsl
  **/
  @ApiModelProperty(example = "true", value = "Encrypt transfer with SSL")
  public Boolean isUseSsl() {
    return useSsl;
  }

  public void setUseSsl(Boolean useSsl) {
    this.useSsl = useSsl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountCreateRequest storageAccountCreateRequest = (StorageAccountCreateRequest) o;
    return Objects.equals(this.anonymous, storageAccountCreateRequest.anonymous) &&
        Objects.equals(this.credential, storageAccountCreateRequest.credential) &&
        Objects.equals(this.identity, storageAccountCreateRequest.identity) &&
        Objects.equals(this.name, storageAccountCreateRequest.name) &&
        Objects.equals(this.providerId, storageAccountCreateRequest.providerId) &&
        Objects.equals(this.useSsl, storageAccountCreateRequest.useSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, credential, identity, name, providerId, useSsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountCreateRequest {\n");
    
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    useSsl: ").append(toIndentedString(useSsl)).append("\n");
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

