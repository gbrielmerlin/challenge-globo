package com.globo.challenge.dto;

import com.globo.challenge.interfaces.RedisData;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class TimePayload implements RedisData {

    private TimePayload() {}

    @Setter
    private LocalTime time;

    public static TimePayload of() {
       TimePayload time = new TimePayload();
       time.setTime(LocalTime.now());

       return time;
    }

    @Override
   public String getTopic() {
        return TimePayloadTopic.getTopic();
    }
}
