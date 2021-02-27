package com.tcup.heartbeatmusic.controller;

import com.tcup.heartbeatmusic.model.Album;
import com.tcup.heartbeatmusic.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enjoy-me")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping("/byId/{id}")
    public ResponseEntity<Optional<Album>> getById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(this.albumService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Album>> getAll() {
        return new ResponseEntity<>(this.albumService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-new")
    public ResponseEntity<Album> add(@RequestBody Album album) {
        return new ResponseEntity<>(this.albumService.save(album), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Album> update(@RequestBody Album album) {
        return new ResponseEntity<>(this.albumService.save(album), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/byId/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        this.albumService.delete(id);
    }
}
