/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.15
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
import io.flexify.apiclient.model.Sort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pageable
 */

public class Pageable {
  @JsonProperty("offset")
  private Long offset = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("paged")
  private Boolean paged = null;

  @JsonProperty("sort")
  private Sort sort = null;

  @JsonProperty("unpaged")
  private Boolean unpaged = null;

  public Pageable offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Pageable pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Pageable pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Pageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

   /**
   * Get paged
   * @return paged
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public Pageable sort(Sort sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public Pageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

   /**
   * Get unpaged
   * @return unpaged
  **/
  @ApiModelProperty(value = "")
  public Boolean isUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.offset, pageable.offset) &&
        Objects.equals(this.pageNumber, pageable.pageNumber) &&
        Objects.equals(this.pageSize, pageable.pageSize) &&
        Objects.equals(this.paged, pageable.paged) &&
        Objects.equals(this.sort, pageable.sort) &&
        Objects.equals(this.unpaged, pageable.unpaged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, pageNumber, pageSize, paged, sort, unpaged);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
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

