package enemies;

import javafx.stage.Stage;

public interface Enemy {
    void render(Stage primaryStage);
    void onClick();
}
