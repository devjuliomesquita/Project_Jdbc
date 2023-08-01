package com.projectcleancode.jdbc.domain.dto;

import com.projectcleancode.jdbc.domain.model.Actor;

import java.time.LocalDateTime;
import java.util.List;

public class MovieDTO {
    private Long id;
    private String name;
    private LocalDateTime realiseDate;
    private List<Actor> actors;
    public MovieDTO(Long id, String name, LocalDateTime realiseDate, List<Actor> actors){
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
}
