package com.crudpractice.crud.entity;

import com.crudpractice.crud.dto.PostRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long postId;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String postContent;

    public Post(PostRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.postContent = requestDto.getPostContent();
        this.title = requestDto.getTitle();
    }

    public void update(PostRequestDto requestDto) {
        this.author = requestDto.getAuthor();
        this.title = requestDto.getTitle();
        this.postContent = requestDto.getPostContent();

    }
}
