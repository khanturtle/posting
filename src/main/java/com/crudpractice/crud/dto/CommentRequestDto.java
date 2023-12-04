package com.crudpractice.crud.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long commentId;
    private String author;
    private String commentContent;
}
