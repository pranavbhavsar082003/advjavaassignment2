package com.example.advjavaassignment2;


import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public class APIUtility {
    private static final Gson gson = new Gson();

    // Replace "YOUR_RAPID_API_KEY" with your actual RapidAPI key
    private static final String RAPID_API_KEY = "aef824fe4emshb12ddfcf34f9df6p1073bejsnf34b0f63d36a";
    private static final String API_ENDPOINT = "https://chemical-elements.p.rapidapi.com/";

    public static List<ElementDetails> getElementsFromAPI() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_ENDPOINT))
                .header("X-RapidAPI-Key", RAPID_API_KEY)
                .header("X-RapidAPI-Host", "chemical-elements.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ElementDetails[] elements = gson.fromJson(response.body(), ElementDetails[].class);
                return Arrays.asList(elements);
            } else {
                System.out.println("Error: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
