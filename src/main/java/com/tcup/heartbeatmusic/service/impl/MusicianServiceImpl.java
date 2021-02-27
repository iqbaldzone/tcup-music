package com.tcup.heartbeatmusic.service.impl;

import com.tcup.heartbeatmusic.model.Musician;
import com.tcup.heartbeatmusic.repository.MusicianRepository;
import com.tcup.heartbeatmusic.service.MusicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MusicianServiceImpl implements MusicianService {

    private final MusicianRepository musicianRepository;

    @Override
    public Optional<Musician> findById(Long id) {
        return this.musicianRepository.findById(id);
    }

    @Override
    public List<Musician> findAll() {
        return this.musicianRepository.findAll();
    }

    public Musician save(Musician musician) {
        return this.musicianRepository.save(musician);
    }

    @Override
    public void delete(Long id) {
        // TODO
    }
}
