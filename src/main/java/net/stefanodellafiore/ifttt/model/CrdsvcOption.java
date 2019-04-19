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
 * Dynamic option
 */
@ApiModel(description = "Dynamic option")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

public class CrdsvcOption   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("value")
  private String value = null;

  public CrdsvcOption label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A user-facing label.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "A user-facing label.")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CrdsvcOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The actual field value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The actual field value.")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcOption option = (CrdsvcOption) o;
    return Objects.equals(this.label, option.label) &&
        Objects.equals(this.value, option.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcOption {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

