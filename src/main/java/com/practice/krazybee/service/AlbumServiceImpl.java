package com.practice.krazybee.service;

import com.practice.krazybee.model.Album;
import com.practice.krazybee.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService<Album, Long> {

    private AlbumRepository albumRepository;


    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album findById(Long id) {
        return null;
    }

    @Override
    public Album save(Album object) {
        return null;
    }

    @Override
    public List<Album> saveAll(List<Album> objects) {
        return albumRepository.saveAll(objects);
    }


}
