package com.cenktas.guild_quest_tracker.guild;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GuildRepository extends CrudRepository<Guild, Integer> {

    @Query("SELECT g FROM Guild g WHERE g.active=true")
    public List<Guild> findAll();

    @Query("SELECT g FROM Guild g WHERE g.active=true AND g.id=:id")
    public Optional<Guild> findById(int id);

}
