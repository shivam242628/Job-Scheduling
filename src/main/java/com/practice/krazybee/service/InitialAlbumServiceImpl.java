package com.practice.krazybee.service;

import com.practice.krazybee.model.Album;
import com.practice.krazybee.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class InitialAlbumServiceImpl implements InitialAlbumService {

    private ParseAlbumService parseAlbumService;
    private AlbumRepository albumRepository;

    public InitialAlbumServiceImpl(ParseAlbumService parseAlbumService, AlbumRepository albumRepository) {
        this.parseAlbumService = parseAlbumService;
        this.albumRepository = albumRepository;
    }

    private static final String GET_URL = "https://jsonplaceholder.typicode.com/albums";

    public void getAllAlbums() throws IOException {
        // Try using RestTemplate
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            List<Album> albums = parseAlbumService.parseData(response);
            albumRepository.saveAll(albums);
        } else {
            System.out.println("GET request not worked");
        }
    }

}
