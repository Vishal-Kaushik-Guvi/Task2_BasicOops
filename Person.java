package Task2_BasicOops;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    // Method to store Person age and name;
    public void personDetails() {
        // Defaut age is 18
        age = 18;
        Scanner sc = new Scanner(System.in);
        // To get person name as input
        System.out.println("Enter the name of the Person: ");
        String name = sc.nextLine();
        System.out.println("Person name is : " + name);
        System.out.println("Person age is : " + age);
        sc.close();
    }

    public static void main(String[] args) {
        //Object of Person class 
        Person p = new Person();
        //Method called
        p.personDetails();
    }
}
