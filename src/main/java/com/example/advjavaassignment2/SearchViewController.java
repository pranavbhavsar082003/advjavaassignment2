package com.example.advjavaassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class SearchViewController {

    @FXML
    private Label infoLabel;

    @FXML
    private ListView<?> listView;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField searchTextField;

    @FXML
    void search(ActionEvent event) {


    }
    @FXML
    private void initialize(){
        progressBar.setVisible(false);
        listView.setVisible(false);
        infoLabel.setVisible(false);
    }

}
