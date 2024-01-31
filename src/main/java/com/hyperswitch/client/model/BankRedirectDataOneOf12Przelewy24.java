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
import com.hyperswitch.client.model.BankNames;
import com.hyperswitch.client.model.BankRedirectBilling;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankRedirectDataOneOf12Przelewy24
 */
@JsonPropertyOrder({
  BankRedirectDataOneOf12Przelewy24.JSON_PROPERTY_BANK_NAME,
  BankRedirectDataOneOf12Przelewy24.JSON_PROPERTY_BILLING_DETAILS
})
@JsonTypeName("BankRedirectData_oneOf_12_przelewy24")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankRedirectDataOneOf12Przelewy24 {
  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private JsonNullable<BankNames> bankName = JsonNullable.<BankNames>undefined();

  public static final String JSON_PROPERTY_BILLING_DETAILS = "billing_details";
  private BankRedirectBilling billingDetails;

  public BankRedirectDataOneOf12Przelewy24() {
  }

  public BankRedirectDataOneOf12Przelewy24 bankName(BankNames bankName) {
    this.bankName = JsonNullable.<BankNames>of(bankName);
    
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public BankNames getBankName() {
        return bankName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BankNames> getBankName_JsonNullable() {
    return bankName;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  public void setBankName_JsonNullable(JsonNullable<BankNames> bankName) {
    this.bankName = bankName;
  }

  public void setBankName(BankNames bankName) {
    this.bankName = JsonNullable.<BankNames>of(bankName);
  }


  public BankRedirectDataOneOf12Przelewy24 billingDetails(BankRedirectBilling billingDetails) {
    
    this.billingDetails = billingDetails;
    return this;
  }

   /**
   * Get billingDetails
   * @return billingDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectBilling getBillingDetails() {
    return billingDetails;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillingDetails(BankRedirectBilling billingDetails) {
    this.billingDetails = billingDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectDataOneOf12Przelewy24 bankRedirectDataOneOf12Przelewy24 = (BankRedirectDataOneOf12Przelewy24) o;
    return equalsNullable(this.bankName, bankRedirectDataOneOf12Przelewy24.bankName) &&
        Objects.equals(this.billingDetails, bankRedirectDataOneOf12Przelewy24.billingDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bankName), billingDetails);
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
    sb.append("class BankRedirectDataOneOf12Przelewy24 {\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
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
