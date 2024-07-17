package project;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.FileWriter;
import static project.PlayerList.readFromFile;



public class Main {


    public static void mainmenu(){
        System.out.println("(1) Search Players");
        System.out.println("(2) Search Clubs");
        System.out.println("(3) Add Player");
        System.out.println("(4) Exit System");
    }
    public static void Search_player(){
        System.out.println("(1) By Player Name");
        System.out.println("(2) By Club and Country");
        System.out.println("(3) By Position");
        System.out.println("(4) By Salary Range");
        System.out.println("(5) Country-wise player count");
        System.out.println("(6) Back to Main Menu");
    }
    /*
    Options of search player
    1st
    */
    public static void Search_Clubs(){
        System.out.println("(1) Player(s) with the maximum salary of a club");
        System.out.println("(2) Player(s) with the maximum age of a club");
        System.out.println("(3) Player(s) with the maximum height of a club");
        System.out.println("(4) Total yearly salary of a club");
        System.out.println("(5) Back to Main Menu");
    }

    //options of search clubs

    //add player
    public static void menu3(){
        System.out.println("(1) Give info");
        System.out.println("(2) return to mainmenu");
    }
    public static void add_player(List<Player> playerList) throws Exception{
        Player p=new Player();
        Scanner sc=new Scanner(System.in);
        boolean pos=true;
        boolean nam=true;
        boolean clu=true;
        System.out.println("Input player's info accordingly");
        while (nam){
            System.out.println("Player name: ");
            String name=sc.nextLine();
            boolean takeagain=false;
            for(Player i:playerList){
                if(name.equalsIgnoreCase(i.getName())){
                    System.out.println("Name already exists");
                    takeagain=true;
                    break;
                }
            }
            if(!takeagain){
                p.setName(name);
                nam=false;
            }
        }

        System.out.println("Country: ");
        String country=sc.nextLine();
        p.setCountry(country);

        System.out.println("Age");
        int age=sc.nextInt();
        p.setAge(age);

        System.out.println("Height");
        double height=sc.nextDouble();
        p.setHeight(height);
        sc.nextLine();

        while(clu){
            System.out.println("Club");
            String club=sc.nextLine();
            int counter=0;
            for(Player i: playerList){
                if(club.equalsIgnoreCase(i.getClub()))
                    counter=counter+1;
            }
            if(counter<=6) {
                p.setClub(club);
                clu=false;
            }
            else System.out.println("Max player reached for this club");
            //System.out.println(counter);
        }

        while(pos){
            System.out.println("position");
            String position=sc.nextLine();
            if(position.equalsIgnoreCase("Goalkeeper")||
                    position.equalsIgnoreCase("Midfielder")||
                    position.equalsIgnoreCase("Defender")||
                    position.equalsIgnoreCase("Forward")){
                         p.setPosition(position);
                         pos=false;
            }
            else {
                System.out.println("give correct info");
            }
        }

        System.out.println("Number");
        int number=sc.nextInt();
        p.setNumber(number);
        System.out.println("Weekly Salary");
        double salary=sc.nextDouble();
        p.setWeekly_salary(salary);
        playerList.add(p);
    }


    public static void main(String[] args) throws Exception{
	// write your code here

        List<Player> playerList = readFromFile();
        Scanner sc=new Scanner(System.in);
        boolean cont=true;
        int option=0;
        while(cont){
            while(option==0){
                mainmenu();
                option=sc.nextInt();
                while(option>4){
                    System.out.println("give correct input");
                    option=sc.nextInt();
                }
            }

            while(option==1){
                Search_player();
                int option1;
                option1= sc.nextInt();
                while(option1>6 || option1<1){
                    System.out.println("give correct input");
                    option1=sc.nextInt();
                }
                if(option1==1)
                    Searchplayer.By_Player_Name(playerList);
                if(option1==2)
                    Searchplayer.By_Player_Club(playerList);
                if(option1==3)
                    Searchplayer.By_Position(playerList);
                if(option1==4)
                    Searchplayer.By_Salary_Range(playerList);
                if(option1==5)
                    Searchplayer.Country_wise_player_count(playerList);
                if(option1==6)
                    option=0;
            }

            while(option==2){
                Search_Clubs();
                int option2;
                option2= sc.nextInt();
                while (option2>5 || option2<1){
                    System.out.println("give correct input");
                    option2=sc.nextInt();
                }
                if(option2==1) SearchClub.maximum_salary(playerList);
                if(option2==2) SearchClub.maximum_age(playerList);
                if(option2==3) SearchClub.maximum_height(playerList);
                if(option2==4) SearchClub.total_yearly_salary(playerList);
                if(option2==5) option=0;
            }
            while(option==3){
                menu3();
                int option3=sc.nextInt();
                if(option3==1) add_player(playerList);
                if(option3==2) option=0;
            }
            if(option==4){
                BufferedWriter bw = new BufferedWriter(new FileWriter("players.txt"));
                for(Player p: playerList){
                    bw.write(p.getName()+","+p.getCountry()+","+p.getAge()+","
                            +p.getHeight()+","+p.getClub()+","+p.getPosition()+","+p.getNumber()+","+p.getWeekly_salary());
                    bw.write("\n");
                }
                bw.close();
                cont=false;
            }

        }


    }

}


