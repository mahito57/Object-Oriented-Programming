package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchClub {

    //1st
    public static void maximum_salary(List<Player> playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String club;
        System.out.println("Input a club");
        club=sc.nextLine();
        List <Double> salary=new ArrayList<Double>();
        for(Player p: playerList){
            if(club.equalsIgnoreCase(p.getClub())){
                salary.add(p.getWeekly_salary());
                found=true;
            }
        }
        if(found){
            Double Max= Collections.max(salary);
            for(Player p: playerList){
                if(club.equalsIgnoreCase(p.getClub()) && Max.equals(p.getWeekly_salary()) )
                    p.show();
            }
        }
        if(!found) System.out.println("No such club with this name");

    }
    //2nd
    public static void maximum_age(List<Player> playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String club;
        System.out.println("Input a club");
        club=sc.nextLine();
        List <Integer> age=new ArrayList<Integer>();
        for(Player p: playerList){
            if(club.equalsIgnoreCase(p.getClub())){
                age.add(p.getAge());
                found=true;
            }
        }
        if(found) {
            Integer Max = Collections.max(age);
            for (Player p : playerList) {
                if (club.equalsIgnoreCase(p.getClub()) && Max.equals(p.getAge()))
                    p.show();
            }
        }
        if(!found) System.out.println("No such club with this name");
    }
    //3rd
    public static void maximum_height(List<Player> playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String club;
        System.out.println("Input a club");
        club=sc.nextLine();
        List <Double> height=new ArrayList<Double>();
        for(Player p: playerList){
            if(club.equalsIgnoreCase(p.getClub())){
                height.add(p.getHeight());
                found=true;
            }

        }
        if(found){
            Double Max=Collections.max(height);
            for(Player p:playerList){
                if(club.equalsIgnoreCase(p.getClub()) && Max.equals(p.getHeight()))
                    p.show();
            }
        }
        if(!found) System.out.println("No such club with this name");
    }
    //Last
    public static void total_yearly_salary(List<Player> playerList){
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        String club;
        System.out.println("Input a club");
        club=sc.nextLine();
        long  total=0;
        for(Player p: playerList){
            if(club.equalsIgnoreCase(p.getClub())){
                total= (long) (total+p.getWeekly_salary());
                found=true;
            }
        }
        if(found) System.out.println("Total yearly salary of players of "+club+" is "+total*52);
        if(!found) System.out.println("No such club with this name");
    }
}
