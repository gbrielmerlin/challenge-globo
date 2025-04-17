package com.globo.challenge.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/text")
@RequiredArgsConstructor
public class TextController {

    @GetMapping
    public ResponseEntity<String> getText() {

        return ResponseEntity.ok("Fixed String.");
    }
}
