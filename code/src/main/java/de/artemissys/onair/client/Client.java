package de.artemissys.onair.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Client extends Application
{
    public static void main(String... args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("OnAir Interface");
        primaryStage.show();
    }
}