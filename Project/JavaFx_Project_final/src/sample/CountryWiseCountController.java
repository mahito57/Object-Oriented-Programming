package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.List;

public class CountryWiseCountController {

    public TextArea textarea;
    private Main main;

    public CountryWiseCountController() throws Exception {
    }

    void setMain(Main main) {
        this.main = main;
    }
    private Stage stage;
    void setStage(Stage stage) {
        this.stage = stage;
    }


        private PlayerList obj = new PlayerList();
        private List<Player> playerList=PlayerList.playerList;

    public void seeResult(javafx.event.ActionEvent event) {
        String result = Searchplayer.Country_wise_player_count(playerList);
        textarea.setText(result);
    }

    public void go_back(ActionEvent event) {
        try {
            main.show_menu_1();
        } catch (Exception e) {
            System.out.println("Exception"+e);
        }
    }
}
