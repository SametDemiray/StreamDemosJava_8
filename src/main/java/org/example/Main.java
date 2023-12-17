package org.example;

import org.example.entity.Employee;


import java.util.ArrayList;
import java.util.List;

import static org.example.entity.Employee.*;

public class Main {

    Employee employee = new Employee();



    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Samet", "Demiray", 36, "MALE", "Software Development", 2022, 55000));
        employeeList.add(new Employee(2,"Robert", "Jones", 35, "MALE", "Software Development", 2022, 45000));
        employeeList.add(new Employee(3,"Amelia", "Taylor", 36, "FEMALE", "Software Development", 2019, 45500));
        employeeList.add(new Employee(4,"Olivia", "Smith", 38, "FEMALE", "Advertising and Marketing", 2019, 30000));
        employeeList.add(new Employee(5,"Jacob", "O,Connor", 30, "MALE", "Software Development", 2017, 56000));
        employeeList.add(new Employee(6,"John", "Miller", 26, "MALE", "Security and Transport", 2019, 35000));
        employeeList.add(new Employee(7,"Thomas", "Edison", 28, "MALE", "Account and Finance", 2017, 30000));
        employeeList.add(new Employee(8,"Emily", "Murphy", 34, "FEMALE", "Account and Finance", 2015, 30000));
        employeeList.add(new Employee(9,"Sophie", "Garcia", 26, "FEMALE", "Sales Marketing", 2017, 30000));
        employeeList.add(new Employee(10,"Jessica", "Smith", 18, "FEMALE", "Sales Marketing", 2024, 24000));
        employeeList.add(new Employee(11,"Margaret", "Wilson", 40, "FEMALE", "Account and Finance", 2012, 65000));
        employeeList.add(new Employee(12,"Lily", "Johnson", 21, "FEMALE", "Infrastructure", 2021, 33000));
        employeeList.add(new Employee(13,"John", "Wilson", 45, "MALE", "Security and Transport", 2020, 30000));
        employeeList.add(new Employee(14,"Jack", "Brown", 24, "MALE", "Product Development", 2023, 28500));
        employeeList.add(new Employee(15,"Charles", "Walsh", 25, "MALE", "Software Development", 2021, 27500));
        employeeList.add(new Employee(16,"Harry", "Potter", 22, "MALE", "Advertising and Marketing", 2016, 30000));
        employeeList.add(new Employee(17,"James", "Potter", 42, "MALE", "Product Development", 2000, 66000));
        employeeList.add(new Employee(18,"Harmonie", "Granger", 22, "FEMALE", "Advertising and Marketing", 2016, 29000));
        employeeList.add(new Employee(19,"Ron", "Weasley", 22, "MALE", "Software Development", 2016, 27500));
        employeeList.add(new Employee(20,"Mark", "West", 24, "MALE", "Infrastructure", 2020, 27500));
        employeeList.add(new Employee(21,"Thomas", "Morton", 21, "MALE", "Security and Transport", 2021, 24500));
        employeeList.add(new Employee(22,"Megan", "Fox", 24, "FEMALE", "Infrastructure", 2020, 29500));
        employeeList.add(new Employee(23,"Emma", "Johnson", 24, "FEMALE", "Infrastructure", 2020, 26500));
        employeeList.add(new Employee(24,"Ethan", "O'Sullivan", 24, "MALE", "Sales Marketing", 2020, 37500));

        System.out.println();
        // Query 1 : How many male and female employees are there in the organization ?
        method1(employeeList);
        System.out.println("\n");

        // Query 2 : Print the name of all departments in the organization ?
        method2(employeeList);
        System.out.println("\n");

        // Query 3 : What is the average age of male and female employees ?
        method3(employeeList);
        System.out.println("\n");

        // Query 4 : Get the details of highest paid employee in the organization ?
        method4(employeeList);
        System.out.println("\n");

        // Query 5 : Get the names of all employees who have joined after 2020 ?
        method5(employeeList);
        System.out.println("\n");

        // Query 6 : Count the number of employees in each department ?
        method6(employeeList);
        System.out.println("\n");

        // Query 7 : What is the average salary of each department?
        method7(employeeList);
        System.out.println("\n");

        // Query 8 : Get the details of youngest male employee in the Software Development department?
        method8(employeeList);
        System.out.println("\n");

        // Query 9 : Who has the most working experience in the organization ?
        method9(employeeList);
        System.out.println("\n");

        // Query 10 : How many male and female employees are there in the sales and marketing team ?
        method10(employeeList);
        System.out.println("\n");

        // Query 11 : What is the average salary of male and female employees ?
        method11(employeeList);
        System.out.println("\n");

        // Query 12 : List down the names of all employees in each department ?
        method12(employeeList);
        System.out.println("\n");

        // Query 13 : What is the average salary and total salary of the whole organization ?
        method13(employeeList);
        System.out.println("\n");

        // Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        method14(employeeList);
        System.out.println("\n");

        // Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to ?
        method15(employeeList);
        System.out.println("\n");
    }


}