package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
       String result="";
        String batchinfo="EU";

        /*if (batchinfo=="US morning"){
            result="Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchinfo=="US evening") {
result="Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchinfo=="EU") {
            result="Class times are  10-5 EST. M, T, W, Th, F.";
        }else result="Invalid Batch";

        System.out.println(result);

         */
/*switch (batchinfo){
    case "US morning":
        result="Class times are 10-5 EST. M, T, Th, F.";
        break;
    case "US evening":
        result="Class times are 7-10 EST. M, T, W, Th, S, S";
        break;
    case "EU":
        result="Class times are  10-5 EST. M, T, W, Th, F.";
        break;
    default:
        result="Invalid Batch";



}

 */
        if (batchinfo=="US morning"||batchinfo=="US evening"||batchinfo=="EU"){
            switch (batchinfo) {
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }


        }else result="Invalid Batch";



    }
}
