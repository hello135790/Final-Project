package com.example.demo;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class HelloApplication extends Application {
   Button button;
   @Override
   public void start(Stage primaryStage) throws Exception {
       primaryStage.setTitle("Title");
       button = new Button();
       button.setText("Click me");
       Pane root = new Pane();
       button.setLayoutX(50);
       button.setLayoutY(50);
//        StackPane layout = new StackPane();
       root.getChildren().add(button);
       Scene scene = new Scene(layout, 300, 250);
       primaryStage.setScene(scene);
       primaryStage.show();
   }


   public static void main(String[] args) {
       launch();
   }
}
