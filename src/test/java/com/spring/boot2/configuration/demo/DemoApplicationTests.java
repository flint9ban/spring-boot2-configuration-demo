package com.spring.boot2.configuration.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.time.Instant;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	DemoConfiguration demoConfiguration;

	public void testDuration() {
		Instant startTime = Instant.now();
		Instant endTime = startTime.plus(demoConfiguration.getDuration());
		assertThat(Duration.between(startTime,endTime)).isEqualTo(Duration.ofDays(5));
	}

	@Test
	public void testArray(){
		assertThat(demoConfiguration.getArray().size()).isEqualTo(3);
		assertThat(demoConfiguration.getArray().get(0)).isEqualTo("zero");
		assertThat(demoConfiguration.getArray().get(1)).isEqualTo("one");
		assertThat(demoConfiguration.getArray().get(2)).isEqualTo("two");
	}
}
