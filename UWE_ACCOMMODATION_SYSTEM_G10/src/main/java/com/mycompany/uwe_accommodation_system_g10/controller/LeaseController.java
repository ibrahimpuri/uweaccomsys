package com.mycompany.uwe_accommodation_system_g10.controller;

import javafx.fxml.FXML;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class LeaseController {

    @FXML
    private Button confirmButton, cancelButton; // defined in the FXML file

    @FXML
    public void initialize() {
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        // Set up event handlers for buttons
        confirmButton.setOnAction(event -> closeWindow());
        cancelButton.setOnAction(event -> cancelWindow());
    }

    @FXML
    private void setTextFlowContent(TextFlow textFlow, String content) {
        textFlow.getChildren().clear();
        textFlow.getChildren().add(new Text(content));
    }

    @FXML
    private void closeWindow() {
        Stage stage = (Stage) confirmButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void cancelWindow() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void passVariables() {
        // Method for passing variables and implementation
    }
}