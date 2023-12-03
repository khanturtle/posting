package com.crudpractice.crud.service;

import com.crudpractice.crud.dto.CommentRequestDto;
import com.crudpractice.crud.dto.CommentResponseDto;
import com.crudpractice.crud.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public CommentResponseDto createComment(CommentRequestDto commentRequestDto, Long postId) {

    }
}
