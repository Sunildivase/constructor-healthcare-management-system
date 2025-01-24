package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Hospital;

import java.util.HashMap;
import java.util.Scanner;

public class HospitalService {

   private static Scanner scanner = new Scanner(System.in);

   HashMap<String , Hospital> hospitals = new HashMap<>();

   void printHospital(Hospital hospital){
       System.out.println(hospital);
   }

   public Hospital createHospital(){

       System.out.println("please enter hospital id");
       int hospitalId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter hospital name");
       String hospitalName = scanner.nextLine();

       System.out.println("please enter address");
       String address = scanner.nextLine();

       System.out.println("please enter contact number");
       String contactNo = scanner.nextLine();

       System.out.println("please enter emailId");
       String emailId = scanner.nextLine();


       Hospital hospital = new Hospital(hospitalId,hospitalName,address,contactNo,emailId);
       hospitals.put(String.valueOf(1),hospital);
       return hospital;
   }
   public void displayHospital(){
       System.out.println("hospital: "+hospitals);
   }

}
