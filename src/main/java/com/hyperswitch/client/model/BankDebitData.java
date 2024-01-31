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
import com.hyperswitch.client.model.BankDebitDataOneOf;
import com.hyperswitch.client.model.BankDebitDataOneOf1;
import com.hyperswitch.client.model.BankDebitDataOneOf1SepaBankDebit;
import com.hyperswitch.client.model.BankDebitDataOneOf2;
import com.hyperswitch.client.model.BankDebitDataOneOf2BecsBankDebit;
import com.hyperswitch.client.model.BankDebitDataOneOf3;
import com.hyperswitch.client.model.BankDebitDataOneOf3BacsBankDebit;
import com.hyperswitch.client.model.BankDebitDataOneOfAchBankDebit;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankDebitData
 */
@JsonPropertyOrder({
  BankDebitData.JSON_PROPERTY_ACH_BANK_DEBIT,
  BankDebitData.JSON_PROPERTY_SEPA_BANK_DEBIT,
  BankDebitData.JSON_PROPERTY_BECS_BANK_DEBIT,
  BankDebitData.JSON_PROPERTY_BACS_BANK_DEBIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankDebitData {
  public static final String JSON_PROPERTY_ACH_BANK_DEBIT = "ach_bank_debit";
  private BankDebitDataOneOfAchBankDebit achBankDebit;

  public static final String JSON_PROPERTY_SEPA_BANK_DEBIT = "sepa_bank_debit";
  private BankDebitDataOneOf1SepaBankDebit sepaBankDebit;

  public static final String JSON_PROPERTY_BECS_BANK_DEBIT = "becs_bank_debit";
  private BankDebitDataOneOf2BecsBankDebit becsBankDebit;

  public static final String JSON_PROPERTY_BACS_BANK_DEBIT = "bacs_bank_debit";
  private BankDebitDataOneOf3BacsBankDebit bacsBankDebit;

  public BankDebitData() {
  }

  public BankDebitData achBankDebit(BankDebitDataOneOfAchBankDebit achBankDebit) {
    
    this.achBankDebit = achBankDebit;
    return this;
  }

   /**
   * Get achBankDebit
   * @return achBankDebit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitDataOneOfAchBankDebit getAchBankDebit() {
    return achBankDebit;
  }


  @JsonProperty(JSON_PROPERTY_ACH_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAchBankDebit(BankDebitDataOneOfAchBankDebit achBankDebit) {
    this.achBankDebit = achBankDebit;
  }


  public BankDebitData sepaBankDebit(BankDebitDataOneOf1SepaBankDebit sepaBankDebit) {
    
    this.sepaBankDebit = sepaBankDebit;
    return this;
  }

   /**
   * Get sepaBankDebit
   * @return sepaBankDebit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitDataOneOf1SepaBankDebit getSepaBankDebit() {
    return sepaBankDebit;
  }


  @JsonProperty(JSON_PROPERTY_SEPA_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepaBankDebit(BankDebitDataOneOf1SepaBankDebit sepaBankDebit) {
    this.sepaBankDebit = sepaBankDebit;
  }


  public BankDebitData becsBankDebit(BankDebitDataOneOf2BecsBankDebit becsBankDebit) {
    
    this.becsBankDebit = becsBankDebit;
    return this;
  }

   /**
   * Get becsBankDebit
   * @return becsBankDebit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BECS_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitDataOneOf2BecsBankDebit getBecsBankDebit() {
    return becsBankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BECS_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBecsBankDebit(BankDebitDataOneOf2BecsBankDebit becsBankDebit) {
    this.becsBankDebit = becsBankDebit;
  }


  public BankDebitData bacsBankDebit(BankDebitDataOneOf3BacsBankDebit bacsBankDebit) {
    
    this.bacsBankDebit = bacsBankDebit;
    return this;
  }

   /**
   * Get bacsBankDebit
   * @return bacsBankDebit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitDataOneOf3BacsBankDebit getBacsBankDebit() {
    return bacsBankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BACS_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacsBankDebit(BankDebitDataOneOf3BacsBankDebit bacsBankDebit) {
    this.bacsBankDebit = bacsBankDebit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDebitData bankDebitData = (BankDebitData) o;
    return Objects.equals(this.achBankDebit, bankDebitData.achBankDebit) &&
        Objects.equals(this.sepaBankDebit, bankDebitData.sepaBankDebit) &&
        Objects.equals(this.becsBankDebit, bankDebitData.becsBankDebit) &&
        Objects.equals(this.bacsBankDebit, bankDebitData.bacsBankDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achBankDebit, sepaBankDebit, becsBankDebit, bacsBankDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDebitData {\n");
    sb.append("    achBankDebit: ").append(toIndentedString(achBankDebit)).append("\n");
    sb.append("    sepaBankDebit: ").append(toIndentedString(sepaBankDebit)).append("\n");
    sb.append("    becsBankDebit: ").append(toIndentedString(becsBankDebit)).append("\n");
    sb.append("    bacsBankDebit: ").append(toIndentedString(bacsBankDebit)).append("\n");
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

