package com.tcup.heartbeatmusic.service.impl;

import com.tcup.heartbeatmusic.model.Song;
import com.tcup.heartbeatmusic.repository.SongRepository;
import com.tcup.heartbeatmusic.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    @Override
    public Optional<Song> findById(Long id) {
        return this.songRepository.findById(id);
    }

    @Override
    public List<Song> findAll() {
        return this.songRepository.findAll();
    }

    public Song save(Song song) {
        return this.songRepository.save(song);
    }

    @Override
    public void delete(Long id) {

    }
}
