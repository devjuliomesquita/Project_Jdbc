package com.projectcleancode.jdbc.infrastructure.persistence.repositories;

import com.projectcleancode.jdbc.domain.interfaces.repository.IMovieRepository;
import com.projectcleancode.jdbc.domain.model.Movie;
import com.projectcleancode.jdbc.infrastructure.persistence.configurations.map.MovieRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MovieRepository implements IMovieRepository {
    private final JdbcTemplate jdbcTemplate;
    public MovieRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Movie> findAll() {
        var sql = """
                SELECT id, name, realiseDate
                FROM movie
                LIMIT 100
                """;
        return jdbcTemplate.query(sql, new MovieRowMapper());
    }

    @Override
    public Movie findById(Long id) {
        return null;
    }

    @Override
    public Movie findByName(String title) {
        return null;
    }

    @Override
    public void create(Movie movie) {

    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(Long id) {

    }
}
