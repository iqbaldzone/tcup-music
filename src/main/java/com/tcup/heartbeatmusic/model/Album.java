package com.tcup.heartbeatmusic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.*;

@Entity(name = "album")
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;

    @Size(min = 5)
    private String name;

    @NotBlank
    @NotNull
    private String releaseDate;

    private String genre;

    @Min(10)
    @Max(100)
    private double price;

    private String description;
}
