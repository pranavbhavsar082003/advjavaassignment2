package com.example.advjavaassignment2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    private static final String RAPID_API_KEY = "08a1867816mshc7a59701721a57cp15f500jsnb1e36b4d4fdf";
    private static final String API_BASE_URL = "https://periodic-table-api.p.rapidapi.com/";

    public static void searchElements(String searchTerm) throws IOException, InterruptedException {
        String encodedSearchTerm = searchTerm.replaceAll(" ", "%20");
        String uri = API_BASE_URL + "getElementsByName/" + encodedSearchTerm + "?rapidapi-key=" + RAPID_API_KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofFile(Paths.get("elements.json")));
    }
}
