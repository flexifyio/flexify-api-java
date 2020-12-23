/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.1-SNAPSHOT
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
import io.flexify.apiclient.model.SlotStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Slot
 */




public class Slot {
  @JsonProperty("slotNumber")
  private Integer slotNumber = null;

  @JsonProperty("stat")
  private SlotStat stat = null;

  public Slot slotNumber(Integer slotNumber) {
    this.slotNumber = slotNumber;
    return this;
  }

   /**
   * Get slotNumber
   * @return slotNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getSlotNumber() {
    return slotNumber;
  }

  public void setSlotNumber(Integer slotNumber) {
    this.slotNumber = slotNumber;
  }

  public Slot stat(SlotStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public SlotStat getStat() {
    return stat;
  }

  public void setStat(SlotStat stat) {
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
    Slot slot = (Slot) o;
    return Objects.equals(this.slotNumber, slot.slotNumber) &&
        Objects.equals(this.stat, slot.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotNumber, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    
    sb.append("    slotNumber: ").append(toIndentedString(slotNumber)).append("\n");
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

