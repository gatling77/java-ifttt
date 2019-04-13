package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse2001Data;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CrdsvcInlineResponse2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcInlineResponse2001   {
  @JsonProperty("data")
  @Valid
  private List<CrdsvcInlineResponse2001Data> data = new ArrayList<CrdsvcInlineResponse2001Data>();

  public CrdsvcInlineResponse2001 data(List<CrdsvcInlineResponse2001Data> data) {
    this.data = data;
    return this;
  }

  public CrdsvcInlineResponse2001 addDataItem(CrdsvcInlineResponse2001Data dataItem) {
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

  public List<CrdsvcInlineResponse2001Data> getData() {
    return data;
  }

  public void setData(List<CrdsvcInlineResponse2001Data> data) {
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
    CrdsvcInlineResponse2001 inlineResponse2001 = (CrdsvcInlineResponse2001) o;
    return Objects.equals(this.data, inlineResponse2001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcInlineResponse2001 {\n");
    
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

