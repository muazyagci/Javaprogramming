package day37_Inheritance;

public class ConstructorPractice {
}
class A {
    public A(int a) {
        System.out.println("A");
    }
}


class B extends A{

    public B(){
        super(9);
    }

}

