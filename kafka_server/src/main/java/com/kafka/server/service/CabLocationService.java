package com.kafka.server.service;

/*
 * @author masoome.aghayari
 * @since 12/17/23
 */

import org.springframework.stereotype.Service;

@Service
public interface CabLocationService {
    void updateLocation(String location);
}
