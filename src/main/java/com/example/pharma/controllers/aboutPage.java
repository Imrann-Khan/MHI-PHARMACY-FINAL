package com.example.pharma.controllers;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class aboutPage implements Initializable {


    public ImageView arc1;
    public ImageView arc2;
    public ImageView arc3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ScaleTransition translate1 = new ScaleTransition();
        translate1.setNode(arc1);
        translate1.setDuration(Duration.millis(3000));
        translate1.setCycleCount(TranslateTransition.INDEFINITE);
        translate1.setByX(0.1);
        translate1.setByY(0.1);
        translate1.setAutoReverse(true);
        translate1.play();

        ScaleTransition translate2 = new ScaleTransition();
        translate2.setNode(arc2);
        translate2.setDuration(Duration.millis(3000));
        translate2.setCycleCount(TranslateTransition.INDEFINITE);
        translate2.setByX(0.1);
        translate2.setByY(0.1);
        translate2.setAutoReverse(true);
        translate2.play();

        ScaleTransition translate3 = new ScaleTransition();
        translate3.setNode(arc3);
        translate3.setDuration(Duration.millis(3000));
        translate3.setCycleCount(TranslateTransition.INDEFINITE);
        translate3.setByX(0.1);
        translate3.setByY(0.1);
        translate3.setAutoReverse(true);
        translate3.play();
    }
}
