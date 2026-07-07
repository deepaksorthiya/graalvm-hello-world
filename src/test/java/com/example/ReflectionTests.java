package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

class ReflectionTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionTests.class);

    @Test
    void testReflection() {
        Class<?> foo = null;
        try {
            foo = Class.forName("com.example.Foo");
            LOGGER.info("Class: {}", foo);
        } catch (ClassNotFoundException e) {
            LOGGER.error("Error occurred while creating Foo instance", e);
        }
        assertThat(foo).isNotNull();
    }
}
