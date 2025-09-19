package com.cenktas.guild_quest_tracker;

import com.cenktas.guild_quest_tracker.player.Player;
import com.cenktas.guild_quest_tracker.player.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService ps) {
        this.playerService = ps;
    }

    @PostMapping("/player")
    public ResponseEntity<Player> save(@RequestBody Player p) {
        return new ResponseEntity<Player>( playerService.save(p), HttpStatus.CREATED);
    }

    @GetMapping("/player")
    public ResponseEntity<Iterable<Player>> save() {
        return new ResponseEntity<Iterable<Player>>(playerService.getAll(), HttpStatus.OK);
    }
}

