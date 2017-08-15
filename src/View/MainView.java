package View;


import Controller.GameController;
import Tools.Map;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainView extends Application {

    private final static int WIDTH = 800;
    private final static int HEIGHT = 600;

    private Group root;
    private Scene scene;

    private ImageView ninja;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        root = new Group();
        scene = new Scene(root, WIDTH, HEIGHT);

        GameController gameController = new GameController(this, root);
        scene.setOnKeyTyped(gameController);

        displayGame();

        primaryStage.setTitle("Shadow Fist");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }

    private void displayGame() {
        root.getChildren().clear();

        ImageView temp;
        for (int i = 0; i < Map.mapTest.length; i++) {
            for (int j = 0; j < Map.mapTest[i].length; j++) {
                temp = new ImageView(Map.mapTest[i][j]);
                temp.setFitWidth(50);
                temp.setFitHeight(50);
                temp.setX(j * 50);
                temp.setY(i * 50);
                root.getChildren().add(temp);
            }
        }
        ninja = new ImageView("Ressources/ninja.png");
        ninja.setFitHeight(50);
        ninja.setFitWidth(50);
        ninja.setX(0);
        ninja.setY(500);
        root.getChildren().add(ninja);
    }
}