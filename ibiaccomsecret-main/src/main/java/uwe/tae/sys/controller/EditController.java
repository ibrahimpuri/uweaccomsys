package uwe.tae.sys.controller;

import javafx.fxml.FXML;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class EditController {

    @FXML
    private Button confirmButton, cancelButton; // Assuming these are buttons in your FXML

    @FXML
    public void initialize() {
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        // Example of setting up an event handler
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
        // Implementation for passing variables
    }
}