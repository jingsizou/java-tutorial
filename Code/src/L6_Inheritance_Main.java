public class L6_Inheritance_Main {
    public static void main(String[] args) {
        L6_Inheritance_Dog dog = new L6_Inheritance_Dog("puppy");
        dog.greet();
        dog.run();
        L6_Polymorphism_Cat cat = new L6_Polymorphism_Cat("bobo");
        cat.greet();
    }
}
