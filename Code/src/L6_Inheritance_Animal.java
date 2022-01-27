public class L6_Inheritance_Animal {
    protected String name;
    public L6_Inheritance_Animal(String name) {
        this.name = name;
    }

    public void greet() {
        print("Hello, I'm " + this.name);
    }

    public void print(String message) {
        System.out.println(message);
    }
}
