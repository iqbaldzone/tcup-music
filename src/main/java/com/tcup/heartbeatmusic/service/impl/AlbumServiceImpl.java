package com.tcup.heartbeatmusic.service.impl;

import com.tcup.heartbeatmusic.model.Album;
import com.tcup.heartbeatmusic.repository.AlbumRepository;
import com.tcup.heartbeatmusic.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    @Override
    public Optional<Album> findById(Long id) {
        return albumRepository.findById(id);
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album save(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void delete(Long id) {
        // TODO
    }
}
