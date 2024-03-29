/*
 * Flexify IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify IO REST API
 *
 * OpenAPI spec version: 2.14.2
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
 * Log event
 */
@ApiModel(description = "Log event")

public class LogEvent {
  /**
   * Level of the event
   */
  public enum LevelEnum {
    ERROR("ERROR"),
    
    INFO("INFO"),
    
    WARNING("WARNING");

    private String value;

    LevelEnum(String value) {
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
    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("level")
  private LevelEnum level = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("time")
  private DateTime time = null;

  public LogEvent level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Level of the event
   * @return level
  **/
  @ApiModelProperty(value = "Level of the event")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public LogEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message of the event
   * @return message
  **/
  @ApiModelProperty(value = "Message of the event")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LogEvent time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Time of the event
   * @return time
  **/
  @ApiModelProperty(value = "Time of the event")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEvent logEvent = (LogEvent) o;
    return Objects.equals(this.level, logEvent.level) &&
        Objects.equals(this.message, logEvent.message) &&
        Objects.equals(this.time, logEvent.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, message, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEvent {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

