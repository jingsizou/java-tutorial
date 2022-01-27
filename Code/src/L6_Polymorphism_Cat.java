public class L6_Polymorphism_Cat extends L6_Inheritance_Animal {
    public L6_Polymorphism_Cat(String name) {
        super(name);
    }
    // overload 函数重载：函数名相同，参数数量类型不一样
    // override 函数重写：函数名相同，子类重写父类的方法
    public void greet() {
        print("MiaoMiao..., I am " + this.name);
    }
}
