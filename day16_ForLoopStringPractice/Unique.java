package day16_ForLoopStringPractice;

public class Unique {
    public static void main(String[] args) {

        String entry="asfsfgjhkalsıjduyrgflıasjdasas564687465165";
        String result="";

        for (int i = 0; i < entry.length(); i++) {
            char ch =entry.charAt(i);
            if (entry.indexOf(ch)==entry.lastIndexOf(ch)) {
                result += ch;
            }



        }
        System.out.println("result = " + result);



    }



}
