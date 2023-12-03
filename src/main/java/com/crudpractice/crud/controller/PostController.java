package com.crudpractice.crud.controller;

import com.crudpractice.crud.dto.PostRequestDto;
import com.crudpractice.crud.dto.PostResponseDto;
import com.crudpractice.crud.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    private PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    @GetMapping("/get/{postId}")
    private PostResponseDto getPost(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

    @GetMapping("/get/posts")
    private List<PostResponseDto> getPosts() {
        return postService.getPosts();
    }

    @PutMapping("/update/{postId}")
    private void updatePost(@RequestBody PostRequestDto requestDto, @PathVariable Long postId) {
        postService.updatePost(requestDto, postId);
    }

    @DeleteMapping("/delete/{postId}")
    private void deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }
}
