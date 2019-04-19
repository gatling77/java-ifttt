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
 * Field Dynamic validation.
 */
@ApiModel(description = "Field Dynamic validation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

public class CrdsvcDynamicValidation   {
  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("message")
  private String message = null;

  public CrdsvcDynamicValidation valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public CrdsvcDynamicValidation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A user-facing message for an invalid field.
   * @return message
  **/
  @ApiModelProperty(value = "A user-facing message for an invalid field.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcDynamicValidation dynamicValidation = (CrdsvcDynamicValidation) o;
    return Objects.equals(this.valid, dynamicValidation.valid) &&
        Objects.equals(this.message, dynamicValidation.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcDynamicValidation {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

