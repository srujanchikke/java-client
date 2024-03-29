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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MandateAmountData
 */
@JsonPropertyOrder({
  MandateAmountData.JSON_PROPERTY_AMOUNT,
  MandateAmountData.JSON_PROPERTY_CURRENCY,
  MandateAmountData.JSON_PROPERTY_START_DATE,
  MandateAmountData.JSON_PROPERTY_END_DATE,
  MandateAmountData.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class MandateAmountData {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public MandateAmountData() {
  }

  public MandateAmountData amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The maximum amount to be debited for the mandate transaction
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


  public MandateAmountData currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public MandateAmountData startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    
    return this;
  }

   /**
   * Specifying start date of the mandate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
  }


  public MandateAmountData endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    
    return this;
  }

   /**
   * Specifying end date of the mandate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }


  public MandateAmountData metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Additional details required by mandate
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateAmountData mandateAmountData = (MandateAmountData) o;
    return Objects.equals(this.amount, mandateAmountData.amount) &&
        Objects.equals(this.currency, mandateAmountData.currency) &&
        equalsNullable(this.startDate, mandateAmountData.startDate) &&
        equalsNullable(this.endDate, mandateAmountData.endDate) &&
        equalsNullable(this.metadata, mandateAmountData.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(metadata));
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
    sb.append("class MandateAmountData {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

