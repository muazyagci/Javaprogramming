package WithOscar.Week05;

public class StringReview01 {
    public static void main(String[] args) {
        String str1 = "Java";// Literal way of creating String
        String str2 = "Java";//literal

    /*
    Java compiler checks teh String Pool. And if there is already a String in the pool, Java does not create a new one.
    str1: reference to our String object, referenceName of object, variableName
    str2: reference to our String object --> Address or pointer to object
     */
        System.out.println(str1 == str2);// check if the object are same ---> TRUE

        String str3 = new String("Java");// Java does not check String pool, it just creates totally a new String object

        System.out.println(str1 == str3);// False

        //When you just want to check if the contents are same: .equals() method
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str3));

    /*
    ArrayList, collections, OOP topics: object equality content (Data) equality not same thing
     */

        String str4="JAVA";
        System.out.println(str1.equalsIgnoreCase(str4));//Case-insensitive





    }
}
