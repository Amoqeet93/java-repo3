package teamManagement;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Moqeet", "Striker");
        Player player1 = new Player("Saba", "Striker");
        Player player2 = new Player("Moiz", "Striker");

        Team team = new Team("Barcelona");
        team.addPlayers(player);
        team.addPlayers(player1);
        team.addPlayers(player2);
        System.out.println();
        team.showPlayers();
        System.out.println();
        team.countPlayers();

    }
}