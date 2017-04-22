package com.example.relationship.onetoone.view;

import com.example.relationship.onetoone.controller.OrganisationController;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aman on 4/5/17.
 */
public class EmployeeView {

    int choice, id;
    String ok;
    Employee employee;
    Department department;
    Scanner scanner = new Scanner(System.in);

    OrganisationController organisationController;

    public EmployeeView() {
    }

    public EmployeeView(OrganisationController organisationController) {
        this.organisationController = organisationController;
    }


    public void menu() {
        do {
            System.out.println("1.Employee--->department");
            System.out.println("1.insert");
            System.out.println("2.update");
            System.out.println("3.delete");
            System.out.println("4.display All");
            System.out.println("5.display byId");
            System.out.println("6.display byName");
            System.out.println("9.back");
            System.out.println("0.exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    displayBYId();
                    break;
                case 6:
                    displayByName();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            if (choice == 9)
                break;
            System.out.println("do you want to continue?'yes' for continue, 'no' for back or 'exit' for terminate");
            ok = scanner.next();
            if (ok.equalsIgnoreCase("exit"))
                System.exit(0);


        } while (ok.equalsIgnoreCase("yes"));

    }

    public void insert() {

        employee = new Employee();
        department = new Department();

        System.out.println("name:");
        employee.setEname(scanner.next());
        System.out.println("salary");

        employee.setSalary(scanner.nextDouble());
        System.out.println("degree");
        employee.setDeg(scanner.next());
        System.out.println("deparment name");
        department.setName(scanner.next());
        employee.setDepartment(department);
        organisationController.insert(employee);


    }

    public void update() {

        department = new Department();
        employee = new Employee();

        System.out.println("emp id:");
        id = scanner.nextInt();
        if (organisationController.findEmployeOne(id) != null) {

            System.out.println(organisationController.findEmployeOne(id));
            System.out.println("name:");
            employee.setEname(scanner.next());
            System.out.println("salary");

            employee.setSalary(scanner.nextDouble());
            System.out.println("degree");
            employee.setDeg(scanner.next());
            System.out.println("deparment name");
            department.setName(scanner.next());
            employee.setDepartment(department);

            System.out.println(department);
            organisationController.update(id, employee);

        } else {
            System.out.println("id not found");
        }

    }


    public void delete() {
        System.out.println("employee Id:");
        id = scanner.nextInt();
        organisationController.deleteByEmployeeId(id);
    }

    public void display() {

        System.out.println("Employee--->Department");
        List<Employee> employeeList = organisationController.findAllEmployee();
        employeeList.forEach(employee1 -> System.out.println(employee1));
    }

    public void displayByName() {
        System.out.println(" employee name:");
        String name = scanner.next();
        List<Employee> employeeList = organisationController.findEmployeeByName(name);
        employeeList.forEach(employee1 -> System.out.println(employee1));

    }

    public void displayBYId() {
        System.out.println("employee id");
        id = scanner.nextInt();
        List<Employee> employeeList = organisationController.findEmployeeById(id);
        employeeList.forEach(employee1 -> System.out.println(employee1));
    }

}
