package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String sizeisGiven="tall";

      /*  if (sizeisGiven=="tall"){
            System.out.println("price is $3.69\n90 calories");
        }else if (sizeisGiven=="grande") {
            System.out.println("Price is $3.99\n120 calories");
        } else if (sizeisGiven=="venti") {
            System.out.println("Price is $4.29\n150 calories");
        }else System.out.println("Invalid size");

       */
   /* switch (sizeisGiven){
        case "tall":
            System.out.println("price is $3.69\n90 calories");
            break;
        case "grande":
            System.out.println("Price is $3.99\n120 calories");
            break;
        case "venti":
            System.out.println("Price is $4.29\n150 calories");
            break;
        default:
            System.out.println("Invalid size");
    }

    */


        if (sizeisGiven=="tall"||sizeisGiven=="grande"||sizeisGiven=="venti"){
            switch (sizeisGiven) {
                case "tall":
                    System.out.println("price is $3.69\n90 calories");
                    break;
                case "grande":
                    System.out.println("Price is $3.99\n120 calories");
                    break;
                default:
                    System.out.println("Price is $4.29\n150 calories");


            }

        }else System.out.println("Invalid size");







    }


    }

