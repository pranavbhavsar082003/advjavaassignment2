package com.example.advjavaassignment2;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APIUtility {

    private static final String RAPID_API_KEY = "08a1867816mshc7a59701721a57cp15f500jsnb1e36b4d4fdf";
    private static final String API_BASE_URL = "https://periodic-table-api.p.rapidapi.com/";

    public static List<ElementDetails> searchElements(String searchTerm) throws IOException, InterruptedException {
        String encodedSearchTerm = searchTerm.replaceAll(" ", "%20");
        String uri = API_BASE_URL + "search?name=" + encodedSearchTerm + "&rapidapi-key=" + RAPID_API_KEY;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("X-RapidAPI-Key", RAPID_API_KEY)
                .header("X-RapidAPI-Host", "periodic-table-api.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Failed to retrieve data. HTTP Status Code: " + response.statusCode());
        }

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        JsonArray dataArray = jsonResponse.getAsJsonArray("data");

        List<ElementDetails> elementList = new ArrayList<>();
        for (int i = 0; i < dataArray.size(); i++) {
            JsonObject elementJson = dataArray.get(i).getAsJsonObject();
            ElementDetails element = gson.fromJson(elementJson, ElementDetails.class);
            elementList.add(element);
        }

        return elementList;
    }
}
