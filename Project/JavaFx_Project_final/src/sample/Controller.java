package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {

    private Main main;
    private Stage stage;
    void setMain(Main main) { this.main = main; }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Button search_player;
    @FXML
    private Button search_club;
    @FXML
    public ImageView image1;
    @FXML
    void entering1(ActionEvent event) {

        try {
            main.show_menu_1();
        }catch (Exception e){
            System.out.println(" Exception in SearchPlayers Menu, Submit Button " + e);
        }
    }
    @FXML
    void entering2(ActionEvent event) {

        try {
            main.show_menu_2();
        }catch (Exception e){
            System.out.println(" Exception in SearchPlayers Menu, Submit Button " + e);
        }
    }
    @FXML
    public void entering3(ActionEvent event) {
        try {
            main.add_player();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    @FXML
    public void exiting(ActionEvent event) {
        try {
            main.exit();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
   // public void initialize(){
     //   image1.setImage(new Image("fifa-21-ultimate-team.jpg"));
    //}

}
