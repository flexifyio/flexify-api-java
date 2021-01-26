/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.2-SNAPSHOT
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
 * Constraints of a price
 */
@ApiModel(description = "Constraints of a price")




public class PriceConstraints {
  @JsonProperty("destRegion")
  private String destRegion = null;

  @JsonProperty("destStorageProviderId")
  private Long destStorageProviderId = null;

  @JsonProperty("engineCloudName")
  private String engineCloudName = null;

  @JsonProperty("engineCloudRegion")
  private String engineCloudRegion = null;

  @JsonProperty("sourceRegion")
  private String sourceRegion = null;

  @JsonProperty("sourceStorageProviderId")
  private Long sourceStorageProviderId = null;

  @JsonProperty("validFrom")
  private DateTime validFrom = null;

  @JsonProperty("validTo")
  private DateTime validTo = null;

  public PriceConstraints destRegion(String destRegion) {
    this.destRegion = destRegion;
    return this;
  }

   /**
   * Destination region string
   * @return destRegion
  **/
  @ApiModelProperty(value = "Destination region string")
  public String getDestRegion() {
    return destRegion;
  }

  public void setDestRegion(String destRegion) {
    this.destRegion = destRegion;
  }

  public PriceConstraints destStorageProviderId(Long destStorageProviderId) {
    this.destStorageProviderId = destStorageProviderId;
    return this;
  }

   /**
   * Destination storage provider
   * @return destStorageProviderId
  **/
  @ApiModelProperty(value = "Destination storage provider")
  public Long getDestStorageProviderId() {
    return destStorageProviderId;
  }

  public void setDestStorageProviderId(Long destStorageProviderId) {
    this.destStorageProviderId = destStorageProviderId;
  }

  public PriceConstraints engineCloudName(String engineCloudName) {
    this.engineCloudName = engineCloudName;
    return this;
  }

   /**
   * Cloud where engines run
   * @return engineCloudName
  **/
  @ApiModelProperty(value = "Cloud where engines run")
  public String getEngineCloudName() {
    return engineCloudName;
  }

  public void setEngineCloudName(String engineCloudName) {
    this.engineCloudName = engineCloudName;
  }

  public PriceConstraints engineCloudRegion(String engineCloudRegion) {
    this.engineCloudRegion = engineCloudRegion;
    return this;
  }

   /**
   * Regions where engines run
   * @return engineCloudRegion
  **/
  @ApiModelProperty(value = "Regions where engines run")
  public String getEngineCloudRegion() {
    return engineCloudRegion;
  }

  public void setEngineCloudRegion(String engineCloudRegion) {
    this.engineCloudRegion = engineCloudRegion;
  }

  public PriceConstraints sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

   /**
   * Source region string
   * @return sourceRegion
  **/
  @ApiModelProperty(value = "Source region string")
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }

  public PriceConstraints sourceStorageProviderId(Long sourceStorageProviderId) {
    this.sourceStorageProviderId = sourceStorageProviderId;
    return this;
  }

   /**
   * Source storage provider
   * @return sourceStorageProviderId
  **/
  @ApiModelProperty(value = "Source storage provider")
  public Long getSourceStorageProviderId() {
    return sourceStorageProviderId;
  }

  public void setSourceStorageProviderId(Long sourceStorageProviderId) {
    this.sourceStorageProviderId = sourceStorageProviderId;
  }

  public PriceConstraints validFrom(DateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Price valid from date
   * @return validFrom
  **/
  @ApiModelProperty(value = "Price valid from date")
  public DateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(DateTime validFrom) {
    this.validFrom = validFrom;
  }

  public PriceConstraints validTo(DateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Price valid to date
   * @return validTo
  **/
  @ApiModelProperty(value = "Price valid to date")
  public DateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(DateTime validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceConstraints priceConstraints = (PriceConstraints) o;
    return Objects.equals(this.destRegion, priceConstraints.destRegion) &&
        Objects.equals(this.destStorageProviderId, priceConstraints.destStorageProviderId) &&
        Objects.equals(this.engineCloudName, priceConstraints.engineCloudName) &&
        Objects.equals(this.engineCloudRegion, priceConstraints.engineCloudRegion) &&
        Objects.equals(this.sourceRegion, priceConstraints.sourceRegion) &&
        Objects.equals(this.sourceStorageProviderId, priceConstraints.sourceStorageProviderId) &&
        Objects.equals(this.validFrom, priceConstraints.validFrom) &&
        Objects.equals(this.validTo, priceConstraints.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destRegion, destStorageProviderId, engineCloudName, engineCloudRegion, sourceRegion, sourceStorageProviderId, validFrom, validTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceConstraints {\n");
    
    sb.append("    destRegion: ").append(toIndentedString(destRegion)).append("\n");
    sb.append("    destStorageProviderId: ").append(toIndentedString(destStorageProviderId)).append("\n");
    sb.append("    engineCloudName: ").append(toIndentedString(engineCloudName)).append("\n");
    sb.append("    engineCloudRegion: ").append(toIndentedString(engineCloudRegion)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    sourceStorageProviderId: ").append(toIndentedString(sourceStorageProviderId)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

