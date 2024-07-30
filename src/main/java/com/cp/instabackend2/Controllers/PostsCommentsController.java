package com.cp.instabackend2.Controllers;


import com.cp.instabackend2.Models.PostComment;
import com.cp.instabackend2.Services.PostCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/comments")
public class PostsCommentsController {
    @Autowired
    private PostCommentsService postCommentService;

    @GetMapping("/healthy")
    public String sayHelloFromCommentsController() {
        return "Hello, from CommentsController!";
    }

    @GetMapping("/recent/{postId}")
    public List<PostComment> getRecentComments(@PathVariable String postId, @RequestParam(defaultValue = "10") int limit) {
        return postCommentService.getRecentCommentsByPostId(postId, limit);
    }

    @GetMapping("/mostLiked/{postId}")
    public List<PostComment> getMostLikedComments(@PathVariable String postId, @RequestParam(defaultValue = "10") int limit) {
        return postCommentService.getMostLikedCommentsByPostId(postId, limit);
    }

    @PostMapping("/add/{postId}")
    public PostComment addComment(@PathVariable String postId, @RequestBody PostComment comment) {
        comment.setPostId(postId);
        return postCommentService.addComment(comment);
    }
}
