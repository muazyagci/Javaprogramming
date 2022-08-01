package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 =new Student();

        student1.setInfo("Hamza",'M',20, 01547,'A');


        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();
        student2.setInfo("Ayse",'F',25, 01547,'A');
        student3.setInfo("Mahmut",'M',23,25468,'B');
        student4.setInfo("Yigit",'M',25, 5457,'A');
        student5.setInfo("Murtaza",'M',25, 56547,'F');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------");

        ArrayList<Student> earlyBirds=new ArrayList<>();
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);


    }
}
