package com.example.relationship.onetoone.view;

import com.example.relationship.onetoone.controller.OrganisationController;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aman on 4/5/17.
 */
public class DepartmentView {

    int choice, id;
    String ok;
    Employee employee;
    Department department;
    Scanner scanner = new Scanner(System.in);
    OrganisationController organisationController;

    public DepartmentView() {

    }

    public DepartmentView(OrganisationController organisationController) {
        this.organisationController = organisationController;
    }

    public void menu() {
        do {
            System.out.println("1.Department--->Employee");
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

        System.out.println("deparment name");
        department.setName(scanner.next());

        System.out.println("name:");
        employee.setEname(scanner.next());
        System.out.println("salary");

        employee.setSalary(scanner.nextDouble());
        System.out.println("degree");
        employee.setDeg(scanner.next());
        employee.setDepartment(department);
        department.setEmployee(employee);
        organisationController.insert(department);


    }

    public void update() {

        department = new Department();
        employee = new Employee();

        System.out.println("dep id:");
        id = scanner.nextInt();
        if (organisationController.findDepartmenOne(id) != null) {
            System.out.println(organisationController.findDepartmenOne(id));

            System.out.println("deparment name:");
            department.setName(scanner.next());

            System.out.println("name:");
            employee.setEname(scanner.next());
            System.out.println("salary");
            employee.setSalary(scanner.nextDouble());
            System.out.println("degree");
            employee.setDeg(scanner.next());

            department.setEmployee(employee);
            organisationController.update(id, department);

        } else {
            System.out.println("id not found");
        }

    }

    public void delete() {
        System.out.println("Department Id:");
        id = scanner.nextInt();
        organisationController.deleteByDepartmentId(id);
    }

    public void display() {

        System.out.println("Department--->Employee");
        List<Department> departmentList = organisationController.findAllDepartment();
        departmentList.forEach(department1 -> System.out.println(department1
                + "( eid=" + department1.getEmployee().getEid()
                + " name=" + department1.getEmployee().getEname()
                + " salary=" + department1.getEmployee().getSalary()
                + " degree=" + department1.getEmployee().getDeg() + " )"));

    }

    public void displayByName() {

        System.out.println(" department name:");
        String name = scanner.next();
        List<Department> departmentList = organisationController.findDepartmentByName(name);
        departmentList.forEach(department1 -> System.out.println(department1));

    }

    public void displayBYId() {

        System.out.println("department id:");
        id = scanner.nextInt();
        List<Department> departmentList = organisationController.findDepartmentById(id);
        departmentList.forEach(department1 -> System.out.println(department1));
    }
}

