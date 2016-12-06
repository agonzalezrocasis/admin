/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.controller;

import admin.Admin;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Alberto
 */
public class RootLayoutController implements Initializable {
    
    private Admin mainApp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setMainApp(Admin mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleNew(ActionEvent event) {
    }

    @FXML
    private void handleOpen(ActionEvent event) {
    }

    @FXML
    private void handleSave(ActionEvent event) {
    }

    @FXML
    private void handleSaveAs(ActionEvent event) {
    }

    @FXML
    private void handleExit(ActionEvent event) {
    }

    @FXML
    private void handleShowBirthdayStatistics(ActionEvent event) {
    }

    @FXML
    private void handleAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("AddressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: Alberto Gonzalez\nWebsite: http://github/betbatesc");
        alert.showAndWait();
    }
    
}
