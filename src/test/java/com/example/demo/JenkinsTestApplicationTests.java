package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
	public static org.slf4j.Logger logger= LoggerFactory.getLogger(JenkinsTestApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test Excuted");
		assertEquals(true, true);
	}

}
