//package com.practice.krazybee.job;
//
//import com.practice.krazybee.repository.AlbumRepository;
//import com.practice.krazybee.service.InitialAlbumService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    private AlbumRepository albumRepository;
//    private InitialAlbumService initialAlbumService;
//
//    public DataLoader(AlbumRepository albumRepository, InitialAlbumService initialAlbumService) {
//        this.albumRepository = albumRepository;
//        this.initialAlbumService = initialAlbumService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Command Line Runner :: " + Thread.currentThread().getName());
//        int count = albumRepository.findAll().size();
//
//        if (count == 0) {
//            initialAlbumService.getAllAlbums();
//        }
//    }
//}
