public class L6_Inheritance_Dog extends L6_Inheritance_Animal {
    // 子类继承父类的数据和方法
    public L6_Inheritance_Dog(String name) {
        super(name);
    }

    public void greet() {
        print("WangWang..., I am " + this.name);
    }

    public void run() {
        print("I'm running!");
    }
}
