package com.example.midfx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// INCOMPLETE

public class comm_btwn_controllers9 extends Application {

    @Override
    public void start(Stage stage)throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
