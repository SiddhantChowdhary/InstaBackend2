package com.cp.instabackend2.Services;

import com.cp.instabackend2.Models.PostComment;
import com.cp.instabackend2.Repositories.PostCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostCommentsService {
    @Autowired
    private PostCommentsRepository postCommentRepository;

    public List<PostComment> getCommentsByPostId(String postId, int limit, Sort sort) {
        return postCommentRepository.findByPostId(postId, sort).stream().limit(limit).toList();
    }

    public List<PostComment> getRecentCommentsByPostId(String postId, int limit) {
        return getCommentsByPostId(postId, limit, Sort.by(Sort.Direction.DESC, "date"));
    }

    public List<PostComment> getMostLikedCommentsByPostId(String postId, int limit) {
        return getCommentsByPostId(postId, limit, Sort.by(Sort.Direction.DESC, "likes"));
    }

    public PostComment addComment(PostComment comment) {
        comment.setDate(new Date());
        return postCommentRepository.save(comment);
    }
}
