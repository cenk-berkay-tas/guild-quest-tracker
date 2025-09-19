package com.cenktas.guild_quest_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class GuildQuestTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuildQuestTrackerApplication.class, args);
	}

}
