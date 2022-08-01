package day12_Scanner;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName, lastName, fullName, email, street, state, city, address="", contacts;
int age,zipcode;
double height,weight;
boolean isMarried;
long workPhoneNumber,personalPhoneNumber;

        System.out.println("Welcome to the patient portal!\nPlease enter your information\nEnter your first name");
    firstName=scan.next();
        System.out.println("Enter your last name");
    lastName=scan.next();
        System.out.println("Enter your email");
    email=scan.next();
        System.out.println("Enter your street");
        street=scan.nextLine();
        scan.nextLine();
        System.out.println("Enter your city");
        city=scan.next();

        System.out.println("Enter your state");
        state= scan.next();
        System.out.println("Enter your zipcode");
        zipcode= scan.nextInt();
        System.out.println("Enter your Enter your work phone number");
workPhoneNumber= scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        age= scan.nextInt();
        System.out.println("Enter your height");
height=scan.nextDouble();
        System.out.println("Enter your weight");
weight= scan.nextDouble();
        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();

        System.out.println("Patient personal information Full name: "+firstName+","+lastName+"\n"+"Address: "+address+","+city+","+state
        +zipcode+"\n"+" Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email:"+email+"\n"+
                "Age: "+age+"\n"+" Height: "+height+"\n"+" Weight: "+weight+" pounds\nMarried?: "+isMarried);
scan.close();





    }
}
