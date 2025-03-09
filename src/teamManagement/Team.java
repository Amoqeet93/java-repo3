package teamManagement;

import java.util.ArrayList;

public class Team {
    private String teamName;
    ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayers(Player player){
        players.add(player);
    }

    public void showPlayers(){
        for(Player players : players){
            players.displayInfo();
        }
    }

    public void countPlayers(){
        System.out.println("The total numbers of players is: " + players.size());
    }
}
