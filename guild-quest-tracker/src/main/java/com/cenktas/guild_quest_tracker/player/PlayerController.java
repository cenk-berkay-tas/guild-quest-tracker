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
    public ResponseEntity<PlayerResponse> save(@RequestBody PlayerRequest request) {
        return new ResponseEntity<PlayerResponse>(playerService.save(request), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<PlayerResponse>> findAll() {
        return new ResponseEntity<Iterable<PlayerResponse>>(playerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerResponse> findById(@PathVariable int id) {
        return new ResponseEntity<PlayerResponse>(playerService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        playerService.delete(id);
    }

}

