package net.javaguides.springboot.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerWrapper {
    private final Logger logger;

    public LoggerWrapper(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    public void info(String message) {
        logger.info(message);
    }

    // You can add other log level methods as needed
}
