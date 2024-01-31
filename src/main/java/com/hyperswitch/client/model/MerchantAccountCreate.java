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
import com.hyperswitch.client.model.MerchantDetails;
import com.hyperswitch.client.model.PrimaryBusinessDetails;
import com.hyperswitch.client.model.RoutingAlgorithm;
import com.hyperswitch.client.model.WebhookDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MerchantAccountCreate
 */
@JsonPropertyOrder({
  MerchantAccountCreate.JSON_PROPERTY_MERCHANT_ID,
  MerchantAccountCreate.JSON_PROPERTY_MERCHANT_NAME,
  MerchantAccountCreate.JSON_PROPERTY_MERCHANT_DETAILS,
  MerchantAccountCreate.JSON_PROPERTY_RETURN_URL,
  MerchantAccountCreate.JSON_PROPERTY_WEBHOOK_DETAILS,
  MerchantAccountCreate.JSON_PROPERTY_ROUTING_ALGORITHM,
  MerchantAccountCreate.JSON_PROPERTY_PAYOUT_ROUTING_ALGORITHM,
  MerchantAccountCreate.JSON_PROPERTY_SUB_MERCHANTS_ENABLED,
  MerchantAccountCreate.JSON_PROPERTY_PARENT_MERCHANT_ID,
  MerchantAccountCreate.JSON_PROPERTY_ENABLE_PAYMENT_RESPONSE_HASH,
  MerchantAccountCreate.JSON_PROPERTY_PAYMENT_RESPONSE_HASH_KEY,
  MerchantAccountCreate.JSON_PROPERTY_REDIRECT_TO_MERCHANT_WITH_HTTP_POST,
  MerchantAccountCreate.JSON_PROPERTY_METADATA,
  MerchantAccountCreate.JSON_PROPERTY_PUBLISHABLE_KEY,
  MerchantAccountCreate.JSON_PROPERTY_LOCKER_ID,
  MerchantAccountCreate.JSON_PROPERTY_PRIMARY_BUSINESS_DETAILS,
  MerchantAccountCreate.JSON_PROPERTY_FRM_ROUTING_ALGORITHM,
  MerchantAccountCreate.JSON_PROPERTY_ORGANIZATION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class MerchantAccountCreate {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_DETAILS = "merchant_details";
  private JsonNullable<MerchantDetails> merchantDetails = JsonNullable.<MerchantDetails>undefined();

  public static final String JSON_PROPERTY_RETURN_URL = "return_url";
  private JsonNullable<String> returnUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_DETAILS = "webhook_details";
  private JsonNullable<WebhookDetails> webhookDetails = JsonNullable.<WebhookDetails>undefined();

  public static final String JSON_PROPERTY_ROUTING_ALGORITHM = "routing_algorithm";
  private JsonNullable<Object> routingAlgorithm = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_PAYOUT_ROUTING_ALGORITHM = "payout_routing_algorithm";
  private JsonNullable<RoutingAlgorithm> payoutRoutingAlgorithm = JsonNullable.<RoutingAlgorithm>undefined();

  public static final String JSON_PROPERTY_SUB_MERCHANTS_ENABLED = "sub_merchants_enabled";
  private JsonNullable<Boolean> subMerchantsEnabled = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_PARENT_MERCHANT_ID = "parent_merchant_id";
  private JsonNullable<String> parentMerchantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLE_PAYMENT_RESPONSE_HASH = "enable_payment_response_hash";
  private JsonNullable<Boolean> enablePaymentResponseHash = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_PAYMENT_RESPONSE_HASH_KEY = "payment_response_hash_key";
  private JsonNullable<String> paymentResponseHashKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REDIRECT_TO_MERCHANT_WITH_HTTP_POST = "redirect_to_merchant_with_http_post";
  private JsonNullable<Boolean> redirectToMerchantWithHttpPost = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_PUBLISHABLE_KEY = "publishable_key";
  private JsonNullable<String> publishableKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCKER_ID = "locker_id";
  private JsonNullable<String> lockerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_BUSINESS_DETAILS = "primary_business_details";
  private JsonNullable<PrimaryBusinessDetails> primaryBusinessDetails = JsonNullable.<PrimaryBusinessDetails>undefined();

  public static final String JSON_PROPERTY_FRM_ROUTING_ALGORITHM = "frm_routing_algorithm";
  private JsonNullable<Object> frmRoutingAlgorithm = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private JsonNullable<String> organizationId = JsonNullable.<String>undefined();

  public MerchantAccountCreate() {
  }

  public MerchantAccountCreate merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The identifier for the Merchant Account
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


  public MerchantAccountCreate merchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
    
    return this;
  }

   /**
   * Name of the Merchant Account
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantName() {
        return merchantName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantName_JsonNullable() {
    return merchantName;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  public void setMerchantName_JsonNullable(JsonNullable<String> merchantName) {
    this.merchantName = merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
  }


  public MerchantAccountCreate merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = JsonNullable.<MerchantDetails>of(merchantDetails);
    
    return this;
  }

   /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantDetails getMerchantDetails() {
        return merchantDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantDetails> getMerchantDetails_JsonNullable() {
    return merchantDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  public void setMerchantDetails_JsonNullable(JsonNullable<MerchantDetails> merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = JsonNullable.<MerchantDetails>of(merchantDetails);
  }


  public MerchantAccountCreate returnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
    
    return this;
  }

   /**
   * The URL to redirect after the completion of the operation
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReturnUrl() {
        return returnUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReturnUrl_JsonNullable() {
    return returnUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  public void setReturnUrl_JsonNullable(JsonNullable<String> returnUrl) {
    this.returnUrl = returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
  }


  public MerchantAccountCreate webhookDetails(WebhookDetails webhookDetails) {
    this.webhookDetails = JsonNullable.<WebhookDetails>of(webhookDetails);
    
    return this;
  }

   /**
   * Get webhookDetails
   * @return webhookDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WebhookDetails getWebhookDetails() {
        return webhookDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WebhookDetails> getWebhookDetails_JsonNullable() {
    return webhookDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_DETAILS)
  public void setWebhookDetails_JsonNullable(JsonNullable<WebhookDetails> webhookDetails) {
    this.webhookDetails = webhookDetails;
  }

  public void setWebhookDetails(WebhookDetails webhookDetails) {
    this.webhookDetails = JsonNullable.<WebhookDetails>of(webhookDetails);
  }


  public MerchantAccountCreate routingAlgorithm(Object routingAlgorithm) {
    this.routingAlgorithm = JsonNullable.<Object>of(routingAlgorithm);
    
    return this;
  }

   /**
   * The routing algorithm to be used for routing payments to desired connectors
   * @return routingAlgorithm
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRoutingAlgorithm() {
        return routingAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROUTING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRoutingAlgorithm_JsonNullable() {
    return routingAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_ROUTING_ALGORITHM)
  public void setRoutingAlgorithm_JsonNullable(JsonNullable<Object> routingAlgorithm) {
    this.routingAlgorithm = routingAlgorithm;
  }

  public void setRoutingAlgorithm(Object routingAlgorithm) {
    this.routingAlgorithm = JsonNullable.<Object>of(routingAlgorithm);
  }


  public MerchantAccountCreate payoutRoutingAlgorithm(RoutingAlgorithm payoutRoutingAlgorithm) {
    this.payoutRoutingAlgorithm = JsonNullable.<RoutingAlgorithm>of(payoutRoutingAlgorithm);
    
    return this;
  }

   /**
   * Get payoutRoutingAlgorithm
   * @return payoutRoutingAlgorithm
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public RoutingAlgorithm getPayoutRoutingAlgorithm() {
        return payoutRoutingAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_ROUTING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RoutingAlgorithm> getPayoutRoutingAlgorithm_JsonNullable() {
    return payoutRoutingAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYOUT_ROUTING_ALGORITHM)
  public void setPayoutRoutingAlgorithm_JsonNullable(JsonNullable<RoutingAlgorithm> payoutRoutingAlgorithm) {
    this.payoutRoutingAlgorithm = payoutRoutingAlgorithm;
  }

  public void setPayoutRoutingAlgorithm(RoutingAlgorithm payoutRoutingAlgorithm) {
    this.payoutRoutingAlgorithm = JsonNullable.<RoutingAlgorithm>of(payoutRoutingAlgorithm);
  }


  public MerchantAccountCreate subMerchantsEnabled(Boolean subMerchantsEnabled) {
    this.subMerchantsEnabled = JsonNullable.<Boolean>of(subMerchantsEnabled);
    
    return this;
  }

   /**
   * A boolean value to indicate if the merchant is a sub-merchant under a master or a parent merchant. By default, its value is false.
   * @return subMerchantsEnabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getSubMerchantsEnabled() {
        return subMerchantsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_MERCHANTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSubMerchantsEnabled_JsonNullable() {
    return subMerchantsEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_MERCHANTS_ENABLED)
  public void setSubMerchantsEnabled_JsonNullable(JsonNullable<Boolean> subMerchantsEnabled) {
    this.subMerchantsEnabled = subMerchantsEnabled;
  }

  public void setSubMerchantsEnabled(Boolean subMerchantsEnabled) {
    this.subMerchantsEnabled = JsonNullable.<Boolean>of(subMerchantsEnabled);
  }


  public MerchantAccountCreate parentMerchantId(String parentMerchantId) {
    this.parentMerchantId = JsonNullable.<String>of(parentMerchantId);
    
    return this;
  }

   /**
   * Refers to the Parent Merchant ID if the merchant being created is a sub-merchant
   * @return parentMerchantId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getParentMerchantId() {
        return parentMerchantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentMerchantId_JsonNullable() {
    return parentMerchantId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_MERCHANT_ID)
  public void setParentMerchantId_JsonNullable(JsonNullable<String> parentMerchantId) {
    this.parentMerchantId = parentMerchantId;
  }

  public void setParentMerchantId(String parentMerchantId) {
    this.parentMerchantId = JsonNullable.<String>of(parentMerchantId);
  }


  public MerchantAccountCreate enablePaymentResponseHash(Boolean enablePaymentResponseHash) {
    this.enablePaymentResponseHash = JsonNullable.<Boolean>of(enablePaymentResponseHash);
    
    return this;
  }

   /**
   * A boolean value to indicate if payment response hash needs to be enabled
   * @return enablePaymentResponseHash
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getEnablePaymentResponseHash() {
        return enablePaymentResponseHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLE_PAYMENT_RESPONSE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnablePaymentResponseHash_JsonNullable() {
    return enablePaymentResponseHash;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLE_PAYMENT_RESPONSE_HASH)
  public void setEnablePaymentResponseHash_JsonNullable(JsonNullable<Boolean> enablePaymentResponseHash) {
    this.enablePaymentResponseHash = enablePaymentResponseHash;
  }

  public void setEnablePaymentResponseHash(Boolean enablePaymentResponseHash) {
    this.enablePaymentResponseHash = JsonNullable.<Boolean>of(enablePaymentResponseHash);
  }


  public MerchantAccountCreate paymentResponseHashKey(String paymentResponseHashKey) {
    this.paymentResponseHashKey = JsonNullable.<String>of(paymentResponseHashKey);
    
    return this;
  }

   /**
   * Refers to the hash key used for calculating the signature for webhooks and redirect response If the value is not provided, a default value is used
   * @return paymentResponseHashKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaymentResponseHashKey() {
        return paymentResponseHashKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_RESPONSE_HASH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentResponseHashKey_JsonNullable() {
    return paymentResponseHashKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_RESPONSE_HASH_KEY)
  public void setPaymentResponseHashKey_JsonNullable(JsonNullable<String> paymentResponseHashKey) {
    this.paymentResponseHashKey = paymentResponseHashKey;
  }

  public void setPaymentResponseHashKey(String paymentResponseHashKey) {
    this.paymentResponseHashKey = JsonNullable.<String>of(paymentResponseHashKey);
  }


  public MerchantAccountCreate redirectToMerchantWithHttpPost(Boolean redirectToMerchantWithHttpPost) {
    this.redirectToMerchantWithHttpPost = JsonNullable.<Boolean>of(redirectToMerchantWithHttpPost);
    
    return this;
  }

   /**
   * A boolean value to indicate if redirect to merchant with http post needs to be enabled
   * @return redirectToMerchantWithHttpPost
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getRedirectToMerchantWithHttpPost() {
        return redirectToMerchantWithHttpPost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_MERCHANT_WITH_HTTP_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getRedirectToMerchantWithHttpPost_JsonNullable() {
    return redirectToMerchantWithHttpPost;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_MERCHANT_WITH_HTTP_POST)
  public void setRedirectToMerchantWithHttpPost_JsonNullable(JsonNullable<Boolean> redirectToMerchantWithHttpPost) {
    this.redirectToMerchantWithHttpPost = redirectToMerchantWithHttpPost;
  }

  public void setRedirectToMerchantWithHttpPost(Boolean redirectToMerchantWithHttpPost) {
    this.redirectToMerchantWithHttpPost = JsonNullable.<Boolean>of(redirectToMerchantWithHttpPost);
  }


  public MerchantAccountCreate metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object.
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


  public MerchantAccountCreate publishableKey(String publishableKey) {
    this.publishableKey = JsonNullable.<String>of(publishableKey);
    
    return this;
  }

   /**
   * API key that will be used for server side API access
   * @return publishableKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPublishableKey() {
        return publishableKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLISHABLE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPublishableKey_JsonNullable() {
    return publishableKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLISHABLE_KEY)
  public void setPublishableKey_JsonNullable(JsonNullable<String> publishableKey) {
    this.publishableKey = publishableKey;
  }

  public void setPublishableKey(String publishableKey) {
    this.publishableKey = JsonNullable.<String>of(publishableKey);
  }


  public MerchantAccountCreate lockerId(String lockerId) {
    this.lockerId = JsonNullable.<String>of(lockerId);
    
    return this;
  }

   /**
   * An identifier for the vault used to store payment method information.
   * @return lockerId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLockerId() {
        return lockerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLockerId_JsonNullable() {
    return lockerId;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKER_ID)
  public void setLockerId_JsonNullable(JsonNullable<String> lockerId) {
    this.lockerId = lockerId;
  }

  public void setLockerId(String lockerId) {
    this.lockerId = JsonNullable.<String>of(lockerId);
  }


  public MerchantAccountCreate primaryBusinessDetails(PrimaryBusinessDetails primaryBusinessDetails) {
    this.primaryBusinessDetails = JsonNullable.<PrimaryBusinessDetails>of(primaryBusinessDetails);
    
    return this;
  }

   /**
   * Get primaryBusinessDetails
   * @return primaryBusinessDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public PrimaryBusinessDetails getPrimaryBusinessDetails() {
        return primaryBusinessDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_BUSINESS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PrimaryBusinessDetails> getPrimaryBusinessDetails_JsonNullable() {
    return primaryBusinessDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_BUSINESS_DETAILS)
  public void setPrimaryBusinessDetails_JsonNullable(JsonNullable<PrimaryBusinessDetails> primaryBusinessDetails) {
    this.primaryBusinessDetails = primaryBusinessDetails;
  }

  public void setPrimaryBusinessDetails(PrimaryBusinessDetails primaryBusinessDetails) {
    this.primaryBusinessDetails = JsonNullable.<PrimaryBusinessDetails>of(primaryBusinessDetails);
  }


  public MerchantAccountCreate frmRoutingAlgorithm(Object frmRoutingAlgorithm) {
    this.frmRoutingAlgorithm = JsonNullable.<Object>of(frmRoutingAlgorithm);
    
    return this;
  }

   /**
   * The frm routing algorithm to be used for routing payments to desired FRM&#39;s
   * @return frmRoutingAlgorithm
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFrmRoutingAlgorithm() {
        return frmRoutingAlgorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_ROUTING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFrmRoutingAlgorithm_JsonNullable() {
    return frmRoutingAlgorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_ROUTING_ALGORITHM)
  public void setFrmRoutingAlgorithm_JsonNullable(JsonNullable<Object> frmRoutingAlgorithm) {
    this.frmRoutingAlgorithm = frmRoutingAlgorithm;
  }

  public void setFrmRoutingAlgorithm(Object frmRoutingAlgorithm) {
    this.frmRoutingAlgorithm = JsonNullable.<Object>of(frmRoutingAlgorithm);
  }


  public MerchantAccountCreate organizationId(String organizationId) {
    this.organizationId = JsonNullable.<String>of(organizationId);
    
    return this;
  }

   /**
   * The id of the organization to which the merchant belongs to
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOrganizationId() {
        return organizationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganizationId_JsonNullable() {
    return organizationId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  public void setOrganizationId_JsonNullable(JsonNullable<String> organizationId) {
    this.organizationId = organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = JsonNullable.<String>of(organizationId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAccountCreate merchantAccountCreate = (MerchantAccountCreate) o;
    return Objects.equals(this.merchantId, merchantAccountCreate.merchantId) &&
        equalsNullable(this.merchantName, merchantAccountCreate.merchantName) &&
        equalsNullable(this.merchantDetails, merchantAccountCreate.merchantDetails) &&
        equalsNullable(this.returnUrl, merchantAccountCreate.returnUrl) &&
        equalsNullable(this.webhookDetails, merchantAccountCreate.webhookDetails) &&
        equalsNullable(this.routingAlgorithm, merchantAccountCreate.routingAlgorithm) &&
        equalsNullable(this.payoutRoutingAlgorithm, merchantAccountCreate.payoutRoutingAlgorithm) &&
        equalsNullable(this.subMerchantsEnabled, merchantAccountCreate.subMerchantsEnabled) &&
        equalsNullable(this.parentMerchantId, merchantAccountCreate.parentMerchantId) &&
        equalsNullable(this.enablePaymentResponseHash, merchantAccountCreate.enablePaymentResponseHash) &&
        equalsNullable(this.paymentResponseHashKey, merchantAccountCreate.paymentResponseHashKey) &&
        equalsNullable(this.redirectToMerchantWithHttpPost, merchantAccountCreate.redirectToMerchantWithHttpPost) &&
        equalsNullable(this.metadata, merchantAccountCreate.metadata) &&
        equalsNullable(this.publishableKey, merchantAccountCreate.publishableKey) &&
        equalsNullable(this.lockerId, merchantAccountCreate.lockerId) &&
        equalsNullable(this.primaryBusinessDetails, merchantAccountCreate.primaryBusinessDetails) &&
        equalsNullable(this.frmRoutingAlgorithm, merchantAccountCreate.frmRoutingAlgorithm) &&
        equalsNullable(this.organizationId, merchantAccountCreate.organizationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, hashCodeNullable(merchantName), hashCodeNullable(merchantDetails), hashCodeNullable(returnUrl), hashCodeNullable(webhookDetails), hashCodeNullable(routingAlgorithm), hashCodeNullable(payoutRoutingAlgorithm), hashCodeNullable(subMerchantsEnabled), hashCodeNullable(parentMerchantId), hashCodeNullable(enablePaymentResponseHash), hashCodeNullable(paymentResponseHashKey), hashCodeNullable(redirectToMerchantWithHttpPost), hashCodeNullable(metadata), hashCodeNullable(publishableKey), hashCodeNullable(lockerId), hashCodeNullable(primaryBusinessDetails), hashCodeNullable(frmRoutingAlgorithm), hashCodeNullable(organizationId));
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
    sb.append("class MerchantAccountCreate {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    webhookDetails: ").append(toIndentedString(webhookDetails)).append("\n");
    sb.append("    routingAlgorithm: ").append(toIndentedString(routingAlgorithm)).append("\n");
    sb.append("    payoutRoutingAlgorithm: ").append(toIndentedString(payoutRoutingAlgorithm)).append("\n");
    sb.append("    subMerchantsEnabled: ").append(toIndentedString(subMerchantsEnabled)).append("\n");
    sb.append("    parentMerchantId: ").append(toIndentedString(parentMerchantId)).append("\n");
    sb.append("    enablePaymentResponseHash: ").append(toIndentedString(enablePaymentResponseHash)).append("\n");
    sb.append("    paymentResponseHashKey: ").append(toIndentedString(paymentResponseHashKey)).append("\n");
    sb.append("    redirectToMerchantWithHttpPost: ").append(toIndentedString(redirectToMerchantWithHttpPost)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    publishableKey: ").append(toIndentedString(publishableKey)).append("\n");
    sb.append("    lockerId: ").append(toIndentedString(lockerId)).append("\n");
    sb.append("    primaryBusinessDetails: ").append(toIndentedString(primaryBusinessDetails)).append("\n");
    sb.append("    frmRoutingAlgorithm: ").append(toIndentedString(frmRoutingAlgorithm)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

