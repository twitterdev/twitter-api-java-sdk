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

import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.Get2ListsIdResponse;
import com.twitter.clientlib.model.Get2UsersIdFollowedListsResponse;
import com.twitter.clientlib.model.Get2UsersIdListMembershipsResponse;
import com.twitter.clientlib.model.Get2UsersIdOwnedListsResponse;
import com.twitter.clientlib.model.Get2UsersIdPinnedListsResponse;
import com.twitter.clientlib.model.ListAddUserRequest;
import com.twitter.clientlib.model.ListCreateRequest;
import com.twitter.clientlib.model.ListCreateResponse;
import com.twitter.clientlib.model.ListDeleteResponse;
import com.twitter.clientlib.model.ListFollowedRequest;
import com.twitter.clientlib.model.ListFollowedResponse;
import com.twitter.clientlib.model.ListMutateResponse;
import com.twitter.clientlib.model.ListPinnedRequest;
import com.twitter.clientlib.model.ListPinnedResponse;
import com.twitter.clientlib.model.ListUnpinResponse;
import com.twitter.clientlib.model.ListUpdateRequest;
import com.twitter.clientlib.model.ListUpdateResponse;
import com.twitter.clientlib.model.Problem;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for ListsApi
 */
@Disabled
public class ListsApiTest {

    private final TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN")));
    // TODO set credentials
    
    /**
     * Get a User&#39;s List Memberships
     *
     * Get a User&#39;s List Memberships.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserListMembershipsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                Get2UsersIdListMembershipsResponse response = apiInstance.lists().getUserListMemberships(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Add a List member
     *
     * Causes a User to become a member of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAddMemberTest() throws ApiException {
        ListAddUserRequest listAddUserRequest = null;
        String id = null;
                ListMutateResponse response = apiInstance.lists().listAddMember(id)
                .listAddUserRequest(listAddUserRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Create List
     *
     * Creates a new List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdCreateTest() throws ApiException {
        ListCreateRequest listCreateRequest = null;
                ListCreateResponse response = apiInstance.lists().listIdCreate()
                .listCreateRequest(listCreateRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Delete List
     *
     * Delete a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdDeleteTest() throws ApiException {
        String id = null;
                ListDeleteResponse response = apiInstance.lists().listIdDelete(id)
                .execute();
        // TODO: test validations
    }


    /**
     * List lookup by List ID.
     *
     * Returns a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdGetTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                Get2ListsIdResponse response = apiInstance.lists().listIdGet(id)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Update List.
     *
     * Update a List that you own.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIdUpdateTest() throws ApiException {
        ListUpdateRequest listUpdateRequest = null;
        String id = null;
                ListUpdateResponse response = apiInstance.lists().listIdUpdate(id)
                .listUpdateRequest(listUpdateRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Remove a List member
     *
     * Causes a User to be removed from the members of a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRemoveMemberTest() throws ApiException {
        String id = null;
        String userId = null;
                ListMutateResponse response = apiInstance.lists().listRemoveMember(id, userId)
                .execute();
        // TODO: test validations
    }


    /**
     * Follow a List
     *
     * Causes a User to follow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserFollowTest() throws ApiException {
        ListFollowedRequest listFollowedRequest = null;
        String id = null;
                ListFollowedResponse response = apiInstance.lists().listUserFollow(id)
                .listFollowedRequest(listFollowedRequest)
                .execute();
        // TODO: test validations
    }


    /**
     * Get a User&#39;s Owned Lists.
     *
     * Get a User&#39;s Owned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserOwnedListsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                Get2UsersIdOwnedListsResponse response = apiInstance.lists().listUserOwnedLists(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Pin a List
     *
     * Causes a User to pin a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPinTest() throws ApiException {
        ListPinnedRequest listPinnedRequest = null;
        String id = null;
                ListPinnedResponse response = apiInstance.lists().listUserPin(listPinnedRequest, id)
                .execute();
        // TODO: test validations
    }


    /**
     * Get a User&#39;s Pinned Lists
     *
     * Get a User&#39;s Pinned Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserPinnedListsTest() throws ApiException {
        String id = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                Get2UsersIdPinnedListsResponse response = apiInstance.lists().listUserPinnedLists(id)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }


    /**
     * Unfollow a List
     *
     * Causes a User to unfollow a List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserUnfollowTest() throws ApiException {
        String id = null;
        String listId = null;
                ListFollowedResponse response = apiInstance.lists().listUserUnfollow(id, listId)
                .execute();
        // TODO: test validations
    }


    /**
     * Unpin a List
     *
     * Causes a User to remove a pinned List.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserUnpinTest() throws ApiException {
        String id = null;
        String listId = null;
                ListUnpinResponse response = apiInstance.lists().listUserUnpin(id, listId)
                .execute();
        // TODO: test validations
    }


    /**
     * Get User&#39;s Followed Lists
     *
     * Returns a User&#39;s followed Lists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userFollowedListsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> listFields = null;
        Set<String> expansions = null;
        Set<String> userFields = null;
                Get2UsersIdFollowedListsResponse response = apiInstance.lists().userFollowedLists(id)
                .maxResults(maxResults)
                .paginationToken(paginationToken)
                .listFields(listFields)
                .expansions(expansions)
                .userFields(userFields)
                .execute();
        // TODO: test validations
    }

}
