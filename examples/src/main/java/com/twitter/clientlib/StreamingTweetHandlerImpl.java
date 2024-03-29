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


package com.twitter.clientlib;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.StreamingTweetResponse;

public class StreamingTweetHandlerImpl extends StreamingTweetHandler {
  public StreamingTweetHandlerImpl(TwitterApi apiInstance) {
    super(apiInstance);
  }

  @Override
  public InputStream connectStream() throws ApiException {
    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");
    tweetFields.add("geo");
    Set<String> expansions = new HashSet<>();
    expansions.add("geo.place_id");
    Set<String> placeFields = new HashSet<>();
    placeFields.add("geo");
    placeFields.add("id");
    placeFields.add("name");
    placeFields.add("place_type");

    return this.apiInstance.tweets().sampleStream()
        .backfillMinutes(0)
        .tweetFields(tweetFields).expansions(expansions).placeFields(placeFields)
        .execute();
  }

  @Override
  public void actionOnStreamingObject(StreamingTweetResponse streamingTweet) throws ApiException {
    if(streamingTweet == null) {
      System.err.println("Error: actionOnTweetsStream - streamingTweet is null ");
      return;
    }

    if(streamingTweet.getErrors() != null) {
      streamingTweet.getErrors().forEach(System.out::println);
    } else if (streamingTweet.getData() != null) {
      System.out.println("New streaming tweet: " + streamingTweet.getData().getText());
    }
  }
}
