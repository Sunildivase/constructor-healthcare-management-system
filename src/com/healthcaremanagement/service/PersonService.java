package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

    Scanner scanner = new Scanner(System.in);

    HashMap<String , Person> persons = new HashMap<>();


    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson() {

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        String contactNo = scanner.nextLine();

        System.out.println("please enter alternate Mobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        //we can optimize the code by using constructor
        //we can remove the setter methods for optimization

        Person person = new Person(personId,type,firstName,lastName,age,gender,contactNo,alternateMobile,address);
        persons.put(String.valueOf(1),person);
        return person;
    }

    public void displayPerson(){
        System.out.println("person: "+persons);
    }

}
