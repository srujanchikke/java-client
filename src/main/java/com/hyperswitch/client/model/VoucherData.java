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
import com.hyperswitch.client.model.AlfamartVoucherData;
import com.hyperswitch.client.model.BoletoVoucherData;
import com.hyperswitch.client.model.IndomaretVoucherData;
import com.hyperswitch.client.model.JCSVoucherData;
import com.hyperswitch.client.model.VoucherDataOneOf;
import com.hyperswitch.client.model.VoucherDataOneOf1;
import com.hyperswitch.client.model.VoucherDataOneOf2;
import com.hyperswitch.client.model.VoucherDataOneOf3;
import com.hyperswitch.client.model.VoucherDataOneOf4;
import com.hyperswitch.client.model.VoucherDataOneOf5;
import com.hyperswitch.client.model.VoucherDataOneOf6;
import com.hyperswitch.client.model.VoucherDataOneOf7;
import com.hyperswitch.client.model.VoucherDataOneOf8;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VoucherData
 */
@JsonPropertyOrder({
  VoucherData.JSON_PROPERTY_BOLETO,
  VoucherData.JSON_PROPERTY_ALFAMART,
  VoucherData.JSON_PROPERTY_INDOMARET,
  VoucherData.JSON_PROPERTY_SEVEN_ELEVEN,
  VoucherData.JSON_PROPERTY_LAWSON,
  VoucherData.JSON_PROPERTY_MINI_STOP,
  VoucherData.JSON_PROPERTY_FAMILY_MART,
  VoucherData.JSON_PROPERTY_SEICOMART,
  VoucherData.JSON_PROPERTY_PAY_EASY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class VoucherData {
  public static final String JSON_PROPERTY_BOLETO = "boleto";
  private BoletoVoucherData boleto;

  public static final String JSON_PROPERTY_ALFAMART = "alfamart";
  private AlfamartVoucherData alfamart;

  public static final String JSON_PROPERTY_INDOMARET = "indomaret";
  private IndomaretVoucherData indomaret;

  public static final String JSON_PROPERTY_SEVEN_ELEVEN = "seven_eleven";
  private JCSVoucherData sevenEleven;

  public static final String JSON_PROPERTY_LAWSON = "lawson";
  private JCSVoucherData lawson;

  public static final String JSON_PROPERTY_MINI_STOP = "mini_stop";
  private JCSVoucherData miniStop;

  public static final String JSON_PROPERTY_FAMILY_MART = "family_mart";
  private JCSVoucherData familyMart;

  public static final String JSON_PROPERTY_SEICOMART = "seicomart";
  private JCSVoucherData seicomart;

  public static final String JSON_PROPERTY_PAY_EASY = "pay_easy";
  private JCSVoucherData payEasy;

  public VoucherData() {
  }

  public VoucherData boleto(BoletoVoucherData boleto) {
    
    this.boleto = boleto;
    return this;
  }

   /**
   * Get boleto
   * @return boleto
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BOLETO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BoletoVoucherData getBoleto() {
    return boleto;
  }


  @JsonProperty(JSON_PROPERTY_BOLETO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBoleto(BoletoVoucherData boleto) {
    this.boleto = boleto;
  }


  public VoucherData alfamart(AlfamartVoucherData alfamart) {
    
    this.alfamart = alfamart;
    return this;
  }

   /**
   * Get alfamart
   * @return alfamart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALFAMART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlfamartVoucherData getAlfamart() {
    return alfamart;
  }


  @JsonProperty(JSON_PROPERTY_ALFAMART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlfamart(AlfamartVoucherData alfamart) {
    this.alfamart = alfamart;
  }


  public VoucherData indomaret(IndomaretVoucherData indomaret) {
    
    this.indomaret = indomaret;
    return this;
  }

   /**
   * Get indomaret
   * @return indomaret
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDOMARET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IndomaretVoucherData getIndomaret() {
    return indomaret;
  }


  @JsonProperty(JSON_PROPERTY_INDOMARET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndomaret(IndomaretVoucherData indomaret) {
    this.indomaret = indomaret;
  }


  public VoucherData sevenEleven(JCSVoucherData sevenEleven) {
    
    this.sevenEleven = sevenEleven;
    return this;
  }

   /**
   * Get sevenEleven
   * @return sevenEleven
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEVEN_ELEVEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getSevenEleven() {
    return sevenEleven;
  }


  @JsonProperty(JSON_PROPERTY_SEVEN_ELEVEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSevenEleven(JCSVoucherData sevenEleven) {
    this.sevenEleven = sevenEleven;
  }


  public VoucherData lawson(JCSVoucherData lawson) {
    
    this.lawson = lawson;
    return this;
  }

   /**
   * Get lawson
   * @return lawson
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAWSON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getLawson() {
    return lawson;
  }


  @JsonProperty(JSON_PROPERTY_LAWSON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLawson(JCSVoucherData lawson) {
    this.lawson = lawson;
  }


  public VoucherData miniStop(JCSVoucherData miniStop) {
    
    this.miniStop = miniStop;
    return this;
  }

   /**
   * Get miniStop
   * @return miniStop
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MINI_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getMiniStop() {
    return miniStop;
  }


  @JsonProperty(JSON_PROPERTY_MINI_STOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMiniStop(JCSVoucherData miniStop) {
    this.miniStop = miniStop;
  }


  public VoucherData familyMart(JCSVoucherData familyMart) {
    
    this.familyMart = familyMart;
    return this;
  }

   /**
   * Get familyMart
   * @return familyMart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAMILY_MART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getFamilyMart() {
    return familyMart;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_MART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFamilyMart(JCSVoucherData familyMart) {
    this.familyMart = familyMart;
  }


  public VoucherData seicomart(JCSVoucherData seicomart) {
    
    this.seicomart = seicomart;
    return this;
  }

   /**
   * Get seicomart
   * @return seicomart
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEICOMART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getSeicomart() {
    return seicomart;
  }


  @JsonProperty(JSON_PROPERTY_SEICOMART)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeicomart(JCSVoucherData seicomart) {
    this.seicomart = seicomart;
  }


  public VoucherData payEasy(JCSVoucherData payEasy) {
    
    this.payEasy = payEasy;
    return this;
  }

   /**
   * Get payEasy
   * @return payEasy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_EASY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JCSVoucherData getPayEasy() {
    return payEasy;
  }


  @JsonProperty(JSON_PROPERTY_PAY_EASY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayEasy(JCSVoucherData payEasy) {
    this.payEasy = payEasy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherData voucherData = (VoucherData) o;
    return Objects.equals(this.boleto, voucherData.boleto) &&
        Objects.equals(this.alfamart, voucherData.alfamart) &&
        Objects.equals(this.indomaret, voucherData.indomaret) &&
        Objects.equals(this.sevenEleven, voucherData.sevenEleven) &&
        Objects.equals(this.lawson, voucherData.lawson) &&
        Objects.equals(this.miniStop, voucherData.miniStop) &&
        Objects.equals(this.familyMart, voucherData.familyMart) &&
        Objects.equals(this.seicomart, voucherData.seicomart) &&
        Objects.equals(this.payEasy, voucherData.payEasy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boleto, alfamart, indomaret, sevenEleven, lawson, miniStop, familyMart, seicomart, payEasy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherData {\n");
    sb.append("    boleto: ").append(toIndentedString(boleto)).append("\n");
    sb.append("    alfamart: ").append(toIndentedString(alfamart)).append("\n");
    sb.append("    indomaret: ").append(toIndentedString(indomaret)).append("\n");
    sb.append("    sevenEleven: ").append(toIndentedString(sevenEleven)).append("\n");
    sb.append("    lawson: ").append(toIndentedString(lawson)).append("\n");
    sb.append("    miniStop: ").append(toIndentedString(miniStop)).append("\n");
    sb.append("    familyMart: ").append(toIndentedString(familyMart)).append("\n");
    sb.append("    seicomart: ").append(toIndentedString(seicomart)).append("\n");
    sb.append("    payEasy: ").append(toIndentedString(payEasy)).append("\n");
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

