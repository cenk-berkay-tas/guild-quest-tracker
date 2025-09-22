package com.cenktas.guild_quest_tracker.player;

import com.cenktas.guild_quest_tracker.common.ErrorDetails;
import com.cenktas.guild_quest_tracker.player.exception.PlayerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService ps) {
        this.playerService = ps;
    }

    @PostMapping()
    public ResponseEntity<PlayerResponse> save(@RequestBody PlayerRequest pr) {
        return new ResponseEntity<PlayerResponse>(playerService.save(pr), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<PlayerResponse>> findAll() {
        return new ResponseEntity<Iterable<PlayerResponse>>(playerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<PlayerResponse> findById(@PathVariable int playerId) {
        return new ResponseEntity<PlayerResponse>(playerService.findById(playerId), HttpStatus.OK);
    }

    @DeleteMapping("/{playerId}")
    public void delete(@PathVariable int playerId) {
        playerService.delete(playerId);
    }

}

