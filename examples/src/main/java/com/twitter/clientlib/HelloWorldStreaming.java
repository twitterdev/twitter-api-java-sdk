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


import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.*;


public class HelloWorldStreaming {

  public static void main(String[] args) {
    /**
     * Set the credentials for the required APIs.
     * The Java SDK supports TwitterCredentialsOAuth2 & TwitterCredentialsBearer.
     * Check the 'security' tag of the required APIs in https://api.twitter.com/2/openapi.json in order
     * to use the right credential object.
     */
    TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN")));
    try {
      TweetsStreamListenersExecutor tsle = new TweetsStreamListenersExecutor();
      tsle.stream()
          .streamingHandler(new StreamingTweetHandlerImpl(apiInstance))
          .executeListeners();
      while(tsle.getError() == null) {
        try {
          System.out.println("==> sleeping 5 ");
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      if(tsle.getError() != null) {
        System.err.println("==> Ended with error: " + tsle.getError());
      }

//      // Shutdown TweetsStreamListenersExecutor
//      try {
//        Thread.sleep(20000);
//        tsle.shutdown();
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }

//      // An example of how to use the streaming directly using the InputStream result (Without TweetsStreamListenersExecutor)
//      try{
//         JSON json = new JSON();
//         Type localVarReturnType = new TypeToken<StreamingTweetResponse>(){}.getType();
//         BufferedReader reader = new BufferedReader(new InputStreamReader(streamResult));
//         String line = reader.readLine();
//         while (line != null) {
//           if(line.isEmpty()) {
//             System.err.println("==> " + line.isEmpty());
//             line = reader.readLine();
//             continue;
//            }
//           Object jsonObject = json.getGson().fromJson(line, localVarReturnType);
//           System.out.println(jsonObject != null ? jsonObject.toString() : "Null object");
//           line = reader.readLine();
//         }
//      }catch (Exception e) {
//        e.printStackTrace();
//        System.out.println(e);
//      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

