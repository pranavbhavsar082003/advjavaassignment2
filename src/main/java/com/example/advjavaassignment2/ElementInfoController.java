package com.example.advjavaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ElementInfoController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label categoryLabel;

    @FXML
    private Label atomicMassLabel;

    @FXML
    private Label densityLabel;

    @FXML
    private Label discoveredByLabel;

    @FXML
    private Label meltBoilLabel;

    @FXML
    private Label electronConfigurationLabel;

    @FXML
    private ImageView bohrModelImageView;

    @FXML
    private Label summaryLabel;

    @FXML
    private Button backButton;

    private static ElementDetails selectedElement;

    public static void showDetails(ElementDetails element) throws IOException {
        selectedElement = element;

        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(ElementInfoController.class.getResource("details-view.fxml"));
        javafx.scene.Parent root = loader.load();

        ElementInfoController controller = loader.getController();
        controller.initialize();

        Stage stage = new Stage();
        stage.setTitle("Element Info");
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }


    @FXML
    private void initialize() {
        nameLabel.setText(selectedElement.getName());
        categoryLabel.setText("Category: " + selectedElement.getCategory());
        atomicMassLabel.setText("Atomic Mass: " + selectedElement.getAtomicMass());
        densityLabel.setText("Density: " + selectedElement.getDensity());
        discoveredByLabel.setText("Discovered By: " + selectedElement.getDiscoveredBy());

        // Load image from URL
        Image bohrModelImage = new Image(selectedElement.getBohr_model_image());
        bohrModelImageView.setImage(bohrModelImage);

    }


    public void goBack(ActionEvent actionEvent) throws IOException {
        ViewUtils.changeScenes(actionEvent, "search-view.fxml");
    }
}
