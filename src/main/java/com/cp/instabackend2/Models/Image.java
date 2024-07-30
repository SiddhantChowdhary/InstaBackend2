package com.cp.instabackend2.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "images")
public class Image {
    @Id
    private String id;
    private String name;
    private String type;
    private byte[] imageInBytes;
    private Date date; // Date of the comment

    // Getters and Setters
    // Constructors
    public Image() {
    }

    public Image(String type, String name, byte[] imageInBytes ,Date date) {
        this.type = type;
        this.name = name;
        this.imageInBytes = imageInBytes;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImageInBytes() {
        return imageInBytes;
    }

    public void setImageInBytes(byte[] imageInBytes) {
        this.imageInBytes = imageInBytes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}