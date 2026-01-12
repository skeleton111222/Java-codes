import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXDrawingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Line
        Line line = new Line();
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(200);
        line.setEndY(50);
        line.setStroke(Color.BLUE); // Set the color of the line

        // Create a Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setFill(Color.GREEN); // Set the color of the rectangle

        // Create a Text
        Text text = new Text();
        text.setX(100);
        text.setY(250);
        text.setText("Hello, JavaFX!");
        text.setFill(Color.RED); // Set the color of the text

        // Stack everything in a StackPane layout
        StackPane root = new StackPane();
        root.getChildren().addAll(line, rectangle, text);

        // Create a Scene and set it to the Stage
        Scene scene = new Scene(root, 400, 400); // Set the size of the scene
        primaryStage.setTitle("JavaFX Drawing Example");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}