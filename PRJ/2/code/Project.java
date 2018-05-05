import java.util.Scanner;

public class Project {

public static void main (String args[])

{
    Hospital hospital= new Hospital("Mairst Hospital");
    int choice = 0;
    Doctor david = new Doctor("David Yellen ","Spine Surgeon");
    Doctor frank = new Doctor("Frankie the Fox ","Brain Surgeon");
    Doctor jake = new Doctor("Jake Tantorski ","ENT Doctor");
    
    System.out.println("Welcome to the Marist Hospital");
    System.out.println("1: Add Doctor "
    		+ "\n2: Show Doctors "
    		+ "\n3: Add Patient "
    		+ "\n4: Assign Doctor "
    		+ "\n5: Doctor's Patient ");
    Scanner input = new Scanner (System.in);
    choice = input.nextInt();
    switch (choice)
    {
    case 1:hospital.addDoctor(david);
    		   hospital.addDoctor(frank);
    		   hospital.addDoctor(jake);
                         
    case 2:    {   System.out.println(hospital.showDoctors());

               }    
    case 3:     {   hospital.addPatient(new Patient ("Amy ",18," Female","brain"));
    				    hospital.addPatient(new Patient ("Brock ",21," Male","spine"));
    				    hospital.addPatient(new Patient ("Colin ",32," Male","ear"));
    				    hospital.addPatient(new Patient ("Dan ",40," Male","nose"));
    				    hospital.addPatient(new Patient ("Edward ",11," Male","spine"));
    				    hospital.addPatient(new Patient ("Fiona ",9," Female","brain"));
                    
                     System.out.println(hospital.showPatients());
                }   
    case 4:     {
                     hospital.assignDoctor();
                }

    case 5:     {
                      System.out.println("\n \n \n "+ ""+jake.getDoctorName()+""+jake.getDoctorPatientList());
                      System.out.println("\n \n \n "+ ""+david.getDoctorName()+""+david.getDoctorPatientList());
                      System.out.println("\n \n \n "+ ""+frank.getDoctorName()+""+frank.getDoctorPatientList());
                }
    }
    }}