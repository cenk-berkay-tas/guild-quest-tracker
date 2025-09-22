package com.cenktas.guild_quest_tracker.player;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    @Query("SELECT p FROM Player p WHERE p.active=true AND p.id=:id")
    public Optional<Player> findById(int id);

    @Query("SELECT p FROM Player p WHERE p.active=true")
    public List<Player> findAll();
}
