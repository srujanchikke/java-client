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
import java.time.OffsetDateTime;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.PaymentLinkStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RetrievePaymentLinkResponse
 */
@JsonPropertyOrder({
  RetrievePaymentLinkResponse.JSON_PROPERTY_PAYMENT_LINK_ID,
  RetrievePaymentLinkResponse.JSON_PROPERTY_MERCHANT_ID,
  RetrievePaymentLinkResponse.JSON_PROPERTY_LINK_TO_PAY,
  RetrievePaymentLinkResponse.JSON_PROPERTY_AMOUNT,
  RetrievePaymentLinkResponse.JSON_PROPERTY_CREATED_AT,
  RetrievePaymentLinkResponse.JSON_PROPERTY_EXPIRY,
  RetrievePaymentLinkResponse.JSON_PROPERTY_DESCRIPTION,
  RetrievePaymentLinkResponse.JSON_PROPERTY_STATUS,
  RetrievePaymentLinkResponse.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class RetrievePaymentLinkResponse {
  public static final String JSON_PROPERTY_PAYMENT_LINK_ID = "payment_link_id";
  private String paymentLinkId;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_LINK_TO_PAY = "link_to_pay";
  private String linkToPay;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRY = "expiry";
  private JsonNullable<OffsetDateTime> expiry = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private PaymentLinkStatus status;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<Currency> currency = JsonNullable.<Currency>undefined();

  public RetrievePaymentLinkResponse() {
  }

  public RetrievePaymentLinkResponse paymentLinkId(String paymentLinkId) {
    
    this.paymentLinkId = paymentLinkId;
    return this;
  }

   /**
   * Get paymentLinkId
   * @return paymentLinkId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentLinkId() {
    return paymentLinkId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentLinkId(String paymentLinkId) {
    this.paymentLinkId = paymentLinkId;
  }


  public RetrievePaymentLinkResponse merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public RetrievePaymentLinkResponse linkToPay(String linkToPay) {
    
    this.linkToPay = linkToPay;
    return this;
  }

   /**
   * Get linkToPay
   * @return linkToPay
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINK_TO_PAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLinkToPay() {
    return linkToPay;
  }


  @JsonProperty(JSON_PROPERTY_LINK_TO_PAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinkToPay(String linkToPay) {
    this.linkToPay = linkToPay;
  }


  public RetrievePaymentLinkResponse amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public RetrievePaymentLinkResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RetrievePaymentLinkResponse expiry(OffsetDateTime expiry) {
    this.expiry = JsonNullable.<OffsetDateTime>of(expiry);
    
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getExpiry() {
        return expiry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpiry_JsonNullable() {
    return expiry;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRY)
  public void setExpiry_JsonNullable(JsonNullable<OffsetDateTime> expiry) {
    this.expiry = expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = JsonNullable.<OffsetDateTime>of(expiry);
  }


  public RetrievePaymentLinkResponse description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public RetrievePaymentLinkResponse status(PaymentLinkStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentLinkStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(PaymentLinkStatus status) {
    this.status = status;
  }


  public RetrievePaymentLinkResponse currency(Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
    
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Currency getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Currency> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<Currency> currency) {
    this.currency = currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentLinkResponse retrievePaymentLinkResponse = (RetrievePaymentLinkResponse) o;
    return Objects.equals(this.paymentLinkId, retrievePaymentLinkResponse.paymentLinkId) &&
        Objects.equals(this.merchantId, retrievePaymentLinkResponse.merchantId) &&
        Objects.equals(this.linkToPay, retrievePaymentLinkResponse.linkToPay) &&
        Objects.equals(this.amount, retrievePaymentLinkResponse.amount) &&
        Objects.equals(this.createdAt, retrievePaymentLinkResponse.createdAt) &&
        equalsNullable(this.expiry, retrievePaymentLinkResponse.expiry) &&
        equalsNullable(this.description, retrievePaymentLinkResponse.description) &&
        Objects.equals(this.status, retrievePaymentLinkResponse.status) &&
        equalsNullable(this.currency, retrievePaymentLinkResponse.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentLinkId, merchantId, linkToPay, amount, createdAt, hashCodeNullable(expiry), hashCodeNullable(description), status, hashCodeNullable(currency));
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
    sb.append("class RetrievePaymentLinkResponse {\n");
    sb.append("    paymentLinkId: ").append(toIndentedString(paymentLinkId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    linkToPay: ").append(toIndentedString(linkToPay)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

