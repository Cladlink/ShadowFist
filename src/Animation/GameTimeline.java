package Animation;

import Controller.GameController;
import javafx.animation.AnimationTimer;

public class GameTimeline extends AnimationTimer {

    private long lastUpdate = 0;
    private GameController gameController;

    public GameTimeline(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void handle(long now) {

    }
}