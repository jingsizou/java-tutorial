public class L6_PractiseVideoGame extends L6_PractiseGame {
    public L6_PractiseVideoGame(int score) {
        super(score);
    }
    public void displayInfo() {
        System.out.printf("Game Type: Video\nGame Score: %s\n", getScore());
    }
}
