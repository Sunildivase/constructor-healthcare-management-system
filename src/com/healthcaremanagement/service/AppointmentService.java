package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Appointment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

public class AppointmentService {

   private static Scanner scanner = new Scanner(System.in);

   private HashMap<String , Appointment> appointments = new HashMap<>();

   void printAppointment(Appointment appointment){
       System.out.println(appointment);
   }

   public void createAppointment(){

       System.out.println("please enter appointment id");
       int appointmentId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter person Id ");
       int personId= Integer.parseInt(scanner.nextLine());

       System.out.println("please enter doctor id");
       int doctorId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter hospital Id");
       int hospitalId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter department id");
       int deptId = Integer.parseInt(scanner.nextLine());

       Appointment appointment = new Appointment(appointmentId,personId,doctorId,hospitalId,deptId);
       appointments.put(String.valueOf(1),appointment);
   }
   public void displayAppointment(){
       System.out.println("appointments: "+appointments);
   }
}
