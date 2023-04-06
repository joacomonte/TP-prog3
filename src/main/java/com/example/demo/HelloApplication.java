package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a new GridPane
        GridPane grid = new GridPane();
        // Set the gap between each cell
        grid.setHgap(10);
        grid.setVgap(10);
        // Set the padding around the grid
        grid.setPadding(new Insets(10));

        // Add 16 TextFields to the grid
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                TextField textField = new TextField();
                if (i == 4 || j == 4) { // check if this is a non-editable field
                    textField.setEditable(false);
                    textField.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                grid.add(textField, i, j);

            }
        }

        // Create a new Scene with the GridPane as the root node
        Scene scene = new Scene(grid, 300, 300);


        // Set the title of the Stage
        primaryStage.setTitle("Grid Example");

        // Set the Scene of the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
