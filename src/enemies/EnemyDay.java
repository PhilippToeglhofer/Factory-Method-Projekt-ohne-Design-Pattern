package enemies;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnemyDay implements Enemy {
    private final Group root = new Group();

    public void render(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(150, 150);
        rectangle.setFill(Color.YELLOW);

        Text text = new Text("EnemyDay!!!");
        text.setStrokeWidth(33);
        text.setFill(Color.BLACK);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle, text);
        stackPane.setTranslateX(120);
        stackPane.setTranslateY(20);

        root.getChildren().add(stackPane);
        onClick();

        Scene scene = new Scene(root, 400, 250, Color.WHITE);
        primaryStage.setTitle("JavaFX Factory Method");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onClick() {
        Button button = new Button("Exit EnemyDay");
        button.setOnAction(event -> Platform.exit());
        button.setTranslateX(145);
        button.setTranslateY(200);
        root.getChildren().add(button);
    }
}