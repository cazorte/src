package day39_Recap.cydeoTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudent;

    //Constructor
    public Student(String name, int age, char gender, int studentID, String fieldOfStudent) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudent(fieldOfStudent);
    }

    //Getters
    public int getStudentID() {
        return studentID;
    }
    public String getFieldOfStudent() {
        return fieldOfStudent;
    }

    //Setters
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setFieldOfStudent(String fieldOfStudent) {
        this.fieldOfStudent = fieldOfStudent;
    }

    //Methods
    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudent='" + fieldOfStudent + '\'' +
                '}';
    }
}
