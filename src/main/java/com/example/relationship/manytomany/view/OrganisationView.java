package com.example.relationship.onetoone.view;

import com.example.relationship.onetoone.controller.OrganisationController;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by aman on 4/5/17.
 */
public class OrganisationView {

    OrganisationController organisationController = new OrganisationController();
    EmployeeView employeeView = new EmployeeView(organisationController);
    DepartmentView departmentView = new DepartmentView(organisationController);
    Scanner scanner = new Scanner(System.in);
    int choice;
    String ok;

    public void displayMenu() {
        do {
            System.out.println("-****Bidirectional Mapping-******");
            System.out.println("select choice");
            System.out.println("1.Employee-->Department");
            System.out.println("2.Deparment-->Employee");
            System.out.println("0.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeView.menu();
                    break;
                case 2:
                    departmentView.menu();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
                    break;
            }

            System.out.println("do you want to continue?yes or no or exit");
            ok = scanner.next();
            if (ok.equalsIgnoreCase("exit"))
                System.exit(0);

        } while (ok.equalsIgnoreCase("yes"));
        System.exit(0);
    }
}

