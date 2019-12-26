package com.practice.krazybee.controllers;

import com.practice.krazybee.model.Album;
import com.practice.krazybee.service.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class IndexController {

    private AlbumService<Album, Long> albumService;

    public IndexController(AlbumService<Album, Long> albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/getAlbums")
    public List<Album> getAlbums() {
        return albumService.findAll();
    }
}
