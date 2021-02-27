package com.tcup.heartbeatmusic.repository;

import com.tcup.heartbeatmusic.model.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianRepository extends JpaRepository<Musician, Long> {
}
