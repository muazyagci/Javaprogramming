package day42_Exceptions_Continue;

class FadyException extends RuntimeException{
public FadyException(String message){
    super(message);



}
public FadyException(){
    super("It's time for a short break");


}
}
class NoBreakException extends Exception{

}
public class CustomExceptions {
    public static void main(String[] args) {
        throw new FadyException("It's time for short break");


//        try {
//            throw new NoBreakException();
//        } catch (NoBreakException e) {
//            e.printStackTrace();
//        }

    }
}
