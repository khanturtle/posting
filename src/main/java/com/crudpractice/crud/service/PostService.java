package com.crudpractice.crud.service;

import com.crudpractice.crud.dto.PostRequestDto;
import com.crudpractice.crud.dto.PostResponseDto;
import com.crudpractice.crud.entity.Post;
import com.crudpractice.crud.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    } //왜 필요한지 학습필요

    public PostResponseDto createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return new PostResponseDto(post);
    }

    public PostResponseDto getPost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(    //Optional 타입을 Post 타입으로 받는 방법 자료 참조
                () -> new NullPointerException("post not exists")
        );
        return new PostResponseDto(post);
    }

    public List<PostResponseDto> getPosts() {
        List<Post> postList = postRepository.findAll();
        List<PostResponseDto> responseDtoList = new ArrayList<>();
        for (Post post : postList) {
            responseDtoList.add(new PostResponseDto(post));
        }
        return responseDtoList;
    }

    @Transactional
    public void updatePost(PostRequestDto requestDto, Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new NullPointerException("post not exists")
        );
        post.update(requestDto);
    }

    public void deletePost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new NullPointerException("post not exists")
        );
        postRepository.delete(post);
    }
}
