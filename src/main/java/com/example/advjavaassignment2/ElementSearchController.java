package com.example.advjavaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.List;

public class ElementSearchController {

    @FXML
    private TextField searchTextField;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ListView<ElementDetails> listView;

    @FXML
    private Label infoLabel;

    @FXML
    private Button detailsButton;

    private static ElementDetails selectedElement;

    @FXML
    private void initialize() {
        // Initially hide ListView and ProgressBar
        listView.setVisible(false);
        progressBar.setVisible(false);
    }

    @FXML
    private void searchButtonClicked(ActionEvent actionEvent) {
        String searchTerm = searchTextField.getText().trim();

        try {
            progressBar.setVisible(true);

            List<ElementDetails> elementList = APIUtility.searchElements(searchTerm);

            if (!elementList.isEmpty()) {
                listView.getItems().setAll(elementList);
                infoLabel.setText("Results for: " + searchTerm);

                listView.setVisible(true);
                progressBar.setVisible(false);
            } else {
                infoLabel.setText("No results found for: " + searchTerm);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            infoLabel.setText("Error fetching data. Please try again.");

            listView.setVisible(false);
            progressBar.setVisible(true);
        }
    }

    @FXML
    private void showDetails(ActionEvent event) {
        selectedElement = listView.getSelectionModel().getSelectedItem();

        if (selectedElement != null) {
            try {
                ElementInfoController.showDetails(selectedElement);
            } catch (IOException e) {
                e.printStackTrace();
                infoLabel.setText("Error loading details. Please try again.");
            }
        } else {
            infoLabel.setText("Please select an element before viewing details.");
        }

        if (selectedElement != null) {
            try {
                ViewUtils.changeScenes(event, "details-view.fxml");
            } catch (Exception e) {
                e.printStackTrace();
                infoLabel.setText("Error loading details. Please try again.");
            }
        }
    }
}
