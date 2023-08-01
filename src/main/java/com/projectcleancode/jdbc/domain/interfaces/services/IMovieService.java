package com.projectcleancode.jdbc.domain.interfaces.services;

import com.projectcleancode.jdbc.domain.dto.MovieDTO;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> findAll();
    MovieDTO findById(Long id);
    MovieDTO findByName(String name);
    void create(MovieDTO movieDTO);
    void update(MovieDTO movieDTO);
    void delete(Long id);
}
