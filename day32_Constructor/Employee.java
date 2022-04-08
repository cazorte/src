package day32_Constructor;

public class Employee {


    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
