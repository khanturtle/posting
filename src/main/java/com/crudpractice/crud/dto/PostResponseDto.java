package com.crudpractice.crud.dto;

import com.crudpractice.crud.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostResponseDto {
    private Long postId;
    private String title;
    private String author;
    private String postContent;

    public PostResponseDto(Post post) {
        this.postId = post.getPostId();
        this.author=post.getAuthor();
        this.title=post.getTitle();
        this.postContent =post.getContent();
    }

    public PostResponseDto(PostRequestDto requestDto) {
        this.postContent =requestDto.getPostContent();
        this.author = requestDto.getAuthor();
        this.title=requestDto.getTitle();
    }
}
