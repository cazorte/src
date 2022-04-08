package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee personel1 = new Employee();
        personel1.setInfo("Anil", 4113,'M', "Tester", 30000, false );
        Employee personel2 = new Employee();
        personel2.setInfo("Burcu", 4114,'F', "BA", 40000, true );
        Employee personel3 = new Employee();
        personel3.setInfo("Hayriye", 4115,'F', "Developer", 20000, true );
        Employee personel4 = new Employee();
        personel4.setInfo("Fatma", 4116,'F', "Developer", 30000, true );
        Employee personel5 = new Employee();
        personel5.setInfo("Ali", 4117,'M', "Marketing", 35000, false );


        Employee [] employees = {personel1,personel2,personel3,personel4,personel5};

        ArrayList<Employee> fullTimeEmployees = new ArrayList<>();
        int countFullTime=0;

        int minSalary = personel1.salary;
        int maxSlaray = personel1.salary;

        for (      Employee each  : employees      ) {
            if (each.isFullTime == true){
               fullTimeEmployees.add(each);
               countFullTime++;
            }
        }
        System.out.println("fullTimeEmployees = " + fullTimeEmployees);
        System.out.println("countFullTime = " + countFullTime);

        for (Employee employee : employees) {
            if (employee.salary< minSalary){
                minSalary = employee.salary;
            }
        }
        System.out.println("minSalary = " + minSalary);





    }


}
