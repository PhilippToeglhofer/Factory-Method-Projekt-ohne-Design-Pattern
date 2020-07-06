import enemies.Enemy;
import enemies.EnemyDay;
import enemies.EnemyNight;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Calendar;

public class Game extends Application {
    private static Enemy enemy;

    @Override
    public void start(Stage primaryStage) {
        run();
        render(primaryStage);
    }

    private static void run() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour > 18 || hour < 5) {
            enemy = new EnemyNight();
        } else {
            enemy = new EnemyDay();
        }
    }

    private static void render(Stage primaryStage) {
        enemy.render(primaryStage);
    }
}
