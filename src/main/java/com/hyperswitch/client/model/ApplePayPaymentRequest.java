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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.hyperswitch.client.model.AmountInfo;
import com.hyperswitch.client.model.CountryAlpha2;
import com.hyperswitch.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApplePayPaymentRequest
 */
@JsonPropertyOrder({
  ApplePayPaymentRequest.JSON_PROPERTY_COUNTRY_CODE,
  ApplePayPaymentRequest.JSON_PROPERTY_CURRENCY_CODE,
  ApplePayPaymentRequest.JSON_PROPERTY_TOTAL,
  ApplePayPaymentRequest.JSON_PROPERTY_MERCHANT_CAPABILITIES,
  ApplePayPaymentRequest.JSON_PROPERTY_SUPPORTED_NETWORKS,
  ApplePayPaymentRequest.JSON_PROPERTY_MERCHANT_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class ApplePayPaymentRequest {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private CountryAlpha2 countryCode;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private Currency currencyCode;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private AmountInfo total;

  public static final String JSON_PROPERTY_MERCHANT_CAPABILITIES = "merchant_capabilities";
  private JsonNullable<List<String>> merchantCapabilities = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_SUPPORTED_NETWORKS = "supported_networks";
  private JsonNullable<List<String>> supportedNetworks = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MERCHANT_IDENTIFIER = "merchant_identifier";
  private JsonNullable<String> merchantIdentifier = JsonNullable.<String>undefined();

  public ApplePayPaymentRequest() {
  }

  public ApplePayPaymentRequest countryCode(CountryAlpha2 countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CountryAlpha2 getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(CountryAlpha2 countryCode) {
    this.countryCode = countryCode;
  }


  public ApplePayPaymentRequest currencyCode(Currency currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ApplePayPaymentRequest total(AmountInfo total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AmountInfo getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(AmountInfo total) {
    this.total = total;
  }


  public ApplePayPaymentRequest merchantCapabilities(List<String> merchantCapabilities) {
    this.merchantCapabilities = JsonNullable.<List<String>>of(merchantCapabilities);
    
    return this;
  }

  public ApplePayPaymentRequest addMerchantCapabilitiesItem(String merchantCapabilitiesItem) {
    if (this.merchantCapabilities == null || !this.merchantCapabilities.isPresent()) {
      this.merchantCapabilities = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.merchantCapabilities.get().add(merchantCapabilitiesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of merchant capabilities(ex: whether capable of 3ds or no-3ds)
   * @return merchantCapabilities
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getMerchantCapabilities() {
        return merchantCapabilities.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getMerchantCapabilities_JsonNullable() {
    return merchantCapabilities;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_CAPABILITIES)
  public void setMerchantCapabilities_JsonNullable(JsonNullable<List<String>> merchantCapabilities) {
    this.merchantCapabilities = merchantCapabilities;
  }

  public void setMerchantCapabilities(List<String> merchantCapabilities) {
    this.merchantCapabilities = JsonNullable.<List<String>>of(merchantCapabilities);
  }


  public ApplePayPaymentRequest supportedNetworks(List<String> supportedNetworks) {
    this.supportedNetworks = JsonNullable.<List<String>>of(supportedNetworks);
    
    return this;
  }

  public ApplePayPaymentRequest addSupportedNetworksItem(String supportedNetworksItem) {
    if (this.supportedNetworks == null || !this.supportedNetworks.isPresent()) {
      this.supportedNetworks = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.supportedNetworks.get().add(supportedNetworksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of supported networks
   * @return supportedNetworks
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getSupportedNetworks() {
        return supportedNetworks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUPPORTED_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getSupportedNetworks_JsonNullable() {
    return supportedNetworks;
  }
  
  @JsonProperty(JSON_PROPERTY_SUPPORTED_NETWORKS)
  public void setSupportedNetworks_JsonNullable(JsonNullable<List<String>> supportedNetworks) {
    this.supportedNetworks = supportedNetworks;
  }

  public void setSupportedNetworks(List<String> supportedNetworks) {
    this.supportedNetworks = JsonNullable.<List<String>>of(supportedNetworks);
  }


  public ApplePayPaymentRequest merchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = JsonNullable.<String>of(merchantIdentifier);
    
    return this;
  }

   /**
   * Get merchantIdentifier
   * @return merchantIdentifier
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantIdentifier() {
        return merchantIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantIdentifier_JsonNullable() {
    return merchantIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  public void setMerchantIdentifier_JsonNullable(JsonNullable<String> merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }

  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = JsonNullable.<String>of(merchantIdentifier);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePayPaymentRequest applePayPaymentRequest = (ApplePayPaymentRequest) o;
    return Objects.equals(this.countryCode, applePayPaymentRequest.countryCode) &&
        Objects.equals(this.currencyCode, applePayPaymentRequest.currencyCode) &&
        Objects.equals(this.total, applePayPaymentRequest.total) &&
        equalsNullable(this.merchantCapabilities, applePayPaymentRequest.merchantCapabilities) &&
        equalsNullable(this.supportedNetworks, applePayPaymentRequest.supportedNetworks) &&
        equalsNullable(this.merchantIdentifier, applePayPaymentRequest.merchantIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, currencyCode, total, hashCodeNullable(merchantCapabilities), hashCodeNullable(supportedNetworks), hashCodeNullable(merchantIdentifier));
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
    sb.append("class ApplePayPaymentRequest {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    merchantCapabilities: ").append(toIndentedString(merchantCapabilities)).append("\n");
    sb.append("    supportedNetworks: ").append(toIndentedString(supportedNetworks)).append("\n");
    sb.append("    merchantIdentifier: ").append(toIndentedString(merchantIdentifier)).append("\n");
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
