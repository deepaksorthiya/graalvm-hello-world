package com.example;

import tools.jackson.databind.json.JsonMapper;

public class JsonUtil {

    private static final JsonMapper jsonMapper = JsonMapper.builder().build();

    public static String serialize(Person person) {
        try {
            return jsonMapper.writeValueAsString(person);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing person to JSON", e);
        }
    }

    public static Person deserialize(String jsonString, Class<Person> personClass) {
        try {
            return jsonMapper.readValue(jsonString, personClass);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing JSON to person", e);
        }
    }
}
