package more_person;

// 一个类可以同时实现多个interface
public class Person implements Student, Employee {
    public void goToSchool() {
        System.out.println("I'm going to school");
    }
    public void takeExam() {
        System.out.println("I'm taking an exam");
    }
    public void goToWork() {
        System.out.println("I'm going to work.");
    }
    public void getSalary() {
        System.out.println("I just got the salary.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.goToSchool();
        person.takeExam();
        person.goToWork();
        person.getSalary();
    }
}
