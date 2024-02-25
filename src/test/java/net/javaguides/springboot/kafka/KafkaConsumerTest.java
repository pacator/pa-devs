package net.javaguides.springboot.kafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class KafkaConsumerTest {

    @Mock
    private Logger loggerMock;

    @InjectMocks
    private KafkaConsumer kafkaConsumer;

    @Test
    public void testConsume() {
        // Given
        String message = "Test message";

        // When
        kafkaConsumer.consume(message);

        // Then
        verify(loggerMock, times(1)).info("Message received -> " + message);
    }
}