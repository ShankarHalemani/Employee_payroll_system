import java.util.*;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [Name : " + name + ", Id : " + id + ", Salary : " + calculateSalary() + "]";
    }

}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private ArrayList<Employee> empList;

    public PayrollSystem() {
        empList = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    public void removeEmployee(int id) {
        if (empList.isEmpty()) {
            System.out.println("There are no employees to remove");
        } else {
            Employee emp = null;
            for (Employee employee : empList) {
                if (employee.getId() == id) {
                    emp = employee;
                    break; // Move the break statement inside the loop
                }
            }

            if (emp != null) {
                empList.remove(emp);
            }
        }

    }

    public void displayEmployees() {
        if (empList.isEmpty()) {
            System.out.println("There are no employees");
        } else {
            for (Employee employee : empList) {
                System.out.println(employee);
            }
        }
    }

}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem(); // Move outside the loop
        Scanner sc = new Scanner(System.in); // Move outside the loop
        boolean enter = true;
        while (enter) {

            System.out.println("1. Add Full Time employees");
            System.out.println("2. Add Part Time employees");
            System.out.println("3. Remove Employees");
            System.out.println("4. Display employees");
            System.out.println("5. Exit Payroll System");

            int options = sc.nextInt();

            switch (options) {

                case 1:
                    System.out.println("Enter employee name");
                    sc.nextLine();
                    String fname = sc.nextLine();

                    System.out.println("Enter employee id");
                    int fid = sc.nextInt();

                    System.out.println("Enter employee monthly salary");
                    double salary = sc.nextDouble();

                    FullTimeEmployee f1 = new FullTimeEmployee(fname, fid, salary);
                    payrollSystem.addEmployee(f1);
                    break;

                case 2:
                    System.out.println("Enter employee name");
                    sc.nextLine();
                    String pname = sc.nextLine();

                    System.out.println("Enter employee id");
                    int pid = sc.nextInt();

                    System.out.println("Enter number of hours P employee worked");
                    int phours = sc.nextInt();

                    System.out.println("Enter hourly rate of P employee");
                    double prate = sc.nextDouble();

                    PartTimeEmployee p1 = new PartTimeEmployee(pname, pid, phours, prate);
                    payrollSystem.addEmployee(p1);
                    break;

                case 3:
                    System.out.println("Enter employee id");
                    int eid = sc.nextInt();

                    payrollSystem.removeEmployee(eid);
                    break;

                case 4:
                    payrollSystem.displayEmployees();
                    System.out.println();
                    break;

                case 5:
                    enter = false;
                    break;
            }
        }
        sc.close(); // Close the Scanner outside the loop
    }
}
