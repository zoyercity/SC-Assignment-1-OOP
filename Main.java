import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Ali", 80000, 15000));
        employees.add(new SalesManager("Sara", 60000, 200000));
        employees.add(new Developer("Ahmed", 75000, 10000));
        employees.add(new SalesManager("Ayesha", 55000, 150000));

        for (Employee employee : employees) {
            System.out.println(employee.name + " final pay: "
                    + employee.calculatePay());
        }
    }
}