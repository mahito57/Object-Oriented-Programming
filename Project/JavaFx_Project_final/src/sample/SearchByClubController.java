package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class SearchByClubController {
    public Button salary;
    public Button age;
    public Button height;
    public Button total_salary;
    public Button back_to;

    private Main main;
    private Stage stage;
    void setMain(Main main) { this.main = main; }
    public void setStage(Stage stage) {
        this.stage = stage;
    }



    public void searchbysalary(ActionEvent event) {
        try{
            main.byclubsalary();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public void searchbyage(ActionEvent event) {
        try{
            main.byclubage();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public void searchbyheight(ActionEvent event) {
        try{
            main.byclubheight();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public void total_salary(ActionEvent event) {
        try{
            main.byclubtotalsalary();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public void go_back(ActionEvent event) {
        try {
            main.showmenu();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
