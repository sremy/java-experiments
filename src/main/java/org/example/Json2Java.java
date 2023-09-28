package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domain.Customer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Json2Java {

    public static void main(String[] args) throws IOException {
        new Json2Java().deserialize("customer-departments-list.json");
//        new Json2Java().deserialize("customer-department-string.json");
    }


    void deserialize(String filename) throws IOException {
        File file = new File("data", filename);
        ObjectMapper objectMapper = new ObjectMapper();
        Customer customer = objectMapper.readValue(Files.readString(file.toPath()), Customer.class);
        System.out.println(customer);

    }
}
