package day19_LoopPractice;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabccdeef";
        int count=0;
        String result="";

        for (int k = 0; k < str.length(); k++) {
            char ch =str.charAt(k);
            count=0;
            for (int i = 0; i < str.length(); i++) {

                char each =str.charAt(i);
                if (ch==each){
                    count++;
                }
            }
            if (count==1){
                result+=ch;
            }

//          if (str.contains(""+str.charAt(k))){   //önceki if statement  zaten uniq olanları filtrelediği için buna gerek yok
//              continue;
//            }
        }
        System.out.println(result);




    }
}
