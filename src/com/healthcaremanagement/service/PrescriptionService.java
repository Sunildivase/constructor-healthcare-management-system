package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Prescription;

import java.util.HashMap;
import java.util.Scanner;

public class PrescriptionService {

    private static Scanner scanner = new Scanner(System.in);

    private HashMap<String , Prescription> prescriptions = new HashMap<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }
    public Prescription createPrescription(){

        System.out.println("please enter prescription id");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription(prescriptionId,prescriptionDetails,personId);
        prescriptions.put(String.valueOf(1),prescription);
        return prescription;
    }
    public void displayPrescription(){
        System.out.println("prescriptions: "+prescriptions);
    }
}
