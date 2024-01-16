package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class startPage implements Initializable {
    public Button getStarted;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getStarted.setOnMouseClicked(MouseEvent-> {
            try {
                change();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    private void change() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/loginRolePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) getStarted.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
