package com.tcup.heartbeatmusic.service;

import com.tcup.heartbeatmusic.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {

    Optional<Song> findById(Long id);

    List<Song> findAll();

    Song save(Song song);

    void delete(Long id);
}
