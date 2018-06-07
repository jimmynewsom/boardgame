package DND;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class SimpleDNDFX extends Application {
    public static Stage primaryStage;
    public static Scene mainMenu, newCharacter, newGame,loadGame, mapEditor, mainGame;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("Views/main_menu.fxml"));
        mainMenu = new Scene(root1, 600, 400);
        Parent root2 = FXMLLoader.load(getClass().getResource("Views/new_character.fxml"));
        newCharacter = new Scene(root2, 600, 400);
        Parent root3 = FXMLLoader.load(getClass().getResource("Views/new_game.fxml"));
        newGame = new Scene(root3, 600, 400);
        Parent root4 = FXMLLoader.load(getClass().getResource("Views/load_game.fxml"));
        loadGame = new Scene(root4, 600, 400);
        Parent root5 = FXMLLoader.load(getClass().getResource("Views/map_editor.fxml"));
        mapEditor = new Scene(root5, 600, 400);
        Parent root6 = FXMLLoader.load(getClass().getResource("Views/main_game.fxml"));
        mainGame = new Scene(root6, 600, 400);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;    //assigns my primaryStage for this fx app to a static reference
        primaryStage.setTitle("My RPG with best practices");
        primaryStage.setScene(mainMenu);
        primaryStage.show();
    }
}