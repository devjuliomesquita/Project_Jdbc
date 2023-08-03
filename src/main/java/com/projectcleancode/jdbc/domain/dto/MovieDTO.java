package com.projectcleancode.jdbc.domain.dto;

import com.projectcleancode.jdbc.domain.model.Actor;

import java.time.LocalDateTime;
import java.util.List;

public class MovieDTO {
    private Long id;
    private String title;
    private LocalDateTime realiseDate;
    private List<Actor> actors;
    public MovieDTO(Long id, String title, LocalDateTime realiseDate, List<Actor> actors){
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
}
