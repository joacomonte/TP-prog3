package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    private final Model model = new Model();

    @FXML
    private TextField tf00;

    @FXML
    private TextField tf01;

    @FXML
    private TextField tf02;

    public void initialize() {
        tf00.textProperty().addListener((observable, oldValue, newValue) -> calculateSumController());
        tf01.textProperty().addListener((observable, oldValue, newValue) -> calculateSumController());
    }

    private void calculateSumController() {
        try {
            int value1 = Integer.parseInt(tf00.getText());
            int value2 = Integer.parseInt(tf01.getText());
            int sum = model.calculateSumModel(value1, value2);
            tf02.setText(Integer.toString(sum));
        } catch (NumberFormatException e) {
            tf02.setText("error");
        }
    }
}