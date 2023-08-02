package com.projectcleancode.jdbc.domain.services;

import com.projectcleancode.jdbc.domain.dto.ActorDTO;
import com.projectcleancode.jdbc.domain.interfaces.repository.IActorRepository;
import com.projectcleancode.jdbc.domain.interfaces.services.IActorService;
import com.projectcleancode.jdbc.domain.model.Actor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ActorService implements IActorService {
    private final IActorRepository repository;
    public ActorService(IActorRepository repository){
        this.repository = repository;
    }
    @Override
    public List<ActorDTO> findAll() {
        List<Actor> actorList = repository.findAll();
        return actorList
                .stream()
                .map(Actor::toActorDto)
                .collect(Collectors.toList());
    }

    @Override
    public ActorDTO findById(Long id) {
        Actor actor = repository.findById(id).get();
        return actor.toActorDto();
    }

    @Override
    public ActorDTO findByName(String name) {
        Actor actor = repository.findByName(name).get();
        return actor.toActorDto();
    }

    @Override
    public void create(ActorDTO actorDTO) {
        Actor actor = new Actor(actorDTO);
        repository.create(actor);
    }

    @Override
    public void update(ActorDTO actorDTO) {
        Actor actor = new Actor(actorDTO);
        repository.update(actor);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
