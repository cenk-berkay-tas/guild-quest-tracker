package com.cenktas.guild_quest_tracker.player.exception;

import com.cenktas.guild_quest_tracker.common.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class PlayerExceptionHandler {
    @ExceptionHandler(PlayerNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlePlayerNotFound() {
        return new ResponseEntity<ErrorDetails>(new ErrorDetails("Player not found.", new Date()), HttpStatus.NOT_FOUND);
    }
}
