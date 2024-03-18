package uwe.tae.sys.controller;

import uwe.tae.sys.model.UWEAccommodationSystem;

import uwe.tae.sys.model.Halls;
import uwe.tae.sys.model.Accommodation;

import java.util.List;

import javafx.scene.text.TextFlow;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.collections.FXCollections;
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

    private void initialize() {

	uweSystem = UWEAccommodationSystem.getSystem();

	setupEventHandlers();

    }

    private void setupEventHandlers() {

    }

    private void handleSelectHall() {
    }

    private void setTextFlowContent(TextFlow textFlow, String content) {
        textFlow.getChildren().clear();
        textFlow.getChildren().add(new Text(content));
    }

    @FXML
    private void onCreateLeaseClicked() {
    }

    @FXML
    private void onDeleteLeaseClicked() {
    }

    private void openLeaseWindow(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Pane pane = loader.load();

	    LeaseController leaseController = loader.getController();

            Scene scene = new Scene(pane);
            String css = getClass().getResource("/uwe/tae/sys/css/styles.css").toExternalForm();
            scene.getStylesheets().add(css); // Adding the CSS file to the scene

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void openEditWindow(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Pane pane = loader.load();

	    EditController editController = loader.getController();

	    Scene scene = new Scene(pane);
            String css = getClass().getResource("/uwe/tae/sys/css/styles.css").toExternalForm();
            scene.getStylesheets().add(css);

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
