package teamManagement;

public class Player {
    private String playerName;
    private String position;

    public Player(String playerName, String position) {
        this.playerName = playerName;
        this.position = position;
    }

    public void displayInfo(){
        System.out.println("teamManagement.Player Name: " + playerName + ", position: " + position );
    }
}
