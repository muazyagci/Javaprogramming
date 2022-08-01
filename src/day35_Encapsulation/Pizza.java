package day35_Encapsulation;

import java.util.Scanner;

public class Pizza {

    private String size;
    private int numberOfCheeseToping,numberOfPepperoniToping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

               if (size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large")){
                   this.size = size;

               } else {
                   System.err.println("Invalid size please choose large or medium or small");
                  System.exit(0);
               }

    }



    public int getNumberOfCheeseToping() {
        return numberOfCheeseToping;
    }

    public void setNumberOfCheeseToping(int numberOfCheeseToping) {
        if (size.equalsIgnoreCase("small")){
           if (numberOfCheeseToping>=1&&numberOfCheeseToping<=3){
               this.numberOfCheeseToping = numberOfCheeseToping;
           }else {
               System.err.println("Invalid ");
               System.exit(0);
           }

        }
        if (size.equalsIgnoreCase("medium")){
            if (numberOfCheeseToping>=1&&numberOfCheeseToping<=4){
                this.numberOfCheeseToping = numberOfCheeseToping;
            }else {
                System.err.println("Invalid");
                System.exit(0);
            }
        }
        if (size.equalsIgnoreCase("large")){
            if (numberOfCheeseToping<=1&&numberOfCheeseToping<=5){
                this.numberOfCheeseToping = numberOfCheeseToping;
            }

        }


    }

    public int getNumberOfPepperoniToping() {
        return numberOfPepperoniToping;
    }

    public void setNumberOfPepperoniToping(int numberOfPepperoniToping) {
        this.numberOfPepperoniToping = numberOfPepperoniToping;
    }
}
