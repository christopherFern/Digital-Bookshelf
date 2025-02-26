package com.christopher.digitalcollection.demo.controller;


import com.christopher.digitalcollection.demo.model.Media;
import com.christopher.digitalcollection.demo.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    private MediaRepository mediaRepository;

    @GetMapping
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    // New endpoint to get media by type
    @GetMapping("/type")
    public List<Media> getMediaByType(@RequestParam String type) {
        return mediaRepository.findByMediaType(type);
    }
}
