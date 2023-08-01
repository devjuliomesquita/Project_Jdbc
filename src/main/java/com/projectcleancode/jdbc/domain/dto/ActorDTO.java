package com.projectcleancode.jdbc.domain.dto;

public class ActorDTO {
    private Long id;
    private String name;
    public ActorDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
