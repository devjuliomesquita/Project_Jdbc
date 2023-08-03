package com.projectcleancode.jdbc.domain.interfaces.repository;

import com.projectcleancode.jdbc.domain.model.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieRepository {
    List<Movie> findAll();
    Optional<Movie> findById(Long id);
    Optional<Movie> findByName(String title);
    void create(Movie movie);
    void update(Movie movie);
    void delete(Long id);
}
