package com.cp.instabackend2.Controllers;


import com.cp.instabackend2.Models.Post;
import com.cp.instabackend2.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

@Autowired
private PostService postService;

    @GetMapping("/healthy")
    public String sayHelloFromPostController() {
        return "Hello, from PostController!";
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Post>> getPosts() {
        List<Post> posts = postService.getPosts();
        return ResponseEntity.ok(posts);
    }
     @PostMapping("/upload")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);
        return ResponseEntity.ok(savedPost);
    }

}
