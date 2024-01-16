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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminDashboard implements Initializable {

    @FXML
    private ImageView about;

    @FXML
    private Button addRmvBranch;

    @FXML
    private Button addRmvDrug;

    @FXML
    private ImageView adminImg1;

    @FXML
    private ImageView adminImg2;

    @FXML
    private Button back;

    @FXML
    private BorderPane border_pane;

    @FXML
    private Button drugHistory;

    @FXML
    private ImageView facebook_icon;

    @FXML
    private Button logout;

    @FXML
    private ImageView msngr_icom;

    @FXML
    private ImageView uTube_icon;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addRmvBranch.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminAddRmvBrunch.fxml"));
                set_center(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        addRmvDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminAddRmvDrug.fxml"));
                setAddRmvDrug(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        drugHistory.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminDrugHistory.fxml"));
                setDrugHistory(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });


        facebook_icon.setOnMouseClicked(MouseEvent -> {
            try {
                show_facebook();
            } catch (URISyntaxException | IOException e) {
                throw new RuntimeException(e);
            }
        });

        back.setOnMouseClicked(MouseEvent->
        {
            try
            {
                startPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        logout.setOnMouseClicked(MouseEvent->
        {
            try
            {
                startPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        set_transition(facebook_icon);
        set_transition(msngr_icom);
        set_transition(about);
        set_transition(uTube_icon);
        set_transition(adminImg2);
        set_transition(adminImg1);

    }

    private void set_transition(ImageView image)
    {
        ScaleTransition scale3 = new ScaleTransition(Duration.millis(2000), image);
        scale3.setCycleCount(TranslateTransition.INDEFINITE);
        scale3.setByX(0.3);
        scale3.setByY(0.3);
        scale3.setAutoReverse(true);
        scale3.play();
    }

    private void show_facebook() throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
    }

    private void set_center(FXMLLoader fxmlLoader) throws IOException{
                AnchorPane anchorPane = fxmlLoader.load();
                border_pane.setCenter(anchorPane);
    }
    private void setAddRmvDrug(FXMLLoader fxmlLoader) throws IOException{
                AnchorPane anchorPane = fxmlLoader.load();
                border_pane.setCenter(anchorPane);
    }
    private void setDrugHistory(FXMLLoader fxmlLoader) throws IOException{
                AnchorPane anchorPane = fxmlLoader.load();
                border_pane.setCenter(anchorPane);
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
}
