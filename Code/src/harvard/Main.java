package harvard;
import stanford.Student;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student s_student = new Student();
        s_student.greet();
        HashMap salaryMap = new HashMap();
        salaryMap.put("Yina", 10000);
        System.out.println(salaryMap.get("Yina"));
    }
}
