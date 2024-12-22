package com.javaproject.socialblog.springboot.service;

import com.javaproject.socialblog.springboot.model.dtos.post.PostResponse;

import java.util.List;

public interface BookmarkService {

    List<PostResponse> getUserBookmarks();

    void removeBookmark(String postId);

    void bookmarkPost(String postId);

}
