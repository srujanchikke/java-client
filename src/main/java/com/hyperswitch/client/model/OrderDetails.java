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
import com.hyperswitch.client.model.ProductType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrderDetails
 */
@JsonPropertyOrder({
  OrderDetails.JSON_PROPERTY_PRODUCT_NAME,
  OrderDetails.JSON_PROPERTY_QUANTITY,
  OrderDetails.JSON_PROPERTY_REQUIRES_SHIPPING,
  OrderDetails.JSON_PROPERTY_PRODUCT_IMG_LINK,
  OrderDetails.JSON_PROPERTY_PRODUCT_ID,
  OrderDetails.JSON_PROPERTY_CATEGORY,
  OrderDetails.JSON_PROPERTY_BRAND,
  OrderDetails.JSON_PROPERTY_PRODUCT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class OrderDetails {
  public static final String JSON_PROPERTY_PRODUCT_NAME = "product_name";
  private String productName;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public static final String JSON_PROPERTY_REQUIRES_SHIPPING = "requires_shipping";
  private JsonNullable<Boolean> requiresShipping = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PRODUCT_IMG_LINK = "product_img_link";
  private JsonNullable<String> productImgLink = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_ID = "product_id";
  private JsonNullable<String> productId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BRAND = "brand";
  private JsonNullable<String> brand = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "product_type";
  private JsonNullable<ProductType> productType = JsonNullable.<ProductType>undefined();

  public OrderDetails() {
  }

  public OrderDetails productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Name of the product that is being purchased
   * @return productName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductName() {
    return productName;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductName(String productName) {
    this.productName = productName;
  }


  public OrderDetails quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the product to be purchased
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderDetails requiresShipping(Boolean requiresShipping) {
    this.requiresShipping = JsonNullable.<Boolean>of(requiresShipping);
    
    return this;
  }

   /**
   * Get requiresShipping
   * @return requiresShipping
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getRequiresShipping() {
        return requiresShipping.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUIRES_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getRequiresShipping_JsonNullable() {
    return requiresShipping;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUIRES_SHIPPING)
  public void setRequiresShipping_JsonNullable(JsonNullable<Boolean> requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = JsonNullable.<Boolean>of(requiresShipping);
  }


  public OrderDetails productImgLink(String productImgLink) {
    this.productImgLink = JsonNullable.<String>of(productImgLink);
    
    return this;
  }

   /**
   * The image URL of the product
   * @return productImgLink
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProductImgLink() {
        return productImgLink.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_IMG_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductImgLink_JsonNullable() {
    return productImgLink;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_IMG_LINK)
  public void setProductImgLink_JsonNullable(JsonNullable<String> productImgLink) {
    this.productImgLink = productImgLink;
  }

  public void setProductImgLink(String productImgLink) {
    this.productImgLink = JsonNullable.<String>of(productImgLink);
  }


  public OrderDetails productId(String productId) {
    this.productId = JsonNullable.<String>of(productId);
    
    return this;
  }

   /**
   * ID of the product that is being purchased
   * @return productId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProductId() {
        return productId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductId_JsonNullable() {
    return productId;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  public void setProductId_JsonNullable(JsonNullable<String> productId) {
    this.productId = productId;
  }

  public void setProductId(String productId) {
    this.productId = JsonNullable.<String>of(productId);
  }


  public OrderDetails category(String category) {
    this.category = JsonNullable.<String>of(category);
    
    return this;
  }

   /**
   * Category of the product that is being purchased
   * @return category
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCategory() {
        return category.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCategory_JsonNullable() {
    return category;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  public void setCategory_JsonNullable(JsonNullable<String> category) {
    this.category = category;
  }

  public void setCategory(String category) {
    this.category = JsonNullable.<String>of(category);
  }


  public OrderDetails brand(String brand) {
    this.brand = JsonNullable.<String>of(brand);
    
    return this;
  }

   /**
   * Brand of the product that is being purchased
   * @return brand
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBrand() {
        return brand.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBrand_JsonNullable() {
    return brand;
  }
  
  @JsonProperty(JSON_PROPERTY_BRAND)
  public void setBrand_JsonNullable(JsonNullable<String> brand) {
    this.brand = brand;
  }

  public void setBrand(String brand) {
    this.brand = JsonNullable.<String>of(brand);
  }


  public OrderDetails productType(ProductType productType) {
    this.productType = JsonNullable.<ProductType>of(productType);
    
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ProductType getProductType() {
        return productType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ProductType> getProductType_JsonNullable() {
    return productType;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  public void setProductType_JsonNullable(JsonNullable<ProductType> productType) {
    this.productType = productType;
  }

  public void setProductType(ProductType productType) {
    this.productType = JsonNullable.<ProductType>of(productType);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetails orderDetails = (OrderDetails) o;
    return Objects.equals(this.productName, orderDetails.productName) &&
        Objects.equals(this.quantity, orderDetails.quantity) &&
        equalsNullable(this.requiresShipping, orderDetails.requiresShipping) &&
        equalsNullable(this.productImgLink, orderDetails.productImgLink) &&
        equalsNullable(this.productId, orderDetails.productId) &&
        equalsNullable(this.category, orderDetails.category) &&
        equalsNullable(this.brand, orderDetails.brand) &&
        equalsNullable(this.productType, orderDetails.productType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, quantity, hashCodeNullable(requiresShipping), hashCodeNullable(productImgLink), hashCodeNullable(productId), hashCodeNullable(category), hashCodeNullable(brand), hashCodeNullable(productType));
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
    sb.append("class OrderDetails {\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requiresShipping: ").append(toIndentedString(requiresShipping)).append("\n");
    sb.append("    productImgLink: ").append(toIndentedString(productImgLink)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

