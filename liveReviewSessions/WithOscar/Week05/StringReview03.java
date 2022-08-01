package WithOscar.Week05;

public class StringReview03 {
    public static void main(String[] args) {
        /*
        Substring(index,index) : method ask from me what int-indexNumber, return to me : a new String in string pool
         replace() method: it takes chars(old and new chars)---> a new String
                         : it also takes String (old and new)---->a new String
         When your method is doing more action with other DataTypes/Parameters : Method Overloading

         */

    String message="we still have a long way to go, so be petient";

    message=message.substring(0,1).toUpperCase()+message.substring(1).toLowerCase();
        System.out.println("message = " + message);

String word="Java";
word=word.replace('j','J');
        System.out.println("word = " + word);

        String browsers="Automation with Chrome Driver";
    // change chrome to firefox
        browsers=browsers.replace("chrome","Firefox");



    }
}
