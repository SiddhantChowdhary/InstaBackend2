package com.cp.instabackend2.Repositories;

import com.cp.instabackend2.Models.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image,String> {
    Image save(Image image);
}