package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
@ContextConfiguration(classes=KafkaTopicConfig.class, loader= AnnotationConfigContextLoader.class)
public class KafkaTopicConfigTest {

    @Autowired
    private KafkaTopicConfig kafkaTopicConfig;

    @Test
    public void testJavaguidesTopicBeanCreation() {
        NewTopic topic = kafkaTopicConfig.javaguidesTopic();
        assertNotNull(topic);
        assertEquals("testTopic", topic.name());
    }

    @Test
    public void testJavaguidesJsonTopicBeanCreation() {
        NewTopic topic = kafkaTopicConfig.javaguidesJsonTopic();
        assertNotNull(topic);
        assertEquals("testJsonTopic", topic.name());
    }
}
