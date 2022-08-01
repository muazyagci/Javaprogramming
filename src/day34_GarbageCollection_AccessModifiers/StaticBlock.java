package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main method");

    }

    static{
        System.out.println("StaticBlock 1");
    }
    static {
        System.out.println("StaticBlock 2");
    }
    static{
        System.out.println("StaticBlock 3");
    }

}
