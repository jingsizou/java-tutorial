public class L6_PractiseGame {
    private int score;
    public L6_PractiseGame(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void displayInfo() {
        System.out.printf("Game Type: Game\nGame Score: %s", score);
    }
}
