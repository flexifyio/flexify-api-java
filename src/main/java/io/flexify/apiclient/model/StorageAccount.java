/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.17
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
import io.flexify.apiclient.model.StorageAccountSettingsRes;
import io.flexify.apiclient.model.StorageAccountStat;
import io.flexify.apiclient.model.StorageProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StorageAccount
 */

public class StorageAccount {
  @JsonProperty("azureKeyVaultSecretId")
  private String azureKeyVaultSecretId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isSas")
  private Boolean isSas = null;

  @JsonProperty("privateUrl")
  private String privateUrl = null;

  @JsonProperty("provider")
  private StorageProvider provider = null;

  @JsonProperty("settings")
  private StorageAccountSettingsRes settings = null;

  @JsonProperty("stat")
  private StorageAccountStat stat = null;

  @JsonProperty("url")
  private String url = null;

  public StorageAccount azureKeyVaultSecretId(String azureKeyVaultSecretId) {
    this.azureKeyVaultSecretId = azureKeyVaultSecretId;
    return this;
  }

   /**
   * Get azureKeyVaultSecretId
   * @return azureKeyVaultSecretId
  **/
  @ApiModelProperty(value = "")
  public String getAzureKeyVaultSecretId() {
    return azureKeyVaultSecretId;
  }

  public void setAzureKeyVaultSecretId(String azureKeyVaultSecretId) {
    this.azureKeyVaultSecretId = azureKeyVaultSecretId;
  }

   /**
   * Id of the storage account
   * @return id
  **/
  @ApiModelProperty(value = "Id of the storage account")
  public Long getId() {
    return id;
  }

  public StorageAccount isSas(Boolean isSas) {
    this.isSas = isSas;
    return this;
  }

   /**
   * Get isSas
   * @return isSas
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSas() {
    return isSas;
  }

  public void setIsSas(Boolean isSas) {
    this.isSas = isSas;
  }

  public StorageAccount privateUrl(String privateUrl) {
    this.privateUrl = privateUrl;
    return this;
  }

   /**
   * URL used by engines to access the cloud
   * @return privateUrl
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com", value = "URL used by engines to access the cloud")
  public String getPrivateUrl() {
    return privateUrl;
  }

  public void setPrivateUrl(String privateUrl) {
    this.privateUrl = privateUrl;
  }

  public StorageAccount provider(StorageProvider provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Link to the storage provider (Amazon, Azure, etc)
   * @return provider
  **/
  @ApiModelProperty(value = "Link to the storage provider (Amazon, Azure, etc)")
  public StorageProvider getProvider() {
    return provider;
  }

  public void setProvider(StorageProvider provider) {
    this.provider = provider;
  }

  public StorageAccount settings(StorageAccountSettingsRes settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Configuration of this storage account
   * @return settings
  **/
  @ApiModelProperty(value = "Configuration of this storage account")
  public StorageAccountSettingsRes getSettings() {
    return settings;
  }

  public void setSettings(StorageAccountSettingsRes settings) {
    this.settings = settings;
  }

  public StorageAccount stat(StorageAccountStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Storage account state and statistics
   * @return stat
  **/
  @ApiModelProperty(value = "Storage account state and statistics")
  public StorageAccountStat getStat() {
    return stat;
  }

  public void setStat(StorageAccountStat stat) {
    this.stat = stat;
  }

  public StorageAccount url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the cloud
   * @return url
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com", value = "URL to the cloud")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccount storageAccount = (StorageAccount) o;
    return Objects.equals(this.azureKeyVaultSecretId, storageAccount.azureKeyVaultSecretId) &&
        Objects.equals(this.id, storageAccount.id) &&
        Objects.equals(this.isSas, storageAccount.isSas) &&
        Objects.equals(this.privateUrl, storageAccount.privateUrl) &&
        Objects.equals(this.provider, storageAccount.provider) &&
        Objects.equals(this.settings, storageAccount.settings) &&
        Objects.equals(this.stat, storageAccount.stat) &&
        Objects.equals(this.url, storageAccount.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureKeyVaultSecretId, id, isSas, privateUrl, provider, settings, stat, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccount {\n");
    
    sb.append("    azureKeyVaultSecretId: ").append(toIndentedString(azureKeyVaultSecretId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSas: ").append(toIndentedString(isSas)).append("\n");
    sb.append("    privateUrl: ").append(toIndentedString(privateUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

