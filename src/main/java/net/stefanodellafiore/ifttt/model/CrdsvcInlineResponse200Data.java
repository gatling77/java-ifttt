package net.stefanodellafiore.ifttt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.stefanodellafiore.ifttt.model.CrdsvcMeta;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CrdsvcInlineResponse200Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T19:12:43.742+02:00")

public class CrdsvcInlineResponse200Data   {
  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("card")
  private String card = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("meta")
  private CrdsvcMeta meta = null;

  public CrdsvcInlineResponse200Data createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CrdsvcInlineResponse200Data card(String card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")


  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }

  public CrdsvcInlineResponse200Data amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CrdsvcInlineResponse200Data currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CrdsvcInlineResponse200Data meta(CrdsvcMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CrdsvcMeta getMeta() {
    return meta;
  }

  public void setMeta(CrdsvcMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcInlineResponse200Data inlineResponse200Data = (CrdsvcInlineResponse200Data) o;
    return Objects.equals(this.createdAt, inlineResponse200Data.createdAt) &&
        Objects.equals(this.card, inlineResponse200Data.card) &&
        Objects.equals(this.amount, inlineResponse200Data.amount) &&
        Objects.equals(this.currency, inlineResponse200Data.currency) &&
        Objects.equals(this.meta, inlineResponse200Data.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, card, amount, currency, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcInlineResponse200Data {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

