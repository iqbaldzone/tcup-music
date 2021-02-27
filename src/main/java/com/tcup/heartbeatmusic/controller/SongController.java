package com.tcup.heartbeatmusic.controller;

import com.tcup.heartbeatmusic.model.Album;
import com.tcup.heartbeatmusic.model.Song;
import com.tcup.heartbeatmusic.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("play-me/")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;

    @GetMapping("/byId/{id}")
    public ResponseEntity<Optional<Song>> getById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(this.songService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Song>> getAll() {
        return new ResponseEntity<>(this.songService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-new")
    public ResponseEntity<Song> add(@RequestBody Song song) {
        return new ResponseEntity<>(this.songService.save(song), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Song> update(@RequestBody Song song) {
        return new ResponseEntity<>(this.songService.save(song), HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/byId/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        this.songService.delete(id);
    }
}
