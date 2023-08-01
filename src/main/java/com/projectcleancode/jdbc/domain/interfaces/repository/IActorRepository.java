package com.projectcleancode.jdbc.domain.interfaces.repository;

import com.projectcleancode.jdbc.domain.model.Actor;

import java.util.List;

public interface IActorRepository {
    List<Actor> findAll();
    Actor findById(Long id);
    Actor findByName(String name);
    void create(Actor actor);
    void update(Actor actor);
    void delete(Long id);
}
