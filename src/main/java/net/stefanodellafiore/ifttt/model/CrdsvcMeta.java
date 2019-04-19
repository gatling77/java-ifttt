package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Trigger Meta data.
 */
@ApiModel(description = "Trigger Meta data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

public class CrdsvcMeta   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("timestamp")
  private Integer timestamp = null;

  public CrdsvcMeta id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the item.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the item.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CrdsvcMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * A Unix timestamp in seconds.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "A Unix timestamp in seconds.")
  @NotNull


  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcMeta meta = (CrdsvcMeta) o;
    return Objects.equals(this.id, meta.id) &&
        Objects.equals(this.timestamp, meta.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcMeta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

