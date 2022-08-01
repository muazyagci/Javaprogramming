package day34_GarbageCollection_AccessModifiers;

public class Contructor_Vs_StaticBlock {
    static {
        System.out.println("Static block");
    }
    public Contructor_Vs_StaticBlock(){
        System.out.println("Contructor");
    }

    public static void main(String[] args) {

        new Contructor_Vs_StaticBlock();

        new Contructor_Vs_StaticBlock();

        new Contructor_Vs_StaticBlock();

        new Contructor_Vs_StaticBlock();

        new Contructor_Vs_StaticBlock();

    }

}
