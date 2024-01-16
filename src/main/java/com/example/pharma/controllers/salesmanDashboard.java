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

public class salesmanDashboard implements Initializable {
    public Button back;
    public ImageView facebook_icon;

    @FXML
    private BorderPane border_pane;
    @FXML
    private ImageView about;

    @FXML
    private Button checkDrug;

    @FXML
    private Button expireCheck;

    @FXML
    private Button generateBill;

    @FXML
    private Button logout;

    @FXML
    private ImageView msngr_icon;

    @FXML
    private ImageView salesmanImg1;

    @FXML
    private ImageView salesmanImg2;

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

        facebook_icon.setOnMouseClicked(MouseEvent -> {
            try {
                show_facebook();
            } catch (URISyntaxException | IOException e) {
                throw new RuntimeException(e);
            }
        });
        checkDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/checkDrugBySalesman.fxml"));
                set_center(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        expireCheck.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/expiryCheckBySalesman.fxml"));
                setExpireCheck(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        generateBill.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/generateBill.fxml"));
                setGenerateBill(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        set_transition(facebook_icon);
        set_transition(msngr_icon);
        set_transition(about);
        set_transition(uTube_icon);
        set_transition(salesmanImg1);
        set_transition(salesmanImg2);
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

    private void show_facebook() throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
    }
    private void set_center(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setExpireCheck(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setGenerateBill(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }

}
