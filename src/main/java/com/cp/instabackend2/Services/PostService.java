package com.cp.instabackend2.Services;


import com.cp.instabackend2.Models.Post;
import com.cp.instabackend2.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;


     public List<Post> getPosts() {
         return postRepository.findAll();
     }

     public Post savePost(Post post) {
         post.setDate(new Date());
         return postRepository.save(post);
     }
}
