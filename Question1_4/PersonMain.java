package Task2_BasicOops.Question1_4;

// Parent class person
class person{
    String name;
    int age;

// constructor on person class.
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// Method to store Person Details.
    public void personDetails(){
        System.out.println("Employee name is " +name);
        System.out.println("Employee age is " +age);
    }
}
// Subclass employee inheriting the properties of parent class person.
class employee extends person{
 int empId;
 int salary;

// constructor of subclass employee.
 public employee(String name, int age, int empId, int salary){

// super keyword to access the member of superclass person. 
    super(name, age);

    this.empId = empId;
    this.salary = salary;
 }

// Method to display employee details.
 public void empDetails(){
// calling Method of super class (person) using super keyword
    super.personDetails();
     System.out.println("Employee ID is " +empId);
     System.out.println("Employee salary is " +salary);
 }
}

public class PersonMain {
    public static void main(String[] args) {
// Object of employee class
        employee emp = new employee("Vishal", 21, 1, 10000);
// Calling empDetails method in employee class using employee object.
        emp.empDetails();
    }
}
