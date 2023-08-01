package com.projectcleancode.jdbc.domain.model;

import com.projectcleancode.jdbc.domain.dto.ActorDTO;

public class Actor {
    private Long id;
    private String name;
    public Actor(){}
    public Actor(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Actor(ActorDTO actorDTO){
        this.id = actorDTO.getId();
        this.name = actorDTO.getName();
    }
    public ActorDTO toActorDto(){
        return new ActorDTO(this.id, this.name);
    }
}
