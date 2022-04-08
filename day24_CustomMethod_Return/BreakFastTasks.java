package day24_CustomMethod_Return;

public class BreakFastTasks {

    public static void main(String[] args) {

        domain("cazorte@gmail.com");
        System.out.println("----------------------");
        nameOfMonth(12);
        System.out.println("----------------------");
        nameOfMonth(124);

    }

    public static void nameOfMonth(int number) {
        String name ="";

        if (number>=1 && number<=12){
            name = (number==1)? "January": (number==2)? "February" : (number==3)? "March": (number== 4)? "April":
                    (number==5)? "May" : (number==6)? "June": (number== 7)? "July": (number==8)? "August" :
                            (number==9)? "September": (number== 10)? "October": (number ==11)?"Novenber": "December";

        }else name = "Invalid";

        System.out.println("Month name = "+name);
    }
    //name of month

    //initials methods
    public static void domain(String email){
        String domain = email.substring(email.indexOf('@')+1 , email.lastIndexOf('.') );
        System.out.println("Your mail adress's domain is: "+domain);

    }


}



