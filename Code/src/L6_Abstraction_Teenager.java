public class L6_Abstraction_Teenager extends L6_Abstraction_Person {
    public void greet() {
        System.out.println("I am a teenager.");
    }

    public static void main(String[] args) {
        L6_Abstraction_Teenager teenager = new L6_Abstraction_Teenager();
        teenager.greet();
        teenager.sleep();
    }
}
