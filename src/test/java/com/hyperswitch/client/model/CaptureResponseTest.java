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
import com.hyperswitch.client.model.CaptureStatus;
import com.hyperswitch.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * Model tests for CaptureResponse
 */
class CaptureResponseTest {
    private final CaptureResponse model = new CaptureResponse();

    /**
     * Model tests for CaptureResponse
     */
    @Test
    void testCaptureResponse() {
        // TODO: test CaptureResponse
    }

    /**
     * Test the property 'captureId'
     */
    @Test
    void captureIdTest() {
        // TODO: test captureId
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'amount'
     */
    @Test
    void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'currency'
     */
    @Test
    void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'authorizedAttemptId'
     */
    @Test
    void authorizedAttemptIdTest() {
        // TODO: test authorizedAttemptId
    }

    /**
     * Test the property 'connectorCaptureId'
     */
    @Test
    void connectorCaptureIdTest() {
        // TODO: test connectorCaptureId
    }

    /**
     * Test the property 'captureSequence'
     */
    @Test
    void captureSequenceTest() {
        // TODO: test captureSequence
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    void errorMessageTest() {
        // TODO: test errorMessage
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'errorReason'
     */
    @Test
    void errorReasonTest() {
        // TODO: test errorReason
    }

    /**
     * Test the property 'referenceId'
     */
    @Test
    void referenceIdTest() {
        // TODO: test referenceId
    }

}
