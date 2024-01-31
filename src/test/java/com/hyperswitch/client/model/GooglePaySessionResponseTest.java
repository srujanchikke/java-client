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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.hyperswitch.client.model.GpayAllowedPaymentMethods;
import com.hyperswitch.client.model.GpayMerchantInfo;
import com.hyperswitch.client.model.GpayTransactionInfo;
import com.hyperswitch.client.model.SdkNextAction;
import com.hyperswitch.client.model.SecretInfoToInitiateSdk;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * Model tests for GooglePaySessionResponse
 */
class GooglePaySessionResponseTest {
    private final GooglePaySessionResponse model = new GooglePaySessionResponse();

    /**
     * Model tests for GooglePaySessionResponse
     */
    @Test
    void testGooglePaySessionResponse() {
        // TODO: test GooglePaySessionResponse
    }

    /**
     * Test the property 'merchantInfo'
     */
    @Test
    void merchantInfoTest() {
        // TODO: test merchantInfo
    }

    /**
     * Test the property 'allowedPaymentMethods'
     */
    @Test
    void allowedPaymentMethodsTest() {
        // TODO: test allowedPaymentMethods
    }

    /**
     * Test the property 'transactionInfo'
     */
    @Test
    void transactionInfoTest() {
        // TODO: test transactionInfo
    }

    /**
     * Test the property 'delayedSessionToken'
     */
    @Test
    void delayedSessionTokenTest() {
        // TODO: test delayedSessionToken
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'sdkNextAction'
     */
    @Test
    void sdkNextActionTest() {
        // TODO: test sdkNextAction
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    void secretsTest() {
        // TODO: test secrets
    }

}
