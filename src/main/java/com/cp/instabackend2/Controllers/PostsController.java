package com.cp.instabackend2.Controllers;


import com.cp.instabackend2.Models.Post;
import com.cp.instabackend2.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

@Autowired
private PostService postService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World2!";
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts() {
        List<Post> posts = postService.getPosts();
        return ResponseEntity.ok(posts);
    }
     @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);
        return ResponseEntity.ok(savedPost);
    }

}
