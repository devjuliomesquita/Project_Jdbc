package com.projectcleancode.jdbc.infrastructure.persistence.repositories;

import com.projectcleancode.jdbc.domain.interfaces.repository.IActorRepository;
import com.projectcleancode.jdbc.domain.model.Actor;
import com.projectcleancode.jdbc.infrastructure.persistence.configurations.map.ActorRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ActorRepository  implements IActorRepository {
    private final JdbcTemplate jdbcTemplate;
    public ActorRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Actor> findAll() {
        String sql = """
                SELECT id, name
                FROM actor
                LIMIT 100;
                """;
        return jdbcTemplate.query(sql, new ActorRowMapper());
    }

    @Override
    public Optional<Actor> findById(Long id) {
        String sql = """
                SELECT id, name
                FROM actor
                WHERE id = ?;
                """;
        return jdbcTemplate
                .query(sql, new ActorRowMapper(), id)
                .stream()
                .findFirst();
    }

    @Override
    public Optional<Actor> findByName(String name) {
        String sql = """
                SELECT id, name
                FROM actor
                WHERE name = ?;
                """;
        return jdbcTemplate
                .query(sql, new ActorRowMapper(), name)
                .stream()
                .findFirst();
    }

    @Override
    public void create(Actor actor) {
        String sql = """
                INSERT INTO actor(name)
                VALUES(?);
                """;
        jdbcTemplate.update(sql, actor.getName());
    }

    @Override
    public void update(Actor actor) {
        String sql = """
                UPDATE actor
                SET name = ?
                WHERE id = ?;
                """;
        jdbcTemplate.update(sql, actor.getName(), actor.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = """
                DELETE FROM actor
                WHERE id = ?;
                """;
        jdbcTemplate.update(sql, id);
    }
}
