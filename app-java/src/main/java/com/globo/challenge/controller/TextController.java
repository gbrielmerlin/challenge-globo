package com.globo.challenge.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TextController {

    @GetMapping("/text")
    @Cacheable("text")
    public ResponseEntity<String> getText() {

        return ResponseEntity.ok("Fixed String.");
    }
}
