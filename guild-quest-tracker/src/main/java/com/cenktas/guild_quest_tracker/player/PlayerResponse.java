package com.cenktas.guild_quest_tracker.player;

public class PlayerResponse {
    private final Integer id;
    private final String name;

    public PlayerResponse(Player p) {
        this.id = p.getId();
        this.name = p.getName();
    }

    public PlayerResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
