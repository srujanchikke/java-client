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
 * AddressDetails
 */
@JsonPropertyOrder({
  AddressDetails.JSON_PROPERTY_CITY,
  AddressDetails.JSON_PROPERTY_COUNTRY,
  AddressDetails.JSON_PROPERTY_LINE1,
  AddressDetails.JSON_PROPERTY_LINE2,
  AddressDetails.JSON_PROPERTY_LINE3,
  AddressDetails.JSON_PROPERTY_ZIP,
  AddressDetails.JSON_PROPERTY_STATE,
  AddressDetails.JSON_PROPERTY_FIRST_NAME,
  AddressDetails.JSON_PROPERTY_LAST_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class AddressDetails {
  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private JsonNullable<CountryAlpha2> country = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_LINE1 = "line1";
  private JsonNullable<String> line1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINE2 = "line2";
  private JsonNullable<String> line2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINE3 = "line3";
  private JsonNullable<String> line3 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ZIP = "zip";
  private JsonNullable<String> zip = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public AddressDetails() {
  }

  public AddressDetails city(String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

   /**
   * The address city
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public AddressDetails country(CountryAlpha2 country) {
    this.country = JsonNullable.<CountryAlpha2>of(country);
    
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<CountryAlpha2> country) {
    this.country = country;
  }

  public void setCountry(CountryAlpha2 country) {
    this.country = JsonNullable.<CountryAlpha2>of(country);
  }


  public AddressDetails line1(String line1) {
    this.line1 = JsonNullable.<String>of(line1);
    
    return this;
  }

   /**
   * The first line of the address
   * @return line1
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine1() {
        return line1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine1_JsonNullable() {
    return line1;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE1)
  public void setLine1_JsonNullable(JsonNullable<String> line1) {
    this.line1 = line1;
  }

  public void setLine1(String line1) {
    this.line1 = JsonNullable.<String>of(line1);
  }


  public AddressDetails line2(String line2) {
    this.line2 = JsonNullable.<String>of(line2);
    
    return this;
  }

   /**
   * The second line of the address
   * @return line2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine2() {
        return line2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine2_JsonNullable() {
    return line2;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE2)
  public void setLine2_JsonNullable(JsonNullable<String> line2) {
    this.line2 = line2;
  }

  public void setLine2(String line2) {
    this.line2 = JsonNullable.<String>of(line2);
  }


  public AddressDetails line3(String line3) {
    this.line3 = JsonNullable.<String>of(line3);
    
    return this;
  }

   /**
   * The third line of the address
   * @return line3
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLine3() {
        return line3.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLine3_JsonNullable() {
    return line3;
  }
  
  @JsonProperty(JSON_PROPERTY_LINE3)
  public void setLine3_JsonNullable(JsonNullable<String> line3) {
    this.line3 = line3;
  }

  public void setLine3(String line3) {
    this.line3 = JsonNullable.<String>of(line3);
  }


  public AddressDetails zip(String zip) {
    this.zip = JsonNullable.<String>of(zip);
    
    return this;
  }

   /**
   * The zip/postal code for the address
   * @return zip
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getZip() {
        return zip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getZip_JsonNullable() {
    return zip;
  }
  
  @JsonProperty(JSON_PROPERTY_ZIP)
  public void setZip_JsonNullable(JsonNullable<String> zip) {
    this.zip = zip;
  }

  public void setZip(String zip) {
    this.zip = JsonNullable.<String>of(zip);
  }


  public AddressDetails state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The address state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public AddressDetails firstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    
    return this;
  }

   /**
   * The first name for the address
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }


  public AddressDetails lastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    
    return this;
  }

   /**
   * The last name for the address
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetails addressDetails = (AddressDetails) o;
    return equalsNullable(this.city, addressDetails.city) &&
        equalsNullable(this.country, addressDetails.country) &&
        equalsNullable(this.line1, addressDetails.line1) &&
        equalsNullable(this.line2, addressDetails.line2) &&
        equalsNullable(this.line3, addressDetails.line3) &&
        equalsNullable(this.zip, addressDetails.zip) &&
        equalsNullable(this.state, addressDetails.state) &&
        equalsNullable(this.firstName, addressDetails.firstName) &&
        equalsNullable(this.lastName, addressDetails.lastName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(city), hashCodeNullable(country), hashCodeNullable(line1), hashCodeNullable(line2), hashCodeNullable(line3), hashCodeNullable(zip), hashCodeNullable(state), hashCodeNullable(firstName), hashCodeNullable(lastName));
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
    sb.append("class AddressDetails {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

