public class L5_1_Employee {
    String name = "Kevin";
    int salary = 10000;

    public static void main(String[] args) {
        L5_1_Employee employee = new L5_1_Employee();
        employee.name = "Yina";
        System.out.println(employee.name);
        employee.quitJob();
    }

    public int getSalary() {
        return salary;
    }
    public void quitJob() {
        System.out.println("I'm out!");
    }
}
