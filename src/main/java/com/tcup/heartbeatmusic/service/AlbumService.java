package com.tcup.heartbeatmusic.service;

import com.tcup.heartbeatmusic.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    Optional<Album> findById(Long id);

    List<Album> findAll();

    Album save(Album album);

    void delete(Long id);
}
