package net.javaguides.springboot;

import net.javaguides.springboot.config.KafkaTopicConfigTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Import(KafkaTopicConfigTest.class)
@TestPropertySource(locations="classpath:test.properties")
class SpringbootKafkaTutorialApplicationTests {

	@Test
	void contextLoads() {
	}

}