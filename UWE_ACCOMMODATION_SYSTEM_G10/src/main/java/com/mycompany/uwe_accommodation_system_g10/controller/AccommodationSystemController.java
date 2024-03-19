package com.mycompany.uwe_accommodation_system_g10.controller;

import com.mycompany.uwe_accommodation_system_g10.model.UWEAccommodationSystem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.text.TextFlow;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.text.Text;
import java.io.IOException;

public class AccommodationSystemController {

    @FXML
    private ListView<String> AccommodationsList;

    @FXML
    private TextFlow HallSelectedTF, HallManagerTF, AccommodationSelectedTF, RentalAgreementTF, StudentTF;

    @FXML
    private MenuButton selectHall;

    @FXML
    private MenuItem selectHallBrecon, selectHallCotswold, selectHallMendip, selectHallQuantock;

    private UWEAccommodationSystem uweSystem; // Declared variable

    @FXML
    public void initialize() { // Made public
        uweSystem = UWEAccommodationSystem.getSystem();
        setupEventHandlers();
    }

    private void setupEventHandlers() {
        // Example of setting up an event handler
        selectHallBrecon.setOnAction(event -> handleSelectHall("Brecon"));
        // Implement other event handlers here
    }

    private void handleSelectHall(String hallName) {
        // Implementation for handling hall selection
    }

    private void setTextFlowContent(TextFlow textFlow, String content) {
        textFlow.getChildren().clear();
        textFlow.getChildren().add(new Text(content));
    }

    @FXML
    private void onCreateLeaseClicked() {
        // Implementation for creating a lease
    }

    @FXML
    private void onDeleteLeaseClicked() {
        // Implementation for deleting a lease
    }

    private void openLeaseWindow(String fxmlFile, String title) {
        // Existing implementation
    }

    private void openEditWindow(String fxmlFile, String title) {
        // Existing implementation
    }
}