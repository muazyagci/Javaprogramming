package day10_NeftedIf;

public class CrewAndPassangers {
    public static void main(String[] args) {
        int number=67;
       String result="";
        if (number>=50&&number<=100){

            if (number>=50&&number<74){
                result="20 crew, 30 passengers";
            } else if (number>=75&&number<99) {
                result="25 crew, 50 passengers";
            }else {
                result="30 crew, 70 passengers";
            }


        }else {
            result="Any other number of people on the ship is not valid ";
        }
        System.out.println(result);
    }
}
