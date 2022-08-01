package Day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        String fullname, gender, Schoolname, city, state, streetname;
        int age, zipcode, buildingnumber;
        long phonenumber;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your gender");
        gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");
        fullname = scan.nextLine();
        System.out.println("Enter your phone number");
        phonenumber = scan.nextLong();
        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter you School name");
        Schoolname = scan.nextLine();
        System.out.println("City name");
        city = scan.next();
        System.out.println("Enter your State name");
        state = scan.next();
        System.out.println("Enter your building number");
        buildingnumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name");
        streetname = scan.nextLine();
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullname = " + fullname);
        System.out.println("phonenumber = " + phonenumber);
        System.out.println("Adress:\n\t" + buildingnumber + " " + streetname + "\n\t" + city + ", " + state + " " + zipcode);
        System.out.println("Schoolname = " + Schoolname);

        scan.close();


    }
}
