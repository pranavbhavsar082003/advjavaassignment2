package com.example.advjavaassignment2;

import java.util.List;
import java.util.stream.Collectors;

public class ElementSearch {
    public static List<ElementDetails> searchElementsByName(List<ElementDetails> elements, String searchTerm) {
        return elements.stream()
                .filter(element -> element.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }
}
