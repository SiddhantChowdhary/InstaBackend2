package com.cp.instabackend2.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Posts")
public class Post {
    @Id
    private ObjectId id;  // Mapping _id
    private String caption;
    private Long likes;
    private String mediaId;
    private String mediaType;
    private String userId;
    private Date date; // Date of the comment

    // Constructors
    public Post() {
    }

    public Post(String caption, Long likes, String imageUrl, String mediaType, String userId,Date date) {
        this.caption = caption;
        this.likes = likes;
        this.mediaId = imageUrl;
        this.mediaType = mediaType;
        this.userId = userId;
        this.date = date;
    }

    // Getters and setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String imageUrl) {
        this.mediaId = imageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
