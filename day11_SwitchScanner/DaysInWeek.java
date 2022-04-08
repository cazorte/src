package day11_SwitchScanner;

public class DaysInWeek {
    public static void main(String[] args) {

        char number = 'a';

        switch (number){                //1,2,3,4,5,6,7

            case 1 :
                System.out.println("Monday");
                break;

            case 'a':
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Wednesday");
                //break;

            case 4:
                System.out.println("Thursday");
                break;

            /*default:
                System.err.println("Error");
                break;   //we dont need break statement if the default statement is end of the cases
*/
            case 2:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;






        }





    }
}
