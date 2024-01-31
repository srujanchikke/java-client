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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.hyperswitch.client.model.ConnectorStatus;
import com.hyperswitch.client.model.ConnectorType;
import com.hyperswitch.client.model.CountryAlpha2;
import com.hyperswitch.client.model.FrmConfigs;
import com.hyperswitch.client.model.MerchantConnectorWebhookDetails;
import com.hyperswitch.client.model.PaymentMethodsEnabled;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Response of creating a new Merchant Connector for the merchant account.\&quot;
 */
@JsonPropertyOrder({
  MerchantConnectorResponse.JSON_PROPERTY_CONNECTOR_TYPE,
  MerchantConnectorResponse.JSON_PROPERTY_CONNECTOR_NAME,
  MerchantConnectorResponse.JSON_PROPERTY_CONNECTOR_LABEL,
  MerchantConnectorResponse.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  MerchantConnectorResponse.JSON_PROPERTY_CONNECTOR_ACCOUNT_DETAILS,
  MerchantConnectorResponse.JSON_PROPERTY_TEST_MODE,
  MerchantConnectorResponse.JSON_PROPERTY_DISABLED,
  MerchantConnectorResponse.JSON_PROPERTY_PAYMENT_METHODS_ENABLED,
  MerchantConnectorResponse.JSON_PROPERTY_METADATA,
  MerchantConnectorResponse.JSON_PROPERTY_BUSINESS_COUNTRY,
  MerchantConnectorResponse.JSON_PROPERTY_BUSINESS_LABEL,
  MerchantConnectorResponse.JSON_PROPERTY_BUSINESS_SUB_LABEL,
  MerchantConnectorResponse.JSON_PROPERTY_FRM_CONFIGS,
  MerchantConnectorResponse.JSON_PROPERTY_CONNECTOR_WEBHOOK_DETAILS,
  MerchantConnectorResponse.JSON_PROPERTY_PROFILE_ID,
  MerchantConnectorResponse.JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS,
  MerchantConnectorResponse.JSON_PROPERTY_PM_AUTH_CONFIG,
  MerchantConnectorResponse.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class MerchantConnectorResponse {
  public static final String JSON_PROPERTY_CONNECTOR_TYPE = "connector_type";
  private ConnectorType connectorType;

  public static final String JSON_PROPERTY_CONNECTOR_NAME = "connector_name";
  private String connectorName;

  public static final String JSON_PROPERTY_CONNECTOR_LABEL = "connector_label";
  private JsonNullable<String> connectorLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  private String merchantConnectorId;

  public static final String JSON_PROPERTY_CONNECTOR_ACCOUNT_DETAILS = "connector_account_details";
  private JsonNullable<Object> connectorAccountDetails = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  private JsonNullable<Boolean> testMode = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private JsonNullable<Boolean> disabled = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_PAYMENT_METHODS_ENABLED = "payment_methods_enabled";
  private JsonNullable<List<PaymentMethodsEnabled>> paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_BUSINESS_COUNTRY = "business_country";
  private JsonNullable<CountryAlpha2> businessCountry = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_BUSINESS_LABEL = "business_label";
  private JsonNullable<String> businessLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUSINESS_SUB_LABEL = "business_sub_label";
  private JsonNullable<String> businessSubLabel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FRM_CONFIGS = "frm_configs";
  private JsonNullable<List<FrmConfigs>> frmConfigs = JsonNullable.<List<FrmConfigs>>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_WEBHOOK_DETAILS = "connector_webhook_details";
  private JsonNullable<MerchantConnectorWebhookDetails> connectorWebhookDetails = JsonNullable.<MerchantConnectorWebhookDetails>undefined();

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  private JsonNullable<String> profileId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS = "applepay_verified_domains";
  private JsonNullable<List<String>> applepayVerifiedDomains = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PM_AUTH_CONFIG = "pm_auth_config";
  private JsonNullable<Object> pmAuthConfig = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConnectorStatus status;

  public MerchantConnectorResponse() {
  }

  public MerchantConnectorResponse connectorType(ConnectorType connectorType) {
    
    this.connectorType = connectorType;
    return this;
  }

   /**
   * Get connectorType
   * @return connectorType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorType getConnectorType() {
    return connectorType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorType(ConnectorType connectorType) {
    this.connectorType = connectorType;
  }


  public MerchantConnectorResponse connectorName(String connectorName) {
    
    this.connectorName = connectorName;
    return this;
  }

   /**
   * Name of the Connector
   * @return connectorName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorName() {
    return connectorName;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }


  public MerchantConnectorResponse connectorLabel(String connectorLabel) {
    this.connectorLabel = JsonNullable.<String>of(connectorLabel);
    
    return this;
  }

   /**
   * Connector label for a connector, this can serve as a field to identify the connector as per business details
   * @return connectorLabel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorLabel() {
        return connectorLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorLabel_JsonNullable() {
    return connectorLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_LABEL)
  public void setConnectorLabel_JsonNullable(JsonNullable<String> connectorLabel) {
    this.connectorLabel = connectorLabel;
  }

  public void setConnectorLabel(String connectorLabel) {
    this.connectorLabel = JsonNullable.<String>of(connectorLabel);
  }


  public MerchantConnectorResponse merchantConnectorId(String merchantConnectorId) {
    
    this.merchantConnectorId = merchantConnectorId;
    return this;
  }

   /**
   * Unique ID of the connector
   * @return merchantConnectorId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantConnectorId() {
    return merchantConnectorId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantConnectorId(String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }


  public MerchantConnectorResponse connectorAccountDetails(Object connectorAccountDetails) {
    this.connectorAccountDetails = JsonNullable.<Object>of(connectorAccountDetails);
    
    return this;
  }

   /**
   * Account details of the Connector. You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Useful for storing additional, structured information on an object.
   * @return connectorAccountDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConnectorAccountDetails() {
        return connectorAccountDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_ACCOUNT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConnectorAccountDetails_JsonNullable() {
    return connectorAccountDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_ACCOUNT_DETAILS)
  public void setConnectorAccountDetails_JsonNullable(JsonNullable<Object> connectorAccountDetails) {
    this.connectorAccountDetails = connectorAccountDetails;
  }

  public void setConnectorAccountDetails(Object connectorAccountDetails) {
    this.connectorAccountDetails = JsonNullable.<Object>of(connectorAccountDetails);
  }


  public MerchantConnectorResponse testMode(Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
    
    return this;
  }

   /**
   * A boolean value to indicate if the connector is in Test mode. By default, its value is false.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getTestMode() {
        return testMode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getTestMode_JsonNullable() {
    return testMode;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  public void setTestMode_JsonNullable(JsonNullable<Boolean> testMode) {
    this.testMode = testMode;
  }

  public void setTestMode(Boolean testMode) {
    this.testMode = JsonNullable.<Boolean>of(testMode);
  }


  public MerchantConnectorResponse disabled(Boolean disabled) {
    this.disabled = JsonNullable.<Boolean>of(disabled);
    
    return this;
  }

   /**
   * A boolean value to indicate if the connector is disabled. By default, its value is false.
   * @return disabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getDisabled() {
        return disabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getDisabled_JsonNullable() {
    return disabled;
  }
  
  @JsonProperty(JSON_PROPERTY_DISABLED)
  public void setDisabled_JsonNullable(JsonNullable<Boolean> disabled) {
    this.disabled = disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = JsonNullable.<Boolean>of(disabled);
  }


  public MerchantConnectorResponse paymentMethodsEnabled(List<PaymentMethodsEnabled> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(paymentMethodsEnabled);
    
    return this;
  }

  public MerchantConnectorResponse addPaymentMethodsEnabledItem(PaymentMethodsEnabled paymentMethodsEnabledItem) {
    if (this.paymentMethodsEnabled == null || !this.paymentMethodsEnabled.isPresent()) {
      this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(new ArrayList<>());
    }
    try {
      this.paymentMethodsEnabled.get().add(paymentMethodsEnabledItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Refers to the Parent Merchant ID if the merchant being created is a sub-merchant
   * @return paymentMethodsEnabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PaymentMethodsEnabled> getPaymentMethodsEnabled() {
        return paymentMethodsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PaymentMethodsEnabled>> getPaymentMethodsEnabled_JsonNullable() {
    return paymentMethodsEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS_ENABLED)
  public void setPaymentMethodsEnabled_JsonNullable(JsonNullable<List<PaymentMethodsEnabled>> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = paymentMethodsEnabled;
  }

  public void setPaymentMethodsEnabled(List<PaymentMethodsEnabled> paymentMethodsEnabled) {
    this.paymentMethodsEnabled = JsonNullable.<List<PaymentMethodsEnabled>>of(paymentMethodsEnabled);
  }


  public MerchantConnectorResponse metadata(Object metadata) {
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


  public MerchantConnectorResponse businessCountry(CountryAlpha2 businessCountry) {
    this.businessCountry = JsonNullable.<CountryAlpha2>of(businessCountry);
    
    return this;
  }

   /**
   * Get businessCountry
   * @return businessCountry
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getBusinessCountry() {
        return businessCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getBusinessCountry_JsonNullable() {
    return businessCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_COUNTRY)
  public void setBusinessCountry_JsonNullable(JsonNullable<CountryAlpha2> businessCountry) {
    this.businessCountry = businessCountry;
  }

  public void setBusinessCountry(CountryAlpha2 businessCountry) {
    this.businessCountry = JsonNullable.<CountryAlpha2>of(businessCountry);
  }


  public MerchantConnectorResponse businessLabel(String businessLabel) {
    this.businessLabel = JsonNullable.<String>of(businessLabel);
    
    return this;
  }

   /**
   * Business Type of the merchant
   * @return businessLabel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBusinessLabel() {
        return businessLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessLabel_JsonNullable() {
    return businessLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL)
  public void setBusinessLabel_JsonNullable(JsonNullable<String> businessLabel) {
    this.businessLabel = businessLabel;
  }

  public void setBusinessLabel(String businessLabel) {
    this.businessLabel = JsonNullable.<String>of(businessLabel);
  }


  public MerchantConnectorResponse businessSubLabel(String businessSubLabel) {
    this.businessSubLabel = JsonNullable.<String>of(businessSubLabel);
    
    return this;
  }

   /**
   * Business Sub label of the merchant
   * @return businessSubLabel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBusinessSubLabel() {
        return businessSubLabel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_SUB_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBusinessSubLabel_JsonNullable() {
    return businessSubLabel;
  }
  
  @JsonProperty(JSON_PROPERTY_BUSINESS_SUB_LABEL)
  public void setBusinessSubLabel_JsonNullable(JsonNullable<String> businessSubLabel) {
    this.businessSubLabel = businessSubLabel;
  }

  public void setBusinessSubLabel(String businessSubLabel) {
    this.businessSubLabel = JsonNullable.<String>of(businessSubLabel);
  }


  public MerchantConnectorResponse frmConfigs(List<FrmConfigs> frmConfigs) {
    this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(frmConfigs);
    
    return this;
  }

  public MerchantConnectorResponse addFrmConfigsItem(FrmConfigs frmConfigsItem) {
    if (this.frmConfigs == null || !this.frmConfigs.isPresent()) {
      this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(new ArrayList<>());
    }
    try {
      this.frmConfigs.get().add(frmConfigsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * contains the frm configs for the merchant connector
   * @return frmConfigs
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FrmConfigs> getFrmConfigs() {
        return frmConfigs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRM_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FrmConfigs>> getFrmConfigs_JsonNullable() {
    return frmConfigs;
  }
  
  @JsonProperty(JSON_PROPERTY_FRM_CONFIGS)
  public void setFrmConfigs_JsonNullable(JsonNullable<List<FrmConfigs>> frmConfigs) {
    this.frmConfigs = frmConfigs;
  }

  public void setFrmConfigs(List<FrmConfigs> frmConfigs) {
    this.frmConfigs = JsonNullable.<List<FrmConfigs>>of(frmConfigs);
  }


  public MerchantConnectorResponse connectorWebhookDetails(MerchantConnectorWebhookDetails connectorWebhookDetails) {
    this.connectorWebhookDetails = JsonNullable.<MerchantConnectorWebhookDetails>of(connectorWebhookDetails);
    
    return this;
  }

   /**
   * Get connectorWebhookDetails
   * @return connectorWebhookDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantConnectorWebhookDetails getConnectorWebhookDetails() {
        return connectorWebhookDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_WEBHOOK_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantConnectorWebhookDetails> getConnectorWebhookDetails_JsonNullable() {
    return connectorWebhookDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_WEBHOOK_DETAILS)
  public void setConnectorWebhookDetails_JsonNullable(JsonNullable<MerchantConnectorWebhookDetails> connectorWebhookDetails) {
    this.connectorWebhookDetails = connectorWebhookDetails;
  }

  public void setConnectorWebhookDetails(MerchantConnectorWebhookDetails connectorWebhookDetails) {
    this.connectorWebhookDetails = JsonNullable.<MerchantConnectorWebhookDetails>of(connectorWebhookDetails);
  }


  public MerchantConnectorResponse profileId(String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
    
    return this;
  }

   /**
   * The business profile this connector must be created in default value from merchant account is taken if not passed
   * @return profileId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getProfileId() {
        return profileId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProfileId_JsonNullable() {
    return profileId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  public void setProfileId_JsonNullable(JsonNullable<String> profileId) {
    this.profileId = profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
  }


  public MerchantConnectorResponse applepayVerifiedDomains(List<String> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = JsonNullable.<List<String>>of(applepayVerifiedDomains);
    
    return this;
  }

  public MerchantConnectorResponse addApplepayVerifiedDomainsItem(String applepayVerifiedDomainsItem) {
    if (this.applepayVerifiedDomains == null || !this.applepayVerifiedDomains.isPresent()) {
      this.applepayVerifiedDomains = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.applepayVerifiedDomains.get().add(applepayVerifiedDomainsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * identifier for the verified domains of a particular connector account
   * @return applepayVerifiedDomains
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getApplepayVerifiedDomains() {
        return applepayVerifiedDomains.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getApplepayVerifiedDomains_JsonNullable() {
    return applepayVerifiedDomains;
  }
  
  @JsonProperty(JSON_PROPERTY_APPLEPAY_VERIFIED_DOMAINS)
  public void setApplepayVerifiedDomains_JsonNullable(JsonNullable<List<String>> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = applepayVerifiedDomains;
  }

  public void setApplepayVerifiedDomains(List<String> applepayVerifiedDomains) {
    this.applepayVerifiedDomains = JsonNullable.<List<String>>of(applepayVerifiedDomains);
  }


  public MerchantConnectorResponse pmAuthConfig(Object pmAuthConfig) {
    this.pmAuthConfig = JsonNullable.<Object>of(pmAuthConfig);
    
    return this;
  }

   /**
   * Get pmAuthConfig
   * @return pmAuthConfig
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPmAuthConfig() {
        return pmAuthConfig.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PM_AUTH_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPmAuthConfig_JsonNullable() {
    return pmAuthConfig;
  }
  
  @JsonProperty(JSON_PROPERTY_PM_AUTH_CONFIG)
  public void setPmAuthConfig_JsonNullable(JsonNullable<Object> pmAuthConfig) {
    this.pmAuthConfig = pmAuthConfig;
  }

  public void setPmAuthConfig(Object pmAuthConfig) {
    this.pmAuthConfig = JsonNullable.<Object>of(pmAuthConfig);
  }


  public MerchantConnectorResponse status(ConnectorStatus status) {
    
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

  public ConnectorStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ConnectorStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantConnectorResponse merchantConnectorResponse = (MerchantConnectorResponse) o;
    return Objects.equals(this.connectorType, merchantConnectorResponse.connectorType) &&
        Objects.equals(this.connectorName, merchantConnectorResponse.connectorName) &&
        equalsNullable(this.connectorLabel, merchantConnectorResponse.connectorLabel) &&
        Objects.equals(this.merchantConnectorId, merchantConnectorResponse.merchantConnectorId) &&
        equalsNullable(this.connectorAccountDetails, merchantConnectorResponse.connectorAccountDetails) &&
        equalsNullable(this.testMode, merchantConnectorResponse.testMode) &&
        equalsNullable(this.disabled, merchantConnectorResponse.disabled) &&
        equalsNullable(this.paymentMethodsEnabled, merchantConnectorResponse.paymentMethodsEnabled) &&
        equalsNullable(this.metadata, merchantConnectorResponse.metadata) &&
        equalsNullable(this.businessCountry, merchantConnectorResponse.businessCountry) &&
        equalsNullable(this.businessLabel, merchantConnectorResponse.businessLabel) &&
        equalsNullable(this.businessSubLabel, merchantConnectorResponse.businessSubLabel) &&
        equalsNullable(this.frmConfigs, merchantConnectorResponse.frmConfigs) &&
        equalsNullable(this.connectorWebhookDetails, merchantConnectorResponse.connectorWebhookDetails) &&
        equalsNullable(this.profileId, merchantConnectorResponse.profileId) &&
        equalsNullable(this.applepayVerifiedDomains, merchantConnectorResponse.applepayVerifiedDomains) &&
        equalsNullable(this.pmAuthConfig, merchantConnectorResponse.pmAuthConfig) &&
        Objects.equals(this.status, merchantConnectorResponse.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorType, connectorName, hashCodeNullable(connectorLabel), merchantConnectorId, hashCodeNullable(connectorAccountDetails), hashCodeNullable(testMode), hashCodeNullable(disabled), hashCodeNullable(paymentMethodsEnabled), hashCodeNullable(metadata), hashCodeNullable(businessCountry), hashCodeNullable(businessLabel), hashCodeNullable(businessSubLabel), hashCodeNullable(frmConfigs), hashCodeNullable(connectorWebhookDetails), hashCodeNullable(profileId), hashCodeNullable(applepayVerifiedDomains), hashCodeNullable(pmAuthConfig), status);
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
    sb.append("class MerchantConnectorResponse {\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    connectorLabel: ").append(toIndentedString(connectorLabel)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
    sb.append("    connectorAccountDetails: ").append(toIndentedString(connectorAccountDetails)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    paymentMethodsEnabled: ").append(toIndentedString(paymentMethodsEnabled)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    businessCountry: ").append(toIndentedString(businessCountry)).append("\n");
    sb.append("    businessLabel: ").append(toIndentedString(businessLabel)).append("\n");
    sb.append("    businessSubLabel: ").append(toIndentedString(businessSubLabel)).append("\n");
    sb.append("    frmConfigs: ").append(toIndentedString(frmConfigs)).append("\n");
    sb.append("    connectorWebhookDetails: ").append(toIndentedString(connectorWebhookDetails)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    applepayVerifiedDomains: ").append(toIndentedString(applepayVerifiedDomains)).append("\n");
    sb.append("    pmAuthConfig: ").append(toIndentedString(pmAuthConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

