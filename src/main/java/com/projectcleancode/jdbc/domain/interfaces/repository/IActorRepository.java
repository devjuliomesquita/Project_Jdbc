package com.projectcleancode.jdbc.domain.interfaces.repository;

import com.projectcleancode.jdbc.domain.model.Actor;

import java.util.List;
import java.util.Optional;

public interface IActorRepository {
    List<Actor> findAll();
    Optional<Actor> findById(Long id);
    Optional<Actor> findByName(String name);
    void create(Actor actor);
    void update(Actor actor);
    void delete(Long id);
}
