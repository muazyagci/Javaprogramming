package WithOscar.Week05;

public class DynamicSubstring {
    public static void main(String[] args) {

        String searchResult="result count:34521";

        System.out.println(searchResult.length());
        // just taking numbers with substring

        String numbers=searchResult.substring(searchResult.indexOf(":")+1);

        System.out.println("numbers = " + numbers);

    }
}
