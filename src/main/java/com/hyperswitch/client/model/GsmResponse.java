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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GsmResponse
 */
@JsonPropertyOrder({
  GsmResponse.JSON_PROPERTY_CONNECTOR,
  GsmResponse.JSON_PROPERTY_FLOW,
  GsmResponse.JSON_PROPERTY_SUB_FLOW,
  GsmResponse.JSON_PROPERTY_CODE,
  GsmResponse.JSON_PROPERTY_MESSAGE,
  GsmResponse.JSON_PROPERTY_STATUS,
  GsmResponse.JSON_PROPERTY_ROUTER_ERROR,
  GsmResponse.JSON_PROPERTY_DECISION,
  GsmResponse.JSON_PROPERTY_STEP_UP_POSSIBLE,
  GsmResponse.JSON_PROPERTY_UNIFIED_CODE,
  GsmResponse.JSON_PROPERTY_UNIFIED_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class GsmResponse {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_FLOW = "flow";
  private String flow;

  public static final String JSON_PROPERTY_SUB_FLOW = "sub_flow";
  private String subFlow;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ROUTER_ERROR = "router_error";
  private JsonNullable<String> routerError = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DECISION = "decision";
  private String decision;

  public static final String JSON_PROPERTY_STEP_UP_POSSIBLE = "step_up_possible";
  private Boolean stepUpPossible;

  public static final String JSON_PROPERTY_UNIFIED_CODE = "unified_code";
  private JsonNullable<String> unifiedCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_MESSAGE = "unified_message";
  private JsonNullable<String> unifiedMessage = JsonNullable.<String>undefined();

  public GsmResponse() {
  }

  public GsmResponse connector(String connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public GsmResponse flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlow() {
    return flow;
  }


  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlow(String flow) {
    this.flow = flow;
  }


  public GsmResponse subFlow(String subFlow) {
    
    this.subFlow = subFlow;
    return this;
  }

   /**
   * Get subFlow
   * @return subFlow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubFlow() {
    return subFlow;
  }


  @JsonProperty(JSON_PROPERTY_SUB_FLOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubFlow(String subFlow) {
    this.subFlow = subFlow;
  }


  public GsmResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public GsmResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public GsmResponse status(String status) {
    
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public GsmResponse routerError(String routerError) {
    this.routerError = JsonNullable.<String>of(routerError);
    
    return this;
  }

   /**
   * Get routerError
   * @return routerError
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRouterError() {
        return routerError.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROUTER_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRouterError_JsonNullable() {
    return routerError;
  }
  
  @JsonProperty(JSON_PROPERTY_ROUTER_ERROR)
  public void setRouterError_JsonNullable(JsonNullable<String> routerError) {
    this.routerError = routerError;
  }

  public void setRouterError(String routerError) {
    this.routerError = JsonNullable.<String>of(routerError);
  }


  public GsmResponse decision(String decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDecision() {
    return decision;
  }


  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDecision(String decision) {
    this.decision = decision;
  }


  public GsmResponse stepUpPossible(Boolean stepUpPossible) {
    
    this.stepUpPossible = stepUpPossible;
    return this;
  }

   /**
   * Get stepUpPossible
   * @return stepUpPossible
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STEP_UP_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStepUpPossible() {
    return stepUpPossible;
  }


  @JsonProperty(JSON_PROPERTY_STEP_UP_POSSIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStepUpPossible(Boolean stepUpPossible) {
    this.stepUpPossible = stepUpPossible;
  }


  public GsmResponse unifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
    
    return this;
  }

   /**
   * Get unifiedCode
   * @return unifiedCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedCode() {
        return unifiedCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedCode_JsonNullable() {
    return unifiedCode;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  public void setUnifiedCode_JsonNullable(JsonNullable<String> unifiedCode) {
    this.unifiedCode = unifiedCode;
  }

  public void setUnifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
  }


  public GsmResponse unifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
    
    return this;
  }

   /**
   * Get unifiedMessage
   * @return unifiedMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedMessage() {
        return unifiedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedMessage_JsonNullable() {
    return unifiedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  public void setUnifiedMessage_JsonNullable(JsonNullable<String> unifiedMessage) {
    this.unifiedMessage = unifiedMessage;
  }

  public void setUnifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GsmResponse gsmResponse = (GsmResponse) o;
    return Objects.equals(this.connector, gsmResponse.connector) &&
        Objects.equals(this.flow, gsmResponse.flow) &&
        Objects.equals(this.subFlow, gsmResponse.subFlow) &&
        Objects.equals(this.code, gsmResponse.code) &&
        Objects.equals(this.message, gsmResponse.message) &&
        Objects.equals(this.status, gsmResponse.status) &&
        equalsNullable(this.routerError, gsmResponse.routerError) &&
        Objects.equals(this.decision, gsmResponse.decision) &&
        Objects.equals(this.stepUpPossible, gsmResponse.stepUpPossible) &&
        equalsNullable(this.unifiedCode, gsmResponse.unifiedCode) &&
        equalsNullable(this.unifiedMessage, gsmResponse.unifiedMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, flow, subFlow, code, message, status, hashCodeNullable(routerError), decision, stepUpPossible, hashCodeNullable(unifiedCode), hashCodeNullable(unifiedMessage));
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
    sb.append("class GsmResponse {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    subFlow: ").append(toIndentedString(subFlow)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    routerError: ").append(toIndentedString(routerError)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    stepUpPossible: ").append(toIndentedString(stepUpPossible)).append("\n");
    sb.append("    unifiedCode: ").append(toIndentedString(unifiedCode)).append("\n");
    sb.append("    unifiedMessage: ").append(toIndentedString(unifiedMessage)).append("\n");
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

