package day31_Constructers;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Fatma",'F','B',15,798654);
        Student student2=new Student("Ayse",'F','B',15,798587);
        Student student3=new Student("Murat",'M','F',17,795478);


        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
    }
}
