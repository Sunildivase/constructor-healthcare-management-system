package com.healthcaremanagement;

import com.healthcaremanagement.service.PersonService;

import java.util.Scanner;

public class ConstructorHealthcareManagementDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("---------------healthcare-management-system------------------------");
            System.out.println("1.create person");

            System.out.println("please select the option");
            option=Integer.parseInt(scanner.nextLine());

            switch (option){

                case 1:
                    PersonService personService = new PersonService();
                    personService.createPerson();
                    personService.displayPerson();
                    System.out.println("person created successfully");
                    break;

                case 2:
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    System.out.println("department created successfully");
                    break;

                case 5:
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    System.out.println("prescription created successfully");
                    break;

                case 7:
                    System.out.println("bill generated successfully");
                    break;

                default:
                    System.out.println("please enter valid input");
                    break;

            }

        }while(option!=0);{
            System.out.println("thank you !!!!");
        }
    }
}
