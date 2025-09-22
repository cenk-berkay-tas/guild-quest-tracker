package com.cenktas.guild_quest_tracker.player;

import jakarta.persistence.*;
import lombok.*;

@Entity
@RequiredArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int id;

    @Column(name = "player_name")
    private String name;

    @Column(name = "player_active")
    private boolean active = true;

    public Player(PlayerRequest p) {
        this.name = p.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
