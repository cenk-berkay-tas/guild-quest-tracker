package com.cenktas.guild_quest_tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessageController {
    @GetMapping("/api/test")
    public String getMessage() {
        return "Hello !";
    }
}
