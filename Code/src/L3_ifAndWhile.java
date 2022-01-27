import java.util.Scanner;

public class L3_ifAndWhile {
    static public void main(String[] args) {
//        System.out.println("Hello World");
        score1();
        score2();
        playGame();
        conditionCheck();
        switchConditionCheck();
        whileLoop();
        doWhileLoop();
        forLoop();
        forLoopForArray();
        nestedForLoop1();
        nestedForLoop2();
        breakStatement();
        addUp();
    }

    static public void score1() {
        int score = 70;
        int reward;
        if (score >= 60) {
            reward = score * 2;
        } else {
            reward = 0;
        }
//        reward = score >= 60 ? score * 2 : 0;
        System.out.println("Reward: " + reward);
    }

    static public void score2() {
        int score = 70, reward = 0;
        if (score >= 90) {
            reward = score * 2;
        } else if (score >= 80) {
            reward = score * 3 / 2;
        } else if (score >= 60) {
            reward = score;
        } else {
            reward = 0;
        }
        System.out.println("Reward: " + reward);
    }

    static public void playGame() {
        boolean gameOver = true;
        if (gameOver) {
            System.out.println("You are dead :(");
        } else {
            System.out.println("Do you want to continue?");
        }
    }

    static public void conditionCheck() {
        // 多个final常量的集合
        enum Membership { NORMAL, SILVER, GOLD, DIAMOND };
        Membership memberType = Membership.GOLD;
        int mealPrice = 1000, payment = 0;
        if (memberType == Membership.GOLD || memberType == Membership.DIAMOND) {
            payment = mealPrice * 8 / 10;
        } else  if (memberType == Membership.SILVER) {
            payment = mealPrice * 9 / 10;
        } else {
            payment = mealPrice;
        }
        System.out.printf("You should pay $%s for the meal.\n", payment);
    }

    static public void switchConditionCheck() {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good job.");
                break;
            case 'D':
            case 'F':
                System.out.println("You can do better.");
                break;
            default:
                System.out.println("Unknown grade.");
        }
    }

    static public void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    static public void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    static public void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    static public void forLoopForArray() {
        String[] cars = {"Ford", "BMW", "Porsche", "Ferrari"};
        // 没有auto
        for (String car : cars) {
            System.out.println(car);
        }
        // 为什么string是length(), 字符数组是length,固定长度
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
    }

    static public void nestedForLoop1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i * 10 + j);
            }
        }
    }

    static public void nestedForLoop2() {
        // 二维数组元素个数可以不一样
        int[][] numMatrix = { {1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int i = 0; i < numMatrix.length; i++) {
            for (int j = 0; j < numMatrix[i].length; j++) {
                System.out.print(numMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public void breakStatement() {
        int[] nums = new int[]{3, 7, 4, 2, 9, 13, 22, 0};
        for (int x : nums) {
            if (x >= 10) {
//                break;
                continue;
            }
            System.out.print(x + " ");
        }
    }

    static public void addUp() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Please enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                System.out.println("sum = " + sum);
                continue;
            }
            scanner.nextLine();
            System.out.print("Do you want to continue?(Y/N): ");
            String response = scanner.nextLine();
            if(response.toLowerCase().charAt(0) == 'n') {
                break;
            }
        }
        System.out.println("Total sum = " + sum);
    }
}
