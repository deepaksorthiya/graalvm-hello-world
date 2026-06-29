package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ReflectionTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionTests.class);

    @Test
    void testReflection() {
        try {
            Class<?> foo = Class.forName("com.example.Foo");
            LOGGER.info("Class: {}", foo);
        } catch (ClassNotFoundException e) {
            LOGGER.error("Error occurred while creating Foo instance", e);
        }
    }
}
