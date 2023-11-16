/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.13.0
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
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isSas")
  private Boolean isSas = null;

  @JsonProperty("keyVaultSecretId")
  private String keyVaultSecretId = null;

  /**
   * OAuth provider if the storage account is using OAuth, or null otherwise
   */
  public enum OauthProviderIdEnum {
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    MICROSOFT("MICROSOFT");

    private String value;

    OauthProviderIdEnum(String value) {
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
    public static OauthProviderIdEnum fromValue(String value) {
      for (OauthProviderIdEnum b : OauthProviderIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("oauthProviderId")
  private OauthProviderIdEnum oauthProviderId = null;

  @JsonProperty("privateUrl")
  private String privateUrl = null;

  @JsonProperty("provider")
  private StorageProvider provider = null;

  @JsonProperty("secretInKeyVault")
  private Boolean secretInKeyVault = null;

  @JsonProperty("settings")
  private StorageAccountSettingsRes settings = null;

  @JsonProperty("stat")
  private StorageAccountStat stat = null;

  @JsonProperty("url")
  private String url = null;

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
   * For Azure - if credential is SAS signature (not included if storing in key vault)
   * @return isSas
  **/
  @ApiModelProperty(value = "For Azure - if credential is SAS signature (not included if storing in key vault)")
  public Boolean isIsSas() {
    return isSas;
  }

  public void setIsSas(Boolean isSas) {
    this.isSas = isSas;
  }

  public StorageAccount keyVaultSecretId(String keyVaultSecretId) {
    this.keyVaultSecretId = keyVaultSecretId;
    return this;
  }

   /**
   * Key Vault secret ID where this credential secret is stored (only for admins)
   * @return keyVaultSecretId
  **/
  @ApiModelProperty(value = "Key Vault secret ID where this credential secret is stored (only for admins)")
  public String getKeyVaultSecretId() {
    return keyVaultSecretId;
  }

  public void setKeyVaultSecretId(String keyVaultSecretId) {
    this.keyVaultSecretId = keyVaultSecretId;
  }

  public StorageAccount oauthProviderId(OauthProviderIdEnum oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

   /**
   * OAuth provider if the storage account is using OAuth, or null otherwise
   * @return oauthProviderId
  **/
  @ApiModelProperty(value = "OAuth provider if the storage account is using OAuth, or null otherwise")
  public OauthProviderIdEnum getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(OauthProviderIdEnum oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
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

  public StorageAccount secretInKeyVault(Boolean secretInKeyVault) {
    this.secretInKeyVault = secretInKeyVault;
    return this;
  }

   /**
   * If secret credential is stored in Key Vault
   * @return secretInKeyVault
  **/
  @ApiModelProperty(value = "If secret credential is stored in Key Vault")
  public Boolean isSecretInKeyVault() {
    return secretInKeyVault;
  }

  public void setSecretInKeyVault(Boolean secretInKeyVault) {
    this.secretInKeyVault = secretInKeyVault;
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
    return Objects.equals(this.id, storageAccount.id) &&
        Objects.equals(this.isSas, storageAccount.isSas) &&
        Objects.equals(this.keyVaultSecretId, storageAccount.keyVaultSecretId) &&
        Objects.equals(this.oauthProviderId, storageAccount.oauthProviderId) &&
        Objects.equals(this.privateUrl, storageAccount.privateUrl) &&
        Objects.equals(this.provider, storageAccount.provider) &&
        Objects.equals(this.secretInKeyVault, storageAccount.secretInKeyVault) &&
        Objects.equals(this.settings, storageAccount.settings) &&
        Objects.equals(this.stat, storageAccount.stat) &&
        Objects.equals(this.url, storageAccount.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isSas, keyVaultSecretId, oauthProviderId, privateUrl, provider, secretInKeyVault, settings, stat, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSas: ").append(toIndentedString(isSas)).append("\n");
    sb.append("    keyVaultSecretId: ").append(toIndentedString(keyVaultSecretId)).append("\n");
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    privateUrl: ").append(toIndentedString(privateUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    secretInKeyVault: ").append(toIndentedString(secretInKeyVault)).append("\n");
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

