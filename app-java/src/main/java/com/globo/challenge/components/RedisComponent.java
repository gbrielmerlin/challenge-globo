package com.globo.challenge.components;

import com.globo.challenge.interfaces.RedisData;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class RedisComponent {

    private static final TimeUnit DEFAULT_TIME_UNIT = TimeUnit.MINUTES;
    private static final long DEFAULT_TIMEOUT = DEFAULT_TIME_UNIT.toMinutes(1);
}
