package com.cenktas.guild_quest_tracker.guild;

import com.cenktas.guild_quest_tracker.guild.exception.GuildNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuildService {
    private final GuildRepository guildRepository;

    public GuildService(GuildRepository guildRepository) {
        this.guildRepository = guildRepository;
    }

    public GuildResponse save(GuildRequest request) {
        Guild g = new Guild(request);
        guildRepository.save(g);
        return new GuildResponse(g);
    }

    public List<GuildResponse> getAll() {
        List<Guild> guilds = guildRepository.findAll();
        return guilds.stream().map(GuildResponse::new).toList();
    }

    public GuildResponse findById(int id) {
        Guild g = guildRepository.findById(id).orElseThrow(GuildNotFoundException::new);
        return new GuildResponse(g);
    }

    public void delete(int id) {
        Guild g = guildRepository.findById(id).orElseThrow(GuildNotFoundException::new);
        g.setActive(false);
        guildRepository.save(g);
    }
}
