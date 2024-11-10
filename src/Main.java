public class Main {
    public static Employee creatEmployee(String fullName, int departament, int salary) {
        Employee employee = new Employee(fullName, departament, salary);
        return employee;
    }

    private static int calculateSalary(Employee[] employees) {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                result = result + employee.getSalary();
            }
        }
        return result;
    }

    private static int calculateMinSalary(Employee[] employees1) {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    private static int calculateMaxSalary(Employee[] employees2) {
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    private static int calculateAverageSalary(Employee[] employees3) {
        int sum = calculateSalary(employees);
        int averageSum = sum / employees.length;
        return averageSum;
    }

    public static void displayFio() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = creatEmployee("Сергеев Сергей Сергеевич ", 1, 7000);
        employees[1] = creatEmployee("Иванов Иван Иванович ", 2, 8000);
        employees[2] = creatEmployee("Максимов Максим Максимович ", 3, 9000);
        employees[3] = creatEmployee("Николаев Николай Николаевич ", 4, 10000);
        employees[4] = creatEmployee("Никитин Никита Никитич ", 5, 11000);
        employees[5] = creatEmployee("Егоров Егор Егорович ", 1, 12000);
        employees[6] = creatEmployee("Дмитриев Дмитрий Дмитрович ", 2, 13000);
        employees[7] = creatEmployee("Тимофеев Тимофей Тимофеевич ", 3, 14000);
        employees[8] = creatEmployee("Филиппов Филипп Филиппович ", 4, 15000);
        employees[9] = creatEmployee("Кириллов Кирилл Кириллович ", 5, 16000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println(" ");
        int total = calculateSalary(employees);
        System.out.println("Сумма трат за месяц составляет - " + total);
        System.out.println(" ");
        int total1 = calculateMinSalary(employees);
        System.out.println("Минимальная зарплата сотрудника - " + total1);
        System.out.println(" ");
        int total2 = calculateMaxSalary(employees);
        System.out.println("Максимальная зарплата сотрудника - " + total2);
        System.out.println(" ");
        int total3 = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата у сотрудников - " + total3);
        System.out.println(" ");
        displayFio();
    }
}