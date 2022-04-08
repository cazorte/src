package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {
        int a =1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(a++);
                }
            }
        }


    }
}
