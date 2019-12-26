package com.practice.krazybee.service;

import com.practice.krazybee.model.Album;

import java.util.List;

public interface ParseAlbumService {

    List<Album> parseData(StringBuffer response);
}
