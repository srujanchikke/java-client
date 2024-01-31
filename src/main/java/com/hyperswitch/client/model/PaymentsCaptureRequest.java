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
import com.hyperswitch.client.model.MerchantConnectorDetailsWrap;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentsCaptureRequest
 */
@JsonPropertyOrder({
  PaymentsCaptureRequest.JSON_PROPERTY_MERCHANT_ID,
  PaymentsCaptureRequest.JSON_PROPERTY_AMOUNT_TO_CAPTURE,
  PaymentsCaptureRequest.JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT,
  PaymentsCaptureRequest.JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX,
  PaymentsCaptureRequest.JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX,
  PaymentsCaptureRequest.JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class PaymentsCaptureRequest {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private JsonNullable<String> merchantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMOUNT_TO_CAPTURE = "amount_to_capture";
  private JsonNullable<Long> amountToCapture = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT = "refund_uncaptured_amount";
  private JsonNullable<Boolean> refundUncapturedAmount = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX = "statement_descriptor_suffix";
  private JsonNullable<String> statementDescriptorSuffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX = "statement_descriptor_prefix";
  private JsonNullable<String> statementDescriptorPrefix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS = "merchant_connector_details";
  private JsonNullable<MerchantConnectorDetailsWrap> merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>undefined();

  public PaymentsCaptureRequest() {
  }

  public PaymentsCaptureRequest merchantId(String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
    
    return this;
  }

   /**
   * The unique identifier for the merchant
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantId() {
        return merchantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantId_JsonNullable() {
    return merchantId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  public void setMerchantId_JsonNullable(JsonNullable<String> merchantId) {
    this.merchantId = merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
  }


  public PaymentsCaptureRequest amountToCapture(Long amountToCapture) {
    this.amountToCapture = JsonNullable.<Long>of(amountToCapture);
    
    return this;
  }

   /**
   * The Amount to be captured/ debited from the user&#39;s payment method.
   * @return amountToCapture
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getAmountToCapture() {
        return amountToCapture.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_TO_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getAmountToCapture_JsonNullable() {
    return amountToCapture;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_TO_CAPTURE)
  public void setAmountToCapture_JsonNullable(JsonNullable<Long> amountToCapture) {
    this.amountToCapture = amountToCapture;
  }

  public void setAmountToCapture(Long amountToCapture) {
    this.amountToCapture = JsonNullable.<Long>of(amountToCapture);
  }


  public PaymentsCaptureRequest refundUncapturedAmount(Boolean refundUncapturedAmount) {
    this.refundUncapturedAmount = JsonNullable.<Boolean>of(refundUncapturedAmount);
    
    return this;
  }

   /**
   * Decider to refund the uncaptured amount
   * @return refundUncapturedAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getRefundUncapturedAmount() {
        return refundUncapturedAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getRefundUncapturedAmount_JsonNullable() {
    return refundUncapturedAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_UNCAPTURED_AMOUNT)
  public void setRefundUncapturedAmount_JsonNullable(JsonNullable<Boolean> refundUncapturedAmount) {
    this.refundUncapturedAmount = refundUncapturedAmount;
  }

  public void setRefundUncapturedAmount(Boolean refundUncapturedAmount) {
    this.refundUncapturedAmount = JsonNullable.<Boolean>of(refundUncapturedAmount);
  }


  public PaymentsCaptureRequest statementDescriptorSuffix(String statementDescriptorSuffix) {
    this.statementDescriptorSuffix = JsonNullable.<String>of(statementDescriptorSuffix);
    
    return this;
  }

   /**
   * Provides information about a card payment that customers see on their statements.
   * @return statementDescriptorSuffix
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStatementDescriptorSuffix() {
        return statementDescriptorSuffix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatementDescriptorSuffix_JsonNullable() {
    return statementDescriptorSuffix;
  }
  
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_SUFFIX)
  public void setStatementDescriptorSuffix_JsonNullable(JsonNullable<String> statementDescriptorSuffix) {
    this.statementDescriptorSuffix = statementDescriptorSuffix;
  }

  public void setStatementDescriptorSuffix(String statementDescriptorSuffix) {
    this.statementDescriptorSuffix = JsonNullable.<String>of(statementDescriptorSuffix);
  }


  public PaymentsCaptureRequest statementDescriptorPrefix(String statementDescriptorPrefix) {
    this.statementDescriptorPrefix = JsonNullable.<String>of(statementDescriptorPrefix);
    
    return this;
  }

   /**
   * Concatenated with the statement descriptor suffix that’s set on the account to form the complete statement descriptor.
   * @return statementDescriptorPrefix
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStatementDescriptorPrefix() {
        return statementDescriptorPrefix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStatementDescriptorPrefix_JsonNullable() {
    return statementDescriptorPrefix;
  }
  
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR_PREFIX)
  public void setStatementDescriptorPrefix_JsonNullable(JsonNullable<String> statementDescriptorPrefix) {
    this.statementDescriptorPrefix = statementDescriptorPrefix;
  }

  public void setStatementDescriptorPrefix(String statementDescriptorPrefix) {
    this.statementDescriptorPrefix = JsonNullable.<String>of(statementDescriptorPrefix);
  }


  public PaymentsCaptureRequest merchantConnectorDetails(MerchantConnectorDetailsWrap merchantConnectorDetails) {
    this.merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>of(merchantConnectorDetails);
    
    return this;
  }

   /**
   * Get merchantConnectorDetails
   * @return merchantConnectorDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantConnectorDetailsWrap getMerchantConnectorDetails() {
        return merchantConnectorDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantConnectorDetailsWrap> getMerchantConnectorDetails_JsonNullable() {
    return merchantConnectorDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_DETAILS)
  public void setMerchantConnectorDetails_JsonNullable(JsonNullable<MerchantConnectorDetailsWrap> merchantConnectorDetails) {
    this.merchantConnectorDetails = merchantConnectorDetails;
  }

  public void setMerchantConnectorDetails(MerchantConnectorDetailsWrap merchantConnectorDetails) {
    this.merchantConnectorDetails = JsonNullable.<MerchantConnectorDetailsWrap>of(merchantConnectorDetails);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsCaptureRequest paymentsCaptureRequest = (PaymentsCaptureRequest) o;
    return equalsNullable(this.merchantId, paymentsCaptureRequest.merchantId) &&
        equalsNullable(this.amountToCapture, paymentsCaptureRequest.amountToCapture) &&
        equalsNullable(this.refundUncapturedAmount, paymentsCaptureRequest.refundUncapturedAmount) &&
        equalsNullable(this.statementDescriptorSuffix, paymentsCaptureRequest.statementDescriptorSuffix) &&
        equalsNullable(this.statementDescriptorPrefix, paymentsCaptureRequest.statementDescriptorPrefix) &&
        equalsNullable(this.merchantConnectorDetails, paymentsCaptureRequest.merchantConnectorDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(merchantId), hashCodeNullable(amountToCapture), hashCodeNullable(refundUncapturedAmount), hashCodeNullable(statementDescriptorSuffix), hashCodeNullable(statementDescriptorPrefix), hashCodeNullable(merchantConnectorDetails));
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
    sb.append("class PaymentsCaptureRequest {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    amountToCapture: ").append(toIndentedString(amountToCapture)).append("\n");
    sb.append("    refundUncapturedAmount: ").append(toIndentedString(refundUncapturedAmount)).append("\n");
    sb.append("    statementDescriptorSuffix: ").append(toIndentedString(statementDescriptorSuffix)).append("\n");
    sb.append("    statementDescriptorPrefix: ").append(toIndentedString(statementDescriptorPrefix)).append("\n");
    sb.append("    merchantConnectorDetails: ").append(toIndentedString(merchantConnectorDetails)).append("\n");
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

