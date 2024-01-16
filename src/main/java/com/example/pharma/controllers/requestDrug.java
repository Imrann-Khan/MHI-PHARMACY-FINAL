package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class requestDrug implements Initializable {

    @FXML
    private BarChart<String , Double> chart;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Double> series01 = new XYChart.Series<>();
        series01.setName("Year 2022");
        series01.getData().add(new XYChart.Data("Jan", 500));
        series01.getData().add(new XYChart.Data("Feb", 200));
        series01.getData().add(new XYChart.Data("Mar", 300));
        series01.getData().add(new XYChart.Data("Apr", 800));
        series01.getData().add(new XYChart.Data("May", 300));
        series01.getData().add(new XYChart.Data("Jun", 20));
        series01.getData().add(new XYChart.Data("Jul", 100));
        series01.getData().add(new XYChart.Data("Aug", 400));
        series01.getData().add(new XYChart.Data("Sep", 800));
        series01.getData().add(new XYChart.Data("Oct", 600));
        series01.getData().add(new XYChart.Data("Nov", 850));
        series01.getData().add(new XYChart.Data("Dec", 686));
        chart.getData().add(series01);
    }
}
