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


package com.twitter.clientlib.auth;

import java.util.HashSet;
import java.util.Set;

import com.github.scribejava.core.model.OAuth2AccessToken;

import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.auth.TwitterOAuth20AppOnlyService;
import com.twitter.clientlib.model.ResourceUnauthorizedProblem;
import com.twitter.clientlib.model.Get2TweetsIdResponse;

/**
* This is an example of getting an OAuth2 bearer boken (app-only) and using it to call an API.
* It's expected to set the TWITTER_CONSUMER_KEY & TWITTER_CONSUMER_SECRET variables in TwitterOAuth20AppOnlyService.
*
* Example steps:
* 1. Set the TwitterOAuth20AppOnlyService with TWITTER_CONSUMER_KEY & TWITTER_CONSUMER_SECRET.
* 2. Get the Bearer token by calling the getAccessTokenClientCredentialsGrant().
* 3. After receiving the access token, setting its value into TwitterCredentialsBearer.
* 4. Call the API.
*/

public class OAuth20AppOnlyGetAccessToken {

  public static void main(String[] args) {
    OAuth20AppOnlyGetAccessToken example = new OAuth20AppOnlyGetAccessToken();

    OAuth2AccessToken accessToken = example.getAccessToken();
    if (accessToken == null) {
      return;
    }

    // Setting the bearer token into TwitterCredentials
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(accessToken.getAccessToken());
    example.callApi(credentials);
  }

  public OAuth2AccessToken getAccessToken() {
    TwitterOAuth20AppOnlyService service = new TwitterOAuth20AppOnlyService(
        System.getenv("TWITTER_CONSUMER_KEY"),
        System.getenv("TWITTER_CONSUMER_SECRET"));

    OAuth2AccessToken accessToken = null;
    try {
      accessToken = service.getAccessTokenClientCredentialsGrant();

      System.out.println("Access token: " + accessToken.getAccessToken());
      System.out.println("Token type: " + accessToken.getTokenType());
    } catch (Exception e) {
      System.err.println("Error while getting the access token:\n " + e);
      e.printStackTrace();
    }
    return accessToken;
  }

  public void callApi(TwitterCredentialsBearer credentials) {
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
      // findTweetById
      Get2TweetsIdResponse result = apiInstance.tweets().findTweetById("20")
        .tweetFields(tweetFields)
        .execute();
      if (result.getErrors() != null && result.getErrors().size() > 0) {
        System.out.println("Error:");
        result.getErrors().forEach(e -> {
          System.out.println(e.toString());
          if (e instanceof ResourceUnauthorizedProblem) {
            System.out.println(
                ((ResourceUnauthorizedProblem) e).getTitle() + " " + ((ResourceUnauthorizedProblem) e).getDetail());
          }
        });
      } else {
        System.out.println("findTweetById - Tweet Text: " + result.toString());
      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
