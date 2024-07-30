package com.cp.instabackend2.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "PostComments")
public class PostComment {
    @Id
    private ObjectId id; // Unique ID for the comment
    private String postId; // ID of the post the comment belongs to
    private String userId;
    private String username;
    private String comment;
    private Date date; // Date of the comment
    private int likes; // Number of likes for the comment

    // Constructors
    public PostComment() {}

    public PostComment(String postId, String userId, String username, String comment, Date date, int likes) {
        this.postId = postId;
        this.userId = userId;
        this.username = username;
        this.comment = comment;
        this.date = date;
        this.likes = likes;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
