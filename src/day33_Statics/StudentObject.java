package day33_Statics;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Ahmet");
        Student student2=new Student("Omer",'M');
        Student student3=new Student("Fatih",11);
        Student student4=new Student("Nigara",12,'A');
        Student student5=new Student("Cihad",'M',28);
        Student student6=new Student("Mehmet",'M',28,13);
        Student student7=new Student("Seda",'F',28,13,'A');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

        System.out.println(student1==student2);

        Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));


//        ArraysUtility<Student> list=new ArraysUtility(Arrays.asList(stude));
    }
}
