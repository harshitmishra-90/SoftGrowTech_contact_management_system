package com.harshit.contact;
import com.harshit.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

        public static boolean isValidPhone(String phone) {
         return phone.matches("^[6-9][0-9]{9}$");
        }
    public static void main(String[] args) {

        System.out.println("-------: contact Management System :--------");
        ArrayList<contact> list =new ArrayList<>();
       
        Scanner scn = new Scanner(System.in);
         
    
        do{

            System.out.println("Enter your choice :-  (1,2,3,4)");
            System.out.println("1. Add Contact");
            System.out.println("2. Show allcontacts ");
            System.out.println("3. Search the contact by name ");
            System.out.println("4. Delete the contact ");
            System.out.println("5. Exit");
           
            int choice =scn.nextInt();
            scn.nextLine();
            switch (choice) {
                case 1:
                     contact c1 =new contact();
                   System.out.println("enter the name :");
                   String name = scn.nextLine();
                    // full name allowed
                    c1.setName(name);
                   System.out.println("enter the phone number ");
                  String phone = scn.next();
                 

                  if(phone.length()!=10){
                    System.out.println("invalid number \n"+"please try again");
                    break;
                  }
                  if (!isValidPhone(phone)) {
                        System.out.println("Invalid phone number! Must start with 6-9 and be 10 digits.");
                            break; // or ask again
                        }
                    
                    c1.setPhone_number(Long.parseLong(phone));
                    list.add(c1);
                    break;
                case 2:
                    // we use this when we don't override toString() method in contact class
                    // for (contact c : list) 
                    //         System.out.println("Name: " + c.getName() + ", Phone: " + c.getPhone_number());
                    for (contact c : list) {
                            System.out.println(c);
                        }

                    break;
                case 3:
                    System.out.println("enter the name : ");
                    String str = scn.next();

                    boolean found = false;

                    for (contact c : list) {
                        if (c.getName().equalsIgnoreCase(str)) {
                            System.out.println("Name: " + c.getName() + ", Phone: " + c.getPhone_number());
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                     System.out.println("enter the name : ");
                    String delName = scn.next();

                    boolean removed = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equalsIgnoreCase(delName)) {
                            list.remove(i);
                            removed = true;
                            System.out.println("Contact deleted successfully");
                            break; // stop after deleting
                        }
                    }

                    if (!removed) {
                        System.out.println("Contact not found");
                    }
                    break;
                
                case 5:
                            System.out.println("Exiting... Thank you!");
                            System.exit(0);   // stops the program completely
                            break;


                default:
                    System.out.println("Please enter the valid number ");
                    break;
            }

        }while(true);

        

    }
}
