package com.crudpractice.crud.dto;

import com.crudpractice.crud.entity.Comment;

public class CommentResponseDto {
    private Long commentId;
    private String author;
    private String commentContent;

    public CommentResponseDto(Comment comment) {
        this.author=comment.getAuthor();
        this.commentContent=comment.getCommentContent();
    }
}
