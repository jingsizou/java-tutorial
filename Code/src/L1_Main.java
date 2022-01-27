public class L1_Main {
    /**
     * This main function prints out string "Hello World"
     */
    public static void main(String[] args) {
        System.out.println("Hello World！！！"); // print string "Hello World"

        // 变量
        String studentName = "Yina";
        System.out.println(studentName);
        int num1 = 100, num2 = 200;
        boolean gameOver = true;
        char c = 'a';
        final double PI = 3.1415926; // const variable
        if (gameOver) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(c);
        }

        // 类型转换
        // 自动类型转换
        char c1 = 'a';
        int num = c1;
        System.out.println(num);
        // 强制类型转换
        double doubleNum = 9.9;
        int doubleToInt = (int)doubleNum;
        System.out.println(doubleToInt);

        // 操作符
        // 算数运算符、关系运算符
        bitOperation();
        isObject();

        // 数组
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(numbers1[0]);
        String[] strings = {"Alice", "Bob", "Yina"};
        System.out.println(strings[2]);
        strings[2] = "Kitty";
        System.out.println(strings[2]);
        // 二维数组矩阵
        int[][] numMatrix = { {1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(numMatrix[0][2]);

        // 字符串String和数学Math是java的两个内置类
        String message = "Hello World!";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.indexOf("World"));
        num1 = 10;
        num2 = 20; // 不能写成一行
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
    }

    public static void bitOperation() {
        int num1 = 1; // 001
        int num2 = 4; // 100
        int num3 = num2 >>> 1;
        // 101 = 2^2 + 1
        System.out.println(num1 | num2);
        System.out.println(num3);
        boolean flag = true;
        int num4 = flag ? 100 : -100;
        System.out.println(num4);
    }

    public static void isObject() {
        L1_Main a = new L1_Main();
        boolean isMain = a instanceof L1_Main;
        System.out.println(isMain);
    }

}
