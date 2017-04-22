package com.example.jpacrud.view;

import com.example.jpacrud.controller.UserController;
import com.example.jpacrud.model.User;

import java.util.List;
import java.util.Scanner;

/**
 * Created by aman on 3/30/17.
 */
public class UserView {
    private User user;
    private int id;
    private String confirm;
    private Scanner scanner;
    private static UserController userController = new UserController();

    public void displayMenu() {


        System.out.println("please choose the menu");
        do {
            scanner = new Scanner(System.in);
            System.out.println("1.Insert user");
            System.out.println("2.Update user");
            System.out.println("3.Delete user");
            System.out.println("4.Display userList");
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
                    System.out.println("input invalid");
            }
            System.out.println("do you want to continue?yes or no");
            confirm = scanner.next();

            if (confirm.equalsIgnoreCase("no"))
                System.exit(0);


        }
        while (confirm.equalsIgnoreCase("yes"));
        System.exit(0);

    }

    public void insert() {

        user = new User();

        System.out.println("1.Insert user details");
        System.out.println("name:");
        user.setName(scanner.next());
        System.out.println("address:");
        user.setAddress(scanner.next());
        userController.insert(user);

    }

    public void update() {
        user = new User();

        System.out.println("1.edit user");
        System.out.println("id:");
        int id = scanner.nextInt();
        if (userController.findOne(id) != null) {
            System.out.println(userController.findOne(id).toString());
            System.out.println("name:");
            user.setName(scanner.next());
            System.out.println("address:");
            user.setAddress(scanner.next());
            userController.update(id, user);
        }
    }

    public void delete() {
        System.out.println("2.Delete ");
        System.out.println("id:");
        int id = scanner.nextInt();
        userController.delete(id);
    }

    public void display() {
        System.out.println("user list");
        List<User> userList = userController.findAll();
        userList.forEach(user -> System.out.println(user));
    }

}
