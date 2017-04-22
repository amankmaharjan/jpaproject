package com.example.relationship.onetoMany.view;

import com.example.relationship.onetoMany.controller.DepartmentController;
import com.example.relationship.onetoMany.model.Department;
import com.example.relationship.onetoMany.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aman on 4/10/17.
 */
public class DepartmentView {
    DepartmentController departmentController = new DepartmentController();

    public void insert() {
        Department department1 = new Department();
        Department department2 = new Department();

        Employee employee1 = new Employee("aman", 500, "Master");
        Employee employee2 = new Employee("raj", 45, "Bachelor");
        Employee employee3 = new Employee("kapil", 80, "comedy");
        Employee employee4 = new Employee("hari", 100, "slc");


        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(employee1);
        employeeList1.add(employee2);

        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(employee3);
        employeeList2.add(employee4);

        department1.setName("Technical");
        department2.setName("Adminstration");

        department1.setEmployeeList(employeeList1);
        department2.setEmployeeList(employeeList2);

        departmentController.insert(department1);
        departmentController.insert(department2);

    }

    public void delete() {
        System.out.println("Department  delete id: ");
        Scanner scanner = new Scanner(System.in);
        departmentController.delete(scanner.nextInt());
        display();

    }

    public void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Department update id: ");
        int id = scanner.nextInt();
        System.out.println(departmentController.findOne(scanner.nextInt()));

        Department department = new Department();
        department.setName("non-technical");
        departmentController.update(id, department);
        display();


    }

    public void display() {
        List<Department> departmentList = departmentController.findAll();
        departmentList.forEach(department -> System.out.println(department));
    }

}
