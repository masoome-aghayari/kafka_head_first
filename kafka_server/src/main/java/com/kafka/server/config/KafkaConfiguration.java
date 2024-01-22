package com.kafka.server.config;

/*
 * @author masoome.aghayari
 * @since 12/17/23
 */

import com.kafka.server.model.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(AppConstants.CAB_LOCATION)
                .build();
    }
}
