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

    public void createPerson() {

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());



        //we can optimize the code by using constructor
        //we can remove the setter methods for optimization

        Person person = new Person(personId);
        persons.put(String.valueOf(1),person);
    }

    public void displayPerson(){
        System.out.println("person: "+persons);
    }

}
