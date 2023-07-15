package com.gabriel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
