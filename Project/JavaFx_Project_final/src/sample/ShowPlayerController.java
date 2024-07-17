package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;

public class ShowPlayerController {

    int state;


    public ShowPlayerController() throws Exception {
    }

    private Main main;
    void setMain(Main main) {
        this.main = main;
    }
    private Stage stage;
    void setStage(Stage stage) {
        this.stage = stage;
    }
    public Text text1;
    public Text text2;
    public TextField box1;
    public TextField box2;
    public TableView tableview1;
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
    public void Name() {
        state = 1;
        text1.setText(" Enter a Player's Name ");
        text2.setVisible(false);
        box2.setVisible(false);
    }

    public void ClubCountry() {
        state = 2;
        text1.setText(" Enter a Club Name ");
        text2.setText(" Enter a Country Name");
    }

    public void position() {
        state=3;
        text1.setText(" Enter a Position ");
        text2.setVisible(false);
        box2.setVisible(false);
    }

    public void salaryRange() {
        state=4;
        text1.setText(" Enter lowest Amount ");
        text2.setText(" Enter highest Amount ");
    }
    @FXML
     void showResult() throws Exception {
      setColumn();

      if(state == 1){
          ObservableList<ChangedPlayer> result = Searchplayer.By_Player_Name(playerList,box1.getText());
          tableview1.setItems(result);

      }
      if(state==2){
          ObservableList<ChangedPlayer> result=Searchplayer.By_Player_Club(playerList,box1.getText(),box2.getText());
          tableview1.setItems(result);
      }
      if(state==3){
            ObservableList<ChangedPlayer> result=Searchplayer.By_Position(playerList,box1.getText());
            tableview1.setItems(result);
        }
      if(state==4){
          ObservableList<ChangedPlayer> result=Searchplayer.By_Salary_Range(playerList, new Double(box1.getText()),new Double(box2.getText()));
          tableview1.setItems(result);
      }
  }


    public void go_back(ActionEvent event) {
        try{
            main.show_menu_1();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }

    public void refresh(ActionEvent event) {
        box1.clear();
        box2.clear();
        tableview1.setItems(null);
    }
}
