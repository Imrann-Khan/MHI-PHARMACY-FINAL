package com.example.pharma.controllers;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginRolePage implements Initializable {
    public AnchorPane loginRolePage;
    public ImageView apatotoCheck;
    public ImageView apatotoCheck2;
    public ImageView image2;
    public ImageView image3;
    public ImageView image1;
    public Button backtostartpage;
    public Button loginAdmin;
    public Button loginManager;
    public Button loginSalesman;
    public Button signupAdmin;
    public Button signupSalesman;
    public Button signupManager;
    public ImageView facebook_icon;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        apatotoCheck2.setOnMouseClicked(MouseEvent-> {
            try {
                changes();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        backtostartpage.setOnMouseClicked(MouseEvent->
        {
                try
                {
                    startPage();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        });
        loginAdmin.setOnMouseClicked(MouseEvent->
        {
                try {
                    loginAdmin();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        });

        signupAdmin.setOnMouseClicked(MouseEvent-> {
            try {
                adminSignupPage();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        loginManager.setOnMouseClicked(MouseEvent->
        {
                try {
                    loginManager();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        });

        signupManager.setOnMouseClicked(MouseEvent->
        {
            try {
                managerSignupPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        loginSalesman.setOnMouseClicked(MouseEvent->
        {
            try {
                loginSalesman();
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


        signupSalesman.setOnMouseClicked(MouseEvent->
        {
            try {
                salesmanSignupPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        set_transition(image1);
        set_transition(image2);
        set_transition(image3);
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

    private void loginAdmin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/adminLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) loginAdmin.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void show_facebook() throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
    }
    private void adminSignupPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/adminSignup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) signupAdmin.getScene().getWindow();
        currentStage.close();
        stage.show();
    }

    private void loginManager() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/managerLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) loginManager.getScene().getWindow();
        currentStage.close();
        stage.show();
    }

    private void managerSignupPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/managerSignup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) signupManager.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void loginSalesman() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/salesmanLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) loginSalesman.getScene().getWindow();
        currentStage.close();
        stage.show();
    }

    private void salesmanSignupPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/salesmanSignup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) signupSalesman.getScene().getWindow();
        currentStage.close();
        stage.show();
    }

    private void changes() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/salesmanDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) apatotoCheck2.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    public void startPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/startPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        Stage currentStage = (Stage) backtostartpage.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
