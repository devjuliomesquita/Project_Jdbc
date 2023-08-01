package com.projectcleancode.jdbc.application;

import com.projectcleancode.jdbc.domain.dto.MovieDTO;
import com.projectcleancode.jdbc.domain.interfaces.services.IMovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    private final IMovieService service;
    public MovieController(IMovieService service){
        this.service = service;
    }
    @GetMapping("/findall")
    public ResponseEntity<List<MovieDTO>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
    @GetMapping("/findByName/{name}")
    public ResponseEntity<MovieDTO> findByName(@PathVariable("name") String name){
        return new ResponseEntity<>(service.findByName(name), HttpStatus.OK);
    }
    @PostMapping
    public void crete(@RequestBody MovieDTO movieDTO){
        service.create(movieDTO);
    }
    @PutMapping
    public void update(@RequestBody MovieDTO movieDTO){
        service.create(movieDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }
}
