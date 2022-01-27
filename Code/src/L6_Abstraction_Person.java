public abstract class L6_Abstraction_Person {
    // 无法创建abstract类的实例，这种抽象类只能被继承
    public abstract void greet();
    public void sleep() {
        System.out.println("Zzz");
    }
}
