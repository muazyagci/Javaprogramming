package day36_Inheritance.AnimalTask;

public class Zoo{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Garabas","Kangal","Big","White",'M',2);

        dog.eat();
        dog.bark();
        dog.drink();
        dog.move();
        dog.sleep();

        Cat cat=new Cat();

        cat.setInfo("Kedi","BritishLongHair","Medium","Grey",'F',1);

        cat.meow();
        cat.scratch();
        cat.drink();
        cat.eat();
        cat.sleep();
        cat.move();

        Tiger tiger=new Tiger();

        tiger.setInfo("khan","Bengal","Large","Brown",'M',2);




    }
}
