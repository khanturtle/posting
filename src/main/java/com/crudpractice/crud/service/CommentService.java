package com.crudpractice.crud.service;

import com.crudpractice.crud.dto.CommentRequestDto;
import com.crudpractice.crud.dto.CommentResponseDto;
import com.crudpractice.crud.entity.Comment;
import com.crudpractice.crud.entity.Post;
import com.crudpractice.crud.repository.CommentRepository;
import com.crudpractice.crud.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    public CommentService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }
    public CommentResponseDto createComment(CommentRequestDto commentRequestDto, Long postId) { //해당 포스트에 comment를 추가하기 위해 postId를 받아 왔는데 어떻게 연결시켜 주어야 할지 모르겠습니다.
        Comment comment = new Comment(commentRequestDto);
        commentRepository.save(comment);
        return new CommentResponseDto(comment);
    }

    public List<CommentResponseDto> getComments(Long postId) { //해당 포스트의 모든 댓글을 불러오고 싶은데 이 역시 잘 모르겠습니다.
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new NullPointerException("post not exists")
        );
        return null;
    }

    public CommentResponseDto getComment(Long postId, Long commentId) {
        return null;
    }

    public CommentResponseDto updateComment(Long postId, Long commentId) {
        return null;
    }

    public void deleteComment(Long postId, Long commentId) {
    }
}
