package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author Deepak
 */
public class MainApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        int i = 0;
        LOGGER.info("Hello World!");
        LOGGER.info("Value of i: {}", i);

        Calculator calculator = new Calculator();

        int sum = calculator.sum(1, 2);
        int sub = calculator.sub(1, 2);

        LOGGER.info("Sum: {}", sum);
        LOGGER.info("Subtraction: {}", sub);

        Map<Integer, String> map = calculator.getMap();
        LOGGER.info("Map: {}", map);

        try {
            Class<?> foo = Class.forName("com.example.Foo");
            Foo fooInstance = (Foo) foo.newInstance();
            fooInstance.print();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            LOGGER.error("Error occurred while creating Foo instance", e);
        }

        // serialization and deserialization test
        // Create an instance of the Person class
        Person person = new Person("John Doe", 30);

        // Serialize the Person object to JSON
        String jsonString = JsonUtil.serialize(person);
        System.out.println("Serialized JSON: " + jsonString);

        // Deserialize the JSON back to a Person object
        Person deserializedPerson = JsonUtil.deserialize(jsonString, Person.class);
        System.out.println("Deserialized Person: " + deserializedPerson.name() + ", Age: " + deserializedPerson.age());

    }
}
