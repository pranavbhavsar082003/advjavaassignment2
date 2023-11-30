package com.example.advjavaassignment2;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        try {
            APIUtility.searchElements("Hydrogen");
            List<ElementDetails> allElements = ElementSearch.parseElementsFromFile();
            List<ElementDetails> searchResults = ElementSearch.searchElementsByName(allElements, "Hyd");

            // Now 'searchResults' contains the filtered elements based on the search term
            System.out.println("Search Results: " + searchResults);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
