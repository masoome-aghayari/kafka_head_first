package com.kafka.server.service.impl;

/*
 * @author masoome.aghayari
 * @since 12/17/23
 */

import com.kafka.server.model.constants.AppConstants;
import com.kafka.server.service.CabLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CabLocationServiceImpl implements CabLocationService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstants.CAB_LOCATION, location);
    }
}
