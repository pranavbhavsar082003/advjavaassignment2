package com.example.advjavaassignment2;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Testing {

    public static void main(String[] args) {
        try {
//        It will take some time to retrieve data from API
            List<ElementDetails> uraniumDetailsList = APIUtility.searchElements("Oxygen");

            if (!uraniumDetailsList.isEmpty()) {
                saveToJsonFile(uraniumDetailsList.get(0), "element.json");
            } else {
                System.out.println("Element not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveToJsonFile(ElementDetails element, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            Gson gson = new Gson();
            String json = gson.toJson(element);
            writer.write(json);
            System.out.println("Element details saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}