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
public class Passport {
  @SerializedName("Mrz1")
  private String mrz1 = null;

  @SerializedName("Mrz2")
  private String mrz2 = null;

  @SerializedName("Number")
  private String number = null;

  @SerializedName("DayOfExpiry")
  private Integer dayOfExpiry = null;

  @SerializedName("MonthOfExpiry")
  private Integer monthOfExpiry = null;

  @SerializedName("YearOfExpiry")
  private Integer yearOfExpiry = null;

  public Passport mrz1(String mrz1) {
    this.mrz1 = mrz1;
    return this;
  }

   /**
   * Line 1 of the passport MRZ
   * @return mrz1
  **/
  @ApiModelProperty(value = "Line 1 of the passport MRZ")
  public String getMrz1() {
    return mrz1;
  }

  public void setMrz1(String mrz1) {
    this.mrz1 = mrz1;
  }

  public Passport mrz2(String mrz2) {
    this.mrz2 = mrz2;
    return this;
  }

   /**
   * line 2 of the passport MRZ
   * @return mrz2
  **/
  @ApiModelProperty(value = "line 2 of the passport MRZ")
  public String getMrz2() {
    return mrz2;
  }

  public void setMrz2(String mrz2) {
    this.mrz2 = mrz2;
  }

  public Passport number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Passport Number
   * @return number
  **/
  @ApiModelProperty(value = "Passport Number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Passport dayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence day of expiry of the individual to be verified
   * @return dayOfExpiry
  **/
  @ApiModelProperty(value = "Passport's Licence day of expiry of the individual to be verified")
  public Integer getDayOfExpiry() {
    return dayOfExpiry;
  }

  public void setDayOfExpiry(Integer dayOfExpiry) {
    this.dayOfExpiry = dayOfExpiry;
  }

  public Passport monthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence month of expiry of the individual to be verified
   * @return monthOfExpiry
  **/
  @ApiModelProperty(value = "Passport's Licence month of expiry of the individual to be verified")
  public Integer getMonthOfExpiry() {
    return monthOfExpiry;
  }

  public void setMonthOfExpiry(Integer monthOfExpiry) {
    this.monthOfExpiry = monthOfExpiry;
  }

  public Passport yearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
    return this;
  }

   /**
   * Passport&#39;s Licence year of expiry of the individual to be verified
   * @return yearOfExpiry
  **/
  @ApiModelProperty(value = "Passport's Licence year of expiry of the individual to be verified")
  public Integer getYearOfExpiry() {
    return yearOfExpiry;
  }

  public void setYearOfExpiry(Integer yearOfExpiry) {
    this.yearOfExpiry = yearOfExpiry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passport passport = (Passport) o;
    return Objects.equals(this.mrz1, passport.mrz1) &&
        Objects.equals(this.mrz2, passport.mrz2) &&
        Objects.equals(this.number, passport.number) &&
        Objects.equals(this.dayOfExpiry, passport.dayOfExpiry) &&
        Objects.equals(this.monthOfExpiry, passport.monthOfExpiry) &&
        Objects.equals(this.yearOfExpiry, passport.yearOfExpiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrz1, mrz2, number, dayOfExpiry, monthOfExpiry, yearOfExpiry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passport {\n");
    
    sb.append("    mrz1: ").append(toIndentedString(mrz1)).append("\n");
    sb.append("    mrz2: ").append(toIndentedString(mrz2)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dayOfExpiry: ").append(toIndentedString(dayOfExpiry)).append("\n");
    sb.append("    monthOfExpiry: ").append(toIndentedString(monthOfExpiry)).append("\n");
    sb.append("    yearOfExpiry: ").append(toIndentedString(yearOfExpiry)).append("\n");
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

