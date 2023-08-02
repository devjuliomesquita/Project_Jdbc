package com.projectcleancode.jdbc.infrastructure.persistence.repositories;

import com.projectcleancode.jdbc.domain.interfaces.repository.IActorRepository;
import com.projectcleancode.jdbc.domain.model.Actor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorRepository  implements IActorRepository {
    private final JdbcTemplate jdbcTemplate;
    public ActorRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Actor> findAll() {
        return null;
    }

    @Override
    public Actor findById(Long id) {
        return null;
    }

    @Override
    public Actor findByName(String name) {
        return null;
    }

    @Override
    public void create(Actor actor) {

    }

    @Override
    public void update(Actor actor) {

    }

    @Override
    public void delete(Long id) {

    }
}
