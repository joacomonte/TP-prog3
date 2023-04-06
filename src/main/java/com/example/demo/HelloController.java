package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private int getNumber(TextField cellText){
        String cellContent = cellText.getText();
        int cellNumber = Integer.parseInt(cellContent);

        return cellNumber;
    }

}