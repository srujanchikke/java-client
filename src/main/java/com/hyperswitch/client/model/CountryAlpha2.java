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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CountryAlpha2
 */
public enum CountryAlpha2 {
  
  AF("AF"),
  
  AX("AX"),
  
  AL("AL"),
  
  DZ("DZ"),
  
  AS("AS"),
  
  AD("AD"),
  
  AO("AO"),
  
  AI("AI"),
  
  AQ("AQ"),
  
  AG("AG"),
  
  AR("AR"),
  
  AM("AM"),
  
  AW("AW"),
  
  AU("AU"),
  
  AT("AT"),
  
  AZ("AZ"),
  
  BS("BS"),
  
  BH("BH"),
  
  BD("BD"),
  
  BB("BB"),
  
  BY("BY"),
  
  BE("BE"),
  
  BZ("BZ"),
  
  BJ("BJ"),
  
  BM("BM"),
  
  BT("BT"),
  
  BO("BO"),
  
  BQ("BQ"),
  
  BA("BA"),
  
  BW("BW"),
  
  BV("BV"),
  
  BR("BR"),
  
  IO("IO"),
  
  BN("BN"),
  
  BG("BG"),
  
  BF("BF"),
  
  BI("BI"),
  
  KH("KH"),
  
  CM("CM"),
  
  CA("CA"),
  
  CV("CV"),
  
  KY("KY"),
  
  CF("CF"),
  
  TD("TD"),
  
  CL("CL"),
  
  CN("CN"),
  
  CX("CX"),
  
  CC("CC"),
  
  CO("CO"),
  
  KM("KM"),
  
  CG("CG"),
  
  CD("CD"),
  
  CK("CK"),
  
  CR("CR"),
  
  CI("CI"),
  
  HR("HR"),
  
  CU("CU"),
  
  CW("CW"),
  
  CY("CY"),
  
  CZ("CZ"),
  
  DK("DK"),
  
  DJ("DJ"),
  
  DM("DM"),
  
  DO("DO"),
  
  EC("EC"),
  
  EG("EG"),
  
  SV("SV"),
  
  GQ("GQ"),
  
  ER("ER"),
  
  EE("EE"),
  
  ET("ET"),
  
  FK("FK"),
  
  FO("FO"),
  
  FJ("FJ"),
  
  FI("FI"),
  
  FR("FR"),
  
  GF("GF"),
  
  PF("PF"),
  
  TF("TF"),
  
  GA("GA"),
  
  GM("GM"),
  
  GE("GE"),
  
  DE("DE"),
  
  GH("GH"),
  
  GI("GI"),
  
  GR("GR"),
  
  GL("GL"),
  
  GD("GD"),
  
  GP("GP"),
  
  GU("GU"),
  
  GT("GT"),
  
  GG("GG"),
  
  GN("GN"),
  
  GW("GW"),
  
  GY("GY"),
  
  HT("HT"),
  
  HM("HM"),
  
  VA("VA"),
  
  HN("HN"),
  
  HK("HK"),
  
  HU("HU"),
  
  IS("IS"),
  
  IN("IN"),
  
  ID("ID"),
  
  IR("IR"),
  
  IQ("IQ"),
  
  IE("IE"),
  
  IM("IM"),
  
  IL("IL"),
  
  IT("IT"),
  
  JM("JM"),
  
  JP("JP"),
  
  JE("JE"),
  
  JO("JO"),
  
  KZ("KZ"),
  
  KE("KE"),
  
  KI("KI"),
  
  KP("KP"),
  
  KR("KR"),
  
  KW("KW"),
  
  KG("KG"),
  
  LA("LA"),
  
  LV("LV"),
  
  LB("LB"),
  
  LS("LS"),
  
  LR("LR"),
  
  LY("LY"),
  
  LI("LI"),
  
  LT("LT"),
  
  LU("LU"),
  
  MO("MO"),
  
  MK("MK"),
  
  MG("MG"),
  
  MW("MW"),
  
  MY("MY"),
  
  MV("MV"),
  
  ML("ML"),
  
  MT("MT"),
  
  MH("MH"),
  
  MQ("MQ"),
  
  MR("MR"),
  
  MU("MU"),
  
  YT("YT"),
  
  MX("MX"),
  
  FM("FM"),
  
  MD("MD"),
  
  MC("MC"),
  
  MN("MN"),
  
  ME("ME"),
  
  MS("MS"),
  
  MA("MA"),
  
  MZ("MZ"),
  
  MM("MM"),
  
  NA("NA"),
  
  NR("NR"),
  
  NP("NP"),
  
  NL("NL"),
  
  NC("NC"),
  
  NZ("NZ"),
  
  NI("NI"),
  
  NE("NE"),
  
  NG("NG"),
  
  NU("NU"),
  
  NF("NF"),
  
  MP("MP"),
  
  NO("NO"),
  
  OM("OM"),
  
  PK("PK"),
  
  PW("PW"),
  
  PS("PS"),
  
  PA("PA"),
  
  PG("PG"),
  
  PY("PY"),
  
  PE("PE"),
  
  PH("PH"),
  
  PN("PN"),
  
  PL("PL"),
  
  PT("PT"),
  
  PR("PR"),
  
  QA("QA"),
  
  RE("RE"),
  
  RO("RO"),
  
  RU("RU"),
  
  RW("RW"),
  
  BL("BL"),
  
  SH("SH"),
  
  KN("KN"),
  
  LC("LC"),
  
  MF("MF"),
  
  PM("PM"),
  
  VC("VC"),
  
  WS("WS"),
  
  SM("SM"),
  
  ST("ST"),
  
  SA("SA"),
  
  SN("SN"),
  
  RS("RS"),
  
  SC("SC"),
  
  SL("SL"),
  
  SG("SG"),
  
  SX("SX"),
  
  SK("SK"),
  
  SI("SI"),
  
  SB("SB"),
  
  SO("SO"),
  
  ZA("ZA"),
  
  GS("GS"),
  
  SS("SS"),
  
  ES("ES"),
  
  LK("LK"),
  
  SD("SD"),
  
  SR("SR"),
  
  SJ("SJ"),
  
  SZ("SZ"),
  
  SE("SE"),
  
  CH("CH"),
  
  SY("SY"),
  
  TW("TW"),
  
  TJ("TJ"),
  
  TZ("TZ"),
  
  TH("TH"),
  
  TL("TL"),
  
  TG("TG"),
  
  TK("TK"),
  
  TO("TO"),
  
  TT("TT"),
  
  TN("TN"),
  
  TR("TR"),
  
  TM("TM"),
  
  TC("TC"),
  
  TV("TV"),
  
  UG("UG"),
  
  UA("UA"),
  
  AE("AE"),
  
  GB("GB"),
  
  UM("UM"),
  
  UY("UY"),
  
  UZ("UZ"),
  
  VU("VU"),
  
  VE("VE"),
  
  VN("VN"),
  
  VG("VG"),
  
  VI("VI"),
  
  WF("WF"),
  
  EH("EH"),
  
  YE("YE"),
  
  ZM("ZM"),
  
  ZW("ZW"),
  
  US("US");

  private String value;

  CountryAlpha2(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CountryAlpha2 fromValue(String value) {
    for (CountryAlpha2 b : CountryAlpha2.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

