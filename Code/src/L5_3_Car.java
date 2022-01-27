public class L5_3_Car {
    String model;
    int year;
    // 多个构造函数，构造函数的重载, java没有默认形参
    public L5_3_Car(String m) {
        model = m;
    }
    public L5_3_Car(String m, int y) {
        model = m;
        year = y;
    }
    // static全局变量, 无需创建实例，可直接使用
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        L5_3_Car car = new L5_3_Car("BMW X5");
        System.out.printf("Model: %s, Year: %s\n", car.model, car.year);
        car = new L5_3_Car("Subaru WRX", 2019);
        System.out.printf("Model: %s, Year: %s\n", car.model, car.year);
//        int result = multiply(3, 9);
        int result = L5_3_Car.multiply(3, 9);
        System.out.println(result); // 27
    }
}
