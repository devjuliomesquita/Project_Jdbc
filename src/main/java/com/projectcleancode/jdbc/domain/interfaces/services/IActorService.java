package com.projectcleancode.jdbc.domain.interfaces.services;

import com.projectcleancode.jdbc.domain.dto.ActorDTO;

import java.util.List;

public interface IActorService {
    List<ActorDTO> findAll();
    ActorDTO findById(Long id);
    ActorDTO findByName(String name);
    void create(ActorDTO actorDTO);
    void update(ActorDTO actorDTO);
    void delete(ActorDTO actorDTO);
}
