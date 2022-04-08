package day27_WrapperClasses;

public class Tasks {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        Character ch=' ';
        String resultLetters="";
        String resultDigits="";
        String resultSpecial="";


        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)){
                resultDigits += ""+ch;
            }else if (Character.isLetter(ch)){
                resultLetters += ""+ch;
            }else if (!Character.isLetterOrDigit(ch)){
                resultSpecial += ""+ch;
            }
        }
        System.out.println("letter= "+resultLetters);
        System.out.println("digits= "+resultDigits);
        System.out.println("special characters= "+resultSpecial);

        System.out.println("------------------");

        String str1 = "JAVA      jjava";

        int countUpper =0;
        int countLower =0;
        for (int i = 0; i < str1.length(); i++) {
            char cha =str1.charAt(i);
            if (Character.isUpperCase(cha)){
                countUpper++;
            }else if (Character.isLowerCase(cha)){
                countLower++;
            }
        }
        boolean result1 =countLower==countUpper;
        System.out.println(result1);


    }
}
