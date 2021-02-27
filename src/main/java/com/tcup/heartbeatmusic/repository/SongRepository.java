package com.tcup.heartbeatmusic.repository;

import com.tcup.heartbeatmusic.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
