package com.kafka.server.controller;

/*
 * @author masoome.aghayari
 * @since 12/17/23
 */

import com.kafka.server.service.CabLocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/cab/location")
@RequiredArgsConstructor
@Slf4j
public class CabLocationController {
    private final CabLocationService cabLocationService;

    @PutMapping()
    public ResponseEntity<Map<String, String>> updateLocation() throws InterruptedException {
        for (int i = 100; i > 0; i--) {
            cabLocationService.updateLocation(Math.random() + ", " + Math.random());
            Thread.sleep(100);
        }

        return new ResponseEntity<>(Map.of("message", "location updated"), HttpStatus.OK);

    }
}
