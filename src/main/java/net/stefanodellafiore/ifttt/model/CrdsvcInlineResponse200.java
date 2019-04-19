package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse200Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CrdsvcInlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

public class CrdsvcInlineResponse200   {
  @JsonProperty("data")
  @Valid
  private List<CrdsvcInlineResponse200Data> data = new ArrayList<CrdsvcInlineResponse200Data>();

  public CrdsvcInlineResponse200 data(List<CrdsvcInlineResponse200Data> data) {
    this.data = data;
    return this;
  }

  public CrdsvcInlineResponse200 addDataItem(CrdsvcInlineResponse200Data dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<CrdsvcInlineResponse200Data> getData() {
    return data;
  }

  public void setData(List<CrdsvcInlineResponse200Data> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcInlineResponse200 inlineResponse200 = (CrdsvcInlineResponse200) o;
    return Objects.equals(this.data, inlineResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcInlineResponse200 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

