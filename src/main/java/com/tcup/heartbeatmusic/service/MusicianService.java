package com.tcup.heartbeatmusic.service;

import com.tcup.heartbeatmusic.model.Musician;

import java.util.List;
import java.util.Optional;

public interface MusicianService {

    Optional<Musician> findById(Long id);

    List<Musician> findAll();

    Musician save(Musician musician);

    void delete(Long id);
}
