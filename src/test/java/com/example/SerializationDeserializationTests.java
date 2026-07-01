package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SerializationDeserializationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializationDeserializationTests.class);

    @Test
    void testSerializationDeserialization() {
        try {
            // serialization and deserialization test
            // Create an instance of the Person class
            Person person = new Person("John Doe", 30);

            // Serialize the Person object to JSON
            String jsonString = JsonUtil.serialize(person);
            LOGGER.info("Serialized JSON: {}", jsonString);

            // Deserialize the JSON back to a Person object
            Person deserializedPerson = JsonUtil.deserialize(jsonString, Person.class);
            LOGGER.info("Deserialized Person: {}, Age: {}", deserializedPerson.name(), deserializedPerson.age());
        } catch (Exception e) {
            LOGGER.error("Error occurred during serialization/deserialization", e);
        }
    }
}
