package com.practice.krazybee.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.practice.krazybee.model.Album;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ParseAlbumServiceImpl implements ParseAlbumService {

    public List<Album> parseData(StringBuffer response) {
        List<Album> albums = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(response.toString());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonobject = jsonArray.getJSONObject(i);
            Long id = jsonobject.getLong("id");
            Long userId = jsonobject.getLong("userId");
            String title = jsonobject.getString("title");
            Album album = new Album();
            album.setId(id);
            album.setUserId(userId);
            album.setTitle(title);
            album.setCreated_On(new Date());
            albums.add(album);
        }
        return albums;
    }
}
