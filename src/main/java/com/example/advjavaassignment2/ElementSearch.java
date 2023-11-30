package com.example.advjavaassignment2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ElementSearch {

    public static List<ElementDetails> parseElementsFromFile() throws IOException {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("elements.json")) {
            Type elementType = new TypeToken<List<ElementDetails>>() {}.getType();
            return gson.fromJson(reader, elementType);
        }
    }

    public static List<ElementDetails> searchElementsByName(List<ElementDetails> elements, String searchTerm) {
        return elements.stream()
                .filter(element -> element.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }
}
