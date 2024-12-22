package com.javaproject.socialblog.springboot.service;

public interface LikeService {

    void likePost(String postId);

    void unlikePost(String postId);

    void likeComment(String commentId);

    void unlikeComment(String commentId);

}
