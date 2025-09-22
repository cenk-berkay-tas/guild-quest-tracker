package com.cenktas.guild_quest_tracker.guild;

public class GuildResponse {
    private final Integer id;
    private final String name;

    public GuildResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GuildResponse(Guild guild) {
        this.id = guild.getId();
        this.name = guild.getName();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
