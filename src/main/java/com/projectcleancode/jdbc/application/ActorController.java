package com.projectcleancode.jdbc.application;

import com.projectcleancode.jdbc.domain.dto.ActorDTO;
import com.projectcleancode.jdbc.domain.interfaces.services.IActorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {
    private final IActorService service;
    public ActorController(IActorService service){
        this.service = service;
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<ActorDTO>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<ActorDTO> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
    @GetMapping("/findByName/{name}")
    public ResponseEntity<ActorDTO> findByName(@PathVariable("name") String name){
        return new ResponseEntity<>(service.findByName(name),HttpStatus.OK);
    }
    @PostMapping
    public void create(@RequestBody ActorDTO actorDTO){
        service.create(actorDTO);
    }
    @PutMapping
    public void update(@RequestBody ActorDTO actorDTO){
        service.update(actorDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }
}
