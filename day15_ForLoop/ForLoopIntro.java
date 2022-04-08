package day15_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        for (int i=1; i<=5; ++i){
            System.out.println("i = "+ "Hello world "+i);
        }


        for (int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println("\n----------------------");

        for (int i = 0; i < 48; i++) {
            for (i=i; i < 5; i++) {
                System.out.print("\t* ");

            }
            //System.out.print("\n");
            for (int a=i%6; a < 5; a++, i++) {          //5x 6 7 8 9 10 11x
                System.out.print("\t* ");                 //12 13 14 15 16 17x
            }
            System.out.print("\n");


        }



    }
}
