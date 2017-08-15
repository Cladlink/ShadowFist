package Controller;

import Animation.GameTimeline;
import View.MainView;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;

public class GameController implements EventHandler<KeyEvent> {

    private MainView mainView;
    private GameTimeline gameTimeline;

    private BooleanProperty leftKeyTyped, rightKeyTyped, upKeyTyped, downKeyTyped, spaceBarKeyTyped;

    public GameController(MainView mainView, Group root) {
        leftKeyTyped = new SimpleBooleanProperty(false);
        rightKeyTyped = new SimpleBooleanProperty(false);
        upKeyTyped = new SimpleBooleanProperty(false);
        downKeyTyped = new SimpleBooleanProperty(false);
        spaceBarKeyTyped = new SimpleBooleanProperty(false);
        this.mainView = mainView;
        gameTimeline = new GameTimeline(this);
        gameTimeline.start();
    }

    @Override
    public void handle(KeyEvent event) {

    }
}
