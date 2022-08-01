package WithOscar.Week08;

import java.util.Arrays;

public class ShoppingAppReportMax {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 13 case"};
        double[] prices = {99.99, 350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12349, 12350};

        double max = prices[0];
int indexOfMaxPrice=0;
double min=prices[0];
        int indexOfMinPrice=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                indexOfMaxPrice=i;
            }
            if (prices[i]<min){
                min=prices[i];
                indexOfMinPrice=i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println("min = " + min);
        System.out.println("indexOfMinPrice = " + indexOfMinPrice);

        System.out.println("itemID of MaxPriced item] = " + itemIDs[indexOfMaxPrice]);



    }
}
