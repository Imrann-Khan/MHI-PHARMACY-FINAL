package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
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

public class managerLogin implements Initializable {
    public ImageView designImage;
    public Button back;
    @FXML
    private Button login;

    @FXML
    private Button signup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        back.setOnMouseClicked(MouseEvent->
        {
            try
            {
                back();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        login.setOnMouseClicked(MouseEvent->
        {
            try
            {
                mngerLogin();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        signup.setOnMouseClicked(MouseEvent->
        {
            try
            {
                mngrSignup();
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

    private void back() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/loginRolePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) back.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void mngerLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/managerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) login.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void mngrSignup() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/managerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) signup.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
