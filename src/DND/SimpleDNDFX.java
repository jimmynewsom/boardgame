package DND;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class SimpleDNDFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My RPG with best practices");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text mainMenuText = new Text("Main Menu");
        mainMenuText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(mainMenuText, 0, 0, 2, 1);

        Button newCharBtn = new Button("Create a character");
        grid.add(newCharBtn, 0, 1);
        Button newGameBtn = new Button("New Game");
        grid.add(newGameBtn, 0, 2);
        Button loadGameBtn = new Button("Load Game");
        grid.add(loadGameBtn, 0,3);
        Button mapEditorBtn = new Button("Map Editor");
        grid.add(mapEditorBtn, 0, 4);

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
