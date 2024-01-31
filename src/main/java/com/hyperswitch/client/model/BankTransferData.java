/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.BankTransferDataOneOf;
import com.hyperswitch.client.model.BankTransferDataOneOf1;
import com.hyperswitch.client.model.BankTransferDataOneOf10;
import com.hyperswitch.client.model.BankTransferDataOneOf11;
import com.hyperswitch.client.model.BankTransferDataOneOf12;
import com.hyperswitch.client.model.BankTransferDataOneOf1SepaBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf2;
import com.hyperswitch.client.model.BankTransferDataOneOf2BacsBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf3;
import com.hyperswitch.client.model.BankTransferDataOneOf3MultibancoBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf4;
import com.hyperswitch.client.model.BankTransferDataOneOf4PermataBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf5;
import com.hyperswitch.client.model.BankTransferDataOneOf6;
import com.hyperswitch.client.model.BankTransferDataOneOf7;
import com.hyperswitch.client.model.BankTransferDataOneOf8;
import com.hyperswitch.client.model.BankTransferDataOneOf9;
import com.hyperswitch.client.model.BankTransferDataOneOfAchBankTransfer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankTransferData
 */
@JsonPropertyOrder({
  BankTransferData.JSON_PROPERTY_ACH_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_SEPA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_BACS_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_MULTIBANCO_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_PERMATA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_BCA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_BNI_VA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_BRI_VA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_CIMB_VA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_MANDIRI_VA_BANK_TRANSFER,
  BankTransferData.JSON_PROPERTY_PIX,
  BankTransferData.JSON_PROPERTY_PSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankTransferData {
  public static final String JSON_PROPERTY_ACH_BANK_TRANSFER = "ach_bank_transfer";
  private BankTransferDataOneOfAchBankTransfer achBankTransfer;

  public static final String JSON_PROPERTY_SEPA_BANK_TRANSFER = "sepa_bank_transfer";
  private BankTransferDataOneOf1SepaBankTransfer sepaBankTransfer;

  public static final String JSON_PROPERTY_BACS_BANK_TRANSFER = "bacs_bank_transfer";
  private BankTransferDataOneOf2BacsBankTransfer bacsBankTransfer;

  public static final String JSON_PROPERTY_MULTIBANCO_BANK_TRANSFER = "multibanco_bank_transfer";
  private BankTransferDataOneOf3MultibancoBankTransfer multibancoBankTransfer;

  public static final String JSON_PROPERTY_PERMATA_BANK_TRANSFER = "permata_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer permataBankTransfer;

  public static final String JSON_PROPERTY_BCA_BANK_TRANSFER = "bca_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer bcaBankTransfer;

  public static final String JSON_PROPERTY_BNI_VA_BANK_TRANSFER = "bni_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer bniVaBankTransfer;

  public static final String JSON_PROPERTY_BRI_VA_BANK_TRANSFER = "bri_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer briVaBankTransfer;

  public static final String JSON_PROPERTY_CIMB_VA_BANK_TRANSFER = "cimb_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer cimbVaBankTransfer;

  public static final String JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER = "danamon_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer;

  public static final String JSON_PROPERTY_MANDIRI_VA_BANK_TRANSFER = "mandiri_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer mandiriVaBankTransfer;

  public static final String JSON_PROPERTY_PIX = "pix";
  private Object pix;

  public static final String JSON_PROPERTY_PSE = "pse";
  private Object pse;

  public BankTransferData() {
  }

  public BankTransferData achBankTransfer(BankTransferDataOneOfAchBankTransfer achBankTransfer) {
    
    this.achBankTransfer = achBankTransfer;
    return this;
  }

   /**
   * Get achBankTransfer
   * @return achBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOfAchBankTransfer getAchBankTransfer() {
    return achBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_ACH_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAchBankTransfer(BankTransferDataOneOfAchBankTransfer achBankTransfer) {
    this.achBankTransfer = achBankTransfer;
  }


  public BankTransferData sepaBankTransfer(BankTransferDataOneOf1SepaBankTransfer sepaBankTransfer) {
    
    this.sepaBankTransfer = sepaBankTransfer;
    return this;
  }

   /**
   * Get sepaBankTransfer
   * @return sepaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf1SepaBankTransfer getSepaBankTransfer() {
    return sepaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_SEPA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepaBankTransfer(BankTransferDataOneOf1SepaBankTransfer sepaBankTransfer) {
    this.sepaBankTransfer = sepaBankTransfer;
  }


  public BankTransferData bacsBankTransfer(BankTransferDataOneOf2BacsBankTransfer bacsBankTransfer) {
    
    this.bacsBankTransfer = bacsBankTransfer;
    return this;
  }

   /**
   * Get bacsBankTransfer
   * @return bacsBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf2BacsBankTransfer getBacsBankTransfer() {
    return bacsBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BACS_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacsBankTransfer(BankTransferDataOneOf2BacsBankTransfer bacsBankTransfer) {
    this.bacsBankTransfer = bacsBankTransfer;
  }


  public BankTransferData multibancoBankTransfer(BankTransferDataOneOf3MultibancoBankTransfer multibancoBankTransfer) {
    
    this.multibancoBankTransfer = multibancoBankTransfer;
    return this;
  }

   /**
   * Get multibancoBankTransfer
   * @return multibancoBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MULTIBANCO_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf3MultibancoBankTransfer getMultibancoBankTransfer() {
    return multibancoBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_MULTIBANCO_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultibancoBankTransfer(BankTransferDataOneOf3MultibancoBankTransfer multibancoBankTransfer) {
    this.multibancoBankTransfer = multibancoBankTransfer;
  }


  public BankTransferData permataBankTransfer(BankTransferDataOneOf4PermataBankTransfer permataBankTransfer) {
    
    this.permataBankTransfer = permataBankTransfer;
    return this;
  }

   /**
   * Get permataBankTransfer
   * @return permataBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMATA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getPermataBankTransfer() {
    return permataBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_PERMATA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermataBankTransfer(BankTransferDataOneOf4PermataBankTransfer permataBankTransfer) {
    this.permataBankTransfer = permataBankTransfer;
  }


  public BankTransferData bcaBankTransfer(BankTransferDataOneOf4PermataBankTransfer bcaBankTransfer) {
    
    this.bcaBankTransfer = bcaBankTransfer;
    return this;
  }

   /**
   * Get bcaBankTransfer
   * @return bcaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BCA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getBcaBankTransfer() {
    return bcaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BCA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBcaBankTransfer(BankTransferDataOneOf4PermataBankTransfer bcaBankTransfer) {
    this.bcaBankTransfer = bcaBankTransfer;
  }


  public BankTransferData bniVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer bniVaBankTransfer) {
    
    this.bniVaBankTransfer = bniVaBankTransfer;
    return this;
  }

   /**
   * Get bniVaBankTransfer
   * @return bniVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BNI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getBniVaBankTransfer() {
    return bniVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BNI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBniVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer bniVaBankTransfer) {
    this.bniVaBankTransfer = bniVaBankTransfer;
  }


  public BankTransferData briVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer briVaBankTransfer) {
    
    this.briVaBankTransfer = briVaBankTransfer;
    return this;
  }

   /**
   * Get briVaBankTransfer
   * @return briVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getBriVaBankTransfer() {
    return briVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BRI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBriVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer briVaBankTransfer) {
    this.briVaBankTransfer = briVaBankTransfer;
  }


  public BankTransferData cimbVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer cimbVaBankTransfer) {
    
    this.cimbVaBankTransfer = cimbVaBankTransfer;
    return this;
  }

   /**
   * Get cimbVaBankTransfer
   * @return cimbVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CIMB_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getCimbVaBankTransfer() {
    return cimbVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_CIMB_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCimbVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer cimbVaBankTransfer) {
    this.cimbVaBankTransfer = cimbVaBankTransfer;
  }


  public BankTransferData danamonVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer) {
    
    this.danamonVaBankTransfer = danamonVaBankTransfer;
    return this;
  }

   /**
   * Get danamonVaBankTransfer
   * @return danamonVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getDanamonVaBankTransfer() {
    return danamonVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDanamonVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer) {
    this.danamonVaBankTransfer = danamonVaBankTransfer;
  }


  public BankTransferData mandiriVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer mandiriVaBankTransfer) {
    
    this.mandiriVaBankTransfer = mandiriVaBankTransfer;
    return this;
  }

   /**
   * Get mandiriVaBankTransfer
   * @return mandiriVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MANDIRI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getMandiriVaBankTransfer() {
    return mandiriVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_MANDIRI_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandiriVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer mandiriVaBankTransfer) {
    this.mandiriVaBankTransfer = mandiriVaBankTransfer;
  }


  public BankTransferData pix(Object pix) {
    
    this.pix = pix;
    return this;
  }

   /**
   * Get pix
   * @return pix
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPix() {
    return pix;
  }


  @JsonProperty(JSON_PROPERTY_PIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPix(Object pix) {
    this.pix = pix;
  }


  public BankTransferData pse(Object pse) {
    
    this.pse = pse;
    return this;
  }

   /**
   * Get pse
   * @return pse
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPse() {
    return pse;
  }


  @JsonProperty(JSON_PROPERTY_PSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPse(Object pse) {
    this.pse = pse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferData bankTransferData = (BankTransferData) o;
    return Objects.equals(this.achBankTransfer, bankTransferData.achBankTransfer) &&
        Objects.equals(this.sepaBankTransfer, bankTransferData.sepaBankTransfer) &&
        Objects.equals(this.bacsBankTransfer, bankTransferData.bacsBankTransfer) &&
        Objects.equals(this.multibancoBankTransfer, bankTransferData.multibancoBankTransfer) &&
        Objects.equals(this.permataBankTransfer, bankTransferData.permataBankTransfer) &&
        Objects.equals(this.bcaBankTransfer, bankTransferData.bcaBankTransfer) &&
        Objects.equals(this.bniVaBankTransfer, bankTransferData.bniVaBankTransfer) &&
        Objects.equals(this.briVaBankTransfer, bankTransferData.briVaBankTransfer) &&
        Objects.equals(this.cimbVaBankTransfer, bankTransferData.cimbVaBankTransfer) &&
        Objects.equals(this.danamonVaBankTransfer, bankTransferData.danamonVaBankTransfer) &&
        Objects.equals(this.mandiriVaBankTransfer, bankTransferData.mandiriVaBankTransfer) &&
        Objects.equals(this.pix, bankTransferData.pix) &&
        Objects.equals(this.pse, bankTransferData.pse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achBankTransfer, sepaBankTransfer, bacsBankTransfer, multibancoBankTransfer, permataBankTransfer, bcaBankTransfer, bniVaBankTransfer, briVaBankTransfer, cimbVaBankTransfer, danamonVaBankTransfer, mandiriVaBankTransfer, pix, pse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferData {\n");
    sb.append("    achBankTransfer: ").append(toIndentedString(achBankTransfer)).append("\n");
    sb.append("    sepaBankTransfer: ").append(toIndentedString(sepaBankTransfer)).append("\n");
    sb.append("    bacsBankTransfer: ").append(toIndentedString(bacsBankTransfer)).append("\n");
    sb.append("    multibancoBankTransfer: ").append(toIndentedString(multibancoBankTransfer)).append("\n");
    sb.append("    permataBankTransfer: ").append(toIndentedString(permataBankTransfer)).append("\n");
    sb.append("    bcaBankTransfer: ").append(toIndentedString(bcaBankTransfer)).append("\n");
    sb.append("    bniVaBankTransfer: ").append(toIndentedString(bniVaBankTransfer)).append("\n");
    sb.append("    briVaBankTransfer: ").append(toIndentedString(briVaBankTransfer)).append("\n");
    sb.append("    cimbVaBankTransfer: ").append(toIndentedString(cimbVaBankTransfer)).append("\n");
    sb.append("    danamonVaBankTransfer: ").append(toIndentedString(danamonVaBankTransfer)).append("\n");
    sb.append("    mandiriVaBankTransfer: ").append(toIndentedString(mandiriVaBankTransfer)).append("\n");
    sb.append("    pix: ").append(toIndentedString(pix)).append("\n");
    sb.append("    pse: ").append(toIndentedString(pse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
