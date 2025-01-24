package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Doctor;

import java.util.HashMap;
import java.util.Scanner;

public class DoctorService {

    private static Scanner scanner = new Scanner(System.in);

    HashMap<String , Doctor> doctors = new HashMap<>();

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter experience");
        int experience = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor(doctorId,firstName,lastName,age,gender,contactNo,speciality,experience);
        doctors.put(String.valueOf(1),doctor);
        return doctor;
    }
    public void displayDoctor(){
        System.out.println("doctor: "+doctors);
    }
}
