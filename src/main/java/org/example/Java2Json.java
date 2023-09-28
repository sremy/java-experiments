package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domain.Address;
import org.example.domain.AddressSingleDpt;
import org.example.domain.Customer;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Java2Json {

    public static void main(String[] args) throws IOException {
        new Java2Json().serialize("customer-departments-list.json");
    }

    void serialize(String filename) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Address address = new Address("Paris", "75017", "rue Cardinet", "17A", List.of("Ile-de-France", "Paris"));
//        AddressSingleDpt addressSingleDpt = new AddressSingleDpt("Paris", "75017", "rue Cardinet", "17A", "Ile-de-France");
        Customer customer = new Customer("Bond", "James", address, 1);
        objectMapper.writeValue(new File("data", filename), customer);
    }
}
