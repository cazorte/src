package day32_Constructor;

public class EmployeeSummary {


    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public EmployeeSummary(String name) {
        this.name = name;
    }

    public EmployeeSummary(String name, char gender) {
        this(name); //this.name = name;
        this.gender = gender;
    }

    public EmployeeSummary(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public EmployeeSummary(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    /*
    public void method1(){
        this("Aaron");
    }
*/

    public String toString() {
        return "EmployeeSummary{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

