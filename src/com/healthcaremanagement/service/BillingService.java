package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Billing;

import java.util.HashMap;
import java.util.Scanner;

public class BillingService {

    private static Scanner scanner = new Scanner(System.in);

    private HashMap<String , Billing> billings = new HashMap<>();

    void printBilling(Billing billing){
        System.out.println(billing);
    }
    public Billing createBilling(){

        System.out.println("please enter bill id ");
        int billId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Billing billing =new Billing(billId,bill,totalBill,personId);
        billings.put(String.valueOf(1),billing);
        return billing;
    }
    public void displayBilling(){
        System.out.println("billings: "+billings);
    }

}
