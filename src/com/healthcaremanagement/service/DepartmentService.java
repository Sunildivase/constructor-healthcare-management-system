package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Department;

import java.util.HashMap;
import java.util.Scanner;

public class DepartmentService {

    private static Scanner scanner = new Scanner(System.in);

    private HashMap<String , Department> departments = new HashMap<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public Department createDepartment(){

        System.out.println("please enter department id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department(deptId,deptName,doctorId,hospitalId);
        departments.put(String.valueOf(1),department);
        return department;
    }
    public void displayDepartment(){
        System.out.println("department: "+departments);
    }
}
