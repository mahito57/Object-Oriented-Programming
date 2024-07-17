package sample;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PlayerList {
    private static final String INPUT_FILE_NAME = "players.txt";
    //private static final String OUTPUT_FILE_NAME= "players.txt";
    public static List<Player> playerList = new ArrayList();
    PlayerList() throws Exception{
        playerList = readFromFile();
    }

    public static List<Player> readFromFile() throws Exception{
        List<Player> playerList=new ArrayList<Player>();
        BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
        while(true){
            String line= br.readLine();
            if (line == null) break;
            String[] tokens = line.split(",");
            Player ob=new Player();
            ob.setName(tokens[0]);
            ob.setCountry(tokens[1]);
            ob.setAge(Integer.parseInt(tokens[2]));
            ob.setHeight(Double.parseDouble(tokens[3]));
            ob.setClub(tokens[4]);
            ob.setPosition(tokens[5]);
            ob.setNumber(Integer.parseInt(tokens[6]));
            ob.setWeekly_salary(Double.parseDouble(tokens[7]));
            playerList.add(ob);
        }
        br.close();
        return playerList;
    }


   /* public static void main(String[] args) throws Exception {
        List<Player> playerList = readFromFile();
        for (Player s : playerList) {
            System.out.println(s.getAge() + ", " + s.getName() + ", " + s.getHeight() + ", " + s.getPosition());
        }
    }*/

}
