package com.cenktas.guild_quest_tracker.player;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository ps) {
        this.playerRepository = ps;
    }
    public Player save(Player p) {
        return playerRepository.save(p);
    }

    public Iterable<Player> getAll() {
        return playerRepository.findAll();
    }
}
