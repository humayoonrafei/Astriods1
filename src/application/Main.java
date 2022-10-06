package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    Point2D size = new Point2D(1000,800);

    @Override
    public void start(Stage stage) throws Exception {
        Group gRoot = new Group();
        Scene scene = new Scene(gRoot,size.getX(),size.getY());

        stage.setScene(scene);
        stage.setTitle("Asteriods Game");
        scene.setFill(Color.BLACK);

        Label fpsLabel = new Label();
        fpsLabel.setTranslateX(2);
        fpsLabel.setTextFill(Color.WHITE);

        gRoot.getChildren().add(fpsLabel);

        AnimationTimer loop = new AnimationTimer() {
            @Override
            double old = -1 ; // The old time
            double elspsedTime = 0;
            public void handle(long nano) {
                if(old < 0 ) old = nano;   // if old is negative
                





            }
        }










        stage.show();
    }

    public static void main(String[] args) {
       launch(args);
    }

}