public class L6_PractisePhoneGame extends L6_PractiseGame{
    public L6_PractisePhoneGame(int score) {
        super(score);
    }
    public void displayInfo() {
        System.out.printf("Game Type: Phone\nGame Score: %s\n", getScore());
    }
}
