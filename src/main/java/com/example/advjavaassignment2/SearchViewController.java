package com.example.advjavaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;

public class SearchViewController {

    @FXML
    private Label infoLabel;

    @FXML
    private ListView<ElementDetails> listView;

    @FXML
    private Label msgLabel;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private HBox resultsBox;

    @FXML
    private VBox resultsVBox;

    @FXML
    private TextField searchTextField;

    @FXML
    private VBox selectedVBox;

    // List to store all elements (you need to set this list with actual data)
    private List<ElementDetails> allElements;

    public void initialize() {
        // Initialize or set the allElements list with actual data from the API
        // For example: allElements = APIUtility.getElementsFromAPI();
    }

    @FXML
    void search(ActionEvent event) {
        String searchTerm = searchTextField.getText();

        if (searchTerm != null && !searchTerm.trim().isEmpty()) {
            List<ElementDetails> searchResults = ElementSearch.searchElementsByName(allElements, searchTerm);

            if (!searchResults.isEmpty()) {
                // Display search results in the ListView
                listView.getItems().setAll(searchResults);
                infoLabel.setText("Search results for '" + searchTerm + "':");
            } else {
                // No results found
                infoLabel.setText("No results found for '" + searchTerm + "'.");
                listView.getItems().clear();
            }
        } else {
            // Empty search term
            infoLabel.setText("Please enter a search term.");
            listView.getItems().clear();
        }
    }
}
