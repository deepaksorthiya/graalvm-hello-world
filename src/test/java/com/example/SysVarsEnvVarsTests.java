package com.example;

import org.junit.jupiter.api.Test;

class SysVarsEnvVarsTests {

    @Test
    void sysVarsEnvVarsTest() {
        System.out.println("#############System Variables #############");
        System.getProperties().forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("#############Environment Variables #############");
        System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
