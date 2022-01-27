import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class L4_myMethod {
    public static void main(String[] args) {
        myMethod();
        printOppositeNum(9);
        printName("Yina", "Zou");
        int num1 = plus5(5);
        System.out.println(num1);
        int num2 = 10;
        if (isEven(num2)) {
            num2 += 2;
        } else {
            num2 = sum(num2, 2);
        }
        System.out.println(num2);

        // Function overload: 函数名一样，入参数量类型不一样
        int intSum = sum(1, 1);
        System.out.println(intSum);
        double doubleSum = sum(1.1, 1.4);
        System.out.println(doubleSum);

        // static 声明函数是全局的，不用通过实例来调用
        L4_myMethod mymethod = new L4_myMethod();
        System.out.println(mymethod.sum2(1, 3));

        string();
        maths();
        arrays();
    }

    public static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void printOppositeNum(int num) {
        System.out.println(-num);
    }

    public static void printName(String firstName, String lastName) {
        System.out.print("Full name: " + firstName + " " + lastName);
    }

    public static int plus5(int num) {
        return num + 5;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sum( int num1, int num2) {
        return num1 + num2;
    }

    public static float sum( float num1, float num2) {
        return num1 + num2;
    }

    public static double sum( double num1, double num2) {
        return num1 + num2;
    }

    public int sum2( int num1, int num2) {
        return num1 + num2;
    }

    public static void string() {
        String str = "   Hello World!    ";
        str = str.trim(); // "Hello World!"
        str = str.replace("World", "Yina");
        System.out.println(str);
        str = str.substring(6, 6 + 4); // (index, index + length)
        System.out.println(str);
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }

    public static void maths() {
        double num1 = 14, num2 = 9.345;
        double minNum = Math.min(num1, num2); // 9.345
        minNum = Math.floor(minNum); // 9.0
        minNum = Math.sqrt(minNum); // 3.0
        minNum = Math.pow(minNum, 3); // 27.0
        System.out.println(minNum);
    }

    public static void arrays() {
        Integer[] array = {5, 7, 6, 3, 4, 2, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // {1, 2, 3, 4, 5, 6, 7}
        List<Integer> arrayList = Arrays.asList(array);
        Collections.reverse(arrayList);
        System.out.println(arrayList); // [7, 6, 5, 4, 3, 1]
    }
}
