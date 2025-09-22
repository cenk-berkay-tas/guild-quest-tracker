package com.cenktas.guild_quest_tracker.player;

public class PlayerRequest {
    private final String name;

    public PlayerRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
