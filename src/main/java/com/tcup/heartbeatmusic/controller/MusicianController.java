package com.tcup.heartbeatmusic.controller;

import com.tcup.heartbeatmusic.model.Album;
import com.tcup.heartbeatmusic.model.Musician;
import com.tcup.heartbeatmusic.service.MusicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("listen-me/")
@RequiredArgsConstructor
public class MusicianController {

    private final MusicianService musicianService;

    @GetMapping("/byId/{id}")
    public ResponseEntity<Optional<Musician>> getById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(this.musicianService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Musician>> getAll() {
        return new ResponseEntity<>(this.musicianService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add-new")
    public ResponseEntity<Musician> add(@RequestBody Musician musician) {
        return new ResponseEntity<>(this.musicianService.save(musician), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Musician> update(@RequestBody Musician musician) {
        return new ResponseEntity<>(this.musicianService.save(musician), HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/byId/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        this.musicianService.delete(id);
    }
}
