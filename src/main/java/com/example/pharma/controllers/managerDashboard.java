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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class managerDashboard implements Initializable {

    @FXML
    private ImageView about;

    @FXML
    private Button addSalesman;

    @FXML
    private Button back;

    @FXML
    private BorderPane border_pane;

    @FXML
    private Button checkDrug;

    @FXML
    private Button expireCheck;

    @FXML
    private ImageView facebook_icon;

    @FXML
    private Button logout;

    @FXML
    private ImageView managerImg1;

    @FXML
    private ImageView managerImg2;

    @FXML
    private ImageView msngr_icon;

    @FXML
    private Button requestDrug;

    @FXML
    private ImageView uTube_icon;


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
        logout.setOnMouseClicked(MouseEvent->
        {
            try
            {
                back();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        addSalesman.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/addSalesman.fxml"));
                set_center(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
         checkDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/checkDrug.fxml"));
                setCheckDrug(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        expireCheck.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/expireDrug.fxml"));
                setExpireCheck(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        requestDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/requestDrug.fxml"));
                setRequestDrug(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        set_transition(facebook_icon);
        set_transition(msngr_icon);
        set_transition(about);
        set_transition(uTube_icon);
        set_transition(managerImg1);
        set_transition(managerImg2);

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

    private void set_center(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setExpireCheck(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setCheckDrug(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setRequestDrug(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
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
}
