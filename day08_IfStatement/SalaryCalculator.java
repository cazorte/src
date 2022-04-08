package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
       /* int hourlyRate = 50 , weeklyHours =45;
        double stateTaxRate =6.5,
                federalTaxRate =26.2;
        //--------
        int salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax * stateTaxRate/100;
        double federalTax = salaryBeforeTax*federalTaxRate/100;


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax = $"+ stateTax);
        System.out.println("Federal tax = $"+ federalTax);
        */
        // && ||
        int age=21;
        char gender = 'F';
        boolean isEligible = age < 35 && gender =='M';
        System.out.println("isEligible = " + isEligible);
        boolean isEligible2 = age>18 ||gender =='F';
        System.out.println("isEligible2 = " + isEligible2);








    }
}
