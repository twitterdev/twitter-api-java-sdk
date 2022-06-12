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


package com.twitter.clientlib.api;

import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.model.BlockUserMutationResponse;
import com.twitter.clientlib.model.BlockUserRequest;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.Get2ListsIdFollowersResponse;
import com.twitter.clientlib.model.Get2ListsIdMembersResponse;
import com.twitter.clientlib.model.Get2TweetsIdLikingUsersResponse;
import com.twitter.clientlib.model.Get2TweetsIdRetweetedByResponse;
import com.twitter.clientlib.model.Get2UsersByResponse;
import com.twitter.clientlib.model.Get2UsersByUsernameUsernameResponse;
import com.twitter.clientlib.model.Get2UsersIdBlockingResponse;
import com.twitter.clientlib.model.Get2UsersIdFollowersResponse;
import com.twitter.clientlib.model.Get2UsersIdFollowingResponse;
import com.twitter.clientlib.model.Get2UsersIdMutingResponse;
import com.twitter.clientlib.model.Get2UsersIdResponse;
import com.twitter.clientlib.model.Get2UsersMeResponse;
import com.twitter.clientlib.model.Get2UsersResponse;
import com.twitter.clientlib.model.MuteUserMutationResponse;
import com.twitter.clientlib.model.MuteUserRequest;
import com.twitter.clientlib.model.Problem;
import java.util.Set;
import com.twitter.clientlib.model.UsersFollowingCreateRequest;
import com.twitter.clientlib.model.UsersFollowingCreateResponse;
import com.twitter.clientlib.model.UsersFollowingDeleteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final TwitterApi apiInstance = new TwitterApi();
    // TODO set credentials
    
    /**
     * User lookup me
     *
     * This endpoint returns information about the requesting User.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findMyUserTest() throws ApiException {
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersMeResponse response = apiInstance.users().findMyUser()
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * User lookup by ID
     *
     * This endpoint returns information about a User. Specify User by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findUserByIdTest() throws ApiException {
        String id = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersIdResponse response = apiInstance.users().findUserById(id)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * User lookup by username
     *
     * This endpoint returns information about a User. Specify User by username.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findUserByUsernameTest() throws ApiException {
        String username = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersByUsernameUsernameResponse response = apiInstance.users().findUserByUsername(username)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * User lookup by IDs
     *
     * This endpoint returns information about Users. Specify Users by their ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findUsersByIdTest() throws ApiException {
        List<String> ids = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersResponse response = apiInstance.users().findUsersById(ids)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * User lookup by usernames
     *
     * This endpoint returns information about Users. Specify Users by their username.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findUsersByUsernameTest() throws ApiException {
        List<String> usernames = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersByResponse response = apiInstance.users().findUsersByUsername(usernames)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that follow a List by the provided List ID
     *
     * Returns a list of Users that follow a List by the provided List ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGetFollowersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2ListsIdFollowersResponse response = apiInstance.users().listGetFollowers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that are members of a List by the provided List ID.
     *
     * Returns a list of Users that are members of a List by the provided List ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGetMembersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2ListsIdMembersResponse response = apiInstance.users().listGetMembers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that have liked the provided Tweet ID
     *
     * Returns a list of Users that have liked the provided Tweet ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetsIdLikingUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2TweetsIdLikingUsersResponse response = apiInstance.users().tweetsIdLikingUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that have retweeted the provided Tweet ID
     *
     * Returns a list of Users that have retweeted the provided Tweet ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetsIdRetweetingUsersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2TweetsIdRetweetedByResponse response = apiInstance.users().tweetsIdRetweetingUsers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Block User by User ID
     *
     * Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdBlockTest() throws ApiException {
        BlockUserRequest blockUserRequest = null;
        String id = null;
                BlockUserMutationResponse response = apiInstance.users().usersIdBlock(blockUserRequest, id)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that are blocked by provided User ID
     *
     * Returns a list of Users that are blocked by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdBlockingTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersIdBlockingResponse response = apiInstance.users().usersIdBlocking(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Follow User
     *
     * Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdFollowTest() throws ApiException {
        UsersFollowingCreateRequest usersFollowingCreateRequest = null;
        String id = null;
                UsersFollowingCreateResponse response = apiInstance.users().usersIdFollow(id)
                .usersFollowingCreateRequest(usersFollowingCreateRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that follow a List by the provided User ID
     *
     * Returns a list of Users that follow the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdFollowersTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersIdFollowersResponse response = apiInstance.users().usersIdFollowers(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Following by User ID
     *
     * Returns a list of Users that are being followed by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdFollowingTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersIdFollowingResponse response = apiInstance.users().usersIdFollowing(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Mute User by User ID.
     *
     * Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdMuteTest() throws ApiException {
        MuteUserRequest muteUserRequest = null;
        String id = null;
                MuteUserMutationResponse response = apiInstance.users().usersIdMute(id)
                .muteUserRequest(muteUserRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Returns User objects that are muted by the provided User ID
     *
     * Returns a list of Users that are muted by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdMutingTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
                Get2UsersIdMutingResponse response = apiInstance.users().usersIdMuting(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .userFields(userFields)
                .expansions(expansions)
                .tweetFields(tweetFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Unblock User by User ID
     *
     * Causes the source User to unblock the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdUnblockTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
                BlockUserMutationResponse response = apiInstance.users().usersIdUnblock(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }


    /**
     * Unfollow User
     *
     * Causes the source User to unfollow the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdUnfollowTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
                UsersFollowingDeleteResponse response = apiInstance.users().usersIdUnfollow(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }


    /**
     * Unmute User by User ID
     *
     * Causes the source User to unmute the target User. The source User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdUnmuteTest() throws ApiException {
        String sourceUserId = null;
        String targetUserId = null;
                MuteUserMutationResponse response = apiInstance.users().usersIdUnmute(sourceUserId, targetUserId)
                .execute();
        // TODO: test validations
    }

}
