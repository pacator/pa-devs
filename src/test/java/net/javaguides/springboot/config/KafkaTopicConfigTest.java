package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class KafkaTopicConfigTest {

    @Autowired
    private final KafkaTopicConfig kafkaTopicConfig;

    public KafkaTopicConfigTest(KafkaTopicConfig kafkaTopicConfig) {
        this.kafkaTopicConfig = kafkaTopicConfig;
    }

    @Test
    public void testJavaguidesTopicBeanCreation() {
        NewTopic topic = kafkaTopicConfig.javaguidesTopic();
        assertNotNull(topic);
        assertEquals("testTopic", topic.name());
        // Add more assertions as per your requirements
    }

    @Test
    public void testJavaguidesJsonTopicBeanCreation() {
        NewTopic topic = kafkaTopicConfig.javaguidesJsonTopic();
        assertNotNull(topic);
        assertEquals("testJsonTopic", topic.name());
        // Add more assertions as per your requirements
    }
}
