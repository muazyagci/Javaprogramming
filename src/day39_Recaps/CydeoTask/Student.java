package day39_Recaps.CydeoTask;

public class Student extends Person {
    private int studentID;
    private String fieldOfStudy;

    public Student(String name, char gender, int age, int studentID, String fieldOfStudy) {
        super(name, gender, age);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public void study(){
        System.out.println(getName()+" is studying");
    }

}

