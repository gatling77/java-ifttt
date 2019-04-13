package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.stefanodellafiore.ifttt.model.CrdsvcActionErrorsErrors;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Action Errors
 */
@ApiModel(description = "Action Errors")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcActionErrors   {
  @JsonProperty("errors")
  @Valid
  private List<CrdsvcActionErrorsErrors> errors = new ArrayList<CrdsvcActionErrorsErrors>();

  public CrdsvcActionErrors errors(List<CrdsvcActionErrorsErrors> errors) {
    this.errors = errors;
    return this;
  }

  public CrdsvcActionErrors addErrorsItem(CrdsvcActionErrorsErrors errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CrdsvcActionErrorsErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<CrdsvcActionErrorsErrors> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcActionErrors actionErrors = (CrdsvcActionErrors) o;
    return Objects.equals(this.errors, actionErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcActionErrors {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

