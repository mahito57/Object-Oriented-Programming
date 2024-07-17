package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;


public class add_playerController {

    private Main main;
    private Stage stage;
    void setMain(Main main) { this.main = main; }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private TextField bname;

    @FXML
    private TextField bcountry;

    @FXML
    private TextField bage;

    @FXML
    private TextField bheight;

    @FXML
    private TextField bclub;

    @FXML
    private TextField bposition;

    @FXML
    private TextField bnumber;

    @FXML
    private TextField bsalary;

    private PlayerList obj = new PlayerList();
    private List<Player> playerList=PlayerList.playerList;

    public add_playerController() throws Exception {
    }

    public void add_p(ActionEvent event) throws Exception {
        Player p2=new Player();
        p2.setName(bname.getText());
        p2.setCountry(bcountry.getText());
        p2.setAge(Integer.parseInt(bage.getText()));
        p2.setHeight(Double.parseDouble(bheight.getText()));
        p2.setClub(bclub.getText());
        p2.setNumber(Integer.parseInt(bnumber.getText()));
        p2.setPosition(bposition.getText());
        p2.setWeekly_salary(Double.parseDouble(bsalary.getText()));
        PlayerList.playerList.add(p2);
        BufferedWriter bw = new BufferedWriter(new FileWriter("players.txt"));
        for(Player p: playerList){
            bw.write(p.getName() + "," + p.getCountry() + "," + p.getAge() + ","
                    + p.getHeight() + "," + p.getClub() + "," + p.getPosition() + "," + p.getNumber() + "," + p.getWeekly_salary());
            bw.write("\n");
        }

        bw.close();

        bname.clear();
        bage.clear();
        bclub.clear();
        bcountry.clear();
        bheight.clear();
        bnumber.clear();
        bsalary.clear();
        bposition.clear();

    }

    public void back_to(ActionEvent event) {
        try{
            main.showmenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refresh(ActionEvent event) {
        bname.clear();
        bage.clear();
        bclub.clear();
        bcountry.clear();
        bheight.clear();
        bnumber.clear();
        bsalary.clear();
        bposition.clear();
    }
}
