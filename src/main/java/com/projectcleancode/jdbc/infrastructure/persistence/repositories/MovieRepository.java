package com.projectcleancode.jdbc.infrastructure.persistence.repositories;

import com.projectcleancode.jdbc.domain.interfaces.repository.IMovieRepository;
import com.projectcleancode.jdbc.domain.model.Movie;
import com.projectcleancode.jdbc.infrastructure.persistence.configurations.map.MovieRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository implements IMovieRepository {
    private final JdbcTemplate jdbcTemplate;
    public MovieRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Movie> findAll() {
        var sql = """
                SELECT id, title, realiseDate
                FROM movie
                LIMIT 100;
                """;
        return jdbcTemplate.query(sql, new MovieRowMapper());
    }

    @Override
    public Optional<Movie> findById(Long id) {
        String sql = """
                SELECT id, title, realiseDate
                FROM movie
                WHERE id = ?;
                """;
        return jdbcTemplate
                .query(sql, new MovieRowMapper(), id)
                .stream()
                .findFirst();
    }

    @Override
    public Optional<Movie> findByName(String title) {
        String sql  = """
                SELECT id, title, realiseDate
                FROM movie
                WHERE name = ?;
                """;
        return jdbcTemplate
                .query(sql, new MovieRowMapper(), title)
                .stream()
                .findFirst();
    }

    @Override
    public void create(Movie movie) {
        String sql = """
                INSERT INTO movie(title, realiseDate)
                VALUES(?, ?);
                """;
        jdbcTemplate.update(sql, movie.getTitle(), movie.getRealiseDate());
    }

    @Override
    public void update(Movie movie) {
        String sql = """
                UPDATE movie
                SET title = ?, realiseDate = ?
                WHERE id = ?;
                """;
        jdbcTemplate.update(sql, movie.getTitle(),movie.getRealiseDate(),movie.getId());
    }

    @Override
    public void delete(Long id) {
        String sql = """
                DELETE FROM movie
                WHERE id = ?;
                """;
        jdbcTemplate.update(sql,id);
    }
}
