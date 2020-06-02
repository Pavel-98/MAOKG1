import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);

        scene.setFill(Color.RED);
        //Line l = new Line(100, 100, 200, 100); //
        //root.getChildren().add(l);
        //l.setStroke(Color.RED);
      Polygon polygon = new Polygon(135, 100, 75, 115, 55, 40, 115, 25, 135, 90, 140, 40, 215, 60, 185, 135,
              137, 100, 165, 150, 120, 180, 95, 130);
        Polyline polyline = new Polyline(99.0, 65.0, 180.0, 80.0, 135.0, 140.0, 99.0, 65.0);
        root.getChildren().add(polygon);
        root.getChildren().add(polyline);
        polygon.setFill(Color.rgb(0, 255, 0));
        polyline.setStroke(Color.rgb(128, 0, 255));
        polyline.setStrokeWidth(5);
//////////////////////////////////////////////////////
        primaryStage.setScene(scene);
        primaryStage.show();
        Polygon polygon1 = new Polygon(0, 0, 20, 10, 10, 20);
    }
}