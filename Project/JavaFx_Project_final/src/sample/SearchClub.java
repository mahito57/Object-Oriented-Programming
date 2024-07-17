package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchClub {

    //1st
    public static ObservableList<ChangedPlayer> maximum_salary(List<Player> playerList,String name){

        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();

        List <Double> salary=new ArrayList<Double>();
        for(Player p: playerList){
            if(p.getClub().equalsIgnoreCase(name)){
                salary.add(p.getWeekly_salary());
            }
        }
            Double Max= Collections.max(salary);
            for(Player p: playerList){
                if(name.equalsIgnoreCase(p.getClub()) && Max.equals(p.getWeekly_salary()) )
                    temp.add(new ChangedPlayer(p));
            }
        return temp;
    }
    //2nd
    public static ObservableList<ChangedPlayer> maximum_age(List<Player> playerList,String name){

        //System.out.println("Input a club");
        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();

        List <Integer> age=new ArrayList<Integer>();
        for(Player p: playerList){
            if(p.getClub().equalsIgnoreCase(name))
                age.add(p.getAge());
        }

            Integer Max = Collections.max(age);
            for (Player p : playerList) {
                if(name.equalsIgnoreCase(p.getClub()) && Max.equals(p.getAge()))
                    temp.add(new ChangedPlayer(p));
            }

        return temp;
    }
    //3rd
    public static ObservableList<ChangedPlayer> maximum_height(List<Player> playerList,String name){

        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();
        List <Double> height=new ArrayList<Double>();
        for(Player p: playerList){
            if(p.getClub().equalsIgnoreCase(name)){
                height.add(p.getHeight());
            }
        }
            Double Max=Collections.max(height);
            for(Player p:playerList){
                if(name.equalsIgnoreCase(p.getClub()) && Max.equals(p.getHeight()))
                    temp.add(new ChangedPlayer(p));
            }
        return temp;
    }
    //Last
    public static long total_yearly_salary(List<Player> playerList,String name){

        //System.out.println("Input a club");

        long  total=0;
        for(Player p: playerList){
            if(p.getClub().equalsIgnoreCase(name)){
                total= (long) (total+p.getWeekly_salary());
            }
        }
        return 52*total;
    }
}
