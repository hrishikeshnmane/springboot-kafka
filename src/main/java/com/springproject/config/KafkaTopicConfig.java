package com.springproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("topicString")
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic topicJson(){
        return TopicBuilder.name("topicJson")
                .replicas(1)
                .build();
    }
}
