package com.javaproject.socialblog.springboot.service;

import com.javaproject.socialblog.springboot.model.entities.User;

import java.util.Set;

public interface FollowService {

    boolean followUser(String thatUserId);

    void unfollowUser(String thatUserId);

    Set<User> getFollowers(String userId);

    Set<User> getFollowing(String userId);

    Set<User> getMyFollowers();

    Set<User> getMyFollowing();

}
