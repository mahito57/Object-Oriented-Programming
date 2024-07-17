package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Searchplayer {
    public static ObservableList<ChangedPlayer> By_Player_Name(List<Player> playerList, String name) {
        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();

        System.out.println("Input player name");

        for(Player p: playerList ){
            if(p.getName().equalsIgnoreCase(name)){
                temp.add(new ChangedPlayer(p));

            }
        }
        return temp;
    }
    //2nd
    public static ObservableList<ChangedPlayer> By_Player_Club(List<Player>playerList,String club,String country){
        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();
        for(Player p: playerList){
            if(p.getClub().equalsIgnoreCase(club) && p.getCountry().equalsIgnoreCase(country)){
                temp.add(new ChangedPlayer(p));
            }
        }
        return temp;
    }
    //3rd
    public static ObservableList<ChangedPlayer> By_Position(List<Player>playerList,String position){
        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();
        for(Player p: playerList){
            if(position.equalsIgnoreCase(p.getPosition())){
               temp.add(new ChangedPlayer(p));
            }
        }
        return temp;
    }
    //4th
    public static ObservableList<ChangedPlayer> By_Salary_Range(List<Player> playerList, Double min, Double max){
        ObservableList<ChangedPlayer> temp;
        temp= FXCollections.observableArrayList();
        for(Player p: playerList){
            if(min<= p.getWeekly_salary() && max>=p.getWeekly_salary() ){
               temp.add(new ChangedPlayer(p));
            }
        }
        return temp;
    }
    //last
    public static String Country_wise_player_count(List<Player> playerList){
        System.out.println("-> Country Wise Count <-");
        System.out.println("Country\tCount");
        //ObservableList<String> temp;
        //temp= FXCollections.observableArrayList();
        String countrywisecount = null;
        int countryCount=0;
        HashMap<String,Integer> count=new HashMap<String,Integer>();
        List <String> co=new ArrayList();
        List <Integer> no=new ArrayList();
        for(Player i:playerList){
            boolean isAvailable=false;
            for(int j=0;j<countryCount;j++){
                if(i.getCountry().equalsIgnoreCase(co.get(j))){
                    isAvailable=true;
                    no.set(j,no.get(j)+1);
                    break;
                }
            }
            if(!isAvailable){
                co.add(countryCount,i.getCountry());
                no.add(countryCount,1);
                countryCount++;
            }
        }
        for(int i=0;i<countryCount;i++){
           // System.out.println(i+1+". "+co.get(i)+"\t"+no.get(i));
            count.put(co.get(i),no.get(i));
            countrywisecount=(String.valueOf(count));
        }

        return countrywisecount;
    }
}
