package com.javaproject.socialblog.springboot.service;

import com.javaproject.socialblog.springboot.model.entities.Comment;
import com.javaproject.socialblog.springboot.model.dtos.comment.CommentRequest;
import com.javaproject.socialblog.springboot.model.dtos.comment.CommentResponse;

import java.util.List;

public interface CommentService {

    List<CommentResponse> getCommentsByPost(String id);

    Comment createComment(CommentRequest comment, String postId);

    Comment updateComment(Comment comment);

    void deleteComment(String id);

    String getPostByCommentId(String id);

    String deleteCommentR(String id);
}
