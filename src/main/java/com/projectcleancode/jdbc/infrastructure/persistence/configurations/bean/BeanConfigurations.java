package com.projectcleancode.jdbc.infrastructure.persistence.configurations.bean;

import com.projectcleancode.jdbc.domain.interfaces.repository.IActorRepository;
import com.projectcleancode.jdbc.domain.interfaces.repository.IMovieRepository;
import com.projectcleancode.jdbc.domain.interfaces.services.IActorService;
import com.projectcleancode.jdbc.domain.interfaces.services.IMovieService;
import com.projectcleancode.jdbc.domain.services.ActorService;
import com.projectcleancode.jdbc.domain.services.MovieService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {
    @Bean
    IMovieService movieService(IMovieRepository movieRepository){
        return new MovieService(movieRepository);
    }
    @Bean
    IActorService actorService(IActorRepository actorRepository){
        return new ActorService(actorRepository);
    }
}
