package com.globo.challenge.controller;

import com.globo.challenge.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TimeController {

    @GetMapping("/time")
    @Cacheable("time")
    public ResponseEntity<String> getTime() {
        String resposta = "Horário atual do servidor: " + LocalDateTime.now();
        return ResponseEntity.ok(resposta);
    }
}
