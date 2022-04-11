package day39_Recap.cydeoTask;

public class Employee extends Person{
    private int employeeID;
    private String jobTitle;
    private double salary;

    //Getters
    public int getEmployeeID() {
        return employeeID;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }

    //Setters
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Constructor
    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Methods
    public void work(){
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
