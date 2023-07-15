package com.gabriel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
