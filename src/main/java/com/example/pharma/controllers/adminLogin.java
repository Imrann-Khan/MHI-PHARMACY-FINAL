package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminLogin implements Initializable {
    public AnchorPane adminLoginPg;
    public ImageView designImage;
    public Button backtorolpage;
    @FXML
    private Button login;
    @FXML
    private TextField adminNameField;

    @FXML
    private TextField adminPassField;
    @FXML
    private Button signup;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(designImage);
        scale.setDuration(Duration.millis(3000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setByX(0.1);
        scale.setByY(0.1);
        scale.setAutoReverse(true);
        scale.play();
        backtorolpage.setOnMouseClicked(MouseEvent->
        {
            try
            {
                backtorolpage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        login.setOnMouseClicked(MouseEvent->
        {
            try
            {
                File file= new File("E:\\java\\pharma\\src\\main\\resources\\textFiles\\adminsLogin.txt");
                String user= adminNameField.getText();
                String pass= adminPassField.getText();

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

    }
    private void backtorolpage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/loginRolePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) backtorolpage.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void mngerLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminDashboard.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminSignup.fxml"));
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