package com.webflux.webfluxmysql.services;

import com.webflux.webfluxmysql.models.UserModels;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UsersRepository  extends ReactiveCrudRepository<UserModels, Long> {

   @Query("SELECT * FROM users WHERE username = :username")
   Mono<UserModels> findByUsername(String username);

}
