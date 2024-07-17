package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class SearchByPlayerController {
    private Main main;
    private Stage stage;
    void setMain(Main main) { this.main = main; }
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private Button Name;

    @FXML
    private Button Club;

    @FXML
    private Button Position;

    @FXML
    private Button Salary;

    @FXML
    private Button Country;

    @FXML
    private Button Backto1;

    @FXML
    void SearchByName(ActionEvent event){

        try{
            main.byname();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    void SearchByClub(ActionEvent event){

        try{
            main.byclub();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }

    }
    @FXML
    void SearchByPosition(ActionEvent event){

        try{
            main.byposition();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }

    }
    @FXML
    void SearchBySalary(ActionEvent event){

        try{
            main.bysalaryrange();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }

    }
   @FXML
   void CountryCount(ActionEvent event){
        try {
            main.countrycount();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }

    @FXML
    void go_back(ActionEvent event){
        try {
            main.showmenu();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }



}
