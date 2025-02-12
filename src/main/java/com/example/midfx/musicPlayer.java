package com.example.midfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class musicPlayer extends Application {

    @Override
    public void start(Stage stage)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(musicPlayer.class.getResource("music_Player.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 605, 162);
        Image icon = new Image("file:/D:/Desktop/Walls/FairyTale.png");
        stage.getIcons().add(icon);
        stage.setTitle("Dev's MP3 Player");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                Platform.exit();
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
    launch(args);
    }
}
