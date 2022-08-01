package day20_Arrays;

public class task1_3 {
    public static void main(String[] args) {
        String[] classMates = {"Recep aydin", "Rahman demirkol", "Veli Ayberk", "Yakup Alihan", "Navid Ahmad", "Basit Usmany"};

        for (String each : classMates) {
            each = each.toUpperCase();
            System.out.println(each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1));
        }
        String reverse = "";
        for (int i = classMates.length - 1; i >= 0; i--) {
            reverse = classMates[i];
            // System.out.println(reverse+"\n");
            for (int j = reverse.length() - 1; j >= 0; j--) {
                System.out.print(reverse.charAt(j));

            }
            System.out.println(" ");
        }

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        for (String each : items) {
            int indexOfGloves = each.indexOf("G");
            if (indexOfGloves >= 0) {
                System.out.println(each + " " + indexOfGloves);
            }
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                System.out.println("The order humber is " + i + " for the " + items[i]);
            }
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);
        }

    }

}
