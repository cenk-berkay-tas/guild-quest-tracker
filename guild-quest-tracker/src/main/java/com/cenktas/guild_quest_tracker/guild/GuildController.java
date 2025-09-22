package com.cenktas.guild_quest_tracker.guild;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/guild")
public class GuildController {

    private final GuildService guildService;

    public GuildController(GuildService gs) {
        this.guildService = gs;
    }

    @PostMapping()
    public ResponseEntity<GuildResponse> save(@RequestBody GuildRequest request) {
        return new ResponseEntity<GuildResponse>(guildService.save(request), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<GuildResponse>> findAll() {
        return new ResponseEntity<Iterable<GuildResponse>>(guildService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuildResponse> findById(@PathVariable int id) {
        return new ResponseEntity<GuildResponse>(guildService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        guildService.delete(id);
    }
}
