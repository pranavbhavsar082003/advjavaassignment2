package com.example.advjavaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class SearchViewController {

    @FXML
    private Label infoLabel;

    @FXML
    private ListView<?> listView;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField searchTextField;

//    @FXML
//    void search(ActionEvent event) {
//        String searchTerm = searchTextField.getText().trim();
//
//        try {
//            List<ElementDetails> elementDetailsList = APIUtility.searchElements(searchTerm);
//
//            if (!elementDetailsList.isEmpty()) {
//                // Print details to console (you can remove or modify this based on your needs)
//                System.out.println("Element Details List: " + elementDetailsList);
//
//                // Save details to a JSON file (optional)
//                // saveElementDetailsListToFile(elementDetailsList);
//
//                // Update your UI here (e.g., display details in ListView)
//                updateListView(elementDetailsList);
//            } else {
//                // No elements found
//                System.out.println("No elements found.");
//                infoLabel.setText("No elements found.");
//                infoLabel.setVisible(true);
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace(); // Handle exceptions appropriately
//        }
//    }
//
//    private void updateListView(List<ElementDetails> elementDetailsList) {
//        listView.getItems().clear();
//
//        for (ElementDetails elementDetails : elementDetailsList) {
//            listView.getItems().add(elementDetails.toString()); // Modify this based on your ElementDetails structure
//        }
//
//        progressBar.setVisible(false);
//        listView.setVisible(true);
//        infoLabel.setVisible(false);
//    }
//

    @FXML
    private void initialize() {
        progressBar.setVisible(false);
        listView.setVisible(false);
        infoLabel.setVisible(false);
    }

}