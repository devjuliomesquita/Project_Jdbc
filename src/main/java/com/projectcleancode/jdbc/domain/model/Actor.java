package com.projectcleancode.jdbc.domain.model;

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
}
