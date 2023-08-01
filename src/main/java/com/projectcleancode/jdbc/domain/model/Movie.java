package com.projectcleancode.jdbc.domain.model;

import com.projectcleancode.jdbc.domain.dto.MovieDTO;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private Long id;
    private String name;
    private LocalDateTime realiseDate;
    private List<Actor> actors;
    public Movie (){}
    public Movie(Long id, String name, LocalDateTime realiseDate, List<Actor> actors){
        this.id = id;
        this.name = name;
        this.realiseDate = realiseDate;
        this.actors = actors;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public LocalDateTime getRealiseDate(){
        return realiseDate;
    }
    public List<Actor> getActors(){
        return actors;
    }
    public Movie(MovieDTO movieDTO){
        this.id = movieDTO.getId();
        this.name = movieDTO.getName();
        this.realiseDate = movieDTO.getRealiseDate();
        this.actors = movieDTO.getActors();
    }
    public MovieDTO toDTO(MovieDTO movieDTO){
        return new MovieDTO(this.id, this.name, this.realiseDate, this.actors);
    }
}
