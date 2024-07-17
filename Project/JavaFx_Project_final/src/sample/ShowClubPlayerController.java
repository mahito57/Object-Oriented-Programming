package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.List;

public class ShowClubPlayerController {

    public Button result;
    public Button backto;
    public Text text;
    public TextField boxclub;
    public TableView tableview2;
    public Text text2;
    public TextField boxclub2;
    int state;

    public ShowClubPlayerController() throws Exception {
    }

    private Main main;
    void setMain(Main main) {
        this.main = main;
    }
    private Stage stage;
    void setStage(Stage stage) {
        this.stage = stage;
    }

    private PlayerList obj = new PlayerList();
    private List<Player> playerList=PlayerList.playerList;
    @FXML
    private TableColumn<Player, String> columnName;
    @FXML
    private TableColumn<Player, String> columnCountry;
    @FXML
    private TableColumn<Player, Integer> columnAge;
    @FXML
    private TableColumn<Player, Double> columnHeight;
    @FXML
    private TableColumn<Player, String> columnClub;
    @FXML
    private TableColumn<Player, String> columnPosition;
    @FXML
    private TableColumn<Player, Integer> columnNumber;
    @FXML
    private TableColumn<Player, Double> columnWeeklySalary;

    void setColumn(){
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnCountry.setCellValueFactory(new PropertyValueFactory<>("Country"));
        columnAge.setCellValueFactory(new PropertyValueFactory<>("Age"));
        columnHeight.setCellValueFactory(new PropertyValueFactory<>("Height"));
        columnClub.setCellValueFactory(new PropertyValueFactory<>("club"));
        columnPosition.setCellValueFactory(new PropertyValueFactory<>("Position"));
        columnNumber.setCellValueFactory(new PropertyValueFactory<>("Number"));
        columnWeeklySalary.setCellValueFactory(new PropertyValueFactory<>("weeklySalary"));
    }

    public void salary() {
        state = 1;
        text.setText("Most Paid Player");
        text2.setVisible(false);
        boxclub2.setVisible(false);
    }

    public void age() {
        state = 2;
        text.setText("Oldest Player");
        text2.setVisible(false);
        boxclub2.setVisible(false);
    }

    public void height() {
        state = 3;
        text.setText("Tallest Player");
        text2.setVisible(false);
        boxclub2.setVisible(false);
    }
    public void totalsalary(){
        state = 4;
        text.setVisible(false);
        tableview2.setVisible(false);
    }
    public void go_back(ActionEvent event) {
        try{
            main.show_menu_2();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }

    public void show_result(ActionEvent event) {
        setColumn();
        if(state==1){
            ObservableList<ChangedPlayer> result=SearchClub.maximum_salary(playerList,boxclub.getText());
            tableview2.setItems(result);
        }
        if(state==2){
            ObservableList<ChangedPlayer> result=SearchClub.maximum_age(playerList,boxclub.getText());
            tableview2.setItems(result);
        }
        if(state==3){
            ObservableList<ChangedPlayer> result=SearchClub.maximum_height(playerList,boxclub.getText());
            tableview2.setItems(result);
        }
        if(state==4){
            Long totalsalary=SearchClub.total_yearly_salary(playerList,boxclub.getText());
            boxclub2.setText(String.valueOf(totalsalary));
        }
    }

    public void refresh(ActionEvent event) {
        boxclub.clear();
        boxclub2.clear();
        tableview2.setItems(null);
    }
}
