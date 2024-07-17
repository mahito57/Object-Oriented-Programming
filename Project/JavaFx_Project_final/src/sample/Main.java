package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileWriter;

public class Main extends Application {
     Stage stage ;
    public Stage getStage() {return stage;}

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        showmenu();
    }
    public void showmenu() throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Mainmenu.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Controller controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);

        // Set the primary stage
        stage.setTitle("Mainmenu");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void show_menu_1() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SearchByPlayer.fxml"));
        Parent root = loader.load();


        // Loading the controller
        SearchByPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);

        // Set the primary stage
        stage.setTitle("Home");
        stage.setScene(new Scene(root));
        stage.show();
    }


    //for by player search


    public void byname() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowPlayer.fxml"));
        Parent root = loader.load();


        // Loading the controller
        ShowPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.Name();

        // Set the primary stage
        stage.setTitle("By Name");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byclub() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowPlayer.fxml"));
        Parent root = loader.load();


        // Loading the controller
        ShowPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.ClubCountry();

        // Set the primary stage
        stage.setTitle("By Name");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byposition() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowPlayer.fxml"));
        Parent root = loader.load();


        // Loading the controller
        ShowPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.position();

        // Set the primary stage
        stage.setTitle("By Name");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void bysalaryrange() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowPlayer.fxml"));
        Parent root = loader.load();


        // Loading the controller
        ShowPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.salaryRange();

        // Set the primary stage
        stage.setTitle("By Name");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void countrycount() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CountryWiseCount.fxml"));
        Parent root = loader.load();


        // Loading the controller
        CountryWiseCountController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);

        // Set the primary stage
        stage.setTitle("By count");
        stage.setScene(new Scene(root));
        stage.show();
    }

    //for by club search

    public void show_menu_2() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SearchByClub.fxml"));
        Parent root = loader.load();


        // Loading the controller
        SearchByClubController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);

        // Set the primary stage
        stage.setTitle("Home");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byclubsalary() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowClubPlayer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        ShowClubPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.salary();

        // Set the primary stage
        stage.setTitle("By salary");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byclubage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowClubPlayer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        ShowClubPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.age();

        // Set the primary stage
        stage.setTitle("By salary");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byclubheight() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowClubPlayer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        ShowClubPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.height();

        // Set the primary stage
        stage.setTitle("By salary");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void byclubtotalsalary() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowClubPlayer.fxml"));
        Parent root = loader.load();

        // Loading the controller
        ShowClubPlayerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);
        controller.totalsalary();

        // Set the primary stage
        stage.setTitle("By salary");
        stage.setScene(new Scene(root));
        stage.show();
    }

    //add player

    public void add_player() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("add_player.fxml"));
        Parent root = loader.load();

        // Loading the controller
        add_playerController controller = loader.getController();
        controller.setMain(this);
        controller.setStage(stage);

        // Set the primary stage
        stage.setTitle("adding player");
        stage.setScene(new Scene(root));
        stage.show();
    }

    //exit
    public void exit() throws Exception{
        stage.close();
    }



    public static void main(String[] args) {
        launch(args);
     }

}
