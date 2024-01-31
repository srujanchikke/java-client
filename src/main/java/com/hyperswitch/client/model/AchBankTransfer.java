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
import com.hyperswitch.client.model.CountryAlpha2;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AchBankTransfer
 */
@JsonPropertyOrder({
  AchBankTransfer.JSON_PROPERTY_BANK_NAME,
  AchBankTransfer.JSON_PROPERTY_BANK_COUNTRY_CODE,
  AchBankTransfer.JSON_PROPERTY_BANK_CITY,
  AchBankTransfer.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  AchBankTransfer.JSON_PROPERTY_BANK_ROUTING_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class AchBankTransfer {
  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private JsonNullable<String> bankName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_COUNTRY_CODE = "bank_country_code";
  private JsonNullable<CountryAlpha2> bankCountryCode = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_BANK_CITY = "bank_city";
  private JsonNullable<String> bankCity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bank_account_number";
  private String bankAccountNumber;

  public static final String JSON_PROPERTY_BANK_ROUTING_NUMBER = "bank_routing_number";
  private String bankRoutingNumber;

  public AchBankTransfer() {
  }

  public AchBankTransfer bankName(String bankName) {
    this.bankName = JsonNullable.<String>of(bankName);
    
    return this;
  }

   /**
   * Bank name
   * @return bankName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBankName() {
        return bankName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankName_JsonNullable() {
    return bankName;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  public void setBankName_JsonNullable(JsonNullable<String> bankName) {
    this.bankName = bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = JsonNullable.<String>of(bankName);
  }


  public AchBankTransfer bankCountryCode(CountryAlpha2 bankCountryCode) {
    this.bankCountryCode = JsonNullable.<CountryAlpha2>of(bankCountryCode);
    
    return this;
  }

   /**
   * Get bankCountryCode
   * @return bankCountryCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getBankCountryCode() {
        return bankCountryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getBankCountryCode_JsonNullable() {
    return bankCountryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_COUNTRY_CODE)
  public void setBankCountryCode_JsonNullable(JsonNullable<CountryAlpha2> bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
  }

  public void setBankCountryCode(CountryAlpha2 bankCountryCode) {
    this.bankCountryCode = JsonNullable.<CountryAlpha2>of(bankCountryCode);
  }


  public AchBankTransfer bankCity(String bankCity) {
    this.bankCity = JsonNullable.<String>of(bankCity);
    
    return this;
  }

   /**
   * Bank city
   * @return bankCity
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBankCity() {
        return bankCity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankCity_JsonNullable() {
    return bankCity;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  public void setBankCity_JsonNullable(JsonNullable<String> bankCity) {
    this.bankCity = bankCity;
  }

  public void setBankCity(String bankCity) {
    this.bankCity = JsonNullable.<String>of(bankCity);
  }


  public AchBankTransfer bankAccountNumber(String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * Bank account number is an unique identifier assigned by a bank to a customer.
   * @return bankAccountNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public AchBankTransfer bankRoutingNumber(String bankRoutingNumber) {
    
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

   /**
   * [9 digits] Routing number - used in USA for identifying a specific bank.
   * @return bankRoutingNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankRoutingNumber() {
    return bankRoutingNumber;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRoutingNumber(String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchBankTransfer achBankTransfer = (AchBankTransfer) o;
    return equalsNullable(this.bankName, achBankTransfer.bankName) &&
        equalsNullable(this.bankCountryCode, achBankTransfer.bankCountryCode) &&
        equalsNullable(this.bankCity, achBankTransfer.bankCity) &&
        Objects.equals(this.bankAccountNumber, achBankTransfer.bankAccountNumber) &&
        Objects.equals(this.bankRoutingNumber, achBankTransfer.bankRoutingNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bankName), hashCodeNullable(bankCountryCode), hashCodeNullable(bankCity), bankAccountNumber, bankRoutingNumber);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchBankTransfer {\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    bankCity: ").append(toIndentedString(bankCity)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
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

