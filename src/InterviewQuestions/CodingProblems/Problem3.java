package InterviewQuestions.CodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int compareTo(Employee that){
        return this.id - that.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeManager<T extends Employee> {
    final List<T> employees;

    EmployeeManager(){
        employees = new ArrayList<>();
    }

    void addEmployee(T emp){
        employees.add(emp);
        System.out.println("Employee: "+ emp.name+" has been added.");
    }

    void removeEmployee(int id){
//        for(T emp: employees){
//            if(emp.id == id){
//                employees.remove(emp);
//            }
//        }
        employees.removeIf(emp -> emp.id == id);
    }

    void printList(){
        Collections.sort(employees);
        for(T emp: employees){
            System.out.println(emp);
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        EmployeeManager<Employee> employeeManager = new EmployeeManager<>();

        employeeManager.addEmployee(new Employee(1, "abhishek", "tech", 121.3));
        employeeManager.addEmployee(new Employee(2, "punit", "tech", 118.5));
        employeeManager.addEmployee(new Employee(3, "jyoti", "marketing", 125.5));

        employeeManager.removeEmployee(2);

        employeeManager.printList();
    }
}

