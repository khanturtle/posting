package com.crudpractice.crud.dto;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private Long postId;
    private String title;
    private String author;
    private String postContent;
}
