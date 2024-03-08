package net.javaguides.springboot.kafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
@ContextConfiguration(classes= KafkaConsumer.class, loader= AnnotationConfigContextLoader.class)
public class KafkaConsumerTest {

    @Mock
    private KafkaConsumer kafkaConsumer;
    @Spy
    private Logger spyLogger = LoggerFactory.getLogger(KafkaConsumer.class);

    @Mock
    private Logger mockLOG;

//    @Test
//    public void shouldLogMessageWhenConsumed() {
//        String message = "Hello, Kafka!";
//
//        // Assuming isInfoEnabled() returns true in your case
//        when(spyLogger.isInfoEnabled()).thenReturn(true);
//
//        kafkaConsumer.consume(message);
//
//        // Verify that the spyLogger was called with the expected message
//        verify(spyLogger, times(1)).info(String.format("Message received -> %s", message));
//    }

    @Test
    public void shouldNotLogMessageWhenLoggerIsDisabled() {
        String message = "Hello, Kafka!";
        when(mockLOG.isInfoEnabled()).thenReturn(false);
        kafkaConsumer.consume(message);
        verify(mockLOG, times(0)).info(String.format("Message received -> %s", message));
    }

    @Test
    public void shouldNotThrowExceptionWhenMessageIsNull() {
        String message = null;
        when(mockLOG.isInfoEnabled()).thenReturn(true);
        assertDoesNotThrow(() -> { kafkaConsumer.consume(message); });
    }
}