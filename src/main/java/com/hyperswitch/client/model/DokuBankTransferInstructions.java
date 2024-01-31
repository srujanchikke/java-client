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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DokuBankTransferInstructions
 */
@JsonPropertyOrder({
  DokuBankTransferInstructions.JSON_PROPERTY_EXPIRES_AT,
  DokuBankTransferInstructions.JSON_PROPERTY_REFERENCE,
  DokuBankTransferInstructions.JSON_PROPERTY_INSTRUCTIONS_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class DokuBankTransferInstructions {
  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private String expiresAt;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_INSTRUCTIONS_URL = "instructions_url";
  private String instructionsUrl;

  public DokuBankTransferInstructions() {
  }

  public DokuBankTransferInstructions expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public DokuBankTransferInstructions reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public DokuBankTransferInstructions instructionsUrl(String instructionsUrl) {
    
    this.instructionsUrl = instructionsUrl;
    return this;
  }

   /**
   * Get instructionsUrl
   * @return instructionsUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstructionsUrl() {
    return instructionsUrl;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstructionsUrl(String instructionsUrl) {
    this.instructionsUrl = instructionsUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DokuBankTransferInstructions dokuBankTransferInstructions = (DokuBankTransferInstructions) o;
    return Objects.equals(this.expiresAt, dokuBankTransferInstructions.expiresAt) &&
        Objects.equals(this.reference, dokuBankTransferInstructions.reference) &&
        Objects.equals(this.instructionsUrl, dokuBankTransferInstructions.instructionsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, reference, instructionsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DokuBankTransferInstructions {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    instructionsUrl: ").append(toIndentedString(instructionsUrl)).append("\n");
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
