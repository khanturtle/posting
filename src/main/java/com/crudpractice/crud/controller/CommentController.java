package com.crudpractice.crud.controller;

import com.crudpractice.crud.dto.CommentRequestDto;
import com.crudpractice.crud.dto.CommentResponseDto;
import com.crudpractice.crud.service.CommentService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private CommentService commentService;

    @PostMapping("/create/{postId}")
    private CommentResponseDto createComment(@RequestBody CommentRequestDto commentRequestDto,Long postId){
        return commentService.createComment(commentRequestDto,postId);
    }
}
