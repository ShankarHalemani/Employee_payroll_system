# Employee_payroll_system

<h2> In this project I created Employee payrole management system where we can </h2>
<h2>
  <ol>
    <li> Add employees </li>
    <li> Remove Employees </li>
    <li> Display all the employees </li>
  </ol>
</h2>
<h3> 
Here I created four classes namely,
<ol>
  <li> Employee</li>
  <li> FullTimeEmployee</li>
  <li> PartTimeEmployee</li>
  <li> PayrollSystem</li>
</ol>

<ol>
  <li> Employee </li>
  <p> This is a abstract class and it has two data members and four methods. Here we achieved encapsulation by using private data members and to retrive those private data members we used getter methods </p>

  <li> FullTimeEmployee </li>
  <p> This is derived class of Employee. Here we achieved <span>Inheritance</span> by inheriting from Employee class and <span>Abstaction</span> and <span>Rumtime polymorphism</span> from overrinding abstarct method from Employee class </p>

  <li> PartTimeEmployee </li>
  <p> Here Part time Employee details are added using sperclass() function which can call Employee() constructor to add name and id. </p>

  <li> PayrollSystem </li>
  <p> This is the class using all the functions such as Add employee, remove employee, Display employee are performed. Here we created empList ArrayList of Employee class type  to store all the Employee objects</p>

  <li> Main </li>
  <p> In Main class I created interface for Employee payroll system </p>
</ol>

</h3>
<h3> All four OOPs pillars (APIE) are implemented in this project </h3>


--------------------------------------
|             Employee               |
--------------------------------------
| - name: String                    |
| - id: int                         |
--------------------------------------
| + Employee(name: String, id: int) |
| + getName(): String               |
| + getId(): int                    |
| + abstract calculateSalary(): double |
| + toString(): String              |
--------------------------------------

         |                   ^
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         V                   |
  -------------------------
  |    FullTimeEmployee  |
  -------------------------
  | - monthlySalary: double |
  -------------------------
  | + FullTimeEmployee(name: String, id: int, monthlySalary: double) |
  | + calculateSalary(): double                                    |
  -------------------------

         |                      ^
         |                      |
         |                      |
         |                      |
         |                      |
         |                      |
         |                      |
         |                      |
         V                      |
  ---------------------------
  |    PartTimeEmployee     |
  ---------------------------
  | - hoursWorked: int       |
  | - hourlyRate: double     |
  ---------------------------
  | + PartTimeEmployee(name: String, id: int, hoursWorked: int, hourlyRate: double) |
  | + calculateSalary(): double                                                     |
  ---------------------------

         |                   ^
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         |                   |
         V                   |
  ---------------------------
  |      PayrollSystem       |
  ---------------------------
  | - empList: ArrayList<Employee> |
  ---------------------------
  | + PayrollSystem()                  |
  | + addEmployee(emp: Employee): void |
  | + removeEmployee(id: int): void    |
  | + displayEmployees(): void         |
  ---------------------------

         |
         |
         |
         |
         |
         |
         |
         |
         V
  -------------------------
  |          Main          |
  -------------------------
  | + main(args: String[]): void |
  -------------------------


