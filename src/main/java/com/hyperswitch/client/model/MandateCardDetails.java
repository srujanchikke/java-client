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
import com.hyperswitch.client.model.CardNetwork;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MandateCardDetails
 */
@JsonPropertyOrder({
  MandateCardDetails.JSON_PROPERTY_LAST4_DIGITS,
  MandateCardDetails.JSON_PROPERTY_CARD_EXP_MONTH,
  MandateCardDetails.JSON_PROPERTY_CARD_EXP_YEAR,
  MandateCardDetails.JSON_PROPERTY_CARD_HOLDER_NAME,
  MandateCardDetails.JSON_PROPERTY_CARD_TOKEN,
  MandateCardDetails.JSON_PROPERTY_SCHEME,
  MandateCardDetails.JSON_PROPERTY_ISSUER_COUNTRY,
  MandateCardDetails.JSON_PROPERTY_CARD_FINGERPRINT,
  MandateCardDetails.JSON_PROPERTY_CARD_ISIN,
  MandateCardDetails.JSON_PROPERTY_CARD_ISSUER,
  MandateCardDetails.JSON_PROPERTY_CARD_NETWORK,
  MandateCardDetails.JSON_PROPERTY_CARD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class MandateCardDetails {
  public static final String JSON_PROPERTY_LAST4_DIGITS = "last4_digits";
  private JsonNullable<String> last4Digits = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  private JsonNullable<String> cardExpMonth = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  private JsonNullable<String> cardExpYear = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  private JsonNullable<String> cardHolderName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_TOKEN = "card_token";
  private JsonNullable<String> cardToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SCHEME = "scheme";
  private JsonNullable<String> scheme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUER_COUNTRY = "issuer_country";
  private JsonNullable<String> issuerCountry = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_FINGERPRINT = "card_fingerprint";
  private JsonNullable<String> cardFingerprint = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_ISIN = "card_isin";
  private JsonNullable<String> cardIsin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_ISSUER = "card_issuer";
  private JsonNullable<String> cardIssuer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_NETWORK = "card_network";
  private JsonNullable<CardNetwork> cardNetwork = JsonNullable.<CardNetwork>undefined();

  public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
  private JsonNullable<String> cardType = JsonNullable.<String>undefined();

  public MandateCardDetails() {
  }

  public MandateCardDetails last4Digits(String last4Digits) {
    this.last4Digits = JsonNullable.<String>of(last4Digits);
    
    return this;
  }

   /**
   * The last 4 digits of card
   * @return last4Digits
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLast4Digits() {
        return last4Digits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLast4Digits_JsonNullable() {
    return last4Digits;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  public void setLast4Digits_JsonNullable(JsonNullable<String> last4Digits) {
    this.last4Digits = last4Digits;
  }

  public void setLast4Digits(String last4Digits) {
    this.last4Digits = JsonNullable.<String>of(last4Digits);
  }


  public MandateCardDetails cardExpMonth(String cardExpMonth) {
    this.cardExpMonth = JsonNullable.<String>of(cardExpMonth);
    
    return this;
  }

   /**
   * The expiry month of card
   * @return cardExpMonth
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardExpMonth() {
        return cardExpMonth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardExpMonth_JsonNullable() {
    return cardExpMonth;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  public void setCardExpMonth_JsonNullable(JsonNullable<String> cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
  }

  public void setCardExpMonth(String cardExpMonth) {
    this.cardExpMonth = JsonNullable.<String>of(cardExpMonth);
  }


  public MandateCardDetails cardExpYear(String cardExpYear) {
    this.cardExpYear = JsonNullable.<String>of(cardExpYear);
    
    return this;
  }

   /**
   * The expiry year of card
   * @return cardExpYear
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardExpYear() {
        return cardExpYear.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardExpYear_JsonNullable() {
    return cardExpYear;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  public void setCardExpYear_JsonNullable(JsonNullable<String> cardExpYear) {
    this.cardExpYear = cardExpYear;
  }

  public void setCardExpYear(String cardExpYear) {
    this.cardExpYear = JsonNullable.<String>of(cardExpYear);
  }


  public MandateCardDetails cardHolderName(String cardHolderName) {
    this.cardHolderName = JsonNullable.<String>of(cardHolderName);
    
    return this;
  }

   /**
   * The card holder name
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardHolderName() {
        return cardHolderName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardHolderName_JsonNullable() {
    return cardHolderName;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  public void setCardHolderName_JsonNullable(JsonNullable<String> cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = JsonNullable.<String>of(cardHolderName);
  }


  public MandateCardDetails cardToken(String cardToken) {
    this.cardToken = JsonNullable.<String>of(cardToken);
    
    return this;
  }

   /**
   * The token from card locker
   * @return cardToken
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardToken() {
        return cardToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardToken_JsonNullable() {
    return cardToken;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  public void setCardToken_JsonNullable(JsonNullable<String> cardToken) {
    this.cardToken = cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = JsonNullable.<String>of(cardToken);
  }


  public MandateCardDetails scheme(String scheme) {
    this.scheme = JsonNullable.<String>of(scheme);
    
    return this;
  }

   /**
   * The card scheme network for the particular card
   * @return scheme
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getScheme() {
        return scheme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getScheme_JsonNullable() {
    return scheme;
  }
  
  @JsonProperty(JSON_PROPERTY_SCHEME)
  public void setScheme_JsonNullable(JsonNullable<String> scheme) {
    this.scheme = scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = JsonNullable.<String>of(scheme);
  }


  public MandateCardDetails issuerCountry(String issuerCountry) {
    this.issuerCountry = JsonNullable.<String>of(issuerCountry);
    
    return this;
  }

   /**
   * The country code in in which the card was issued
   * @return issuerCountry
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIssuerCountry() {
        return issuerCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssuerCountry_JsonNullable() {
    return issuerCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  public void setIssuerCountry_JsonNullable(JsonNullable<String> issuerCountry) {
    this.issuerCountry = issuerCountry;
  }

  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = JsonNullable.<String>of(issuerCountry);
  }


  public MandateCardDetails cardFingerprint(String cardFingerprint) {
    this.cardFingerprint = JsonNullable.<String>of(cardFingerprint);
    
    return this;
  }

   /**
   * A unique identifier alias to identify a particular card
   * @return cardFingerprint
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardFingerprint() {
        return cardFingerprint.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardFingerprint_JsonNullable() {
    return cardFingerprint;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_FINGERPRINT)
  public void setCardFingerprint_JsonNullable(JsonNullable<String> cardFingerprint) {
    this.cardFingerprint = cardFingerprint;
  }

  public void setCardFingerprint(String cardFingerprint) {
    this.cardFingerprint = JsonNullable.<String>of(cardFingerprint);
  }


  public MandateCardDetails cardIsin(String cardIsin) {
    this.cardIsin = JsonNullable.<String>of(cardIsin);
    
    return this;
  }

   /**
   * The first 6 digits of card
   * @return cardIsin
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardIsin() {
        return cardIsin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardIsin_JsonNullable() {
    return cardIsin;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_ISIN)
  public void setCardIsin_JsonNullable(JsonNullable<String> cardIsin) {
    this.cardIsin = cardIsin;
  }

  public void setCardIsin(String cardIsin) {
    this.cardIsin = JsonNullable.<String>of(cardIsin);
  }


  public MandateCardDetails cardIssuer(String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
    
    return this;
  }

   /**
   * The bank that issued the card
   * @return cardIssuer
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardIssuer() {
        return cardIssuer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardIssuer_JsonNullable() {
    return cardIssuer;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_ISSUER)
  public void setCardIssuer_JsonNullable(JsonNullable<String> cardIssuer) {
    this.cardIssuer = cardIssuer;
  }

  public void setCardIssuer(String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
  }


  public MandateCardDetails cardNetwork(CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
    
    return this;
  }

   /**
   * Get cardNetwork
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CardNetwork getCardNetwork() {
        return cardNetwork.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CardNetwork> getCardNetwork_JsonNullable() {
    return cardNetwork;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  public void setCardNetwork_JsonNullable(JsonNullable<CardNetwork> cardNetwork) {
    this.cardNetwork = cardNetwork;
  }

  public void setCardNetwork(CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
  }


  public MandateCardDetails cardType(String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
    
    return this;
  }

   /**
   * The type of the payment card
   * @return cardType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardType() {
        return cardType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardType_JsonNullable() {
    return cardType;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  public void setCardType_JsonNullable(JsonNullable<String> cardType) {
    this.cardType = cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateCardDetails mandateCardDetails = (MandateCardDetails) o;
    return equalsNullable(this.last4Digits, mandateCardDetails.last4Digits) &&
        equalsNullable(this.cardExpMonth, mandateCardDetails.cardExpMonth) &&
        equalsNullable(this.cardExpYear, mandateCardDetails.cardExpYear) &&
        equalsNullable(this.cardHolderName, mandateCardDetails.cardHolderName) &&
        equalsNullable(this.cardToken, mandateCardDetails.cardToken) &&
        equalsNullable(this.scheme, mandateCardDetails.scheme) &&
        equalsNullable(this.issuerCountry, mandateCardDetails.issuerCountry) &&
        equalsNullable(this.cardFingerprint, mandateCardDetails.cardFingerprint) &&
        equalsNullable(this.cardIsin, mandateCardDetails.cardIsin) &&
        equalsNullable(this.cardIssuer, mandateCardDetails.cardIssuer) &&
        equalsNullable(this.cardNetwork, mandateCardDetails.cardNetwork) &&
        equalsNullable(this.cardType, mandateCardDetails.cardType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(last4Digits), hashCodeNullable(cardExpMonth), hashCodeNullable(cardExpYear), hashCodeNullable(cardHolderName), hashCodeNullable(cardToken), hashCodeNullable(scheme), hashCodeNullable(issuerCountry), hashCodeNullable(cardFingerprint), hashCodeNullable(cardIsin), hashCodeNullable(cardIssuer), hashCodeNullable(cardNetwork), hashCodeNullable(cardType));
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
    sb.append("class MandateCardDetails {\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    cardFingerprint: ").append(toIndentedString(cardFingerprint)).append("\n");
    sb.append("    cardIsin: ").append(toIndentedString(cardIsin)).append("\n");
    sb.append("    cardIssuer: ").append(toIndentedString(cardIssuer)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

