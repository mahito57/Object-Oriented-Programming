package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Searchplayer {
    public static void By_Player_Name(List<Player> playerList) throws Exception{
        Scanner sc=new Scanner(System.in);
        String name;
        boolean found=false;
        System.out.println("Input player name");
        name=sc.nextLine();
        for(Player p: playerList){
            if(name.equalsIgnoreCase(p.getName())) {
                p.show();
                found = true;
            }
        }
        if(!found)
            System.out.println("No such player with this name");
    }
    //2nd
    public static void By_Player_Club(List<Player>playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String country;
        String club;
        System.out.println("Input a Country");
        country=sc.nextLine();
        System.out.println("Input a Club");
        club=sc.nextLine();
        for(Player p: playerList){
            if(country.equalsIgnoreCase(p.getCountry())){

                if(club.equalsIgnoreCase("ANY")){
                    p.show();
                    found=true;
                }
                else if(club.equalsIgnoreCase(p.getClub())){
                    p.show();
                    found=true;
                }
            }
        }
        if(!found) {
            System.out.println("No such player with this club and country");
        }

    }
    //3rd
    public static void By_Position(List<Player>playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String position;
        System.out.println("Input a position");
        position=sc.nextLine();
        for(Player p: playerList){
            if(position.equalsIgnoreCase(p.getPosition())){
                p.show();
                found=true;
            }
        }
        if(!found)
            System.out.println("No such player with this position");
    }
    //4th
    public static void By_Salary_Range(List<Player> playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        System.out.println("Input min and max salary");
        double min = sc.nextDouble();
        double max = sc.nextDouble();
        if(min>max){
            double t;
            t=min;
            min=max;
            max=t;
        }
        for(Player p: playerList){
            if(min<= p.getWeekly_salary() && max>=p.getWeekly_salary() ){
                p.show();
                found=true;
            }
        }
        if(!found) {
            System.out.println("No such player with this weekly salary range");
        }

    }
    //last
    public static void Country_wise_player_count(List<Player> playerList){
        System.out.println("-> Country Wise Count <-");
        System.out.println("Country\tCount");
        int countryCount=0;
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
            System.out.println(i+1+". "+co.get(i)+"\t"+no.get(i));
        }
    }
}
