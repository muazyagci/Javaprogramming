package WithOscar.Week08;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int code = 200;
        int[] codes = new int[8];
        codes[0] = 200;
        codes[1] = 204;
        codes[codes.length - 1] = 500;
        for (int i = 0; i < codes.length; i++) {
            System.out.println("codes[i]= " + codes[i]);

        }
        System.out.println(Arrays.toString(codes));

        System.out.println("-----second way of creating arrays");

        int[] statusCode = {200, 201, 204, 400, 401, 403, 404, 500};//declare and initialize your array

        for (int i = 0; i < statusCode.length; i++) {
            System.out.println("statusCodes= " + statusCode[i]);

        }
        String[] responseTypes = new String[]{"OK", "Created", "No Content", new String("Bad Request"), "Unauthorized", "Forbidden", "Not Found",
                "Internal Server Error"};


        for (int i = 0; i < codes.length; i++) {
            System.out.println("Each Status Code Means: " + statusCode[i] + " = " + responseTypes[i]);
        }


    }

}
