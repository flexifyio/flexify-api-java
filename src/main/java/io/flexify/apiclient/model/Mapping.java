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
import io.flexify.apiclient.model.Bucket;
import io.flexify.apiclient.model.MappingStat;
import io.flexify.apiclient.model.Slot;
import io.flexify.apiclient.model.StorageAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Mapping
 */

public class Mapping {
  @JsonProperty("destBucket")
  private Bucket destBucket = null;

  @JsonProperty("destBucketNewRegion")
  private String destBucketNewRegion = null;

  @JsonProperty("destStorageAccount")
  private StorageAccount destStorageAccount = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("keyAddPrefix")
  private String keyAddPrefix = null;

  @JsonProperty("keyRemovePrefix")
  private String keyRemovePrefix = null;

  @JsonProperty("objectsListUri")
  private String objectsListUri = null;

  /**
   * Method selected for comparison
   */
  public enum SelectedComparisonMethodEnum {
    AUTO("AUTO"),
    
    LIST_ONLY("LIST_ONLY"),
    
    LIST_PROBE("LIST_PROBE"),
    
    PROBE_ONLY("PROBE_ONLY");

    private String value;

    SelectedComparisonMethodEnum(String value) {
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
    public static SelectedComparisonMethodEnum fromValue(String value) {
      for (SelectedComparisonMethodEnum b : SelectedComparisonMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("selectedComparisonMethod")
  private SelectedComparisonMethodEnum selectedComparisonMethod = null;

  @JsonProperty("slots")
  private List<Slot> slots = new ArrayList<Slot>();

  @JsonProperty("sourceBucket")
  private Bucket sourceBucket = null;

  @JsonProperty("sourceStorageAccount")
  private StorageAccount sourceStorageAccount = null;

  @JsonProperty("stat")
  private MappingStat stat = null;

  public Mapping destBucket(Bucket destBucket) {
    this.destBucket = destBucket;
    return this;
  }

   /**
   * Destination bucket/container
   * @return destBucket
  **/
  @ApiModelProperty(required = true, value = "Destination bucket/container")
  public Bucket getDestBucket() {
    return destBucket;
  }

  public void setDestBucket(Bucket destBucket) {
    this.destBucket = destBucket;
  }

  public Mapping destBucketNewRegion(String destBucketNewRegion) {
    this.destBucketNewRegion = destBucketNewRegion;
    return this;
  }

   /**
   * Region where bucket should be created if missing
   * @return destBucketNewRegion
  **/
  @ApiModelProperty(value = "Region where bucket should be created if missing")
  public String getDestBucketNewRegion() {
    return destBucketNewRegion;
  }

  public void setDestBucketNewRegion(String destBucketNewRegion) {
    this.destBucketNewRegion = destBucketNewRegion;
  }

  public Mapping destStorageAccount(StorageAccount destStorageAccount) {
    this.destStorageAccount = destStorageAccount;
    return this;
  }

   /**
   * Destination storage account
   * @return destStorageAccount
  **/
  @ApiModelProperty(required = true, value = "Destination storage account")
  public StorageAccount getDestStorageAccount() {
    return destStorageAccount;
  }

  public void setDestStorageAccount(StorageAccount destStorageAccount) {
    this.destStorageAccount = destStorageAccount;
  }

  public Mapping id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this mapping
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of this mapping")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Mapping keyAddPrefix(String keyAddPrefix) {
    this.keyAddPrefix = keyAddPrefix;
    return this;
  }

   /**
   * Prefix added to each object key
   * @return keyAddPrefix
  **/
  @ApiModelProperty(value = "Prefix added to each object key")
  public String getKeyAddPrefix() {
    return keyAddPrefix;
  }

  public void setKeyAddPrefix(String keyAddPrefix) {
    this.keyAddPrefix = keyAddPrefix;
  }

  public Mapping keyRemovePrefix(String keyRemovePrefix) {
    this.keyRemovePrefix = keyRemovePrefix;
    return this;
  }

   /**
   * Prefix removed from each object key
   * @return keyRemovePrefix
  **/
  @ApiModelProperty(value = "Prefix removed from each object key")
  public String getKeyRemovePrefix() {
    return keyRemovePrefix;
  }

  public void setKeyRemovePrefix(String keyRemovePrefix) {
    this.keyRemovePrefix = keyRemovePrefix;
  }

  public Mapping objectsListUri(String objectsListUri) {
    this.objectsListUri = objectsListUri;
    return this;
  }

   /**
   * URI of a text file with a list of objects to migrate
   * @return objectsListUri
  **/
  @ApiModelProperty(value = "URI of a text file with a list of objects to migrate")
  public String getObjectsListUri() {
    return objectsListUri;
  }

  public void setObjectsListUri(String objectsListUri) {
    this.objectsListUri = objectsListUri;
  }

  public Mapping selectedComparisonMethod(SelectedComparisonMethodEnum selectedComparisonMethod) {
    this.selectedComparisonMethod = selectedComparisonMethod;
    return this;
  }

   /**
   * Method selected for comparison
   * @return selectedComparisonMethod
  **/
  @ApiModelProperty(value = "Method selected for comparison")
  public SelectedComparisonMethodEnum getSelectedComparisonMethod() {
    return selectedComparisonMethod;
  }

  public void setSelectedComparisonMethod(SelectedComparisonMethodEnum selectedComparisonMethod) {
    this.selectedComparisonMethod = selectedComparisonMethod;
  }

  public Mapping slots(List<Slot> slots) {
    this.slots = slots;
    return this;
  }

  public Mapping addSlotsItem(Slot slotsItem) {
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Slots that this mapping is split into
   * @return slots
  **/
  @ApiModelProperty(required = true, value = "Slots that this mapping is split into")
  public List<Slot> getSlots() {
    return slots;
  }

  public void setSlots(List<Slot> slots) {
    this.slots = slots;
  }

  public Mapping sourceBucket(Bucket sourceBucket) {
    this.sourceBucket = sourceBucket;
    return this;
  }

   /**
   * Source bucket/container
   * @return sourceBucket
  **/
  @ApiModelProperty(required = true, value = "Source bucket/container")
  public Bucket getSourceBucket() {
    return sourceBucket;
  }

  public void setSourceBucket(Bucket sourceBucket) {
    this.sourceBucket = sourceBucket;
  }

  public Mapping sourceStorageAccount(StorageAccount sourceStorageAccount) {
    this.sourceStorageAccount = sourceStorageAccount;
    return this;
  }

   /**
   * Source storage account
   * @return sourceStorageAccount
  **/
  @ApiModelProperty(required = true, value = "Source storage account")
  public StorageAccount getSourceStorageAccount() {
    return sourceStorageAccount;
  }

  public void setSourceStorageAccount(StorageAccount sourceStorageAccount) {
    this.sourceStorageAccount = sourceStorageAccount;
  }

  public Mapping stat(MappingStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Cumulative statistics of this mapping
   * @return stat
  **/
  @ApiModelProperty(required = true, value = "Cumulative statistics of this mapping")
  public MappingStat getStat() {
    return stat;
  }

  public void setStat(MappingStat stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mapping mapping = (Mapping) o;
    return Objects.equals(this.destBucket, mapping.destBucket) &&
        Objects.equals(this.destBucketNewRegion, mapping.destBucketNewRegion) &&
        Objects.equals(this.destStorageAccount, mapping.destStorageAccount) &&
        Objects.equals(this.id, mapping.id) &&
        Objects.equals(this.keyAddPrefix, mapping.keyAddPrefix) &&
        Objects.equals(this.keyRemovePrefix, mapping.keyRemovePrefix) &&
        Objects.equals(this.objectsListUri, mapping.objectsListUri) &&
        Objects.equals(this.selectedComparisonMethod, mapping.selectedComparisonMethod) &&
        Objects.equals(this.slots, mapping.slots) &&
        Objects.equals(this.sourceBucket, mapping.sourceBucket) &&
        Objects.equals(this.sourceStorageAccount, mapping.sourceStorageAccount) &&
        Objects.equals(this.stat, mapping.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destBucket, destBucketNewRegion, destStorageAccount, id, keyAddPrefix, keyRemovePrefix, objectsListUri, selectedComparisonMethod, slots, sourceBucket, sourceStorageAccount, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapping {\n");
    
    sb.append("    destBucket: ").append(toIndentedString(destBucket)).append("\n");
    sb.append("    destBucketNewRegion: ").append(toIndentedString(destBucketNewRegion)).append("\n");
    sb.append("    destStorageAccount: ").append(toIndentedString(destStorageAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyAddPrefix: ").append(toIndentedString(keyAddPrefix)).append("\n");
    sb.append("    keyRemovePrefix: ").append(toIndentedString(keyRemovePrefix)).append("\n");
    sb.append("    objectsListUri: ").append(toIndentedString(objectsListUri)).append("\n");
    sb.append("    selectedComparisonMethod: ").append(toIndentedString(selectedComparisonMethod)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    sourceBucket: ").append(toIndentedString(sourceBucket)).append("\n");
    sb.append("    sourceStorageAccount: ").append(toIndentedString(sourceStorageAccount)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

