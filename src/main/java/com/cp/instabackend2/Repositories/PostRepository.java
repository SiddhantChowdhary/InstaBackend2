package com.cp.instabackend2.Repositories;

import com.cp.instabackend2.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface PostRepository extends MongoRepository<Post,String> {

     List<Post> findAll();

     Post save(Post post);

}