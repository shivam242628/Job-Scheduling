package com.practice.krazybee.job;

import com.practice.krazybee.repository.AlbumRepository;
import com.practice.krazybee.service.InitialAlbumService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ScheduledJob {
    AlbumRepository albumRepository;
    InitialAlbumService initialAlbumService;


    public ScheduledJob(AlbumRepository albumRepository, InitialAlbumService initialAlbumService) {
        this.albumRepository = albumRepository;
        this.initialAlbumService = initialAlbumService;
    }

    @Scheduled(fixedRate = 60000)
    public void refreshData() throws IOException {
        System.out.println("Deleting Database");
        albumRepository.deleteAll();
        System.out.println("Re-populating Database");
        initialAlbumService.getAllAlbums();
    }

}
