package com.projectcleancode.jdbc.domain.services;

import com.projectcleancode.jdbc.domain.dto.MovieDTO;
import com.projectcleancode.jdbc.domain.interfaces.repository.IMovieRepository;
import com.projectcleancode.jdbc.domain.interfaces.services.IMovieService;
import com.projectcleancode.jdbc.domain.model.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService implements IMovieService {
    private final IMovieRepository repository;
    public MovieService(IMovieRepository repository){
        this.repository = repository;
    }
    @Override
    public List<MovieDTO> findAll() {
        List<Movie> movieList = repository.findAll();
        return movieList
                .stream()
                .map(Movie::toMovieDto)
                .collect(Collectors.toList());
    }

    @Override
    public MovieDTO findById(Long id) {
        Movie movie = repository.findById(id);
        return movie.toMovieDto();
    }

    @Override
    public MovieDTO findByName(String name) {
        Movie movie = repository.findByName(name);
        return movie.toMovieDto();
    }

    @Override
    public void create(MovieDTO movieDTO) {
        Movie movie = new Movie(movieDTO);
        repository.create(movie);
    }

    @Override
    public void update(MovieDTO movieDTO) {
        Movie movie = new Movie(movieDTO);
        repository.create(movie);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
