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
 * Location Field
 */
@ApiModel(description = "Location Field")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-13T20:36:06.995+02:00")

public class CrdsvcLocationField   {
  @JsonProperty("lat")
  private Double lat = null;

  @JsonProperty("lng")
  private Double lng = null;

  @JsonProperty("radius")
  private Double radius = null;

  public CrdsvcLocationField lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * @return lat
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public CrdsvcLocationField lng(Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Get lng
   * @return lng
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public CrdsvcLocationField radius(Double radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Get radius
   * @return radius
  **/
  @ApiModelProperty(value = "")


  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrdsvcLocationField locationField = (CrdsvcLocationField) o;
    return Objects.equals(this.lat, locationField.lat) &&
        Objects.equals(this.lng, locationField.lng) &&
        Objects.equals(this.radius, locationField.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrdsvcLocationField {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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

