package com.example.testloggingmdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@SpringBootApplication
public class TestLoggingMdcApplication {
    //private static Logger LOGGER = LoggerFactory.getLogger(TestLoggingMdcApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TestLoggingMdcApplication.class, args);
        Logger logger = LoggerFactory.getLogger(TestLoggingMdcApplication.class);
        MDC.put("traceId", "45");
        logger.info("{\"type\":\"example\",\"msg\":\"example of json message with type\"}");
    }
}
