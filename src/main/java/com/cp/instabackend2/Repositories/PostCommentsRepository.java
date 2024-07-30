package com.cp.instabackend2.Repositories;

import com.cp.instabackend2.Models.PostComment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostCommentsRepository extends MongoRepository<PostComment, ObjectId> {
     List<PostComment> findByPostId(String postId, Sort sort);
}
