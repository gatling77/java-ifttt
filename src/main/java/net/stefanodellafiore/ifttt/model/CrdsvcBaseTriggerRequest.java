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
 * CrdsvcBaseTriggerRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcBaseTriggerRequest   {
  @JsonProperty("trigger_identity")
  private String triggerIdentity = null;

  @JsonProperty("limit")
  private Integer limit = 50;

  @JsonProperty("user")
  private CrdsvcUser user = null;

  @JsonProperty("ifttt_source")
  private CrdsvcIftttSource iftttSource = null;

  public CrdsvcBaseTriggerRequest triggerIdentity(String triggerIdentity) {
    this.triggerIdentity = triggerIdentity;
    return this;
  }

  /**
   * A unique identifier for this set of trigger fields for a given Applet.
   * @return triggerIdentity
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for this set of trigger fields for a given Applet.")
  @NotNull


  public String getTriggerIdentity() {
    return triggerIdentity;
  }

  public void setTriggerIdentity(String triggerIdentity) {
    this.triggerIdentity = triggerIdentity;
  }

  public CrdsvcBaseTriggerRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of items to be returned, default 50.
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(value = "Maximum number of items to be returned, default 50.")

@Min(0)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CrdsvcBaseTriggerRequest user(CrdsvcUser user) {
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

  public CrdsvcBaseTriggerRequest iftttSource(CrdsvcIftttSource iftttSource) {
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
    CrdsvcBaseTriggerRequest baseTriggerRequest = (CrdsvcBaseTriggerRequest) o;
    return Objects.equals(this.triggerIdentity, baseTriggerRequest.triggerIdentity) &&
        Objects.equals(this.limit, baseTriggerRequest.limit) &&
        Objects.equals(this.user, baseTriggerRequest.user) &&
        Objects.equals(this.iftttSource, baseTriggerRequest.iftttSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerIdentity, limit, user, iftttSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcBaseTriggerRequest {\n");
    
    sb.append("    triggerIdentity: ").append(toIndentedString(triggerIdentity)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

