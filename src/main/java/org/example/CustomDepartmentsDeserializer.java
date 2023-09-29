package org.example;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Deserializer that can handle {@code String} or {@code List<String>}
 * It always creates a list, with all items for a json array, or only one item if input is a string
 */
public class CustomDepartmentsDeserializer extends StdDeserializer<List<String>> {

    public CustomDepartmentsDeserializer() {
        this(null);
    }

    protected CustomDepartmentsDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public List<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        List<String> departmentsList = new ArrayList<>();

        ObjectCodec codec = jsonParser.getCodec();
        JsonNode node = codec.readTree(jsonParser);
        if (node.isTextual()) {
            System.out.println("TEXT " + node);
            departmentsList.add(node.asText());
        } else if (node.isArray()) {
            System.out.println("ARRAY " + node);
            for (JsonNode jsonNode : node) {
                departmentsList.add(jsonNode.asText());
            }
        }
        return departmentsList;
    }
}
