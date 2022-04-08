package day16_ForLoopStringPractice;

public class RemoveDublicate {

    public static void main(String[] args) {

        String input="AABBCCBCefghh";

        String result="";
        String result1="";
/*
        for (int i = 0; i < input.length(); i++) {
            String ch =""+input.charAt(i);          //ch-->A
            if (!ch.contains(result1)){             //result1 -->""        // Sonuç: contains kullanırken parantez içi eğer "" olursa sonuç hep true döner
                result1+=ch;
            }

        }
        System.out.println("result1 = " + result1);
*/

        for (int i = 0; i < input.length(); i++) {
            String ch=""+input.charAt(i);

            if (!result.contains(ch)){              //result--> ""
                result+=ch;                         //ch---> A
            }
        }
        System.out.println("result = " + result);



    }
}
