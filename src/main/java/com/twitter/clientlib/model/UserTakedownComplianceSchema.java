/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.UserComplianceSchemaUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * UserTakedownComplianceSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserTakedownComplianceSchema {
  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserComplianceSchemaUser user;

  public static final String SERIALIZED_NAME_WITHHELD_IN_COUNTRIES = "withheld_in_countries";
  @SerializedName(SERIALIZED_NAME_WITHHELD_IN_COUNTRIES)
  private List<String> withheldInCountries = new ArrayList<>();

  public UserTakedownComplianceSchema() { 
  }

  public UserTakedownComplianceSchema eventAt(OffsetDateTime eventAt) {
    
    this.eventAt = eventAt;
    return this;
  }

   /**
   * Event time.
   * @return eventAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-07-06T18:40:40Z", required = true, value = "Event time.")

  public OffsetDateTime getEventAt() {
    return eventAt;
  }


  public void setEventAt(OffsetDateTime eventAt) {
    this.eventAt = eventAt;
  }


  public UserTakedownComplianceSchema user(UserComplianceSchemaUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserComplianceSchemaUser getUser() {
    return user;
  }


  public void setUser(UserComplianceSchemaUser user) {
    this.user = user;
  }


  public UserTakedownComplianceSchema withheldInCountries(List<String> withheldInCountries) {
    
    this.withheldInCountries = withheldInCountries;
    return this;
  }

  public UserTakedownComplianceSchema addWithheldInCountriesItem(String withheldInCountriesItem) {
    this.withheldInCountries.add(withheldInCountriesItem);
    return this;
  }

   /**
   * Get withheldInCountries
   * @return withheldInCountries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getWithheldInCountries() {
    return withheldInCountries;
  }


  public void setWithheldInCountries(List<String> withheldInCountries) {
    this.withheldInCountries = withheldInCountries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTakedownComplianceSchema userTakedownComplianceSchema = (UserTakedownComplianceSchema) o;
    return Objects.equals(this.eventAt, userTakedownComplianceSchema.eventAt) &&
        Objects.equals(this.user, userTakedownComplianceSchema.user) &&
        Objects.equals(this.withheldInCountries, userTakedownComplianceSchema.withheldInCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAt, user, withheldInCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTakedownComplianceSchema {\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    withheldInCountries: ").append(toIndentedString(withheldInCountries)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("event_at");
    openapiFields.add("user");
    openapiFields.add("withheld_in_countries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_at");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("withheld_in_countries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserTakedownComplianceSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (UserTakedownComplianceSchema.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in UserTakedownComplianceSchema is not found in the empty JSON string", UserTakedownComplianceSchema.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserTakedownComplianceSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        UserComplianceSchemaUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      // ensure the json data is an array
      if (jsonObj.get("withheld_in_countries") != null && !jsonObj.get("withheld_in_countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `withheld_in_countries` to be an array in the JSON string but got `%s`", jsonObj.get("withheld_in_countries").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserTakedownComplianceSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserTakedownComplianceSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserTakedownComplianceSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserTakedownComplianceSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UserTakedownComplianceSchema>() {
           @Override
           public void write(JsonWriter out, UserTakedownComplianceSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserTakedownComplianceSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserTakedownComplianceSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserTakedownComplianceSchema
  * @throws IOException if the JSON string is invalid with respect to UserTakedownComplianceSchema
  */
  public static UserTakedownComplianceSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserTakedownComplianceSchema.class);
  }

 /**
  * Convert an instance of UserTakedownComplianceSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
