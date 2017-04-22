package com.example.relationship.onetoMany;

import com.example.relationship.onetoMany.view.DepartmentView;


/**
 * Created by aman on 4/5/17.
 */
public class Main {
    public static void main(String[] args) {
        DepartmentView departmentView = new DepartmentView();
        departmentView.insert();
        departmentView.display();
        departmentView.delete();
        departmentView.update();
    }
}
