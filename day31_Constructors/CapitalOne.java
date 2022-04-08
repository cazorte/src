package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("--------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000);

        account2.checkBalance();




    }

    public static class RectangleObjects {

        public static void main(String[] args) {

            Rectangle rectangle1 = new Rectangle(5.5, 3.5);

            Rectangle rectangle2 = new Rectangle(10.5, 8.5);

            System.out.println(rectangle1);
            System.out.println(rectangle2);


        }


    }
}