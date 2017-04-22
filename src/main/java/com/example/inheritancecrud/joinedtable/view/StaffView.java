package com.example.inheritancecrud.joinedtable.view;



import com.example.inheritancecrud.joinedtable.controller.StaffController;
import com.example.inheritancecrud.joinedtable.model.NonTeachingStaff;
import com.example.inheritancecrud.joinedtable.model.Staff;
import com.example.inheritancecrud.joinedtable.model.TeachingStaff;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aman on 3/31/17.
 */
public class StaffView {

    private static StaffController staffController = new StaffController();
    Scanner scanner = new Scanner(System.in);
    String ok = "yes";
    TeachingStaff teachingStaff;
    NonTeachingStaff nonTeachingStaff;


    public void displayMenu() {
        do {
            System.out.println("select menu  choice");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.View");
            int choice = scanner.nextInt();
            switch (choice) {
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
                default:
                    System.out.println("invalid  choice");

            }
            System.out.println("do you want to continue? yes or no");
            ok = scanner.next();

        } while (ok.equalsIgnoreCase("yes"));
        System.exit(0);
    }


    public void insert() {

        System.out.println("choose Staff type");
        System.out.println("1.Teching Staff");
        System.out.println("2.Non-Teaching Staff");
        int staffType = scanner.nextInt();
        if (staffType == 1) {

            teachingStaff = new TeachingStaff();
            System.out.println("name:");
            teachingStaff.setSname(scanner.next());
            System.out.println("Qualification");
            teachingStaff.setQualification(scanner.next());
            System.out.println("SubjcectExpertise");
            teachingStaff.setSubjectExpertise(scanner.next());
            staffController.insert(teachingStaff);
//            System.out.println(teachingStaff);

        } else if (staffType == 2) {

            nonTeachingStaff = new NonTeachingStaff();
            System.out.println("Non-Teaching staff");
            System.out.println("name:");
            nonTeachingStaff.setSname(scanner.next());
            System.out.println("AreaExpertise");
            nonTeachingStaff.setAreaExpertise(scanner.next());
            staffController.insert(nonTeachingStaff);

        } else {
            System.out.println("invalid choice");
        }

    }


    public void update() {

        System.out.println("2.Edit staff");
        System.out.println("id:");
        int id = scanner.nextInt();
        Staff staff = staffController.findOne(id);
        if (staff instanceof TeachingStaff) {

            teachingStaff = new TeachingStaff();
            System.out.println("teaching staff");
            System.out.println(staff);
            System.out.println("name:");
            teachingStaff.setSname(scanner.next());
            System.out.println("Qualification");
            teachingStaff.setQualification(scanner.next());
            System.out.println("SubjcectExpertise");
            teachingStaff.setSubjectExpertise(scanner.next());
            staffController.update(id, teachingStaff);


        } else if (staff instanceof NonTeachingStaff) {

            nonTeachingStaff = new NonTeachingStaff();
            System.out.println("non-teaching staff");
            System.out.println(staff.getClass());
            System.out.println(staff);
            System.out.println("name:");
            nonTeachingStaff.setSname(scanner.next());
            System.out.println("AreaExpertise");
            nonTeachingStaff.setAreaExpertise(scanner.next());
            staffController.update(id, nonTeachingStaff);

        } else {
            System.out.println("invalid id");
        }

    }

    public void delete() {
        System.out.println("2.Delete ");
        System.out.println("id:");
        int id = scanner.nextInt();
        staffController.delete(id);
    }

    public void display() {
        List<Staff> staffList = staffController.findAll();
        staffList.forEach(staff1 -> System.out.println(staff1));
    }
}
