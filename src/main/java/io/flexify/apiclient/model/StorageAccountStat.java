/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.7-SNAPSHOT
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
import org.joda.time.DateTime;

/**
 * StorageAccountStat
 */




public class StorageAccountStat {
  /**
   * Cloud environment (Gov, Germany, etc.) for Azure storage account
   */
  public enum AzureEnvEnum {
    AZUREGERMANY("AzureGermany"),
    
    AZUREGOVERNMENT("AzureGovernment"),
    
    CHINA("China"),
    
    PRIVATE("Private"),
    
    PUBLIC("Public");

    private String value;

    AzureEnvEnum(String value) {
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
    public static AzureEnvEnum fromValue(String text) {
      for (AzureEnvEnum b : AzureEnvEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("azureEnv")
  private AzureEnvEnum azureEnv = null;

  @JsonProperty("azureRegion")
  private String azureRegion = null;

  @JsonProperty("lastRefreshed")
  private DateTime lastRefreshed = null;

  /**
   * State of this storage account
   */
  public enum StateEnum {
    ERROR("ERROR"),
    
    NONE("NONE"),
    
    OK("OK"),
    
    REFRESHING("REFRESHING"),
    
    WARNING("WARNING");

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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("storagesCount")
  private Integer storagesCount = null;

  @JsonProperty("storagesLimitExceeded")
  private Boolean storagesLimitExceeded = null;

  public StorageAccountStat azureEnv(AzureEnvEnum azureEnv) {
    this.azureEnv = azureEnv;
    return this;
  }

   /**
   * Cloud environment (Gov, Germany, etc.) for Azure storage account
   * @return azureEnv
  **/
  @ApiModelProperty(value = "Cloud environment (Gov, Germany, etc.) for Azure storage account")
  public AzureEnvEnum getAzureEnv() {
    return azureEnv;
  }

  public void setAzureEnv(AzureEnvEnum azureEnv) {
    this.azureEnv = azureEnv;
  }

  public StorageAccountStat azureRegion(String azureRegion) {
    this.azureRegion = azureRegion;
    return this;
  }

   /**
   * Region for Azure storage account
   * @return azureRegion
  **/
  @ApiModelProperty(value = "Region for Azure storage account")
  public String getAzureRegion() {
    return azureRegion;
  }

  public void setAzureRegion(String azureRegion) {
    this.azureRegion = azureRegion;
  }

  public StorageAccountStat lastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

   /**
   * When buckets/containers were requested last time
   * @return lastRefreshed
  **/
  @ApiModelProperty(value = "When buckets/containers were requested last time")
  public DateTime getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  public StorageAccountStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of this storage account
   * @return state
  **/
  @ApiModelProperty(value = "State of this storage account")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public StorageAccountStat storagesCount(Integer storagesCount) {
    this.storagesCount = storagesCount;
    return this;
  }

   /**
   * Number of buckets/containers reported by the storage
   * @return storagesCount
  **/
  @ApiModelProperty(value = "Number of buckets/containers reported by the storage")
  public Integer getStoragesCount() {
    return storagesCount;
  }

  public void setStoragesCount(Integer storagesCount) {
    this.storagesCount = storagesCount;
  }

  public StorageAccountStat storagesLimitExceeded(Boolean storagesLimitExceeded) {
    this.storagesLimitExceeded = storagesLimitExceeded;
    return this;
  }

   /**
   * When the limit of the maxmimum number of buckets/containers is exceeed and not all storages are shown
   * @return storagesLimitExceeded
  **/
  @ApiModelProperty(value = "When the limit of the maxmimum number of buckets/containers is exceeed and not all storages are shown")
  public Boolean isStoragesLimitExceeded() {
    return storagesLimitExceeded;
  }

  public void setStoragesLimitExceeded(Boolean storagesLimitExceeded) {
    this.storagesLimitExceeded = storagesLimitExceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountStat storageAccountStat = (StorageAccountStat) o;
    return Objects.equals(this.azureEnv, storageAccountStat.azureEnv) &&
        Objects.equals(this.azureRegion, storageAccountStat.azureRegion) &&
        Objects.equals(this.lastRefreshed, storageAccountStat.lastRefreshed) &&
        Objects.equals(this.state, storageAccountStat.state) &&
        Objects.equals(this.storagesCount, storageAccountStat.storagesCount) &&
        Objects.equals(this.storagesLimitExceeded, storageAccountStat.storagesLimitExceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureEnv, azureRegion, lastRefreshed, state, storagesCount, storagesLimitExceeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountStat {\n");
    
    sb.append("    azureEnv: ").append(toIndentedString(azureEnv)).append("\n");
    sb.append("    azureRegion: ").append(toIndentedString(azureRegion)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storagesCount: ").append(toIndentedString(storagesCount)).append("\n");
    sb.append("    storagesLimitExceeded: ").append(toIndentedString(storagesLimitExceeded)).append("\n");
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

