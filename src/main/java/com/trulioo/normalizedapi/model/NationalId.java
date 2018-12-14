/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-03T13:54:47.084-08:00")
public class NationalId {
  @SerializedName("Number")
  private String number = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("DistrictOfIssue")
  private String districtOfIssue = null;

  @SerializedName("CityOfIssue")
  private String cityOfIssue = null;

  @SerializedName("ProvinceOfIssue")
  private String provinceOfIssue = null;

  @SerializedName("CountyOfIssue")
  private String countyOfIssue = null;

  public NationalId number(String number) {
    this.number = number;
    return this;
  }

   /**
   * 
   * @return number
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public NationalId type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Supported Types: NationalID, Health, SocialService, TaxIDNumber
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Supported Types: NationalID, Health, SocialService, TaxIDNumber")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NationalId districtOfIssue(String districtOfIssue) {
    this.districtOfIssue = districtOfIssue;
    return this;
  }

   /**
   * District that issued the ID
   * @return districtOfIssue
  **/
  @ApiModelProperty(value = "District that issued the ID")
  public String getDistrictOfIssue() {
    return districtOfIssue;
  }

  public void setDistrictOfIssue(String districtOfIssue) {
    this.districtOfIssue = districtOfIssue;
  }

  public NationalId cityOfIssue(String cityOfIssue) {
    this.cityOfIssue = cityOfIssue;
    return this;
  }

   /**
   * City that issued the ID
   * @return cityOfIssue
  **/
  @ApiModelProperty(value = "City that issued the ID")
  public String getCityOfIssue() {
    return cityOfIssue;
  }

  public void setCityOfIssue(String cityOfIssue) {
    this.cityOfIssue = cityOfIssue;
  }

  public NationalId provinceOfIssue(String provinceOfIssue) {
    this.provinceOfIssue = provinceOfIssue;
    return this;
  }

   /**
   * Province that issued the ID
   * @return provinceOfIssue
  **/
  @ApiModelProperty(value = "Province that issued the ID")
  public String getProvinceOfIssue() {
    return provinceOfIssue;
  }

  public void setProvinceOfIssue(String provinceOfIssue) {
    this.provinceOfIssue = provinceOfIssue;
  }

  public NationalId countyOfIssue(String countyOfIssue) {
    this.countyOfIssue = countyOfIssue;
    return this;
  }

   /**
   * County that issued the ID
   * @return countyOfIssue
  **/
  @ApiModelProperty(value = "County that issued the ID")
  public String getCountyOfIssue() {
    return countyOfIssue;
  }

  public void setCountyOfIssue(String countyOfIssue) {
    this.countyOfIssue = countyOfIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NationalId nationalId = (NationalId) o;
    return Objects.equals(this.number, nationalId.number) &&
        Objects.equals(this.type, nationalId.type) &&
        Objects.equals(this.districtOfIssue, nationalId.districtOfIssue) &&
        Objects.equals(this.cityOfIssue, nationalId.cityOfIssue) &&
        Objects.equals(this.provinceOfIssue, nationalId.provinceOfIssue) &&
        Objects.equals(this.countyOfIssue, nationalId.countyOfIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, districtOfIssue, cityOfIssue, provinceOfIssue, countyOfIssue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NationalId {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    districtOfIssue: ").append(toIndentedString(districtOfIssue)).append("\n");
    sb.append("    cityOfIssue: ").append(toIndentedString(cityOfIssue)).append("\n");
    sb.append("    provinceOfIssue: ").append(toIndentedString(provinceOfIssue)).append("\n");
    sb.append("    countyOfIssue: ").append(toIndentedString(countyOfIssue)).append("\n");
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

