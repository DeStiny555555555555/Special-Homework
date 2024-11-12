import java.util.Objects;

public class Employee {
   private String fullName;
   private int department;
   private int salary;
   private static int count = 1;
   private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    String getFullName() {
        return this.fullName;
    }

    int getDepartment() {
        return this.department;
    }

    int getSalary() {
        return this.salary;
    }

    public String toString() {
        return fullName + ":" + " отдел = " + department + " заработная плата =  " + salary + " id сотрудника =  " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}
