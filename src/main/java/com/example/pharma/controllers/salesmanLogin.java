package com.example.pharma.controllers;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class salesmanLogin implements Initializable {
    public ImageView designImage;
    public Button back;

    public Button loginToDashboard;

    public Button signupToPage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        back.setOnMouseClicked(MouseEvent->
        {
            try
            {
                startPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        loginToDashboard.setOnMouseClicked(MouseEvent->
        {
            try
            {
                salesmanloginToDashboard();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        signupToPage.setOnMouseClicked(MouseEvent->
        {
            try
            {
                salesmanSignupPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        ScaleTransition scale = new ScaleTransition();
        scale.setNode(designImage);
        scale.setDuration(Duration.millis(3000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setByX(0.1);
        scale.setByY(0.1);
        scale.setAutoReverse(true);
        scale.play();
    }
    public void startPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/loginRolePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        Stage currentStage = (Stage) back.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    public void salesmanloginToDashboard() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/salesmanDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        Stage currentStage = (Stage) loginToDashboard.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    public void salesmanSignupPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/salesmanSignup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        Stage currentStage = (Stage) loginToDashboard.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
