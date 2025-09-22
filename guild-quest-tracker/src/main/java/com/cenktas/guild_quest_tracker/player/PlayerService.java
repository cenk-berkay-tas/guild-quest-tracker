package com.cenktas.guild_quest_tracker.player;

import com.cenktas.guild_quest_tracker.player.exception.PlayerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository ps) {
        this.playerRepository = ps;
    }
    public PlayerResponse save(PlayerRequest pr) {
        Player p = new Player(pr);
        playerRepository.save(p);
        return new PlayerResponse(p);
    }

    public List<PlayerResponse> getAll() {
        List<Player> players = playerRepository.findAll();
        return players.stream().map(PlayerResponse::new).toList();
    }

    public PlayerResponse findById(int id) {
        Player p = playerRepository.findById(id).orElseThrow(PlayerNotFoundException::new);
        return new PlayerResponse(p);
    }

    public void delete(int id) {
        Player p = playerRepository.findById(id).orElseThrow(PlayerNotFoundException::new);
        p.setActive(false);
        playerRepository.save(p);
    }
}
