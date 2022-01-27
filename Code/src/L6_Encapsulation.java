public class L6_Encapsulation {
    // 将数据的细节隐藏起来，仅公开有限接口给用户
    private int score;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Score Error!");
            return;
        }
        this.score = score;
    }
    public static void main(String[] args) {
        L6_Encapsulation game = new L6_Encapsulation();
        game.setScore(100);
        System.out.println(game.getScore());
    }

    public static class L5_4_Student2 {
        private String name = "Yina";
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }
}
