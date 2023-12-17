package org.example.entity;


import java.util.*;
import java.util.stream.Collectors;

public class Employee {


    int id;
    String name;
    String surname;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee() {


    }

    public Employee(int id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String surname, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public static void method1(List<Employee> employeeList) {
        System.out.println("Query 1 : How many male and female employees are there in the organization ? ");
        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }

    public static void method2(List<Employee> employeeList) {
        System.out.println("Query 2 : Print the name of all departments in the organization ? ");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);


    }

    public static void method3(List<Employee> employeeList) {
        System.out.println("Query 3 : What is the average age of male and female employees ?");
        Map<String, Double> avarageAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avarageAgeOfMaleAndFemaleEmployee);


    }

    public static void method4(List<Employee> employeeList) {
        System.out.println("Query 4 : Get the details of highest paid employee in the organization ?");
        Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
                // .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(highestPaidEmployeeWrapper.get().getName());
    }

    public static void method5(List<Employee> employeeList) {
        System.out.println("Query 5 : Get the names of all employees who have joined after 2015 ?");
        employeeList.stream().filter(employee -> employee.yearOfJoining > 2020).map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void method6(List<Employee> employeeList) {
        System.out.println("Query 6 : Count the number of employees in each department ?");
        Map<String, Long> employeeCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

        for (Map.Entry<String, Long> entry : entrySet) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void method7(List<Employee> employeeList) {
        System.out.println("Query 7 : What is the average salary of each department ?");
        Map<String, Double> avgSalaryDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryDepartment.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void method8(List<Employee> employeeList){
        System.out.println("Query 8 : Get the details of youngest male employee in the product development department ?");

        Optional<Employee> youngestMaleEmployeeInSoftwareDevelopmentWrapper =
                employeeList.stream()
                .filter(employee -> employee.getGender()=="MALE" && employee.getDepartment()=="Software Development")
                .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeSoftware = youngestMaleEmployeeInSoftwareDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Software Development");
        System.out.println("---------------------------------------------------------");
        System.out.println("ID      : " + youngestMaleEmployeeSoftware.getId());
        System.out.println("Name    : " + youngestMaleEmployeeSoftware.getName());
        System.out.println("Surname : " + youngestMaleEmployeeSoftware.getSurname());
        System.out.println("Age     : " + youngestMaleEmployeeSoftware.getAge());
    }

    public static void method9(List<Employee> employeeList){
        System.out.println("Query 9 : Who has the most working experience in the organization ?");

        Optional<Employee> seniorMostEmployeeWrapper =
                employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

                Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
        System.out.println("Senior Most Employee Details ");
        System.out.println("----------------------------");
        System.out.println("ID              :" + seniorMostEmployee.getId());
        System.out.println("Name            :" + seniorMostEmployee.getName() + " " + seniorMostEmployee.getSurname());
        System.out.println("Year of Joining :" + seniorMostEmployee.getYearOfJoining());

    }
    public static void method10(List<Employee> employeeList){
        System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team ?");

        Map<String, Long> countMaleAndFemaleInSalesMarketing = employeeList.stream()
                .filter(employee -> employee.getDepartment()=="Sales Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countMaleAndFemaleInSalesMarketing);
    }
    public static void method11(List<Employee> employeeList){
        System.out.println("Query 11 : What is the average salary of male and female employees ?");
        Map<String, Double> avarageOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avarageOfMaleAndFemaleEmployee);
    }
    public static void method12(List<Employee> employeeList){
        System.out.println("Query 12 : List down the names of all employees in each department ?");
        Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet){
            System.out.println("----------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("----------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.println(e.getName() + " " + e.getSurname());
            }
        }
    }

    public static void method13(List<Employee> employeeList){
        System.out.println("Query 13 : What is the average salary and total salary of the whole organization ?");
        DoubleSummaryStatistics employeeSummaryStatistics =
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = " + employeeSummaryStatistics.getAverage());
        System.out.println("Total   Salary = " + employeeSummaryStatistics.getSum());
    }

    public static void method14(List<Employee> employeeList){
        System.out.println("Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");

        Map<Boolean, List<Employee>> partitionEmployeeByAge =
                employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge()> 25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionEmployeeByAge.entrySet();

        for (Map.Entry<Boolean,List<Employee>> entry : entrySet){

            System.out.println("------------------------------");

           if(entry.getKey()){
               System.out.println(" Employees older than 25 years :");
           }
           else
           {
               System.out.println(" Employees younger than or equal to 25 years :");
           }
            System.out.println("------------------------------");

           List<Employee> list = entry.getValue();

           for (Employee e : list){
               System.out.println(e.getName());
           }

        }
    }

    public static void method15(List<Employee> employeeList){
        System.out.println("Query 15   : Who is the oldest employee in the organization? What is his age and which department he belongs to ?");
        Optional<Employee> oldestEmployeeWrapper =
                employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name       : " + oldestEmployee.getName());
        System.out.println("Age        : " + oldestEmployee.getAge());
        System.out.println("Department : " + oldestEmployee.getDepartment());

    }
}
