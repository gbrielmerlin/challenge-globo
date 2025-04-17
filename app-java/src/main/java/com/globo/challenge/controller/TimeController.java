package com.globo.challenge.controller;

import com.globo.challenge.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/time")
@RequiredArgsConstructor
public class TimeController {

    private final TimeService service;

    @GetMapping
    public ResponseEntity<LocalTime> getTime() {

        return ResponseEntity.ok(service.getTimeCacheable().getTime());
    }
}
