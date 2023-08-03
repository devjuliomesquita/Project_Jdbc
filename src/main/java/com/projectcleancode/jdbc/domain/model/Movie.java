package com.projectcleancode.jdbc.domain.model;

import com.projectcleancode.jdbc.domain.dto.MovieDTO;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private Long id;
    private String title;
    private LocalDateTime realiseDate;
    private List<Actor> actors;
    public Movie (){}
    public Movie(Long id, String title, LocalDateTime realiseDate, List<Actor> actors){
        this.id = id;
        this.title = title;
        this.realiseDate = realiseDate;
        this.actors = actors;
    }
    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public LocalDateTime getRealiseDate(){
        return realiseDate;
    }
    public List<Actor> getActors(){
        return actors;
    }
    public Movie(MovieDTO movieDTO){
        this.id = movieDTO.getId();
        this.title = movieDTO.getTitle();
        this.realiseDate = movieDTO.getRealiseDate();
        this.actors = movieDTO.getActors();
    }
    public MovieDTO toMovieDto(){
        return new MovieDTO(this.id, this.title, this.realiseDate, this.actors);
    }
}
