package com.kafka.user.service.impl;

/*
 * @author masoome.aghayari
 * @since 12/17/23
 */

import com.kafka.user.service.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService {
    @Override
    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        log.info(location);
    }
}
