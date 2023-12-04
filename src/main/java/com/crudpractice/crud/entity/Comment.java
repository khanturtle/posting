package com.crudpractice.crud.entity;

import com.crudpractice.crud.dto.CommentRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long commentId;
    @Column
    private Long postId;
    @Column
    private String author;
    @Column
    private String commentContent;

    public Comment(CommentRequestDto commentRequestDto) {
        this.author=commentRequestDto.getAuthor();
        this.commentContent=commentRequestDto.getCommentContent();
    }
}