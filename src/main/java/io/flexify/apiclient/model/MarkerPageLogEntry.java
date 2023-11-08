/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.12.19.hf1
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
import io.flexify.apiclient.model.LogEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Content page with continuation maker
 */
@ApiModel(description = "Content page with continuation maker")

public class MarkerPageLogEntry {
  @JsonProperty("content")
  private List<LogEntry> content = null;

  @JsonProperty("nextMarker")
  private Long nextMarker = null;

  public MarkerPageLogEntry content(List<LogEntry> content) {
    this.content = content;
    return this;
  }

  public MarkerPageLogEntry addContentItem(LogEntry contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<LogEntry>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Content of the page
   * @return content
  **/
  @ApiModelProperty(value = "Content of the page")
  public List<LogEntry> getContent() {
    return content;
  }

  public void setContent(List<LogEntry> content) {
    this.content = content;
  }

  public MarkerPageLogEntry nextMarker(Long nextMarker) {
    this.nextMarker = nextMarker;
    return this;
  }

   /**
   * Marker that canbe used to request next page
   * @return nextMarker
  **/
  @ApiModelProperty(value = "Marker that canbe used to request next page")
  public Long getNextMarker() {
    return nextMarker;
  }

  public void setNextMarker(Long nextMarker) {
    this.nextMarker = nextMarker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkerPageLogEntry markerPageLogEntry = (MarkerPageLogEntry) o;
    return Objects.equals(this.content, markerPageLogEntry.content) &&
        Objects.equals(this.nextMarker, markerPageLogEntry.nextMarker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, nextMarker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkerPageLogEntry {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

