package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default Contructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Contructor with argument");

    }
    public ConstructorCalls(String str){
        this(10);

        System.out.println("Contructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1=new ConstructorCalls();

    }

}
