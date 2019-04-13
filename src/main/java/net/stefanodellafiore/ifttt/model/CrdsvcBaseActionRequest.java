package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.stefanodellafiore.ifttt.model.CrdsvcIftttSource;
import net.stefanodellafiore.ifttt.model.CrdsvcUser;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CrdsvcBaseActionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcBaseActionRequest   {
  @JsonProperty("user")
  private CrdsvcUser user = null;

  @JsonProperty("ifttt_source")
  private CrdsvcIftttSource iftttSource = null;

  public CrdsvcBaseActionRequest user(CrdsvcUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CrdsvcUser getUser() {
    return user;
  }

  public void setUser(CrdsvcUser user) {
    this.user = user;
  }

  public CrdsvcBaseActionRequest iftttSource(CrdsvcIftttSource iftttSource) {
    this.iftttSource = iftttSource;
    return this;
  }

  /**
   * Get iftttSource
   * @return iftttSource
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CrdsvcIftttSource getIftttSource() {
    return iftttSource;
  }

  public void setIftttSource(CrdsvcIftttSource iftttSource) {
    this.iftttSource = iftttSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcBaseActionRequest baseActionRequest = (CrdsvcBaseActionRequest) o;
    return Objects.equals(this.user, baseActionRequest.user) &&
        Objects.equals(this.iftttSource, baseActionRequest.iftttSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, iftttSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcBaseActionRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    iftttSource: ").append(toIndentedString(iftttSource)).append("\n");
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

