package DND.Views;

import DND.Actors.Character;
import DND.Actors.Classes.Class;
import DND.Actors.Races.Race;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import DND.SimpleDNDFX;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//how does this controller get references to the stage and those other scenes

public class Controller {
    @FXML
    private void toMainMenu(){
        SimpleDNDFX.primaryStage.setScene(SimpleDNDFX.mainMenu);
    }

    @FXML
    private void toNewCharacter(){
        SimpleDNDFX.primaryStage.setScene(SimpleDNDFX.newCharacter);
    }

    @FXML
    private void toNewGame(){
        SimpleDNDFX.primaryStage.setScene(SimpleDNDFX.newGame);
    }

    @FXML
    private void toLoadGame(){
        SimpleDNDFX.primaryStage.setScene(SimpleDNDFX.loadGame);
    }

    @FXML
    private void toMapEditor(){
        SimpleDNDFX.primaryStage.setScene(SimpleDNDFX.mapEditor);
    }

    //new character fields
    @FXML
    private TextField nameField;
    @FXML
    private ChoiceBox<DND.Actors.Races.Race> raceField;
    @FXML
    private ChoiceBox<DND.Actors.Classes.Class> classField;

    




}
