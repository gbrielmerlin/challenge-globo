package com.globo.challenge.service;

import com.globo.challenge.components.RedisComponent;
import com.globo.challenge.dto.TimePayload;
import com.globo.challenge.dto.TimePayloadTopic;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TimeService {

    private final RedisTemplate<String, LocalTime> redis;

    public LocalTime getTimeCacheable() {
    }

    public Optional<V> getExecutionData(String topic) {
        return Optional.ofNullable(redis.opsForValue().get(topic));
    }

    public void saveData(V data) {
        redis.opsForValue().set("time", data, RedisComponent, DEFAULT_TIME_UNIT);
    }
}
