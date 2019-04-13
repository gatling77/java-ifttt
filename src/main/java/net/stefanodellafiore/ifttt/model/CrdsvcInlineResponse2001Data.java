package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.stefanodellafiore.ifttt.model.CrdsvcOption;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Swagger 2.0 does not support oneOf. Please use (label, value) or (label, values).
 */
@ApiModel(description = "Swagger 2.0 does not support oneOf. Please use (label, value) or (label, values).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcInlineResponse2001Data   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("values")
  @Valid
  private List<CrdsvcOption> values = null;

  public CrdsvcInlineResponse2001Data label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CrdsvcInlineResponse2001Data value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CrdsvcInlineResponse2001Data values(List<CrdsvcOption> values) {
    this.values = values;
    return this;
  }

  public CrdsvcInlineResponse2001Data addValuesItem(CrdsvcOption valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<CrdsvcOption>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CrdsvcOption> getValues() {
    return values;
  }

  public void setValues(List<CrdsvcOption> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcInlineResponse2001Data inlineResponse2001Data = (CrdsvcInlineResponse2001Data) o;
    return Objects.equals(this.label, inlineResponse2001Data.label) &&
        Objects.equals(this.value, inlineResponse2001Data.value) &&
        Objects.equals(this.values, inlineResponse2001Data.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcInlineResponse2001Data {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

