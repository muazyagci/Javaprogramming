package day37_Inheritance.Animal;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Karabas","Kangal","Large","White",'M',4,1);
dog1.barks();
        System.out.println(dog1+"\n");

        Cat cat1=new Cat("Pamuk","BritishLongHair","Large","White",'F',2);
cat1.scratch();
        System.out.println(cat1+"\n");

        Parrot parrot1=new Parrot("Gus","Macaw","medium","Blue",'M',1,"Red");
parrot1.sing();
        System.out.println(parrot1);
    }

}
