package com.cenktas.guild_quest_tracker.guild.exception;

import com.cenktas.guild_quest_tracker.common.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class GuildExceptionHandler {
    @ExceptionHandler(GuildNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleGuildNotFound() {
        return new ResponseEntity<ErrorDetails>(new ErrorDetails("Guild not found.", new Date()), HttpStatus.NOT_FOUND);
    }
}