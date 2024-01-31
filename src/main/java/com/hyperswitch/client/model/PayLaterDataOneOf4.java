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
 * PayLaterDataOneOf4
 */
@JsonPropertyOrder({
  PayLaterDataOneOf4.JSON_PROPERTY_PAY_BRIGHT_REDIRECT
})
@JsonTypeName("PayLaterData_oneOf_4")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class PayLaterDataOneOf4 {
  public static final String JSON_PROPERTY_PAY_BRIGHT_REDIRECT = "pay_bright_redirect";
  private Object payBrightRedirect;

  public PayLaterDataOneOf4() {
  }

  public PayLaterDataOneOf4 payBrightRedirect(Object payBrightRedirect) {
    
    this.payBrightRedirect = payBrightRedirect;
    return this;
  }

   /**
   * For PayBright Redirect as PayLater Option
   * @return payBrightRedirect
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_BRIGHT_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPayBrightRedirect() {
    return payBrightRedirect;
  }


  @JsonProperty(JSON_PROPERTY_PAY_BRIGHT_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayBrightRedirect(Object payBrightRedirect) {
    this.payBrightRedirect = payBrightRedirect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayLaterDataOneOf4 payLaterDataOneOf4 = (PayLaterDataOneOf4) o;
    return Objects.equals(this.payBrightRedirect, payLaterDataOneOf4.payBrightRedirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payBrightRedirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayLaterDataOneOf4 {\n");
    sb.append("    payBrightRedirect: ").append(toIndentedString(payBrightRedirect)).append("\n");
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

