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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * FilteredStreamingTweetMatchingRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilteredStreamingTweetMatchingRules {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public FilteredStreamingTweetMatchingRules() { 
  }

  public FilteredStreamingTweetMatchingRules id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this rule.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "120897978112909812", required = true, value = "Unique identifier of this rule.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FilteredStreamingTweetMatchingRules tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * The user-supplied tag assigned to the rule which matched
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user-supplied tag assigned to the rule which matched")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteredStreamingTweetMatchingRules filteredStreamingTweetMatchingRules = (FilteredStreamingTweetMatchingRules) o;
    return Objects.equals(this.id, filteredStreamingTweetMatchingRules.id) &&
        Objects.equals(this.tag, filteredStreamingTweetMatchingRules.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteredStreamingTweetMatchingRules {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilteredStreamingTweetMatchingRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (FilteredStreamingTweetMatchingRules.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in FilteredStreamingTweetMatchingRules is not found in the empty JSON string", FilteredStreamingTweetMatchingRules.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilteredStreamingTweetMatchingRules.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilteredStreamingTweetMatchingRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilteredStreamingTweetMatchingRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilteredStreamingTweetMatchingRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilteredStreamingTweetMatchingRules.class));

       return (TypeAdapter<T>) new TypeAdapter<FilteredStreamingTweetMatchingRules>() {
           @Override
           public void write(JsonWriter out, FilteredStreamingTweetMatchingRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilteredStreamingTweetMatchingRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilteredStreamingTweetMatchingRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilteredStreamingTweetMatchingRules
  * @throws IOException if the JSON string is invalid with respect to FilteredStreamingTweetMatchingRules
  */
  public static FilteredStreamingTweetMatchingRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilteredStreamingTweetMatchingRules.class);
  }

 /**
  * Convert an instance of FilteredStreamingTweetMatchingRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
