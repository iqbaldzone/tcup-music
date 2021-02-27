package com.tcup.heartbeatmusic.repository;

import com.tcup.heartbeatmusic.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
