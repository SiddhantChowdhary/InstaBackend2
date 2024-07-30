package com.cp.instabackend2.Services;


import com.cp.instabackend2.Models.Image;
import com.cp.instabackend2.Repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;


    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }
    
    public Optional<Image> getImageById(String id) {
        return imageRepository.findById(id);
    }

}
