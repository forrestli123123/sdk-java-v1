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

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-03T13:54:47.084-08:00")
public class TransactionRecordResult {
  @SerializedName("TransactionID")
  private String transactionID = null;

  @SerializedName("UploadedDt")
  private DateTime uploadedDt = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("ProductName")
  private String productName = null;

  @SerializedName("Record")
  private Record record = null;

  @SerializedName("CustomerReferenceID")
  private String customerReferenceID = null;

  @SerializedName("Errors")
  private List<ServiceError> errors = null;

  @SerializedName("InputFields")
  private List<DataField> inputFields = null;

  public TransactionRecordResult transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

   /**
   * The id for the transaction it will be a GUID
   * @return transactionID
  **/
  @ApiModelProperty(value = "The id for the transaction it will be a GUID")
  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public TransactionRecordResult uploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
    return this;
  }

   /**
   * Time in UTC
   * @return uploadedDt
  **/
  @ApiModelProperty(value = "Time in UTC")
  public DateTime getUploadedDt() {
    return uploadedDt;
  }

  public void setUploadedDt(DateTime uploadedDt) {
    this.uploadedDt = uploadedDt;
  }

  public TransactionRecordResult countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country Code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country Code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public TransactionRecordResult productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Product Name
   * @return productName
  **/
  @ApiModelProperty(value = "Product Name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public TransactionRecordResult record(Record record) {
    this.record = record;
    return this;
  }

   /**
   * 
   * @return record
  **/
  @ApiModelProperty(value = "")
  public Record getRecord() {
    return record;
  }

  public void setRecord(Record record) {
    this.record = record;
  }

  public TransactionRecordResult customerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
    return this;
  }

   /**
   * Customer Reference Id
   * @return customerReferenceID
  **/
  @ApiModelProperty(value = "Customer Reference Id")
  public String getCustomerReferenceID() {
    return customerReferenceID;
  }

  public void setCustomerReferenceID(String customerReferenceID) {
    this.customerReferenceID = customerReferenceID;
  }

  public TransactionRecordResult errors(List<ServiceError> errors) {
    this.errors = errors;
    return this;
  }

  public TransactionRecordResult addErrorsItem(ServiceError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ServiceError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<ServiceError> getErrors() {
    return errors;
  }

  public void setErrors(List<ServiceError> errors) {
    this.errors = errors;
  }

  public TransactionRecordResult inputFields(List<DataField> inputFields) {
    this.inputFields = inputFields;
    return this;
  }

  public TransactionRecordResult addInputFieldsItem(DataField inputFieldsItem) {
    if (this.inputFields == null) {
      this.inputFields = new ArrayList<DataField>();
    }
    this.inputFields.add(inputFieldsItem);
    return this;
  }

   /**
   * 
   * @return inputFields
  **/
  @ApiModelProperty(value = "")
  public List<DataField> getInputFields() {
    return inputFields;
  }

  public void setInputFields(List<DataField> inputFields) {
    this.inputFields = inputFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRecordResult transactionRecordResult = (TransactionRecordResult) o;
    return Objects.equals(this.transactionID, transactionRecordResult.transactionID) &&
        Objects.equals(this.uploadedDt, transactionRecordResult.uploadedDt) &&
        Objects.equals(this.countryCode, transactionRecordResult.countryCode) &&
        Objects.equals(this.productName, transactionRecordResult.productName) &&
        Objects.equals(this.record, transactionRecordResult.record) &&
        Objects.equals(this.customerReferenceID, transactionRecordResult.customerReferenceID) &&
        Objects.equals(this.errors, transactionRecordResult.errors) &&
        Objects.equals(this.inputFields, transactionRecordResult.inputFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, uploadedDt, countryCode, productName, record, customerReferenceID, errors, inputFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRecordResult {\n");
    
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    uploadedDt: ").append(toIndentedString(uploadedDt)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    customerReferenceID: ").append(toIndentedString(customerReferenceID)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    inputFields: ").append(toIndentedString(inputFields)).append("\n");
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

