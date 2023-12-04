package com.crudpractice.crud.controller;

import com.crudpractice.crud.dto.CommentRequestDto;
import com.crudpractice.crud.dto.CommentResponseDto;
import com.crudpractice.crud.service.CommentService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private CommentService commentService;

    //댓글 생성
    @PostMapping("/create/{postId}")
    private CommentResponseDto createComment(@RequestBody CommentRequestDto commentRequestDto,@PathVariable Long postId){
        return commentService.createComment(commentRequestDto,postId);
    }
    //게시글의 댓글 전체 조회
    @GetMapping("/get/{postId}/comments")
    private List<CommentResponseDto> getComments(@PathVariable Long postId){
        return commentService.getComments(postId);
    }
    //게시글의 댓글 단건 조회
    @GetMapping("/get/{postId}/{commentId}")
    private CommentResponseDto getComment(@PathVariable Long postId,@PathVariable Long commentId){
        return commentService.getComment(postId,commentId);
    }
    //게시글의 댓글 단건 수정
    @PutMapping("/update/{postId}/{commentId}")
    private CommentResponseDto updateComment(@PathVariable Long postId,@PathVariable Long commentId){
        return commentService.updateComment(postId,commentId);
    }
    //게시글의 댓글 단건 삭제
    @DeleteMapping("/delete/{postId}/{commentId}")
    private void deleteComment(@PathVariable Long postId,@PathVariable Long commentId){
        commentService.deleteComment(postId,commentId);
    }
}
